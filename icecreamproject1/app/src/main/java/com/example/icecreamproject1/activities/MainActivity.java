package com.example.icecreamproject1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.icecreamproject1.R;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    Vector<String> vectorPrecios = new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vectorPrecios.add("2500");
        spinner1 = findViewById(R.id.spinnerP);
        ArrayAdapter<String>adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, vectorPrecios);
        spinner1.setAdapter(adapter1);
    }
}