package com.monster.AutoCompleteTextView;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends Activity {
	
	String[] ISDcodes = {
			"93 : Afghanistan",
			"61 : Australia",
			"975 : Bhutan",
			"1 : Canada",
			"86 : China",
			"354 : Iceland",
			"91 : India",
			"62 : Indonesia",
			"98 : Iran",
			"964 : Iraq",
			"353 : Ireland",
			"972 : Israel",
			"39 : Italy",
			"52 : Mexico",
			"997 : Nepal",
			"64 : New Zealand",
			"92 : Pakistan",
			"65 : Singapore",
			"27 : South Africa"
			};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        		android.R.layout.simple_dropdown_item_1line, ISDcodes);
        
        		AutoCompleteTextView actv = (AutoCompleteTextView)
        		findViewById(R.id.txtCountries);
        
        		actv.setThreshold(0);
        		
        		actv.setAdapter(adapter);
    }
}





