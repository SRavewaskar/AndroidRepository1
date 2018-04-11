package com.example.textviewlistenerassignment;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv1 = (TextView) findViewById(R.id.tv1);
		tv2 = (TextView) findViewById(R.id.tv2);
		tv3 = (TextView) findViewById(R.id.tv3);
		tv4 = (TextView) findViewById(R.id.tv4);
		tv5 = (TextView) findViewById(R.id.tv5);
		tv6 = (TextView) findViewById(R.id.tv6);
		
		tv1.setOnClickListener(this);
		tv2.setOnClickListener(this);
		tv3.setOnClickListener(this);
		tv4.setOnClickListener(this);
		tv5.setOnClickListener(this);
		tv6.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.tv1:
			showToast(tv1.getText());
			break;
		case R.id.tv2:
			showToast(tv2.getText());
			break;
		case R.id.tv3:
			showToast(tv3.getText());
			break;
		case R.id.tv4:
			showToast(tv4.getText());
			break;
		case R.id.tv5:
			showToast(tv5.getText());
			break;
		case R.id.tv6:
			showToast(tv6.getText());
			break;
				default:
			break;
		}
		
	}

	private void showToast(CharSequence text) {
		
		Toast.makeText(getBaseContext(), text + " selected", Toast.LENGTH_SHORT).show();
	}

}
