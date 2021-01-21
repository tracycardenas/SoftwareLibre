package com.example.cuerpohumano.login;

import com.example.cuerpohumano.MainActivity2;
import com.example.cuerpohumano.login.LoginInterface;

public class LoginPresenter implements LoginInterface.Presenter, LoginInterface.TaskListener {
    private LoginInterface.View view;
    private LoginInterface.Model model;


    public LoginPresenter (LoginInterface.View view) {
        this.view=view;
        model = new LoginModel(this);
    }

    @Override
    public void onDestoy() {


    }

    @Override
    public void tologin(String email, String password) {

        model.toLogin(email,password);

    }

    @Override
    public void onSource() {
        if (view!=null){
            view.enableInputs();
            view.onLogin();
        }

    }

    @Override
    public void onError(String error) {
        if (view!=null){
            view.onError(error);
        }

    }
}
