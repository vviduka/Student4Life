package com.student.app;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Splash extends Activity{

	Thread thrDelay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
				
		thrDelay = new Thread(){
		
			public void run() {
				try {
					sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				finally {
					Intent openStartingPoint = new Intent("com.student.app.MENU");
					startActivity(openStartingPoint);
				}
				
			}
		};
		
		thrDelay.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}

