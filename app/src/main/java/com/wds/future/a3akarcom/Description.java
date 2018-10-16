package com.wds.future.a3akarcom;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wenchao.cardstack.CardStack;

public class Description extends AppCompatActivity implements CardStack.CardEventListener, View.OnClickListener{

TextView txt_des , txt_welcome ;
    CardStack cardStack ;
    Card_Adapter card_adapter ;
    Button btn_skip ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        images();


        cardStack =findViewById(R.id.card_stack);
        cardStack.setContentResource(R.layout.card_layout);

        cardStack.setAdapter(card_adapter);

        cardStack.setListener(this);


        txt_welcome = findViewById(R.id.welcome);

        Typeface tf = Typeface.createFromAsset(getAssets(),"BRUSHSCI.TTF");
        txt_welcome.setTypeface(tf);
        txt_welcome.setTextSize(45);

        btn_skip = findViewById(R.id.skip);
        btn_skip.setOnClickListener(this);


    }

    public void images (){

        card_adapter = new Card_Adapter(getApplicationContext(),0);
        card_adapter.add(R.drawable.spec);
        card_adapter.add(R.drawable.mapp);
        card_adapter.add(R.drawable.searchh);
        card_adapter.add(R.drawable.desc);
    }

    @Override
    public boolean swipeEnd(int i, float v) {
        return (v>300)?true:false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.skip :
                btn_skip.setSelected(true);
                Intent intent1 = new Intent(Description.this, Login.class);
                startActivity(intent1);break;

        }

    }
}
