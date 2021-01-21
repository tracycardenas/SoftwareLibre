package com.example.cuerpohumano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cuerpohumano.login.LoginInterface;
import com.example.cuerpohumano.login.LoginPresenter;

public class MainActivity2 extends AppCompatActivity implements LoginInterface.View {
    Button crearcuenta, iniciar_sesion;
    private EditText et_correo, et_contrasena;
    private LoginInterface.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setViews();
        crearcuenta=findViewById(R.id.crearcuenta);
        crearcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,SignUp.class));
                finish();
            }
        });
        iniciar_sesion = findViewById(R.id.iniciar_sesion);
        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,InterfazInicial.class));
                Toast.makeText(MainActivity2.this,"BIENVENIDO", Toast.LENGTH_SHORT).show();
                //aqui base de datos
                handleLogin();
            }
        });

    }

    private void setViews() {
        presenter = new LoginPresenter(this);
        et_correo = findViewById(R.id.et_correo);
        et_contrasena = findViewById(R.id.et_contrasena);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK){
            startActivity(new Intent(MainActivity2.this,Login2.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }



    private void setInputs(boolean enable){
        et_correo.setEnabled(enable);
        et_contrasena.setEnabled(enable);
        iniciar_sesion.setEnabled(enable);
    }

    @Override
    public void disableInputs() {
        setInputs(false);

    }

    @Override
    public void enableInputs() {
        setInputs(true);

    }

    @Override
    public void showProgress() {


    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void handleLogin() {
        presenter.tologin(et_correo.getText().toString().trim(),et_contrasena.getText().toString().trim());

    }


    @Override
    public void onLogin() {


    }

    @Override
    public void onError(String error) {

    }
}