package com.example.teaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashactivity);

        imageView=findViewById(R.id.img);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanim);

        imageView.startAnimation(myanim);

        final Intent i = new Intent(SplashActivity.this,MainActivity.class);
        Thread timer =new Thread() {

            public void run () {
                try {
                    sleep(2000) ;
                } catch (InterruptedException  e) {
                    e.printStackTrace();

                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}

