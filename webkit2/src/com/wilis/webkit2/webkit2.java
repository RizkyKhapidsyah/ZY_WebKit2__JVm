package com.wilis.webkit2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class webkit2 extends Activity {
	WebView browser;
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		browser=(WebView)findViewById(R.id.webkit);
		
		browser.loadUrl("http://google.com");
	}
}
