package com.example.android.hotelyatra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class Second extends AppCompatActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F);
    ViewFlipper f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        f1=findViewById(R.id.flip1);
        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        f1.setInAnimation(out);
        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        f1.setInAnimation(in);


        f1.startFlipping();

        f1.setFlipInterval(4000);

    }
    public void startTour(View view)
    {
        view.startAnimation(buttonClick);
        Intent intent=new Intent(Second.this,landingpage.class);
        startActivity(intent);
        finish();
    }
}
