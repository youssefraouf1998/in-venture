package com.wds.future.a3akarcom;

import android.content.Intent;
import android.graphics.Typeface;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import de.hdodenhof.circleimageview.CircleImageView;


public class navi_drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout ;

    Animation animation ;

    CircleImageView circleImageView_prof ;
    TextView txt_featured_property , txt_featured_geo_design ;
    ViewFlipper v_flipper ;
    ViewFlipper viewFlipper ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        circleImageView_prof = findViewById(R.id.profile_image);

        txt_featured_property = findViewById(R.id.featured_proprty);
        txt_featured_geo_design = findViewById(R.id.featured_geo_designs);

        Typeface tf = Typeface.createFromAsset(getAssets(),"BRUSHSCI.TTF");
        txt_featured_property.setTypeface(tf);
        txt_featured_property.setTextSize(45);
        txt_featured_geo_design.setTypeface(tf);
        txt_featured_geo_design.setTextSize(45);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        v_flipper = findViewById(R.id.view_flipper_layout);
        viewFlipper = findViewById(R.id.view_flipper_layout_2);

        int images_flippers_resource_1 []= {R.drawable.photo1 , R.drawable.photo2
                , R.drawable.photo3 , R.drawable.photo4 , R.drawable.photo5};


        for(int images_flippers1 : images_flippers_resource_1) {
            flipperImages1(images_flippers1);

        }
        int images_flippers_resource_2 []= {R.drawable.pho1 , R.drawable.pho2
                , R.drawable.pho3 , R.drawable.pho4 };


        for(int images_flippers2 : images_flippers_resource_2){
            flipperImages2(images_flippers2);





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


    public void flipperImages1(int images1) {
        ImageView imageView1 = new ImageView(this);
        imageView1.setBackgroundResource(images1);
        viewFlipper.addView(imageView1);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }



    public void flipperImages2(int images2) {
        ImageView imageView2 = new ImageView(this);
        imageView2.setBackgroundResource(images2);
        v_flipper.addView(imageView2);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.find_home) {

            Intent intent1 = new Intent(navi_drawer.this, Fillter.class);
            startActivity(intent1);


        }else if (id == R.id.news_events) {

        } else if (id == R.id.service) {

          Intent intent2 = new Intent(navi_drawer.this, MainActivity.class);
          startActivity(intent2);

        } else if (id == R.id.bankers) {

        } else if (id == R.id.recent_viewed) {

        } else if (id == R.id.notification) {

        } else if (id == R.id.our_companies) {

        } else if (id == R.id.sign_in) {

            Intent intent4 = new Intent(navi_drawer.this, Sign_In.class);
            startActivity(intent4);

        } else if (id == R.id.contact_us) {

            Intent intent5 = new Intent(navi_drawer.this, Contact_Us.class);
            startActivity(intent5);

        } else if (id == R.id.gps) {

        } else if (id == R.id.in_venture) {

            Intent intent3 = new Intent(navi_drawer.this, Powered.class);
            startActivity(intent3);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
