package com.example.calculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, name;
    //private String user, signo;

    Operations c1 = new Operations();
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1=findViewById(R.id.et1); //Asignando editText a variable
        et2=findViewById(R.id.et2); //Asignando editText a variable
        tv1=findViewById(R.id.tv1); //Asignar TextView a variable
        name=findViewById(R.id.PText1);

        ImageButton Boperator = findViewById(R.id.operatorImg);
        ImageButton Bsumando = findViewById(R.id.Bsuma);
        ImageButton Bresta = findViewById(R.id.Bresta);
        ImageButton Bmulti = findViewById(R.id.multiImg);
        ImageButton Bdiv = findViewById(R.id.divImg);

        Button calc = findViewById(R.id.button2);
        Button Bmostrar = findViewById(R.id.Bmostrar);
        Button Benviar = findViewById(R.id.Benviar);
        Button bpasar = findViewById(R.id.Bpasar);

        //TextView nom;
        Toast.makeText(this, "Primer Prototipo Calculadora", Toast.LENGTH_SHORT).show();

        //Boperator= (ImageButton) findViewById(R.id.operatorImg);


        Benviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameUser = name.getText().toString();
                name.setText("");
                c1.setUser(nameUser);
            }
        });

        Bmostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello "+c1.getUser(), Toast.LENGTH_SHORT).show();
            }
        });

        Bsumando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cambiar imagen del boton-------------!!
                //Boperator.setBackgroundResource();
                Boperator.setBackgroundResource(R.drawable.sumarpx);
                c1.setSigno("+");
            }
        });

        Bresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boperator.setBackgroundResource(R.drawable.restarpx);
                c1.setSigno("-");
            }
        });

        Bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boperator.setBackgroundResource(R.drawable.multiplicarpx);
                c1.setSigno("*");
            }
        });

        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boperator.setBackgroundResource(R.drawable.dividirpx);
                c1.setSigno("/");
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(c1.result());
            }
        });

        bpasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }



    /*public void calcular(View v){

    }
    public void calcular(View v){
        switch (signo){
            case "+":
                sumar();
                break;
            case "*":
                multip();
                break;
            default:
                Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void sumar(){
        String s1= et1.getText().toString();
        String s2= et2.getText().toString();
        int n1= Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int sum=n1+n2;
        tv1.setText(""+sum);
    }

    public void multip(){
        String s1= et1.getText().toString();
        String s2= et2.getText().toString();
        int n1= Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int multi=n1*n2;
        tv1.setText(""+multi);
    }*/

    public void precionar (){

    }


    public void press (View v){
        Toast.makeText(this, "Presionando B2", Toast.LENGTH_SHORT).show();
    }
}