package com.example.cuerpohumano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class SistemaOseo extends AppCompatActivity {

    Button simular;
    CheckBox opcionfruta, lacteos,carne;
    RadioButton todoslosdias, unavez,tresveces;
    double porcentaje= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_oseo);
        simular = findViewById(R.id.simular);
        opcionfruta = findViewById(R.id.Opcionfruta);
        lacteos = findViewById(R.id.lacteos);
        carne = findViewById(R.id.carnes);
        todoslosdias = findViewById(R.id.todoslosdias);
        unavez = findViewById(R.id.unavez);
        tresveces = findViewById(R.id.tresveces);

        simular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calcularProrcentaje();
            }
        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK){
            startActivity(new Intent(SistemaOseo.this,InterfazInicial.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }


    public void calcularProrcentaje(){
        if (opcionfruta.isSelected()){
            if (todoslosdias.isSelected()){
                porcentaje = porcentaje+100;
            }
        }

    }
}