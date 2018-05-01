package com.example.keshavgupta.emi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Launcher extends AppCompatActivity {

    Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        getSupportActionBar().hide();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Launcher.this,calculate.class));
            }
        },6000);


        TextView tx = (TextView)findViewById(R.id.txv1);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Quicksand-Bold.ttf");
        tx.setText("EMI Calculator");
        tx.setTypeface(custom_font);


    }
}
