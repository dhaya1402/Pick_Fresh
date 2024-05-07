package com.example.onlinemarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class vegetables extends AppCompatActivity {
private Button b4;
private EditText vkg1,vkg2,vkg3,vkg4,vkg5,vkg6,vkg7,vkg8,vkg9,vkg10;
private CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);
        vkg1=findViewById(R.id.vkg1);
        vkg2=findViewById(R.id.vkg2);
        vkg3=findViewById(R.id.vkg3);
        vkg4=findViewById(R.id.vkg4);
        vkg5=findViewById(R.id.vkg5);
        vkg6=findViewById(R.id.vkg6);
        vkg7=findViewById(R.id.vkg7);
        vkg8=findViewById(R.id.vkg8);
        vkg9=findViewById(R.id.vkg9);
        vkg10=findViewById(R.id.vkg10);
        c1=findViewById(R.id.vc1);

        c2=findViewById(R.id.vc2);
        c3=findViewById(R.id.vc3);
        c4=findViewById(R.id.vc4);
        c5=findViewById(R.id.vc5);
        c6=findViewById(R.id.vc6);
        c7=findViewById(R.id.vc7);
        c8=findViewById(R.id.vc8);
        c9=findViewById(R.id.vc9);
        c10=findViewById(R.id.vc10);
       b4=findViewById(R.id.pov);
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view){
               StringBuffer stringBuffer=new StringBuffer(20);
               stringBuffer.append("YOUR ORDER");
               stringBuffer.append(System.getProperty("line.separator"));


          if(c1.isChecked())
          {
              stringBuffer.append("* "+c1.getText().toString());
              stringBuffer.append(" -"+vkg1.getText().toString()+" kg");
              stringBuffer.append(System.getProperty("line.separator"));

          }
          if(c2.isChecked())
          {
                   stringBuffer.append("* "+c2.getText().toString());
              stringBuffer.append(" -"+vkg2.getText().toString()+" kg");
              stringBuffer.append(System.getProperty("line.separator"));

          }
          if(c3.isChecked())
               {
                   stringBuffer.append("* "+c3.getText().toString());
                   stringBuffer.append(" -"+vkg3.getText().toString()+" kg");
                   stringBuffer.append(System.getProperty("line.separator"));
               }
               if(c4.isChecked())
               {
                   stringBuffer.append("* "+c4.getText().toString());
                   stringBuffer.append(" -"+vkg4.getText().toString()+" kg");
                   stringBuffer.append(System.getProperty("line.separator"));
               }
               if(c5.isChecked())
               {
                   stringBuffer.append("* "+c5.getText().toString());
                   stringBuffer.append(" -"+vkg5.getText().toString()+" kg");
                   stringBuffer.append(System.getProperty("line.separator"));
               }
               if(c6.isChecked())
               {
                   stringBuffer.append("* "+c6.getText().toString());
                   stringBuffer.append(" -"+vkg6.getText().toString()+" kg");
                   stringBuffer.append(System.getProperty("line.separator"));
               }
               if(c7.isChecked())
               {
                   stringBuffer.append("* "+c7.getText().toString());
                   stringBuffer.append(" -"+vkg7.getText().toString()+" kg ");
                   stringBuffer.append(System.getProperty("line.separator"));
               }
               if(c8.isChecked())
               {
                   stringBuffer.append("* "+c8.getText().toString());
                   stringBuffer.append(" -"+vkg8.getText().toString()+" kg ");
                   stringBuffer.append(System.getProperty("line.separator"));
               }
               if(c9.isChecked())
               {
                   stringBuffer.append("* "+c9.getText().toString());
                   stringBuffer.append(" -"+vkg9.getText().toString()+" kg ");
                   stringBuffer.append(System.getProperty("line.separator"));
               }
               if(c10.isChecked())
               {
                   stringBuffer.append("* "+c10.getText().toString());
                   stringBuffer.append(" -"+vkg10.getText().toString()+" kg ");
                   stringBuffer.append(System.getProperty("line.separator"));

               }

             String str = stringBuffer.toString();
                Intent intent =new Intent( vegetables.this,order_details.class);
               intent.putExtra("keyname",str);
                startActivity(intent);
              Toast.makeText(vegetables.this,stringBuffer.toString(),Toast.LENGTH_LONG).show();
           }
       });

    }
}