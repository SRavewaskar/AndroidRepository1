package com.example.imageviewlistenerassignment;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	ImageView iv1,iv2,iv3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv1 = (ImageView) findViewById(R.id.iv1);
		iv2 = (ImageView) findViewById(R.id.iv2);
		iv3 = (ImageView) findViewById(R.id.iv3);
		
		iv1.setOnClickListener(this);
		iv2.setOnClickListener(this);
		iv3.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv1:
				showToast("Android");
			break;
		case R.id.iv2:
			showToast("IOS");
		break;
		case R.id.iv3:
			showToast("Windows");
		break;
		default:
			break;
		}
		
	}
	private void showToast(String string) {

		Toast.makeText(getBaseContext(), string + " selected", Toast.LENGTH_SHORT).show();
		
	}

}
