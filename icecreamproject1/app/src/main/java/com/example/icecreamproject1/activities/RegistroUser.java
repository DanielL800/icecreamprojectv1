package com.example.icecreamproject1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.icecreamproject1.R;

public class RegistroUser extends AppCompatActivity {

    ImageView imgHelado1 = findViewById(R.id.imgVIce1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_user);

        Animation rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotacionimg);
        imgHelado1.startAnimation(rotateAnim);

    }
}