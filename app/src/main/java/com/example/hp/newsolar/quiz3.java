package com.example.hp.newsolar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class quiz3 extends AppCompatActivity {
    ImageButton btback;
    Button bty,btn,bty1,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        btback = (ImageButton) findViewById(R.id.back);
        btback.setOnClickListener(listener);
        bty = (Button) findViewById(R.id.bty);
        bty.setOnClickListener(listener1);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(listener2);
        bty1 = (Button) findViewById(R.id.bty1);
        bty1.setOnClickListener(listener3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(listener4);
    }
    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(quiz3.this, earth.class);
            startActivity(intent);
            quiz3.this.finish();
        }
    };
    Button.OnClickListener listener1 = new Button.OnClickListener() {
        public void onClick(View v) {

            Toast toastCenter = Toast.makeText(getApplicationContext(),"Serious?",Toast.LENGTH_LONG);


            toastCenter.setGravity(Gravity.CENTER,0,0);


            toastCenter.show();

        }
    };
    Button.OnClickListener listener2 = new Button.OnClickListener() {
        public void onClick(View v) {
            Toast toastCenter = Toast.makeText(getApplicationContext(),"You made it!",Toast.LENGTH_LONG);


            toastCenter.setGravity(Gravity.CENTER,0,0);


            toastCenter.show();
        }
    };
    Button.OnClickListener listener3 = new Button.OnClickListener() {
        public void onClick(View v) {
            Toast toastCenter = Toast.makeText(getApplicationContext(),"Think clearly!",Toast.LENGTH_LONG);


            toastCenter.setGravity(Gravity.CENTER,0,0);


            toastCenter.show();
        }
    };
    Button.OnClickListener listener4 = new Button.OnClickListener() {
        public void onClick(View v) {
            Toast toastCenter = Toast.makeText(getApplicationContext(),"um...sorry",Toast.LENGTH_LONG);


            toastCenter.setGravity(Gravity.CENTER,0,0);


            toastCenter.show();
        }
    };
}
