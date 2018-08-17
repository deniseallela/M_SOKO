package com.xyz.m_soko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread bb = new Thread() {
            //            execute thread
            public void run() {
                try {
//                    the progress bar will load for 2 seconds
                    sleep(1 * 1000);
                    Intent jj = new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(jj);
                    finish();
                } catch (Exception e) {

                }
            }
        };
        bb.start();

    }
}

