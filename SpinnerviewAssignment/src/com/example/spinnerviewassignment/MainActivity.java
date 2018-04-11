package com.example.spinnerviewassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final String []products = getResources().getStringArray(R.array.items);
		
		Spinner sp = (Spinner) findViewById(R.id.sv);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getBaseContext(), 
				android.R.layout.simple_spinner_dropdown_item, 
				products);
		
		sp.setAdapter(adapter);
		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View v,int position, long id) {
				
				Toast.makeText(getBaseContext(), products[position] + " selected" , Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
		});
	
	}
}
