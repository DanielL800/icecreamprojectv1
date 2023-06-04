package com.example.icecreamproject1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.icecreamproject1.R;

public class ForgotPassword extends AppCompatActivity {

    Button btnPhone;
    ConstraintLayout sectionPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        btnPhone = findViewById(R.id.btnOtroMetodo);
        sectionPhone = findViewById(R.id.recuperarconCelular);

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sectionPhone.getVisibility() == View.VISIBLE){
                    sectionPhone.setVisibility(View.GONE);//Ocultar la seccion
                } else {
                    sectionPhone.setVisibility(View.VISIBLE); //Mostrar la seccion
                }
            }
        });
    }
}