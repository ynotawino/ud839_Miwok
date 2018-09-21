package com.example.android.miwok;

public class Word {
    private String defaultWord;
    private String miwokWord;
    private int image;
    private int sound;
    private int visibility = -1;

    public Word(String defaultWord, String miwokWord, int sound) {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.sound = sound;
    }

    public Word(String defaultWord, String miwokWord, int image, int sound) {
        this.defaultWord = defaultWord;
        this.miwokWord = miwokWord;
        this.image = image;
        this.sound = sound;
        visibility = image;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean hasImage() {
        return visibility != -1;
    }

    public int getSound() {
        return sound;
    }

}
