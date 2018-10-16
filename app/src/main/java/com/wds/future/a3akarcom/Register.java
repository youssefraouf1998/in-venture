package com.wds.future.a3akarcom;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Animation animation ;

    CircleImageView circleImageView ;

    TextView txt_register ;

    Button btn_register ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txt_register = findViewById(R.id.textViewreg);
        circleImageView = findViewById(R.id.logo_reg);
        btn_register = findViewById(R.id.registerButton);

        Typeface tf = Typeface.createFromAsset(getAssets(),"BRUSHSCI.TTF");
        txt_register.setTypeface(tf);
        txt_register.setTextSize(50);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim2);
        circleImageView.setAnimation(animation);
        txt_register.setAnimation(animation);
        btn_register.setAnimation(animation);



        btn_register.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.registerButton:

            Intent intent1 = new Intent(Register.this, Login.class);
            startActivity(intent1); break;

        }
    }
}
