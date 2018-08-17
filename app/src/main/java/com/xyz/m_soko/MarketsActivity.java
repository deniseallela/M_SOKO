package com.xyz.m_soko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MarketsActivity extends AppCompatActivity {
    Button first,second,third,fourth,fifth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markets);
        first = findViewById(R.id.button);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MarketsActivity.this, "One Clicked", Toast.LENGTH_SHORT).show();
                Intent launchme=getApplicationContext().getPackageManager().
                        getLaunchIntentForPackage("com.android.stk");
                if (launchme !=null){
                    startActivity(launchme);
                }
            }
        });
        second = findViewById(R.id.buttonone);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MarketsActivity.this, "Two Clicked", Toast.LENGTH_SHORT).show();
                Intent launchme=getApplicationContext().getPackageManager().
                        getLaunchIntentForPackage("com.android.stk");
                if (launchme !=null){
                    startActivity(launchme);
                }
            }
        });
        third = findViewById(R.id.buttontwo);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MarketsActivity.this, "Three Clicked", Toast.LENGTH_SHORT).show();
                Intent launchme=getApplicationContext().getPackageManager().
                        getLaunchIntentForPackage("com.android.stk");
                if (launchme !=null){
                    startActivity(launchme);
                }
            }
        });
        fourth = findViewById(R.id.buttonthree);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MarketsActivity.this, "Four Clicked", Toast.LENGTH_SHORT).show();
                Intent launchme=getApplicationContext().getPackageManager().
                        getLaunchIntentForPackage("com.android.stk");
                if (launchme !=null){
                    startActivity(launchme);
                }
            }
        });
        fifth = findViewById(R.id.buttonfour);
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MarketsActivity.this, "Five Clicked", Toast.LENGTH_SHORT).show();
                Intent launchme=getApplicationContext().getPackageManager().
                        getLaunchIntentForPackage("com.android.stk");
                if (launchme !=null){
                    startActivity(launchme);
                }
            }
        });
    }
}
