package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contar(){ //Sirve para crear un contador
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                FinalizarMain();
            }
        }, 5000); // 8 Segundos
    }

    public void FinalizarMain(){ //Se tumba el main para que ingrese otra Activity (en este caso Login)
        Intent siguiente = new Intent(MainActivity.this, Login.class);
        startActivity(siguiente);
        finish(); //Finaliza el activity main
    }
}