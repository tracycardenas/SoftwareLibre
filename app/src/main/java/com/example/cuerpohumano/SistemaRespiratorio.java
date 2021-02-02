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

public class SistemaRespiratorio extends AppCompatActivity {

    Button siguiente, mostrar;
    ScaleGestureDetector detector;
    float xBegin =0;
    float yBegin = 0;
    RadioButton traumatismo, desviacion, expuesto,cambios,humo, marihuana, contaminacion,vapores,tumor,lesiones,neumonia,infecciones, alergias, exposicional,radioterapia,vasos,ampollas,ventilacion, vomito,tuberculosis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_respiratorio);
        traumatismo = findViewById(R.id.traumatismo);
        desviacion = findViewById(R.id.desviacion);
        cambios = findViewById(R.id.cambios);
        humo = findViewById(R.id.humo);
        marihuana = findViewById(R.id.marihuana);
        contaminacion = findViewById(R.id.contaminacion);
        lesiones = findViewById(R.id.lesiones);
        neumonia = findViewById(R.id.neumonia);
        infecciones = findViewById(R.id.infecciones);
        alergias = findViewById(R.id.alergias);
        exposicional = findViewById(R.id.exposicion);
        radioterapia = findViewById(R.id.radioterapia);
        vasos = findViewById(R.id.vasos);
        ampollas = findViewById(R.id.ampollas);
        ventilacion = findViewById(R.id.ventilacion);
        vomito = findViewById(R.id.vomito);
        tuberculosis = findViewById(R.id.tuberculosis);
        mostrar = findViewById(R.id.mostrar);
        siguiente = findViewById(R.id.siguiente);
        siguiente.setVisibility(View.INVISIBLE);
        ImageView imageView = (ImageView) findViewById(R.id.image1);
        ImageView imageView2 = (ImageView) findViewById(R.id.image2);
        ImageView imtexto = (ImageView) findViewById(R.id.imtexto);
        xBegin = imtexto.getScaleX();
        yBegin =imtexto.getScaleY();
        detector = new ScaleGestureDetector(this,new ScaleListener(imtexto));
        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (traumatismo.isChecked()== true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.epistaxis);
                    imageView2.setImageResource(R.drawable.epistaxis2);
                    imtexto.setImageResource(R.drawable.epistaxiscon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.mediastinitis);
                            imageView2.setImageResource(R.drawable.mediastinitis2);
                            imtexto.setImageResource(R.drawable.mediastinitiscon);

                        }
                    });
                }
                if (desviacion.isChecked() == true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.epistaxis);
                    imageView2.setImageResource(R.drawable.epistaxis2);
                    imtexto.setImageResource(R.drawable.epistaxiscon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.rinosinositis);
                            imageView2.setImageResource(R.drawable.rinosinositis2);
                            imtexto.setImageResource(R.drawable.rinosinositisco);
                        }
                    });
                }
                if (humo.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.enfisema);
                    imageView2.setImageResource(R.drawable.enfisema2);
                    imtexto.setImageResource(R.drawable.enfisemacon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.cancer);
                            imageView2.setImageResource(R.drawable.cancer2);
                            imtexto.setImageResource(R.drawable.cancercon);
                        }
                    });
                }
                if (lesiones.isChecked()==true){
                    siguiente.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.atelectasia);
                    imageView2.setImageResource(R.drawable.atelectasia2);
                    imtexto.setImageResource(R.drawable.atelectasiacon);
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setImageResource(R.drawable.neumotorax);
                            imageView2.setImageResource(R.drawable.neumotorax2);
                            imtexto.setImageResource(R.drawable.neumotoraxcon);
                        }
                    });
                }
                if (  cambios.isChecked()==true){
                    imageView.setImageResource(R.drawable.epistaxis);
                    imageView2.setImageResource(R.drawable.epistaxis2);
                    imtexto.setImageResource(R.drawable.epistaxiscon);
                }
                if (marihuana.isChecked()==true || contaminacion.isChecked()==true){
                    imageView.setImageResource(R.drawable.enfisema);
                    imageView2.setImageResource(R.drawable.enfisema2);
                    imtexto.setImageResource(R.drawable.enfisemacon);
                }
                if (neumonia.isChecked()==true ){
                    imageView.setImageResource(R.drawable.atelectasia);
                    imageView2.setImageResource(R.drawable.atelectasia2);
                    imtexto.setImageResource(R.drawable.atelectasiacon);
                }
                if ( infecciones.isChecked()==true || alergias.isChecked()==true ){
                    imageView.setImageResource(R.drawable.rinosinositis);
                    imageView2.setImageResource(R.drawable.rinosinositis2);
                    imtexto.setImageResource(R.drawable.rinosinositisco);
                }
                if (exposicional.isChecked()==true || radioterapia.isChecked()==true ){
                    imageView.setImageResource(R.drawable.cancer);
                    imageView2.setImageResource(R.drawable.cancer2);
                    imtexto.setImageResource(R.drawable.cancercon);
                }
                if (vasos.isChecked()==true){
                    imageView.setImageResource(R.drawable.derrame);
                    imageView2.setImageResource(R.drawable.derrame2);
                    imtexto.setImageResource(R.drawable.derramecon);
                }

                if (ampollas.isChecked()==true || ventilacion.isChecked()==true ){
                    imageView.setImageResource(R.drawable.neumotorax);
                    imageView2.setImageResource(R.drawable.neumotorax2);
                    imtexto.setImageResource(R.drawable.neumotoraxcon);
                }
                if (vomito.isChecked()==true || tuberculosis.isChecked()==true){
                    imageView.setImageResource(R.drawable.mediastinitis);
                    imageView2.setImageResource(R.drawable.mediastinitis2);
                    imtexto.setImageResource(R.drawable.mediastinitiscon);
                }

                if (cambios.isChecked()==true|| marihuana.isChecked()==true || contaminacion.isChecked()==true || neumonia.isChecked()==true
                       || infecciones.isChecked()==true || alergias.isChecked()==true || exposicional.isChecked()==true || radioterapia.isChecked()==true
                            || vasos.isChecked()==true || ampollas.isChecked()==true || ventilacion.isChecked()==true || vomito.isChecked()==true || tuberculosis.isChecked()==true ){
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
            startActivity(new Intent(SistemaRespiratorio.this,InterfazInicial.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}