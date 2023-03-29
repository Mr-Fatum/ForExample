package com.example.forexample.ui.home;

import android.view.View;
import android.widget.ImageButton;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel implements HomeViewModelInter {

    public String task = "Весёлая задача: \n Расскажу я вам, дружочки, \n Как вышащивать грибочки: \n Нужно в поле утром рано \n Cдвинуть два куска урана... \n \n Вопрос: Какова должна быть общая масска кусков урана, чтобы произошел ядерный взрыв?";
    final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
    }


    @Override
    public void onImageClick(View v) {
        ImageButton btn;
        mText.setValue(task);
    }


    @Override
    public LiveData<String> getText() {
        return mText;
    }
}