package com.nagel.animationexe;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView mario;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//lisasin setContentView(R.layout.activity_main); et pilt tuleks ette
        mario = findViewById(R.id.imageview);
    }

    //lisasin xml failis kõikidele  onClick
    public void onZoom(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        mario.startAnimation(animation);
    }

    public void onClockwise(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        mario.startAnimation(animation);
    }

    public void onFade(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        mario.startAnimation(animation);

    }

    public void onBlink(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        mario.startAnimation(animation);
    }

    public void onMove(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        mario.startAnimation(animation);
    }

    public void onSlide(View view) {
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        mario.startAnimation(animation);
    }

    public void onStop(View view) {
        mario.clearAnimation();
    }
}