package com.example.omar.animatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runanimate(View view) {
        ImageView Together = (ImageView)findViewById(R.id.AnimImg);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.mixanimat);
        Together.startAnimation(animation);

    }
}
