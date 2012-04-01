package com.student.app;


import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import android.os.Bundle;

public class Osijek extends MapActivity {
	MapView map;
	MapController controller;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osijek);
        map =(MapView)findViewById(R.id.mvOsijek);
        map.setBuiltInZoomControls(true);
        controller = map.getController();
        GeoPoint point = new GeoPoint((int)(45.5599888 * 1E6), (int)(18.6758628 * 1E6));
        controller.animateTo(point);
        controller.setZoom(13);
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
}