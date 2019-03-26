package com.example.hp.newsolar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Selectpage2 extends AppCompatActivity {
    ImageButton btback;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectpage2);
        btback = (ImageButton) findViewById(R.id.back);
        btback.setOnClickListener(listener);
        bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(listener1);
    }
    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage2.this, Secondpage.class);
            startActivity(intent);
            Selectpage2.this.finish();
        }
    };
    Button.OnClickListener listener1 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(Selectpage2.this, earth.class);
            startActivity(intent);
            Selectpage2.this.finish();
        }
    };
}
