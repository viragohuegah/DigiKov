package com.example.digikov;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the MainActivity after the delay
                Intent intent = new Intent(SplashActivity2.this, Login.class);
                startActivity(intent);

                // Specify custom animations for the transition
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                finish();
            }
        }, 3000);
    }
}