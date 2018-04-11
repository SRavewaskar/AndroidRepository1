package com.monster.android.datepicker;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TimePicker;
import android.widget.DatePicker;

public class DatePickerActivity extends Activity {
DatePicker datePicker;
TimePicker timePicker;

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main);

timePicker = (TimePicker) findViewById(R.id.timePicker);
datePicker = (DatePicker) findViewById(R.id.datePicker);

//timePicker.setIs24HourView(true); //default is false


//---Button view---
Button btnOpen = (Button) findViewById(R.id.btnOpen);

btnOpen.setOnClickListener(new View.OnClickListener() {
	public void onClick(View v) {
		Toast.makeText(getBaseContext(),
		"Date selected:" + datePicker.getDayOfMonth()+    // getMonth() returns 0 for Jan, 1 for FEb....
		"/" + (datePicker.getMonth()+1) +
		"/" + datePicker.getYear() + "\n" +
		"Time selected:" + timePicker.getCurrentHour() +
		":" + timePicker.getCurrentMinute(),
		Toast.LENGTH_LONG).show();
			
		
		}
});
}


}