package com.example.icecreamproject1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.icecreamproject1.R;

public class RegistroUser extends AppCompatActivity {

    ImageView imgHelado1;
    Button continar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_user);

        imgHelado1 = findViewById(R.id.imgVIce1);
        continar = findViewById(R.id.btnContinuar);

        Animation rotacionlenta = AnimationUtils.loadAnimation(RegistroUser.this, R.anim.rotacionimglenta);
        imgHelado1.startAnimation(rotacionlenta);
        continar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotateAnim = AnimationUtils.loadAnimation(RegistroUser.this, R.anim.rotacionimgrapida);
                imgHelado1.startAnimation(rotateAnim);
            }
        });
    }
}