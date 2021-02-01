package com.example.cuerpohumano;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;



public class SistemaOseo extends AppCompatActivity {

    Button siguiente, mostrar;
    ScaleGestureDetector detector;
    float xBegin =0;
    float yBegin = 0;
    RadioButton calcio,alimentacion,cirugias,esteroides,sedentario, alcohol,hereditarios,lesiones,obesidad,diabetes,vitaminad,crecimiento,prematuro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_oseo);
        mostrar = findViewById(R.id.mostrar);
        siguiente = findViewById(R.id.siguiente);
        calcio=(RadioButton) findViewById(R.id.calcio);
        alimentacion = findViewById(R.id.alimentacion);
        cirugias = findViewById(R.id.cirugias);
        esteroides = findViewById(R.id.esteroides);
        sedentario = findViewById(R.id.sedentario);
        alcohol = findViewById(R.id.alcohol);
        hereditarios = findViewById(R.id.hereditarios);
        lesiones = findViewById(R.id.lesiones);
        obesidad = findViewById(R.id.obesidad);
        diabetes = findViewById(R.id.diabetes);
        vitaminad = findViewById(R.id.vitaminaD);
        crecimiento = findViewById(R.id.crecimiento);
        prematuro = findViewById(R.id.prematuro);
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
                if (calcio.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.osteoporosisi);
                    imtexto.setImageResource(R.drawable.osteoporosisconc);
                    imageView2.setImageResource(R.drawable.osteoporosis2);


                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.canceroseo);
                            imtexto.setImageResource(R.drawable.canceroseoc);
                            imageView2.setImageResource(R.drawable.canceroseo2);
                        }
                    });
                }
                if (cirugias.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.osteoporosisi);
                    imtexto.setImageResource(R.drawable.osteoporosisconc);
                    imageView2.setImageResource(R.drawable.osteoporosis2);


                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.osteomelitis);
                            imageView2.setImageResource(R.drawable.osteomelitis2);
                            imtexto.setImageResource(R.drawable.osteomelitiscon);
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setImageResource(R.drawable.osteomalacia);
                                    imageView2.setImageResource(R.drawable.osteomalacia2);
                                    imtexto.setImageResource(R.drawable.osteomalaciacon);
                                }
                            });
                        }
                    });
                }

                if (hereditarios.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.canceroseo);
                    imtexto.setImageResource(R.drawable.canceroseoc);
                    imageView2.setImageResource(R.drawable.canceroseo2);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.artritis);
                            imageView2.setImageResource(R.drawable.artritis2);
                            imtexto.setImageResource(R.drawable.artritiscon);
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setImageResource(R.drawable.osteogenesis);
                                    imageView2.setImageResource(R.drawable.osteogenesis2);
                                    imtexto.setImageResource(R.drawable.osteogenesiscon);
                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            imageView.setImageResource(R.drawable.paget);
                                            imageView2.setImageResource(R.drawable.paget2);
                                            imtexto.setImageResource(R.drawable.pagetcon);
                                        }
                                    });
                                }
                            });
                        }
                    });

                }

                if(lesiones.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.artritis);
                    imageView2.setImageResource(R.drawable.artritis2);
                    imtexto.setImageResource(R.drawable.artritiscon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.osteomelitis);
                            imageView2.setImageResource(R.drawable.osteomelitis2);
                            imtexto.setImageResource(R.drawable.osteomelitiscon);
                        }
                    });

                }

                if (vitaminad.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.osteomalacia);
                    imageView2.setImageResource(R.drawable.osteomalacia2);
                    imtexto.setImageResource(R.drawable.osteomalaciacon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.raquitismo);
                            imageView2.setImageResource(R.drawable.raquitismo2);
                            imtexto.setImageResource(R.drawable.raquitismocon);
                        }
                    });

                }

                if( alimentacion.isChecked()==true || esteroides.isChecked()==true || sedentario.isChecked()==true || alcohol.isChecked()==true){
                    imtexto.setImageResource(R.drawable.osteoporosisconc);
                    imageView2.setImageResource(R.drawable.osteoporosisi);
                    imageView.setImageResource(R.drawable.osteoporosis2);
                }

                if ( obesidad.isChecked()==true ){
                    imageView.setImageResource(R.drawable.artritis);
                    imageView2.setImageResource(R.drawable.artritis2);
                    imtexto.setImageResource(R.drawable.artritiscon);
                }
                if (diabetes.isChecked()==true){
                    imageView.setImageResource(R.drawable.osteomelitis);
                    imageView2.setImageResource(R.drawable.osteomelitis2);
                    imtexto.setImageResource(R.drawable.osteomelitiscon);
                }
                if (crecimiento.isChecked()==true){
                    imageView.setImageResource(R.drawable.acromegalia);
                    imageView2.setImageResource(R.drawable.acromegalia2);
                    imtexto.setImageResource(R.drawable.acromegaliacon);
                }
                if (prematuro.isChecked()==true){
                    imageView.setImageResource(R.drawable.raquitismo);
                    imageView2.setImageResource(R.drawable.raquitismo2);
                    imtexto.setImageResource(R.drawable.raquitismocon);
                }

                if (prematuro.isChecked()==true || crecimiento.isChecked() == true || diabetes.isChecked()==true || obesidad.isChecked()== true
                || alimentacion.isChecked()==true
                        || esteroides.isChecked()==true || sedentario.isChecked()==true || alcohol.isChecked()==true ) {
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
            startActivity(new Intent(SistemaOseo.this,InterfazInicial.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }




}