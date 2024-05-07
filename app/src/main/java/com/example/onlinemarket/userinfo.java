package com.example.onlinemarket;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userinfo extends AppCompatActivity {
private Button button;
EditText E1,E2,E3,E5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
      E1=findViewById(R.id.E1);
      E2=findViewById(R.id.E2);
      E3=findViewById(R.id.E3);

      E5=findViewById(R.id.E5);
      button=findViewById(R.id.S1);
      button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              StringBuffer sb=new StringBuffer("address of the customer");
              sb.append(E1.getText().toString());
               sb.append(E2.getText().toString());
               sb.append(E3.getText().toString());

               sb.append("phone number of the customer");
               sb.append(E5.getText().toString());
               if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
                   if(checkSelfPermission(Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                       sendSMS();
                   } else{
                       requestPermissions(new String[]{Manifest.permission.SEND_SMS},1);
                   }
               }
           }
       });
    }
private void sendSMS() {
    StringBuffer sb=new StringBuffer("Address of the customer:  ");
    sb.append(E1.getText().toString());
    sb.append(E2.getText().toString());
    sb.append(E3.getText().toString());
    sb.append("Phone number of the customer:  ");
    sb.append("   ");
    sb.append(E5.getText().toString());
        String phoneno = "6383333584".toString();
    String str = getIntent().getStringExtra("keyname");
    sb.append(str);
    String str2=sb.toString();

    try {
    SmsManager smsManager = SmsManager.getDefault();
    smsManager.sendTextMessage(phoneno, null,str2, null, null);
    Toast.makeText(this, "ORDER CONFIRMED", Toast.LENGTH_SHORT).show();
} catch(Exception e)
    {
        e.printStackTrace();
        Toast.makeText(this, "Faild to send message", Toast.LENGTH_SHORT).show();
    }
}
}