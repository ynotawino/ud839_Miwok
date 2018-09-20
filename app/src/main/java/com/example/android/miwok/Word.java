package com.example.android.miwok;

public class Word {
    private String defaultWord;
    private String miwokWord;
    private int image;
    private int visibility=-1;

    public Word() {
        this("", "");
    }

    public Word(String defaultWord, String miwokWord) {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
    }

    public Word(String defaultWord, String miwokWord, int image) {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.image = image;
        visibility=image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public boolean hasImage(){
        return visibility!=-1;
    }
}
