package com.example.a013_immanuel_pwpb.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a013_immanuel_pwpb.MainActivity;
import com.example.a013_immanuel_pwpb.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Intent pindah = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(pindah);
                finish();
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(run,1000);

    }
}
