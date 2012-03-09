package com.student.app;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;





public class Student4LifeActivity extends Activity 
{
	private EditText text;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (EditText) findViewById(R.id.editText1);
        text.setText("Nije pritisnut button");
    }
       
    //button1
    public void MojButton1(View view) {

    text.setText("Button 1 was clicked");
    }
    
    //button2
    
    public void MojButton2 (View view) {
    	
    	text.setText("Button 2 was clicked");
    	}
    
}
        

