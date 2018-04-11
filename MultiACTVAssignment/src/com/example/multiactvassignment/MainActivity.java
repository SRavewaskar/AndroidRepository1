package com.example.multiactvassignment;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MultiAutoCompleteTextView mactv = 
				(MultiAutoCompleteTextView) findViewById(R.id.mactv);
		
		String[] items = {"Cupcake" , "Donut" , "Eclair" ,
				"Froyo" , "Gingerbread" , "Honeycomb" , 
				"Ice-cream Sandwich" , "JellyBean" , "Kitkat" , "Lollipop"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>
		(getBaseContext(), 
				android.R.layout.simple_dropdown_item_1line, 
				items);
		
		mactv.setAdapter(adapter);
		
		mactv.setTokenizer(new 
				MultiAutoCompleteTextView.CommaTokenizer());
		
		mactv.setThreshold(1);
		
		
		
	}
}
