package com.ramzi.inventoryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Ramzi on 30-Dec-17.
 */

public class SplashActivity extends AppCompatActivity {
    private static long N = 1500;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Timer timer = new Timer();
        timer.schedule(new SplashTask(), N);
    }

    private class SplashTask extends TimerTask {

        @Override
        public void run() {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
