package com.monster.android.basicviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
public class BasicViewsActivity extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main);
//---Button view---
Button btnOpen = (Button) findViewById(R.id.btnOpen);

btnOpen.setOnClickListener(new View.OnClickListener() {
 
public void onClick(View v) {
DisplayToast("You have clicked the Open button");
}
});

//---Button view---
Button btnSave = (Button) findViewById(R.id.btnSave);
btnSave.setOnClickListener(new View.OnClickListener()
{
public void onClick(View v) {
DisplayToast("You have clicked the Save button");
}
});

//---CheckBox---
CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);  
// 3 methods of Checkable object 
// void setChecked (boolean checked) - set / unset the state of CheckBox 
// boolean isChecked ()  - Chks state -> T / F
// void toggle () - reverses the current state of the view.   
 
checkBox.setOnClickListener(new View.OnClickListener()
{
public void onClick(View v) {
if (((CheckBox)v).isChecked())
DisplayToast("CheckBox is checked");
else
DisplayToast("CheckBox is unchecked");
}
});

// 1st way to check which Radio Button checked ?
/*
//---RadioButton---
RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener()
{
public void onCheckedChanged(RadioGroup group, int checkedId) {
RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
if (rb1.isChecked()) {
DisplayToast("Option 1 checked!");
} else {
DisplayToast("Option 2 checked!");
}
}
});
*/

//2nd way to check which Radio Button checked ?
RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener()
{
public void onCheckedChanged(RadioGroup group, int checkedId) {
if(checkedId == R.id.rdb1)
	DisplayToast("Option 1 checked!");
else
	DisplayToast("Option 2 checked!");
};
});

//---ToggleButton---
ToggleButton toggleButton =
(ToggleButton) findViewById(R.id.toggle1);
toggleButton.setOnClickListener(new View.OnClickListener()
{
public void onClick(View v) {
if (((ToggleButton)v).isChecked())
DisplayToast("Toggle button is On");
else
DisplayToast("Toggle button is Off");
}
});
}

private void DisplayToast(String msg)
{
Toast.makeText(getBaseContext(), msg,
Toast.LENGTH_SHORT).show();
}
}

