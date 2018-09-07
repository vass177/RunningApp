package com.triptech.run4fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.triggertrap.seekarc.SeekArc;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final TextView weightText=findViewById(R.id.weightText);
        final TextView heightText=findViewById(R.id.heightText);
        final SeekArc seekArcWeight=findViewById(R.id.seekWeight);
        final SeekArc seekArcHeight=findViewById(R.id.seekHeight);
        SeekArc.OnSeekArcChangeListener seekArcChangeListener= new SeekArc.OnSeekArcChangeListener() {
            @Override
            public void onProgressChanged(SeekArc seekArc, int progress, boolean b) {
                if(seekArc.equals(seekArcWeight))
                    weightText.setText(String.valueOf(progress)+" kg");
                else
                    heightText.setText(String.valueOf(progress)+" cm");
            }

            @Override
            public void onStartTrackingTouch(SeekArc seekArc) {

            }

            @Override
            public void onStopTrackingTouch(SeekArc seekArc) {

            }
        };
        seekArcWeight.setOnSeekArcChangeListener(seekArcChangeListener);
        seekArcHeight.setOnSeekArcChangeListener(seekArcChangeListener);
    }

}
