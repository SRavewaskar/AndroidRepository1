package com.example.listviewassignment1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView lv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.lv);
		
		final String [] items = getResources().getStringArray(
				R.array.listitems);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getBaseContext(), 
				android.R.layout.simple_list_item_1, items);
		
		lv.setAdapter(adapter);
	
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, 
					View v, int position,long id) {
				
				Toast.makeText(getBaseContext(), 
						items[position] +" selected", 
						Toast.LENGTH_SHORT).show();
			}
			
		});
		
	}

}
