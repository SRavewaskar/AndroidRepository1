package com.example.buttonlistener2;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button) findViewById(R.id.b1);
		
		//Method 1
		b1.setOnClickListener(this);// First implement the listener method and set it on the button.
		
	}

	@Override
	public void onClick(View v) {
		
		Toast.makeText(getBaseContext(), "Msg from onClick Listener method", Toast.LENGTH_SHORT).show();
	}
	
	//Method 2
	public void validate(View v){// Using the attribute "onClick" of button in xml file & write the method with the same name. 
		
		Toast.makeText(getBaseContext(), "Msg from onClick attribute in xml", Toast.LENGTH_SHORT).show();
	}
	
}
