package com.example.miranlee.mubser;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.Trackers);
        btn2 = (Button) findViewById(R.id. User);
        btn3 = (Button) findViewById(R.id. Lang);
        setTitle("Main Menu");

        final SoftKeyboardDetectorView softKeyboardDetectorView = new SoftKeyboardDetectorView(this);
        softKeyboardDetectorView.setOnShownKeyboard(new SoftKeyboardDetectorView.OnShownKeyboardListener() {
            @Override
            public void onShowSoftKeyboard() {

            }
        });
    }

    public void ClickParent(View v) {
        Intent intent = new Intent(this, ParentActivity.class);
        startActivity(intent);
        finish();
    }

    public void ClickUser(View v) {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
        finish();

    }
    public void ClickLang(View v) {
        Intent intent = new Intent(this, MainpageArabic.class);
        startActivity(intent);
        finish();
    }

}
