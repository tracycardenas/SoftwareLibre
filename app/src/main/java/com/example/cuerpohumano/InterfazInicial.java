package com.example.cuerpohumano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class InterfazInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_inicial);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK){
            startActivity(new Intent(InterfazInicial.this,MainActivity2.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}