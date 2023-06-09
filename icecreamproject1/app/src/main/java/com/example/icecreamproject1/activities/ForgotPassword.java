package com.example.icecreamproject1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.icecreamproject1.R;

public class ForgotPassword extends AppCompatActivity {

    Button sendSMS;
    ConstraintLayout sectionPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        sectionPhone = findViewById(R.id.recuperarconCelular);

    }
}