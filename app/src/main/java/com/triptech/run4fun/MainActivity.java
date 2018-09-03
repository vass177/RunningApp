package com.triptech.run4fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.vass17.first.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startMapButton=findViewById(R.id.testMapsButton);
        final Intent startMapIntent=new Intent(this,MapsActivity.class);
        startMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(startMapIntent);
            }
        });

        Button startUnityButton=findViewById(R.id.testUnityButton);
        final Intent startUnityIntent=new Intent(this,UnityPlayerActivity.class);
        startUnityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(startUnityIntent);
            }
        });

    }
}
