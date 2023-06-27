package com.example.icecreamproject1.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.icecreamproject1.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RegistroUser extends AppCompatActivity {

    private String nombreCompletoS, documentoS, userS, passwordS, emailS, telefonoS, rolS, d1;
    ImageView imgHelado1;
    Button continuar;
    ImageButton btnBack;

    EditText nombreCompleto, documento, user, password, email, telefono, rol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_user);

        imgHelado1 = findViewById(R.id.imgVIce1);
        continuar = findViewById(R.id.btnContinuar);
        btnBack = findViewById(R.id.btnBack2);
        nombreCompleto = findViewById(R.id.edtNombre);
        documento = findViewById(R.id.edtDocument);
        user = findViewById(R.id.edTusuario);
        email = findViewById(R.id.edtCorreo);
        telefono = findViewById(R.id.edtCell);
        rol = findViewById(R.id.edTrol);
        //nombreCompletoS = nombreCompleto.getText().toString();
        //documentoS = documento.getText().toString();
        //userS = user.getText().toString();
        //emailS = email.getText().toString();
        //telefonoS = telefono.getText().toString();
        //rolS = rol.getText().toString();


        //Permite volver a la activity anterior (en este caso Login)
        Functions function1 = new Functions();
        function1.handleArrowBackClickToLogin(btnBack, Login.class);

        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarUsuario("https://helarticoproject.000webhostapp.com/apiicedreamproject/tbuser.php");
            }
        });
    }

    private void guardarUsuario(String URL){

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(!response.isEmpty()){

                    /*
                    * RECUPERAR DATOS DESPUES DE UNA INSERCION ########################
                    * try {
                            JSONObject jsonObject = new JSONObject(response);
                            d1 = jsonObject.getString("documento");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    * */

                    Intent iniciar = new Intent(RegistroUser.this, MainActivity.class);
                    startActivity(iniciar);
                    //overridePendingTransition(R.anim.to_left, R.anim.from_right);
                }else{
                    Toast.makeText(RegistroUser.this, "NO es posible el Registro", Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(RegistroUser.this, error.toString(), Toast.LENGTH_LONG).show();
            }
        }){
            @Nullable

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("texto1", documento.getText().toString());
                parametros.put("texto2", nombreCompleto.getText().toString());
                parametros.put("texto3", user.getText().toString());
                parametros.put("texto4", password.getText().toString());
                parametros.put("texto5", email.getText().toString());
                parametros.put("texto6", telefono.getText().toString());
                parametros.put("texto7", rol.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestqueve = Volley.newRequestQueue(this);
        requestqueve.add(stringRequest);
    }
}