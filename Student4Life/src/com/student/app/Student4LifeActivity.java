package com.student.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Student4LifeActivity extends Activity 
{
	private static final int REQUEST_ENABLE_BT = 0;
	private EditText text;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (EditText) findViewById(R.id.editText1);
        text.setText("Nije pritisnut button");
        Toast toast=Toast.makeText(this, "Ušao si u moju aplikaciju", 2000);
    	
	     toast.setGravity(Gravity.TOP, -50, 150);
	
	     toast.show();
	     
    }
	     
	     public void bluetooth (View view)
	     {
	     
	    	 BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();    
	    	 if (!mBluetoothAdapter.isEnabled()) {
	    	         Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
	    	         startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
	     }
	     
	     }
    
       
    //button1
    public void MojButton1(View view) {

    text.setText("Prihvatio si to što si kliknuo");
    }
    
    //button2
    
    public void MojButton2 (View view) {
    	
    	text.setText("Nisi prihvatio si to što si kliknuo");
    	}
    
    
    	public void oapp(View view)
    	{

    	AlertDialog ad = new AlertDialog.Builder(Student4LifeActivity.this).create();

    	CharSequence poruka = "Autor programa \n" ;

    	poruka = poruka + "Danijel Blagajac\n\n";

    	poruka = poruka + "Suradnik\n";

    	poruka = poruka + "John Doe\n\n";

    	poruka = poruka + "Verzija programa\n";

    	poruka = poruka + "0.0.0.1";

    	ad.setTitle("Student4Life");

    	ad.setMessage(poruka);

    	ad.setButton("Zatvori", new DialogInterface.OnClickListener()

    	{

    	@Override

    	public void onClick(DialogInterface arg0, int arg1)

    	{

    	}

    	});

    	ad.show();

    	}
    	
    	 
    
}
        

