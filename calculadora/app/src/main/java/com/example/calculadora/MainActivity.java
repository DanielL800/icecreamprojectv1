package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers = findViewById(R.id.TVnumbers);

        Button b1 = findViewById(R.id.Bone);
        Button b2 = findViewById(R.id.Btwo);
        Button b3 = findViewById(R.id.Btrhee);
        Button b4 = findViewById(R.id.Bfour);
        Button b5 = findViewById(R.id.Bfive);
        Button b6 = findViewById(R.id.Bsix);
        Button b7 = findViewById(R.id.Bseven);
        Button b8 = findViewById(R.id.Beight);
        Button b9 = findViewById(R.id.Bnine);
        Button b0 = findViewById(R.id.Bcero);

        Button bsum = findViewById(R.id.Bsum);
        Button brest = findViewById(R.id.Brest);
        Button bmult = findViewById(R.id.Bmulti);
        Button bdiv = findViewById(R.id.Bdiv);
        Button biqual = findViewById(R.id.Biqual);

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();


    }

}