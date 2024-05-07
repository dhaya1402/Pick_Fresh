package com.example.onlinemarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class order_details extends AppCompatActivity {

    Button b4;
     TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        t1=findViewById(R.id.order_details);
        String str = getIntent().getStringExtra("keyname");
        t1.setText(str);
        b4=findViewById(R.id.confirm_button);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(order_details.this, userinfo.class);
                intent.putExtra("keyname",str);
                startActivity(intent);
                Toast.makeText(order_details.this, "order confirmed", Toast.LENGTH_LONG).show();
            }
        });
    }
}