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

public class SistemaDigestivo extends AppCompatActivity {

    Button siguiente, mostrar;
    ScaleGestureDetector detector;
    float xBegin =0;
    float yBegin = 0;
    RadioButton consumo,obesidad,embarazo,esclerodermia,tabaquismo,recostarse,sedentarismo,diabetes,perder,hereditarios,ambientales,
        dietabaja,dietaalta,farmacos,esfuerzo,estrenimiento, levantar,contracciones,inflamacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_digestivo);
        consumo = findViewById(R.id.consumo);
        obesidad = findViewById(R.id.obesidad);
        embarazo = findViewById(R.id.embarazo);
        esclerodermia = findViewById(R.id.esclerodermia);
        tabaquismo = findViewById(R.id.tabaquismo);
        recostarse = findViewById(R.id.recostarse);
        sedentarismo = findViewById(R.id.sedentarismo);
        diabetes = findViewById(R.id.diabetes);
        perder = findViewById(R.id.perder);
        hereditarios = findViewById(R.id.hereditarios);
        ambientales = findViewById(R.id.ambientales);
        dietabaja = findViewById(R.id.dietabaja);
        dietaalta = findViewById(R.id.dietaalta);
        farmacos = findViewById(R.id.farmacos);
        esfuerzo = findViewById(R.id.esfuerzo);
        estrenimiento = findViewById(R.id.estrenimiento);
        levantar = findViewById(R.id.levantar);
        contracciones = findViewById(R.id.contracciones);
        inflamacion = findViewById(R.id.inflamacion);
        ImageView imageView = (ImageView) findViewById(R.id.image1);
        ImageView imageView2 = (ImageView) findViewById(R.id.image2);
        ImageView imtexto = (ImageView) findViewById(R.id.imtexto);
        xBegin = imtexto.getScaleX();
        yBegin =imtexto.getScaleY();
        detector = new ScaleGestureDetector(this,new ScaleListener(imtexto));
        siguiente = findViewById(R.id.siguiente);
        siguiente.setVisibility(View.INVISIBLE);
        mostrar = findViewById(R.id.mostrar);
        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (obesidad.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.gastroesofagico);
                    imageView2.setImageResource(R.drawable.gastroesofagico2);
                    imtexto.setImageResource(R.drawable.gastroesofagicocon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.calculos);
                            imageView2.setImageResource(R.drawable.calculos2);
                            imtexto.setImageResource(R.drawable.calculoscon);
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setImageResource(R.drawable.diverticulocis);
                                    imageView2.setImageResource(R.drawable.diverticulocis2);
                                    imtexto.setImageResource(R.drawable.diverticulociscon);
                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            imageView.setImageResource(R.drawable.hemorroides);
                                            imageView2.setImageResource(R.drawable.hemorroides2);
                                            imtexto.setImageResource(R.drawable.hemorroidescon);
                                        }
                                    });
                                }
                            });
                        }
                    });

                }
                if (embarazo.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.gastroesofagico);
                    imageView2.setImageResource(R.drawable.gastroesofagico2);
                    imtexto.setImageResource(R.drawable.gastroesofagicocon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.calculos);
                            imageView2.setImageResource(R.drawable.calculos2);
                            imtexto.setImageResource(R.drawable.calculoscon);
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setImageResource(R.drawable.hemorroides);
                                    imageView2.setImageResource(R.drawable.hemorroides2);
                                    imtexto.setImageResource(R.drawable.hemorroidescon);
                                }
                            });
                        }
                    });
                }

                if (tabaquismo.isChecked() == true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.gastroesofagico);
                    imageView2.setImageResource(R.drawable.gastroesofagico2);
                    imtexto.setImageResource(R.drawable.gastroesofagicocon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.crohn);
                            imageView2.setImageResource(R.drawable.crohn2);
                            imtexto.setImageResource(R.drawable.crohncon);
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setImageResource(R.drawable.diverticulocis);
                                    imageView2.setImageResource(R.drawable.diverticulocis2);
                                    imtexto.setImageResource(R.drawable.diverticulociscon);
                                }
                            });
                        }
                    });
                }
                if (sedentarismo.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.calculos);
                    imageView2.setImageResource(R.drawable.calculos2);
                    imtexto.setImageResource(R.drawable.calculoscon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.diverticulocis);
                            imageView2.setImageResource(R.drawable.diverticulocis2);
                            imtexto.setImageResource(R.drawable.diverticulociscon);
                        }
                    });
                }

                if (hereditarios.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.crohn);
                    imageView2.setImageResource(R.drawable.crohn2);
                    imtexto.setImageResource(R.drawable.crohncon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.colitis);
                            imageView2.setImageResource(R.drawable.colitis2);
                            imtexto.setImageResource(R.drawable.colitiscon);
                        }
                    });
                }

                if (dietabaja.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.diverticulocis);
                    imageView2.setImageResource(R.drawable.diverticulocis2);
                    imtexto.setImageResource(R.drawable.diverticulociscon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.hemorroides);
                            imageView2.setImageResource(R.drawable.hemorroides2);
                            imtexto.setImageResource(R.drawable.hemorroidescon);
                        }
                    });
                }
                if (consumo.isChecked()==true ||esclerodermia.isChecked()==true || recostarse.isChecked()==true){
                    imageView.setImageResource(R.drawable.gastroesofagico);
                    imageView2.setImageResource(R.drawable.gastroesofagico2);
                    imtexto.setImageResource(R.drawable.gastroesofagicocon);
                }
                if (diabetes.isChecked() == true || perder.isChecked()==true){
                    imageView.setImageResource(R.drawable.calculos);
                    imageView2.setImageResource(R.drawable.calculos2);
                    imtexto.setImageResource(R.drawable.calculoscon);
                }

                if (ambientales.isChecked()==true){
                    imageView.setImageResource(R.drawable.crohn);
                    imageView2.setImageResource(R.drawable.crohn2);
                    imtexto.setImageResource(R.drawable.crohncon);
                }
                if (dietaalta.isChecked()==true || farmacos.isChecked()==true){
                    imageView.setImageResource(R.drawable.diverticulocis);
                    imageView2.setImageResource(R.drawable.diverticulocis2);
                    imtexto.setImageResource(R.drawable.diverticulociscon);
                }
                if (esfuerzo.isChecked()==true || estrenimiento.isChecked()==true || levantar.isChecked()==true){
                    imageView.setImageResource(R.drawable.hemorroides);
                    imageView2.setImageResource(R.drawable.hemorroides2);
                    imtexto.setImageResource(R.drawable.hemorroidescon);
                }
                if (contracciones.isChecked()==true || inflamacion.isChecked()==true){
                    imageView.setImageResource(R.drawable.irritable);
                    imageView2.setImageResource(R.drawable.irritable2);
                    imtexto.setImageResource(R.drawable.irritablecon);
                }

                if (consumo.isChecked()==true ||esclerodermia.isChecked()==true || recostarse.isChecked()==true
                        || diabetes.isChecked() == true || perder.isChecked()==true
                            || ambientales.isChecked()==true || dietaalta.isChecked()==true || farmacos.isChecked()==true
                                || esfuerzo.isChecked()==true || estrenimiento.isChecked()==true || levantar.isChecked()==true
                                    ||contracciones.isChecked()==true || inflamacion.isChecked()==true )   {
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
            startActivity(new Intent(SistemaDigestivo.this,InterfazInicial.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

}