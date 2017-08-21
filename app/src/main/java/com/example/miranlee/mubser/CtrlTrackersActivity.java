package com.example.miranlee.mubser;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by KhawlaAlkooheji on 2/24/17.
 */

public class CtrlTrackersActivity extends AppCompatActivity {

    EditText tv;
    String name;
    String number;
    ListView trackerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctrltrackers);
        setTitle("Control Trackers");
        tv = (EditText) findViewById(R.id.ChosenName);
        trackerList = (ListView)findViewById(R.id.trackerList);

        name = null;
        number = null;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK && requestCode == 0) {
            Cursor c = getContentResolver().query(data.getData(), new String[] {
                    ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                    ContactsContract.CommonDataKinds.Phone.NUMBER
            },null,null,null);
            c.moveToFirst();
            name = c.getString(0);
            number = c.getString(1);

        }

        if(name != null && number != null) {
            tv.setText(name+" ("+number+")");
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void Click_tracker(View view) {
        Intent i = new Intent(Intent.ACTION_PICK);
        i.setData(ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(i,0);
    }

    public void Click_done(View view) {

    }
}
