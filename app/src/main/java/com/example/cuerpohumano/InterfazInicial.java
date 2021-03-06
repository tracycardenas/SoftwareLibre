package com.example.cuerpohumano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class InterfazInicial extends AppCompatActivity {

    Button btn_oseo,btn_respiratorio,btn_circulatorio,btn_digestivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_inicial);
        btn_oseo=findViewById(R.id.btn_oseo);
        btn_oseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InterfazInicial.this,SistemaOseo.class));
            }
        });

        btn_circulatorio = findViewById(R.id.btn_circulatorio);
        btn_circulatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InterfazInicial.this,SistemaCirculatorio.class));

            }
        });

        btn_respiratorio = findViewById(R.id.btn_respiratorio);
        btn_respiratorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InterfazInicial.this,SistemaRespiratorio.class));
            }
        });

        btn_digestivo = findViewById(R.id.btn_digestivo);
        btn_digestivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InterfazInicial.this,SistemaDigestivo.class));
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK){
            startActivity(new Intent(InterfazInicial.this,MainActivity2.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}