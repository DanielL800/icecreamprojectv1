package com.guillo.conexionlogin;

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
    EditText dato1, dato2;
    Button boton;
    String usuario , contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dato1 = (EditText) findViewById(R.id.Tusuario);
        dato2 = (EditText) findViewById(R.id.Tcontrasena);
        boton = (Button) findViewById(R.id.Blogin);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario= dato1.getText().toString();
                contrasena = dato2.getText().toString();
                if (!usuario.isEmpty() && !usuario.isEmpty()){
                    // validarusuario("https://tutoriasguillo.000webhostapp.com/api16/validarusuario.php");
                    validarusuario("https://tutoriasguillo.000webhostapp.com/apiinvensoft/autenticar.php");
                }else{
                    Toast.makeText(MainActivity.this, "No se permiten campos vacios", Toast.LENGTH_SHORT).show();
                }
               
            }
        });

    }//cerrar oncreate
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
                parametros.put("texto1",dato1.getText().toString());
                parametros.put("texto2",dato2.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestqueve = Volley.newRequestQueue(this);
        requestqueve.add(stringRequest);
    }
}