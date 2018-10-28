package com.rencorp.fohire;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    if(Common.getPreferenceString(getApplicationContext(),"AlreadySign","").equals("1")){
                        Intent i = new Intent(SplashActivity.this, HomeActivity.class);
                        startActivity(i);
                        finish();
                        return;
                    } else {
                        Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                        startActivity(i);
                        finish();
                        return;
                    }


            }
        }, 2000);
    }
}
