package com.example.cuerpohumano.login;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginModel implements LoginInterface.Model {

    private LoginInterface.TaskListener listener;
    private FirebaseAuth auth;

    public LoginModel(LoginInterface.TaskListener listener) {
        this.listener = listener;
        auth= FirebaseAuth.getInstance();
    }

    @Override
    public void toLogin(String email, String password) {
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    listener.onSource();
                }

            }
        });

    }
}
