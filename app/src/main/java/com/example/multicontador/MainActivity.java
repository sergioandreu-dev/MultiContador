package com.example.multicontador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;

    int contadorGlobal = 0;
    TextView texto1;
    Button reset_all;

    TextView texto2;
    Button sum1;
    Button reset1;

    TextView texto3;
    Button sum2;
    Button reset2;

    TextView texto4;
    Button sum3;
    Button reset3;

    TextView texto5;
    Button sum4;
    Button reset4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        texto1 = findViewById(R.id.text);
        reset_all = findViewById(R.id.ResetAll);

        texto2 = findViewById(R.id.text2);
        sum1 = findViewById(R.id.Boton1);
        reset1 = findViewById(R.id.Reset1);

        texto3 = findViewById(R.id.text3);
        sum2 = findViewById(R.id.Boton2);
        reset2 = findViewById(R.id.Reset2);

        texto4 = findViewById(R.id.text4);
        sum3 = findViewById(R.id.Boton3);
        reset3 = findViewById(R.id.Reset3);

        texto5 = findViewById(R.id.text5);
        sum4 = findViewById(R.id.Boton4);
        reset4 = findViewById(R.id.Reset4);

        reset_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;
                texto1.setText("" + contadorGlobal);
                texto2.setText("" + contador1);
                texto3.setText("" + contador2);
                texto4.setText("" + contador3);
                texto5.setText("" + contador4);
            }
        });

        sum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1 ++;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto2.setText("" + contador1);
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vb) {
                contador1 = 0;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto2.setText("" + contador1);
            }
        });

        sum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vc) {
                contador2 ++;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto3.setText("" + contador2);
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vd) {
                contador2 = 0;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto3.setText("" + contador2);
            }
        });

        sum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View ve) {
                contador3 ++;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto4.setText("" + contador3);
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vf) {
                contador3 = 0;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto4.setText("" + contador3);
            }
        });

        sum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vg) {
                contador4 ++;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto5.setText("" + contador4);
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vh) {
                contador4 = 0;
                contadorGlobal = contador1 + contador2 + contador3 + contador4;

                texto1.setText("" + contadorGlobal);
                texto5.setText("" + contador4);
            }
        });
    }
}