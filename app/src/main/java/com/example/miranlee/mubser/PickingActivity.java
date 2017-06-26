package com.example.miranlee.mubser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by KhawlaAlkooheji on 2/24/17.
 */

public class PickingActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_QR_CODE=1000;

    Button qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);
        setTitle("Picking Page");
        qr = (Button)findViewById(R.id.btn_qr);
    }

    public void Click_qr(View v) {

        Intent intent = new Intent(PickingActivity.this, SimpleScannerActivity.class);

        startActivityForResult(intent, REQUEST_CODE_QR_CODE);
    }

    protected void onActivityResult(int reqestCode, int resultCode, Intent data) {

        switch (reqestCode){
            case REQUEST_CODE_QR_CODE:
                if(resultCode==RESULT_OK){
                    String code = data.getStringExtra("result");
                    qr.setText(code);
                    qr.setClickable(false);
                }
                break;
            default:
                super.onActivityResult(reqestCode, resultCode, data);
        }


    }


}
