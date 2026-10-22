package com.luntik.calendarai

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this)
        setContentView(webView)
        val s = webView.settings
        s.javaScriptEnabled = true
        s.domStorageEnabled = true
        s.allowFileAccess = true
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.loadUrl("file:///android_asset/index.html")
    }
}