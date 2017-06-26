package com.example.miranlee.mubser;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by KhawlaAlkooheji on 2/24/17.
 */

public class GuideActivity extends FragmentActivity implements OnMapReadyCallback, LocationListener {

    GoogleMap map;
    LocationManager lm;
    Location location;
    LatLng Loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        setTitle("Current Location Page");
        MapFragment mapFr = (MapFragment)getFragmentManager().findFragmentById(R.id.map2);
        mapFr.getMapAsync(GuideActivity.this);

    }

    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.setMyLocationEnabled(true);
        UiSettings uis = map.getUiSettings();
        uis.setZoomControlsEnabled(true);
        map.setIndoorEnabled(true);
    }

    @Override
    public void onLocationChanged(Location location) {
        updateMap(location);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Location l = new Location(provider);
        updateMap(l);
    }

    @Override
    public void onProviderEnabled(String provider) {
        Location l = new Location(provider);
        updateMap(l);
    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    public void updateMap(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        final LatLng Loc = new LatLng(latitude, longitude);
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(Loc, 16));
    }
}
