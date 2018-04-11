package com.example.seekbarassignment;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings.SettingNotFoundException;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	float brightnessvalue = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SeekBar sb = (SeekBar) findViewById(R.id.sb);
		sb.setMax(255);
		
		// mention the permission in the manifest file as
		// <uses-permission android:name="android.permission.WRITE_SETTINGS"/>
		
		try {
			brightnessvalue = android.provider.Settings.System.getInt(
					getContentResolver(), 
					android.provider.Settings.System.SCREEN_BRIGHTNESS);
			
		} catch (SettingNotFoundException e) {
			e.printStackTrace();
		}
		
		sb.setProgress((int) brightnessvalue);
		
		sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			int progress = 0;
			
			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				
				android.provider.Settings.System.putInt(
						getContentResolver(), 
						android.provider.Settings.System.SCREEN_BRIGHTNESS, 
						progress);
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar arg0) {}
			
			@Override
			public void onProgressChanged(SeekBar sb, int value, boolean arg2) {
				// boolean arg2 is true , if the progress was initiated by the user
				// if done by setProgress() then arg2 is false
				progress = value;
				
			}
		});
		
	}
}
