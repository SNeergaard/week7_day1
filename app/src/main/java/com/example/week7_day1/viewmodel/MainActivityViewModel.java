package com.example.week7_day1.viewmodel;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;



import com.example.week7_day1.R;
import com.example.week7_day1.model.user.Login;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.auth.FirebaseUser;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivityViewModel extends ViewModel implements Observable {
    private CallbackManager callbackManager;
    private LoginButton loginButton;

    @Bindable
    public String userName;
    @Bindable
    public String password;

    public MainActivityViewModel(){

    }


    public void userName(CharSequence s) {

    }

    public void password(CharSequence s) {

    }

    public void onLogInClicked(View view) {
//        switch (view.getId()){
//            case R.id.login_button:
//                callbackManager = CallbackManager.Factory.create();
//                loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//                    @Override
//                    public void onSuccess(LoginResult loginResult) {
//
//                    }
//
//                    @Override
//                    public void onCancel() {
//
//                    }
//
//                    @Override
//                    public void onError(FacebookException error) {
//
//                    }
//                });
//        }
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
}
