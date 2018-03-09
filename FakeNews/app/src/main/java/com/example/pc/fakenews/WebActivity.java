package com.example.pc.fakenews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by pc on 09/03/2018.
 */

public class WebActivity extends AppCompatActivity {
    WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        setTitle("FakeNews");
        mWebView= (WebView)findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadData(getIntent().getStringExtra("link"),"text/html","UTF-8");
    }
}
