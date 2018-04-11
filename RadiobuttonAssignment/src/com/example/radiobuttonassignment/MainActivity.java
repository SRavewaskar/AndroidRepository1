package com.example.radiobuttonassignment;

import android.os.Bundle;
import android.app.Activity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	int id;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
		final RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
		final RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
		final RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
		final RadioButton rb4 = (RadioButton) findViewById(R.id.rb4);
		final RadioButton rb5 = (RadioButton) findViewById(R.id.rb5);
		
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
			
		// Method 1
	
				if(rb1.isChecked())
					showToast(rb1.getText());
				else if(rb2.isChecked())
					showToast(rb2.getText());
				else if(rb3.isChecked())
					showToast(rb3.getText());
				else if(rb4.isChecked())
					showToast(rb4.getText());
				else 
					showToast(rb5.getText());
	
			
				// Method 2
		/*
					 id = rg.getCheckedRadioButtonId();
						
						switch (id) {
						case R.id.rb1:
							showToast(rb1.getText());
							break;
						case R.id.rb2:
							showToast(rb2.getText());
							break;
						case R.id.rb3:
							showToast(rb3.getText());
							break;
						case R.id.rb4:
							showToast(rb4.getText());
							break;
						case R.id.rb5:
							showToast(rb5.getText());
							break;
						default:
							break;
						}
			*/	
			}
			
		});
			
	}
	
	private void showToast(CharSequence text) {
		
		Toast.makeText(getBaseContext(), 
				"Your favourite star is " + text , 
				Toast.LENGTH_SHORT).show();
	}




}
