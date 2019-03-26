package com.example.hp.newsolar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class uranus extends AppCompatActivity {
    ImageButton btback;
    Button btq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranus);
        btback = (ImageButton) findViewById(R.id.back);
        btback.setOnClickListener(listener);
        btq = (Button) findViewById(R.id.btq);
        btq.setOnClickListener(listener1);
    }

    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(uranus.this, Selectpage.class);
            startActivity(intent);
            uranus.this.finish();
        }
    };
    Button.OnClickListener listener1 = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(uranus.this, quiz7.class);
            startActivity(intent);
            uranus.this.finish();
        }
    };
}
