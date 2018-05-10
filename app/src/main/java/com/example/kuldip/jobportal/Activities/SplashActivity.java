package com.example.kuldip.jobportal.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kuldip.jobportal.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        int SPLASH_TIME_OUT= 2000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intent = new Intent(SplashActivity.this,NavigationDrawerActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
