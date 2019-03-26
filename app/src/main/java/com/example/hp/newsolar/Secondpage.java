package com.example.hp.newsolar;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Secondpage extends AppCompatActivity {
    ImageButton btback;
    Button bt21,bt22,bt23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        btback = (ImageButton) findViewById(R.id.back);
        btback.setOnClickListener(listener);
        bt21 = (Button) findViewById(R.id.bt21);
        bt21.setOnClickListener(listener1);
        bt22 = (Button) findViewById(R.id.bt22);
        bt22.setOnClickListener(listener2);
        bt23 = (Button) findViewById(R.id.bt23);
        bt23.setOnClickListener(listener3);

    }
    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Secondpage.this,Firstpage.class);
            startActivity(intent);
            Secondpage.this.finish();
        }
    };
    Button.OnClickListener listener1 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Secondpage.this,Selectpage.class);
            startActivity(intent);
            Secondpage.this.finish();
        }
    };
    Button.OnClickListener listener2 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Secondpage.this,Selectpage2.class);
            startActivity(intent);
            Secondpage.this.finish();
        }
    };
    Button.OnClickListener listener3 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Secondpage.this,unityactivity.class);
            startActivity(intent);
            Secondpage.this.finish();
        }
    };
}
