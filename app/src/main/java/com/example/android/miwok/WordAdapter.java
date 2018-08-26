package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private Context mContext;

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
        mContext = context;
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
        defaultText.setText(word.getDefaultWord());
        miwokText.setText(word.getMiwokWord());
        return view;
    }
}
