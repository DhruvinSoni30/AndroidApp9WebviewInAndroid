package com.example.kalpeshsoni.practical9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"This application require Internet Connection",Toast.LENGTH_SHORT).show();

        web = findViewById(R.id.webv);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://dhruvin3045.blogspot.com/");
    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack())
        {
            web.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
