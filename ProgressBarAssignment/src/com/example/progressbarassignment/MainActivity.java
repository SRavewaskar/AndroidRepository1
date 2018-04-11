package com.example.progressbarassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button start = (Button) findViewById(R.id.start);
		final ProgressBar pb = (ProgressBar) findViewById(R.id.pb);
		pb.setMax(100);
		
		start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Thread t = new Thread(){
					
					int timer = 0;
					@Override
					public void run() {
							
							while (timer < 100) {
								timer += 5;
								
								try {
									sleep(1*1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								pb.setProgress(timer);
							}
						
						}
					
				};
				t.start();
				
			}
		});

	}

}
