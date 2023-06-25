package com.example.icecreamproject1.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

import com.example.icecreamproject1.R;

public class Login extends AppCompatActivity {

    private String email, contrasena;
    private EditText correo;
     private EditText password;
     Button btnIngreso;
    Button btnRegistro;

    //Button hiden password
    private boolean passVisible = false;
    private ImageButton showPassword; //visibility img

    Button btnForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correo = findViewById(R.id.edtDoc);
        password = findViewById(R.id.Text2pass);
        btnIngreso = findViewById(R.id.btnContinuar);
        btnRegistro = findViewById(R.id.btnregistro);
        showPassword = findViewById(R.id.imgBtnvisibility);
        btnForgot = findViewById(R.id.btnOlvidar);

        //Evento btn ingresar -----------------//
        btnIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email= correo.getText().toString();
                contrasena = password.getText().toString();
                if (!email.isEmpty() && !email.isEmpty()){
                    validarusuario("https://helarticoproject.000webhostapp.com/apiicedreamproject/autenticar.php");
                } else {
                    Toast.makeText(Login.this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                }
                //overridePendingTransition(R.anim.to_left, R.anim.from_right);
            }
        });

        //OCULTACION DE CONTRASEÑA------
        showPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passVisible){
                    //Si la contraseña es visible, ocultarla
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    showPassword.setImageResource(R.drawable.baseline_visibility_off_24);
                    //passVisible = false;
                }else{
                    //Si no está visible la contraseña, mostrarla
                    //password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    password.setTransformationMethod(null);
                    showPassword.setImageResource(R.drawable.baseline_visibility_24);
                    //passVisible = true;
                }
                passVisible = !passVisible; //Invierte el valor del Boolean
            }
        });

        //Inicio activity RECUPERAR CONTRASEÑA---------------
        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPass = new Intent(Login.this, ForgotPassword.class);
                startActivity(intentPass);
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        //Inicio de la activity de Registro de nuevos usuarios------------////
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Login.this, RegistroUser.class);
                startActivity(intent1);
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

    }

    //VALIDACION DE USUARIO BASE DE DATOS 000WEBHOST
    private void validarusuario(String URL){

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(!response.isEmpty()){
                    Intent seguir = new Intent(Login.this, MainActivity.class);
                    startActivity(seguir);
                    //overridePendingTransition(R.anim.to_left, R.anim.from_right);
                }else{
                    Toast.makeText(Login.this, "Usuario y contraseña incorrecta", Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Login.this, error.toString(), Toast.LENGTH_LONG).show();
            }
        }){
            @Nullable

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String>parametros= new HashMap<String,String>();
                parametros.put("texto1",correo.getText().toString());
                parametros.put("texto2",password.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestqueve = Volley.newRequestQueue(this);
        requestqueve.add(stringRequest);
    }
}