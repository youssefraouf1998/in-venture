package com.wds.future.a3akarcom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class Card_Adapter extends ArrayAdapter<Integer> {

    public Card_Adapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imageView = convertView.findViewById(R.id.card_content);
        imageView.setImageResource(getItem(position));
        return convertView ;
    }
}
