package com.example.textwatcherdemo;

import android.os.Bundle;
import android.app.Activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		EditText pass = (EditText) findViewById(R.id.pass);
		final TextView txtwt = (TextView) findViewById(R.id.txtwatcher);
		
		pass.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, 
			int count) {
				
				if(s.toString().equals("")==true)
					txtwt.setText("Not Entered");
				else if(s.length()<3) {
					txtwt.setText("Weak");
					}
				else if(s.length()<=6) {
					txtwt.setText("Medium");
					}
				else 
					txtwt.setText("Strong");
					 
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
