package com.xyz.m_soko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Instagram extends AppCompatActivity {
WebView vc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        vc=findViewById(R.id.iconone);
        vc.loadUrl("https://www.instagram.com/essy_kangara");
        vc.getSettings().setJavaScriptEnabled(true);
    }
}



