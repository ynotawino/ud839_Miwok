package com.example.android.miwok;

public class Word {
    private String defaultWord;
    private String miwokWord;

    public Word() {
        this("", "");
    }

    public Word(String defaultWord, String miwokWord) {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }
}
