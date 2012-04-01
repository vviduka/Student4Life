package com.student.app;


import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import android.os.Bundle;

public class Osijek extends MapActivity {
	MapView map;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osijek);
        map =(MapView)findViewById(R.id.mvOsijek);
        map.setBuiltInZoomControls(true);
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
}