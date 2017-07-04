package com.example.miranlee.mubser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by KhawlaAlkooheji on 2/24/17.
 */

public class PickingActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_QR_CODE=1000;

    Button qr;
    EditText user_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);
        setTitle("Picking Page");
        qr = (Button)findViewById(R.id.btn_qr);
        user_code = (EditText)findViewById(R.id.user_code);
    }

    public void Click_qr(View v) {

        Intent intent = new Intent(PickingActivity.this, SimpleScannerActivity.class);

        startActivityForResult(intent, REQUEST_CODE_QR_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        String code = data.getStringExtra("result");
        user_code.setText(code);

        switch (requestCode){
            case REQUEST_CODE_QR_CODE:
                if(resultCode==RESULT_OK){
                    code = data.getStringExtra("result");
                    user_code.setText(code);
                }else {
                    Toast.makeText(this, "Not Registered Code",Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                super.onActivityResult(requestCode, resultCode, data);
        }


    }

    public void Click_done(View v) {

    }


}
