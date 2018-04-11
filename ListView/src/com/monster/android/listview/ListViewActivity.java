package com.monster.android.listview;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends ListActivity {
String[] states = {
		"Andhra Pradesh",
		"Arunachal Pradesh",
		"Assam",
		"Bihar",
		"Chattisgarh",
		"Delhi",
		"Goa",
		"Gujarat",
		"Himachal Pradesh",
		"Haryana",
		"Jharkhand",
		"Jammu and Kashmir",
		"Kerala",
		"Karnataka",
		"Maharashtra",
		"Meghalaya",
		"Manipur",
		"Madhya Pradesh",
		"Mizoram",
		"Nagaland",
		"Orissa",
		"Punjab",
		"Rajasthan",
		"Sikkim",
		"Tamil Nadu",
		"Tripura",
		"Uttarakhand",
		"Uttar Pradesh",
		"Union territories",
		"West Bengal"
	};

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		getListView().setChoiceMode(2); 
		//What wud be the O/p with setChoiceMode(1) and setChoiceMode(0) 
		
		setListAdapter(new ArrayAdapter<String>(this, 
		
		android.R.layout.simple_list_item_1, states));
		//android.R.layout.simple_list_item_checked, states));
		
		//simple_list_item_checked, simple_list_item_1 
	}

	public void onListItemClick(ListView parent, View v, 
			int position, long id)
	{
		Toast.makeText(this, states[position] + " selected ", Toast.LENGTH_SHORT).show();
	}
}

