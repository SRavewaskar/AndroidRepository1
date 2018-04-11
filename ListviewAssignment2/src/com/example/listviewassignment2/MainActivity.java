package com.example.listviewassignment2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.lv);

		String [] stars = getResources().getStringArray(R.array.items);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getBaseContext(), 
				android.R.layout.simple_list_item_multiple_choice, 
				stars);
		
		//lv.setChoiceMode(2);
		
		lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		// equivalent to lv.setChoiceMode(2);
		
		//lv.setChoiceMode(ListView.CHOICE_MODE_NONE); // 0
		//lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE); // 1
		
		
		lv.setAdapter(adapter);
		
	}

}
