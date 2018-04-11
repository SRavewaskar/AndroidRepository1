package com.example.listviewwithcolor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView lv;
	String [] items;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.lv);
		
		items = getResources().getStringArray(R.array.listitems);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getBaseContext(), android.R.layout.simple_list_item_1,
				items);
		
		lv.setAdapter(adapter);
		
	
	// can change colour via xml attribute android:listSelector="#ff0000"	
/*
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position,long id) {
				
				for(int i=0 ; i<lv.getCount() ; i++)
				{
					if(lv.getItemIdAtPosition(i) == lv.getItemIdAtPosition(position))
						lv.getChildAt(i).setBackgroundColor(Color.RED);
					else
						lv.getChildAt(i).setBackgroundColor(Color.WHITE);
				}
				
			}
			
		});
		*/

	
		
	}

}
