package com.example.iozhproject.ui.frontend.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.content.Context;

import com.example.iozhproject.R;

public class AboutModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutModel(Context context) {
        mText = new MutableLiveData<>();
        mText.setValue(context.getString(R.string.ab_about));
    }

    public LiveData<String> getText() {
        return mText;
    }
}
