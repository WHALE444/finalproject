package com.example.hp.newsolar;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Firstpage extends AppCompatActivity {
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        bt1 = (Button) findViewById(R.id.start);
        bt1.setOnClickListener(listener);
    }
    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Firstpage.this,Secondpage.class);
            startActivity(intent);
            Firstpage.this.finish();
        }
    };
}
