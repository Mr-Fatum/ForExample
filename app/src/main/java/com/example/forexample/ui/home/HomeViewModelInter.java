package com.example.forexample.ui.home;

import android.view.View;

import androidx.lifecycle.LiveData;

public interface HomeViewModelInter {
    void onImageClick(View v);

    LiveData<String> getText();
}
