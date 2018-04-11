package com.example.seekbarassignment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

// run this app on Phone only. Not on emulator of Studio / Genymotion
public class MainActivity extends Activity {

	float brightnessvalue = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SeekBar sb = (SeekBar) findViewById(R.id.sb);
		sb.setMax(255);
		
		// mention the permission in the manifest file as
		// <uses-permission android:name="android.permission.WRITE_SETTINGS"/>  for API < 23
		// for api 23 and above , permissions are taken are run time only.

		// code for API 23 and above ....
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			if (Settings.System.canWrite(getApplicationContext())) {
				try {
					// To allow manual changes also , through the seek bar
					Settings.System.putInt( getContentResolver(),
							Settings.System.SCREEN_BRIGHTNESS_MODE, Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);

					brightnessvalue = android.provider.Settings.System.getInt(
							getContentResolver(),
							android.provider.Settings.System.SCREEN_BRIGHTNESS);

					String temp = String.valueOf(brightnessvalue);
					// checking the value fetched
					Log.i("Present Brigthness ", temp );

				} catch (SettingNotFoundException e) {
					//Throw an error case it couldn't be retrieved
					Log.e("Error", "Cannot access system brightness");
					e.printStackTrace();
				}

				sb.setProgress((int) brightnessvalue);

				sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
					int progress = 0;

					@Override
					public void onStopTrackingTouch(SeekBar arg0) {
						Log.i("logging : ", "in stop" );


						android.provider.Settings.System.putInt(
								getContentResolver(),
								android.provider.Settings.System.SCREEN_BRIGHTNESS,
								progress);

						{ // block for test purpose

							float brightnessvalue = 0;
							try {
								brightnessvalue = Settings.System.getInt(
										getContentResolver(),
										Settings.System.SCREEN_BRIGHTNESS);
							} catch (SettingNotFoundException e) {
								e.printStackTrace();
							}

							String temp = String.valueOf(brightnessvalue);
							// checking the value fetched
							Log.i("Present Brigthness ", temp);
						}
					}

					@Override
					public void onStartTrackingTouch(SeekBar arg0) {
						Log.i("logging : ", "in start" );
					}

					@Override
					public void onProgressChanged(SeekBar sb, int value, boolean arg2) {
						// boolean arg2 is true , if the progress was initiated by the user
						// if done by setProgress() then arg2 is false
						progress = value;

					}
				});

			}
			}
			else {
				Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_WRITE_SETTINGS);
				intent.setData(Uri.parse("package:" + getPackageName()));
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
			}
		}

}

