package com.example.yearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DannyActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danny);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");
    }

    public void switchNickActivity(View view){
        Intent intent = new Intent(this, NickActivity.class);
        startActivity(intent);
    }

    public void switchJohnActivity(View view){
        Intent intent = new Intent(this, JohnActivity.class);
        startActivity(intent);
    }

}