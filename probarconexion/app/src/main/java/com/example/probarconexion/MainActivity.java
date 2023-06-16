package com.example.probarconexion;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;
    Button btn;
    String user, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1  = (EditText) findViewById(R.id.editTextText);
        text2 = (EditText) findViewById(R.id.editTextText2);
        btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = text1.getText().toString();
                password = text2.getText().toString();
                if (!user.isEmpty() && !user.isEmpty()){
                    validarusuario("https://helarticoproject.000webhostapp.com/apiicedreamproject/autenticar.php");
                } else {
                    Toast.makeText(MainActivity.this, "Debes completar todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    } //Cierre OnCreate

    private void validarusuario(String URL){

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(!response.isEmpty()){
                    Intent seguir = new Intent(MainActivity.this, Principal.class);
                    startActivity(seguir);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario y contraseña incorrecta", Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();
            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String>parametros= new HashMap<String,String>();
                parametros.put("texto1",text1.getText().toString());
                parametros.put("texto2",text2.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestqueve = Volley.newRequestQueue(this);
        requestqueve.add(stringRequest);
    }
}