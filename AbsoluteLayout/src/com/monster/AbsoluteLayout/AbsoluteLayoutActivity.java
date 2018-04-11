package com.monster.AbsoluteLayout;

import android.app.Activity;
import android.os.Bundle;

public class AbsoluteLayoutActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); 
        // main.xml : try android:background="#FFFFFF" color. Also try android:layout_height="wrap_content"  
    }
}