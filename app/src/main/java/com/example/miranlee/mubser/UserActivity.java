package com.example.miranlee.mubser;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by miran lee on 2017-02-25.
 */
public class UserActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        setTitle("User Page");

        btn1 = (Button)findViewById(R.id.MyLocation);
        btn2 = (Button)findViewById(R.id.Places);
        btn3 = (Button)findViewById(R.id.VoiceOrder);
        btn5 = (Button)findViewById(R.id.Settings);
    }

    public void ClickMyLocation(View v) {
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }

    public void ClickList(View v) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void ClickVoiceOrder(View v) {

    }

    public void ClickMemo(View v) {
        Intent intent = new Intent(this, MemoActivity.class);
        startActivity(intent);}

    public void ClickSettings(View v) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
