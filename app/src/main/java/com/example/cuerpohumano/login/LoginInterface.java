package com.example.cuerpohumano.login;

public interface LoginInterface {
    interface  View {
        void disableInputs();
        void enableInputs();

        void showProgress();
        void hideProgress();

        void handleLogin();


        void onLogin();
        void onError(String error);

    }
    interface Presenter {
        void onDestoy();
        void tologin(String email, String password);

    }
    interface Model {
        void toLogin(String email, String password);

    }
    interface TaskListener {
        void onSource();
        void onError(String error);

    }
}
