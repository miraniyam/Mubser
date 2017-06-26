package com.example.miranlee.mubser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainpageArabic extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainarabic);
        btn1 = (Button)findViewById(R.id.Trackers1);
        btn2 = (Button) findViewById(R.id. User1);
        btn3 = (Button) findViewById(R.id. Lang1);
        setTitle("Main Menu");
    }

    public void ClickParent1(View v) {
        Intent intent = new Intent(this, ParentActivity.class);
        startActivity(intent);
    }

    public void ClickUser1(View v) {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
        public void ClickLang1(View v) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

