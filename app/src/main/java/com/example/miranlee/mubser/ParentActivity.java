package com.example.miranlee.mubser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by miran lee on 2017-02-25.
 */
public class ParentActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        setTitle("Parents Page");

        btn1 = (Button)findViewById(R.id.Picking);
        btn2 = (Button)findViewById(R.id.Tracking);
    }
    public void ClickPicking(View v) {
        Intent intent = new Intent(this, PickingActivity.class);
        startActivity(intent);
        finish();

    }
    public void ClickTracking(View v) {
        Intent intent = new Intent(this, TrackingActivity.class);
        startActivity(intent);
        finish();
    }

    public void ClickBack(View v) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
