package com.example.miranlee.mubser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by KhawlaAlkooheji on 2/24/17.
 */

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Settings Page");
    }

    public void ClickCtrlT(View v) {
        // 여기다가 사용자가 트랙커 지정해 줄 수 있는 페이지 만들기~
        startActivity(new Intent(this, CtrlTrackersActivity.class));
    }
}
