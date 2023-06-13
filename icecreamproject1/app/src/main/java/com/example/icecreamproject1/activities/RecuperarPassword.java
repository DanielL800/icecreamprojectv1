package com.example.icecreamproject1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.icecreamproject1.R;

public class RecuperarPassword extends AppCompatActivity {

    ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_password);


        btnBack = findViewById(R.id.arrowBack);

        //Permite volver a la activity anterior (en este caso Login)
        Functions function1 = new Functions();
        function1.handleArrowBackClickToLogin(btnBack, Login.class);
    }
}