package com.example.progressdialogassignment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	ProgressDialog pd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button start = (Button) findViewById(R.id.start);
		
		start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				pd = new ProgressDialog(MainActivity.this);
				pd.setMessage("This is a Progress Dialog");
				pd.show();
				
				Thread t = new Thread(){
					@Override
					public void run() {
					
						try {
							sleep(5*1000);
							pd.dismiss();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						super.run();
					}
				};
				t.start();
				
			}
		});
		
	}

}
