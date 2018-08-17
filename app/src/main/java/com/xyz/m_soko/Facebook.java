package com.xyz.m_soko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Facebook extends AppCompatActivity {
WebView cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        cv=findViewById(R.id.iconone);
        cv.loadUrl("https://www.facebook.com/shyro.kangara.7?ref=bookmarks");
        cv.getSettings().setJavaScriptEnabled(true);
    }
}
