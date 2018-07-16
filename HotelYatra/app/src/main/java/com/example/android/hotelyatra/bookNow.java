package com.example.android.hotelyatra;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class bookNow extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
Intent intent;
ViewFlipper f[]=new ViewFlipper[11];

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        //flipper animation
        f[1]=findViewById(R.id.flip2);

        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        f[1].setInAnimation(in);
        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        f[1].setOutAnimation(out);
        f[1].setFlipInterval(3000);
        f[1].showNext();
        f[1].showNext();

        //paragraph
        f[2]=findViewById(R.id.flip3);

        Animation in1= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);
        f[2].setInAnimation(in1);
        Animation out1= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        f[2].setOutAnimation(out1);
        f[2].setFlipInterval(3000);
        f[2].showNext();
        f[2].showNext();

        //flipper animation
        f[5]=findViewById(R.id.flip5);

        Animation in2= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        f[5].setInAnimation(in2);
        Animation out2= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        f[5].setOutAnimation(out2);
        f[5].setFlipInterval(3000);
        f[5].showNext();
        f[5].showNext();

        //paragraph
        f[6]=findViewById(R.id.flip6);

        Animation in3= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);
        f[6].setInAnimation(in3);
        Animation out3= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        f[6].setOutAnimation(out3);
        f[6].setFlipInterval(3000);
        f[6].showNext();
        f[6].showNext();






    }
    public void book(View v)
    {
        if(v.getId()==R.id.book1)
        {
            v.startAnimation(buttonClick);
            intent=new Intent(getApplicationContext(),payment.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.book2)
        {
            v.startAnimation(buttonClick);
            intent=new Intent(getApplicationContext(),payment.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.book3)
        {
            v.startAnimation(buttonClick);
            intent=new Intent(getApplicationContext(),payment.class);
            startActivity(intent);
        }

    }
    public void detail(View v)
    {
        if(v.getId()==R.id.detail1)
        {
            v.startAnimation(buttonClick);
            intent=new Intent(getApplicationContext(),Information.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.detail2)
        {
            v.startAnimation(buttonClick);
            intent=new Intent(getApplicationContext(),Information.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.detail3)
        {
            v.startAnimation(buttonClick);
            intent=new Intent(getApplicationContext(),Information.class);
            startActivity(intent);
        }

    }






    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.book_now, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent=new Intent(getApplicationContext(),login.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
