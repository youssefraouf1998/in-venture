package com.wds.future.a3akarcom;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Sign_In extends AppCompatActivity {

    TextView txt_profile ;
    CircleImageView circleImageView ;
    Animation animation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);

        circleImageView = findViewById(R.id.sign_in);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim3);
        circleImageView.setAnimation(animation);

        txt_profile = findViewById(R.id.kamal_profile);

        Typeface tf = Typeface.createFromAsset(getAssets(),"BRUSHSCI.TTF");
        txt_profile.setTypeface(tf);
        txt_profile.setTextSize(45);

        FloatingActionButton home_sign_in = (FloatingActionButton) findViewById(R.id.home_sign_in);
        home_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.home_sign_in :
                        Intent intent1 = new Intent(Sign_In.this, navi_drawer.class);
                        startActivity(intent1);break;
                }
            }
        });
    }

}
