package com.xyz.m_soko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Twitter extends AppCompatActivity {
    WebView tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        tr=findViewById(R.id.iconone);
        tr.loadUrl("https://www.facebook.com/shyro.kangara.7?ref=bookmarks");
        tr.getSettings().setJavaScriptEnabled(true);
    }
}
