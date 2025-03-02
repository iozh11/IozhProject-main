package com.example.iozhproject.ui.frontend.longeared;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LongearedModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LongearedModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}