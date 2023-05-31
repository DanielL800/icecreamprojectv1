package com.example.icecreamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    // INGRESO DE USUARIO NUEVO
    private String idUsuario, nombres, usuario, email, telefono, rol, estado;
    private String[] dataUser;

    private String user, contrasena;
    EditText correo;
    EditText password;
    Button btnIngreso;
    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correo = findViewById(R.id.editTextText);
        password = findViewById(R.id.Text2pass);
        btnIngreso = findViewById(R.id.Btningresar);
        btnRegistro = findViewById(R.id.btnregistro);

        btnIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = correo.getText().toString();
                contrasena = password.getText().toString();
                Toast.makeText(Login.this, "Hola Usuario " + user, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


