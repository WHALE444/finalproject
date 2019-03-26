package com.example.hp.newsolar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class quiz4 extends AppCompatActivity {
    ImageButton btback;
    Button bty,btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        btback = (ImageButton) findViewById(R.id.back);
        btback.setOnClickListener(listener);
        bty = (Button) findViewById(R.id.bty);
        bty.setOnClickListener(listener1);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(listener2);
    }
    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(quiz4.this, mars.class);
            startActivity(intent);
            quiz4.this.finish();
        }
    };
    Button.OnClickListener listener1 = new Button.OnClickListener() {
        public void onClick(View v) {

            Toast toastCenter = Toast.makeText(getApplicationContext(),"may be not...",Toast.LENGTH_LONG);


            toastCenter.setGravity(Gravity.CENTER,0,0);


            toastCenter.show();

        }
    };
    Button.OnClickListener listener2 = new Button.OnClickListener() {
        public void onClick(View v) {
            Toast toastCenter = Toast.makeText(getApplicationContext(),"Clever!",Toast.LENGTH_LONG);


            toastCenter.setGravity(Gravity.CENTER,0,0);


            toastCenter.show();
        }
    };
}
