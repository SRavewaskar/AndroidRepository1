package com.example.numberpickerassignment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		NumberPicker np = (NumberPicker) findViewById(R.id.np);
		final TextView tv1 = (TextView) findViewById(R.id.tv1);
		final TextView tv2 = (TextView) findViewById(R.id.tv2);
	
		np.setMinValue(0);
		np.setMaxValue(10);
		
		np.setOnValueChangedListener(new OnValueChangeListener() {
			
			@Override
			public void onValueChange(NumberPicker picker, 
					int oldvalue, int newvalue) {
				
				tv1.setText("Old Value: "+String.valueOf(oldvalue));
				tv2.setText("New Value: "+String.valueOf(newvalue));
					
			}
		});
		
	}
}
