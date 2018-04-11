package com.example.ratingbarassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Button submit = (Button) findViewById(R.id.submit);
		final RatingBar rb = (RatingBar) findViewById(R.id.rb);
		
		rb.setNumStars(4);
		
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float f = rb.getRating();
				int i = Math.round(f);
				Toast.makeText(getBaseContext(), "rating is "+ i  , 
						Toast.LENGTH_SHORT).show();
				/*
				Toast.makeText(getBaseContext(), "rating is "+ rb.getRating()  , 
						Toast.LENGTH_SHORT).show();
			*/
			}
		});
		
	
	
	
	}
}
