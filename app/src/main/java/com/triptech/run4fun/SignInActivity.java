package com.triptech.run4fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button signInButton=findViewById(R.id.signInButton);
        final Intent signInIntent=new Intent(this, MainActivity.class);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signInIntent);
            }
        });

        TextView signUpText=findViewById(R.id.registerText);
        final Intent signUpIntent=new Intent(this, SignUpActivity.class);
        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(signUpIntent);
                overridePendingTransition(R.anim.bottomtotop, R.anim.toptobottom);
            }
        });

    }
}
