package com.example.icecreamproject1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.icecreamproject1.R;

public class RegistroUser extends AppCompatActivity {

    ImageView imgHelado1;
    Button continuar;
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_user);

        imgHelado1 = findViewById(R.id.imgVIce1);
        continuar = findViewById(R.id.btnContinuar);
        btnBack = findViewById(R.id.btnBack2);

        //Permite volver a la activity anterior (en este caso Login)
        Functions function1 = new Functions();
        function1.handleArrowBackClickToLogin(btnBack, Login.class);
    }
}