package com.wds.future.a3akarcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Splash extends AppCompatActivity {

    CircleImageView circleImageView ;

    Animation animation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        circleImageView = findViewById(R.id.logo);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim);
        circleImageView.setAnimation(animation);

        Thread thread = new Thread(){

        @Override
        public void run() {

            try {


                sleep(3000);




                Intent intent = new Intent(getApplicationContext(), Description.class);
                startActivity(intent);

                finish();
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }

    };


        thread.start();

}
}
