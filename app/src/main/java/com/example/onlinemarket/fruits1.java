package com.example.onlinemarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class fruits1 extends AppCompatActivity {

    private Button fruitsod;
    private EditText fkg1,fkg2,fkg3,fkg4,fkg5,fkg6,fkg7,fkg8,fkg9,fkg10;
    private CheckBox fch1,fch2,fch3,fch4,fch5,fch6,fch7,fch8,fch9,fch10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits1);
        fkg1=findViewById(R.id.fkg1);
        fkg2=findViewById(R.id.fkg2);
        fkg3=findViewById(R.id.fkg3);
        fkg4=findViewById(R.id.fkg4);
        fkg5=findViewById(R.id.fkg5);
        fkg6=findViewById(R.id.fkg6);
        fkg7=findViewById(R.id.fkg7);
        fkg8=findViewById(R.id.fkg8);
        fkg9=findViewById(R.id.fkg9);
        fkg10=findViewById(R.id.fkg10);
        fch1=findViewById(R.id.fch1);
        fch2=findViewById(R.id.fch2);
        fch3=findViewById(R.id.fch3);
        fch4=findViewById(R.id.fch4);
        fch5=findViewById(R.id.fch5);
        fch6=findViewById(R.id.fch6);
        fch7=findViewById(R.id.fch7);
        fch8=findViewById(R.id.fch8);
        fch9=findViewById(R.id.fch9);
        fch10=findViewById(R.id.fch10);
        fruitsod=findViewById(R.id.pov);
        fruitsod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                StringBuffer stringBuffer=new StringBuffer(20);
                stringBuffer.append("YOUR ORDER");
                stringBuffer.append(System.getProperty("line.separator"));


                if(fch1.isChecked())
                {
                    stringBuffer.append("* "+fch1.getText().toString());
                    stringBuffer.append(" -"+fkg1.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));

                }
                if(fch2.isChecked())
                {
                    stringBuffer.append("* "+fch2.getText().toString());
                    stringBuffer.append(" -"+fkg2.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));

                }
                if(fch3.isChecked())
                {
                    stringBuffer.append("* "+fch3.getText().toString());
                    stringBuffer.append(" -"+fkg3.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(fch4.isChecked())
                {
                    stringBuffer.append("* "+fch4.getText().toString());
                    stringBuffer.append(" -"+fkg4.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(fch5.isChecked())
                {
                    stringBuffer.append("* "+fch5.getText().toString());
                    stringBuffer.append(" -"+fkg5.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(fch6.isChecked())
                {
                    stringBuffer.append("* "+fch6.getText().toString());
                    stringBuffer.append(" -"+fkg6.getText().toString()+" kg");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(fch7.isChecked())
                {
                    stringBuffer.append("* "+fch7.getText().toString());
                    stringBuffer.append(" -"+fkg7.getText().toString()+" kg ");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(fch8.isChecked())
                {
                    stringBuffer.append("* "+fch8.getText().toString());
                    stringBuffer.append(" -"+fkg8.getText().toString()+" kg ");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(fch9.isChecked())
                {
                    stringBuffer.append("* "+fch9.getText().toString());
                    stringBuffer.append(" -"+fkg9.getText().toString()+" kg ");
                    stringBuffer.append(System.getProperty("line.separator"));
                }
                if(fch10.isChecked())
                {
                    stringBuffer.append("* "+fch10.getText().toString());
                    stringBuffer.append(" -"+fkg10.getText().toString()+" kg ");
                    stringBuffer.append(System.lineSeparator());

                }

                String str = stringBuffer.toString();
                Intent intent =new Intent( fruits1.this,order_details.class);
                intent.putExtra("keyname",str);
                startActivity(intent);
                Toast.makeText(fruits1.this,stringBuffer.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}