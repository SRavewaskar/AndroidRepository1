
package com.monster.android.spinnerview;
import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerViewActivity extends Activity {
String[] state_list;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main);

state_list = getResources().getStringArray(R.array.states);
Spinner s1 = (Spinner) findViewById(R.id.spinner1);
ArrayAdapter<String> adapter 
= new ArrayAdapter<String>(this, 
		android.R.layout.simple_spinner_item, state_list); 
        // 2 layouts  : simple_spinner_dropdown_item , 
		//simple_spinner_item 
s1.setAdapter(adapter);

s1.setOnItemSelectedListener(new OnItemSelectedListener()
{
@Override
public void onItemSelected(AdapterView<?> arg0, 
		View arg1, int arg2, long arg3)
{
//int index = arg0.getSelectedItemPosition();
Toast.makeText(getBaseContext(),
state_list[arg2] + " : Opted as your state of domicile",
Toast.LENGTH_SHORT).show();
}
@Override
public void onNothingSelected(AdapterView<?> arg0) {}
});
}
}