package com.example.onlinemarket;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dairyproducts extends AppCompatActivity {
    private Button pod;
    private EditText lt1,lt2,lt3,lt4,lt5;
    private CheckBox dc1,dc2,dc3,dc4,dc5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairyproducts);
        lt1=findViewById(R.id. lt1);
        lt2=findViewById(R.id. lt2);
        lt3=findViewById(R.id. lt3);
        lt4=findViewById(R.id. lt4);
        lt5=findViewById(R.id. lt5);
        dc1=findViewById(R.id.dc1);
        dc2=findViewById(R.id.dc2);
        dc3=findViewById(R.id.dc3);
        dc4=findViewById(R.id.dc4);
        dc5=findViewById(R.id.dc5);
        pod=findViewById(R.id.pod);
        pod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                StringBuffer stringBuffer=new StringBuffer(20);
                stringBuffer.append("YOUR ORDER");
                stringBuffer.append(System.getProperty("line.separator"));


                if(dc1.isChecked())
                {
                    stringBuffer.append("* "+dc1.getText().toString());
                    stringBuffer.append(" -"+lt1.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));

                }
                if(dc2.isChecked())
                {
                    stringBuffer.append("* "+dc2.getText().toString());
                    stringBuffer.append(" -"+lt2.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));

                }
                if(dc3.isChecked())
                {
                    stringBuffer.append("* "+dc3.getText().toString());
                    stringBuffer.append(" -"+lt3.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(dc4.isChecked())
                {
                    stringBuffer.append("* "+dc4.getText().toString());
                    stringBuffer.append(" -"+lt4.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(dc5.isChecked())
                {
                    stringBuffer.append("* "+dc5.getText().toString());
                    stringBuffer.append(" -"+lt5.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                String str = stringBuffer.toString();
                Intent intent =new Intent( dairyproducts.this,order_details.class);
                intent.putExtra("keyname",str);
                startActivity(intent);
                Toast.makeText(dairyproducts.this,stringBuffer.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}