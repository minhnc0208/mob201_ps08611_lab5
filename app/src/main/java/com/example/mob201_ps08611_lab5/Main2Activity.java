package com.example.mob201_ps08611_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    WebView webView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView = findViewById(R.id.webview1);
        intent = getIntent();
        String link = intent.getStringExtra("openlink");
        webView.loadUrl(link);
        webView.setWebViewClient(new WebViewClient());
    }
}
