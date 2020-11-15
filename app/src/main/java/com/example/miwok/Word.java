package com.example.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    // Data members

    // Variable for Miwok translation
    private String mMiwokTranslation;
    //Variable for default translation
    private String mDefaultTranslation;
    //Variable for storing ID of the image associated with the current word
    private int mImageResourceId;
    //Variable that indicates whether there is an image associated with the word
    private boolean hasImage;
    //Variable for storing ID of the audio clip associated with the current word
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId    is the resource id of the audio clip associated with the word
     */
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
        hasImage = false;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource id of the image associated with the word
     * @param audioResourceId    is the resource id of the audio file associated with the word
     */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
        hasImage = true;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Return the image resource Id of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether there is an image associated with the word or not
     */
    public boolean hasImageResource() {
        return hasImage;
    }

    /**
     * Get the resource id of the audio file associated with the word
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns a String for a Word object
     */
    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' + '}';
    }
}
