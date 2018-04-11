package com.example.buttonlistener1;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button) findViewById(R.id.btn);
		
		
		 // Method 1
		
		
		 //Step 1: Making an object of onClickListener as "on". 
		  OnClickListener on = new OnClickListener() {   
			
			@Override
			public void onClick(View v) {
				
				Toast.makeText(getBaseContext(), "Msg from the object of onClickListener", Toast.LENGTH_SHORT).show();
			}
		};
		
		btn.setOnClickListener(on); //Step 2: Passing the object "on".
		
		
		/*
		//Method 2
		
		btn.setOnClickListener(new OnClickListener() { // Here making Anonymous Inner class and passing it at the same time. 
			
			@Override
			public void onClick(View v) {
				
				Toast.makeText(getBaseContext(), "Msg from Anonymous Inner class object", Toast.LENGTH_SHORT).show();
			}
		});
	*/
	}
}
