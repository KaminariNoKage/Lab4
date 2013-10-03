package com.mobileproto.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toCamera = (Button) findViewById(R.id.to_camera);

        toCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCamera(view);
            }
        });

/*        toGPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToGPS(view);
            }
        });*/

/*        toMicrophone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMicrophone(view);
            }
        });*/


    }


/*    public void goToFlashlight(View view){
        Intent i = new Intent(this, FlashLightActivity.class);
        startActivity(i);
    }*/

    public void goToCamera(View view){
        Intent i = new Intent(this, CameraActivity.class);
        startActivity(i);
    }

/*    public void goToMicrophone(View view){
        Intent i = new Intent(this, MicrophoneActivity.class);
        startActivity(i);
    }*/

/*    public void goToGPS(View view){
        Intent i = new Intent(this, GPSActivity.class);
        startActivity(i);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
