package com.example.hp.newsolar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Selectpage extends AppCompatActivity {
    ImageButton btback;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectpage);
        btback = (ImageButton) findViewById(R.id.back);
        btback.setOnClickListener(listener);
        bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(listener1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(listener2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(listener3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(listener4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(listener5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt6.setOnClickListener(listener6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt7.setOnClickListener(listener7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt8.setOnClickListener(listener8);

    }

    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, Secondpage.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener1 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, mercury.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener2 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, venus.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener3 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, earth.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener4 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, mars.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener5 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, jupiter.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener6 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, saturn.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener7 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, uranus.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
    Button.OnClickListener listener8 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage.this, neptune.class);
            startActivity(intent);
            Selectpage.this.finish();
        }
    };
}

