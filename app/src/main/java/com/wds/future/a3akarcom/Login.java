package com.wds.future.a3akarcom;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Animation animation ;

    CircleImageView circleImageView ;

    TextView txt_login ;

    Button btn_log , btn_reg ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_login = findViewById(R.id.textView2);

        btn_log = findViewById(R.id.login_button);
        btn_reg = findViewById(R.id.register_button);

        circleImageView = findViewById(R.id.logo_login);

        Typeface tf = Typeface.createFromAsset(getAssets(),"BRUSHSCI.TTF");
        txt_login.setTypeface(tf);
        txt_login.setTextSize(50);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim2);
        circleImageView.setAnimation(animation);
        txt_login.setAnimation(animation);
        btn_log.setAnimation(animation);
        btn_reg.setAnimation(animation);



        btn_log.setOnClickListener(this);
        btn_reg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.login_button:
                Intent intent1 = new Intent(Login.this, navi_drawer.class);
                startActivity(intent1); break;

            case R.id.register_button:
                Intent intent2 = new Intent(Login.this, Register.class);
                startActivity(intent2); break;
        }
    }
}
