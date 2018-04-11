package com.example.linearlayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	 public void f1(View v)
	 {
		 Toast.makeText(getApplicationContext(), "hi all", 
				 Toast.LENGTH_SHORT).show();
		 
	 }

}
