package com.example.android.hotelyatra;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    Handler h1;
    ViewFlipper flip1,flip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flip1=findViewById(R.id.move1);

        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        flip1.setInAnimation(in);
        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        flip1.setOutAnimation(out);
        flip1.showNext();



        h1=new Handler();
        h1.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Second.class);
                startActivity(intent);
                finish();
            }
        },4000);



    }
}
