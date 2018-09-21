package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private Context mContext;
    private int color;

    public WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mContext = context;
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);
        TextView defaultText = view.findViewById(R.id.textView_numbers_english);
        TextView miwokText = view.findViewById(R.id.textView_numbers_miwok);
        ImageView image = view.findViewById(R.id.image_item);
        ViewGroup textViews = view.findViewById(R.id.textViews_list);
        defaultText.setText(word.getDefaultWord());
        miwokText.setText(word.getMiwokWord());
        image.setImageResource(word.getImage());
        if (word.hasImage())
            image.setVisibility(View.VISIBLE);
        else
            image.setVisibility(View.GONE);
        textViews.setBackgroundColor(this.color);
        return view;
    }
}
