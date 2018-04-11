package com.example.checkboxassignment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
		final CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
		final CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
		final CheckBox cb4 = (CheckBox) findViewById(R.id.cb4);
		final CheckBox cb5 = (CheckBox) findViewById(R.id.cb5);
		
		cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, 
					boolean isChecked) {
				
				if(cb1.isChecked())
					showToast(cb1.getText());
				else
					showToast2(cb1.getText());
			}
		});
		
		cb2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb2.isChecked())
					showToast(cb2.getText());
				else
					showToast2(cb2.getText());
			}
		});
		
		cb3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb3.isChecked())
					showToast(cb3.getText());
				else
					showToast2(cb3.getText());
			}
		});

		cb4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb4.isChecked())
					showToast(cb4.getText());
				else
					showToast2(cb4.getText());
			}
		});
		
		cb5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if(cb5.isChecked())
					showToast(cb5.getText());
				else
					showToast2(cb5.getText());
			}
		});
		
		
	}

	private void showToast2(CharSequence text) {
		// TODO Auto-generated method stub
		Toast.makeText(getBaseContext(), text + " not selected", Toast.LENGTH_SHORT).show();
	}

	private void showToast(CharSequence text) {
		// TODO Auto-generated method stub
		Toast.makeText(getBaseContext(), text + " selected", Toast.LENGTH_SHORT).show();
	}

}

/*
 
CompoundButton extends Button and implements Checkable.
It is just a button with 2 states : checked and unchecked.
When the button is pressed or clicked, the state changes automatically.

*/