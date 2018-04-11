package com.example.checkboxassignment2;

import com.example.checkboxassignment2.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	String [] str = {"" ,"" ,"" ,"" ,""  };
	TextView tv;
	CheckBox cb1 , cb2 , cb3, cb4 , cb5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		cb1 = (CheckBox) findViewById(R.id.cb1);
		cb2 = (CheckBox) findViewById(R.id.cb2);
		cb3 = (CheckBox) findViewById(R.id.cb3);
		cb4 = (CheckBox) findViewById(R.id.cb4);
		cb5 = (CheckBox) findViewById(R.id.cb5);
		
		cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton 
					buttonView, boolean isChecked) {
				
				//if(cb1.isChecked())
				if(isChecked)	
					str[0] = cb1.getText().toString();
				else
					str[0] = "";
				
				displayCheckedboxText(str);
			}
		});
		
		cb2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb2.isChecked())
					str[1] = cb2.getText().toString();
				else
					str[1] = "";
				displayCheckedboxText(str);
			}
		});
		
		cb3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb3.isChecked())
					str[2] = cb3.getText().toString();
				else
					str[2] = "";
				displayCheckedboxText(str);
			}
		});

		cb4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb4.isChecked())
					str[3] = cb4.getText().toString();
				else
					str[3] = "";
				displayCheckedboxText(str);
			}
		});
		
		cb5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb5.isChecked())
					str[4] = cb5.getText().toString();
				else
					str[4] = "";
				
				displayCheckedboxText(str);
			}
		});
		
	}

	private void displayCheckedboxText(String[] str2) {
		
		String s = "";
		for(int i=0 ; i<str2.length ; i++)
		{
			s += " " + str2[i];
		}
		tv.setText(s);
	}

}
