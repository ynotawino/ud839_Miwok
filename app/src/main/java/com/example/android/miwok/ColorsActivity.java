/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> color = new ArrayList<>();
        color.add(new Word("red", "weṭeṭṭi"));
        color.add(new Word("green", "chokokki"));
        color.add(new Word("brown", "ṭakaakki"));
        color.add(new Word("gray", "ṭopoppi"));
        color.add(new Word("black", "kululli"));
        color.add(new Word("white", "kelelli"));
        color.add(new Word("dusty yellow", "ṭopiisә"));
        color.add(new Word("mustard yellow", "chiwiiṭә"));
        WordAdapter listAdapter = new WordAdapter(this, color);
        ListView list = findViewById(R.id.list_colors);
        list.setAdapter(listAdapter);
    }
}
