package com.example.cuerpohumano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class SistemaCirculatorio extends AppCompatActivity {

    RadioButton presion, colesterol, tabaquismo, diabetes, inflamacion,apnea,problemas,tumores,problemasti,medicamentos,drogas,
    obstruccion, coagulo, enfermedades, ruptura,ataque, infeccion,sarampion,oido,diente,celulitis;
    Button mostrar, siguiente;
    ScaleGestureDetector detector;
    float xBegin =0;
    float yBegin = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_circulatorio);
        presion = findViewById(R.id.presion);
        colesterol = findViewById(R.id.colesterol);
        tabaquismo = findViewById(R.id.tabquismo);
        diabetes = findViewById(R.id.diabetes);
        inflamacion = findViewById(R.id.inflamacion);
        problemas = findViewById(R.id.problemas);
        tumores = findViewById(R.id.tumores);
        problemasti = findViewById(R.id.problemastiro);
        medicamentos = findViewById(R.id.medicamentos);
        drogas = findViewById(R.id.drogas);
        obstruccion = findViewById(R.id.obstruccion);
        enfermedades = findViewById(R.id.enfermedades);
        ruptura = findViewById(R.id.ruptura);
        ataque = findViewById(R.id.ataque);
        infeccion= findViewById(R.id.infeccion);
        sarampion = findViewById(R.id.sarampion);
        oido = findViewById(R.id.oido);
        diente = findViewById(R.id.diente);
        celulitis = findViewById(R.id.celulitis);
        mostrar = findViewById(R.id.mostrar);
        siguiente = findViewById(R.id.siguiente);
        ImageView imageView = (ImageView) findViewById(R.id.image1);
        ImageView imageView2 = (ImageView) findViewById(R.id.image2);
        ImageView imtexto = (ImageView) findViewById(R.id.imtexto);
        xBegin = imtexto.getScaleX();
        yBegin =imtexto.getScaleY();
        detector = new ScaleGestureDetector(this,new ScaleListener(imtexto));
        siguiente.setVisibility(View.INVISIBLE);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (presion.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.aterosclerosis);
                    imageView2.setImageResource(R.drawable.aterosclerosis2);
                    imtexto.setImageResource(R.drawable.aterosclerosiscon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.arritmias);
                            imageView2.setImageResource(R.drawable.arritmias2);
                            imtexto.setImageResource(R.drawable.arritmiascon);
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setImageResource(R.drawable.insuficiencia);
                                    imageView2.setImageResource(R.drawable.insuficiencia2);
                                    imtexto.setImageResource(R.drawable.insuficienciacon);
                                }
                            });
                        }
                    });
                }

                if (diabetes.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.aterosclerosis);
                    imageView2.setImageResource(R.drawable.aterosclerosis2);
                    imtexto.setImageResource(R.drawable.aterosclerosiscon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.infarto);
                            imageView2.setImageResource(R.drawable.infarto2);
                            imtexto.setImageResource(R.drawable.infartocon);
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setImageResource(R.drawable.arritmias);
                                    imageView2.setImageResource(R.drawable.arritmias2);
                                    imtexto.setImageResource(R.drawable.arritmiascon);
                                }
                            });
                        }
                    });
                }
                if (ataque.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.arritmias);
                    imageView2.setImageResource(R.drawable.arritmias2);
                    imtexto.setImageResource(R.drawable.arritmiascon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.insuficiencia);
                            imageView2.setImageResource(R.drawable.insuficiencia2);
                            imtexto.setImageResource(R.drawable.insuficienciacon);
                        }
                    });
                }



                if (colesterol.isChecked()==true || tabaquismo.isChecked()==true || inflamacion.isChecked()==true){
                    imageView.setImageResource(R.drawable.aterosclerosis);
                    imageView2.setImageResource(R.drawable.aterosclerosis2);
                    imtexto.setImageResource(R.drawable.aterosclerosiscon);
                }

                if (problemas.isChecked()==true || tumores.isChecked()==true || problemasti.isChecked()==true || medicamentos.isChecked()==true || drogas.isChecked()==true){
                    imageView.setImageResource(R.drawable.hipertension);
                    imageView2.setImageResource(R.drawable.hipertension2);
                    imtexto.setImageResource(R.drawable.hipertensioncon);
                }

                if (obstruccion.isChecked()==true || enfermedades.isChecked()==true){
                    imageView.setImageResource(R.drawable.infarto);
                    imageView2.setImageResource(R.drawable.infarto2);
                    imtexto.setImageResource(R.drawable.infartocon);
                }
                if (ruptura.isChecked()==true){
                    imageView.setImageResource(R.drawable.accidente);
                    imageView2.setImageResource(R.drawable.accidente2);
                    imtexto.setImageResource(R.drawable.accidentecon);
                }

                if (infeccion.isChecked()==true){
                    imageView.setImageResource(R.drawable.arritmias);
                    imageView2.setImageResource(R.drawable.arritmias2);
                    imtexto.setImageResource(R.drawable.arritmiascon);
                }
                if (sarampion.isChecked()==true || oido.isChecked()==true || diente.isChecked()== true || celulitis.isChecked()==true ){
                    imageView.setImageResource(R.drawable.linfadenopatia);
                    imageView2.setImageResource(R.drawable.linfadenopatia2);
                    imtexto.setImageResource(R.drawable.linfadenopatiacon);
                }

                if (colesterol.isChecked()==true || tabaquismo.isChecked()==true || inflamacion.isChecked()==true ||
                        problemas.isChecked()==true || tumores.isChecked()==true || problemasti.isChecked()==true || medicamentos.isChecked()==true || drogas.isChecked()==true ||
                obstruccion.isChecked()==true || enfermedades.isChecked()==true ||ruptura.isChecked()==true || infeccion.isChecked()==true
                || sarampion.isChecked()==true || oido.isChecked()==true || diente.isChecked()== true || celulitis.isChecked()==true ){
                    siguiente.setVisibility(View.INVISIBLE);
                }

            }
        });


    }

    public boolean onTouchEvent (MotionEvent event){
        detector.onTouchEvent(event);
        return super.onTouchEvent(event);

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK){
            startActivity(new Intent(SistemaCirculatorio.this,InterfazInicial.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}