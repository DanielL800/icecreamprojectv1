package com.example.calculo;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Operations extends MainActivity{
    //private EditText et1, et2, name;
    private String signo, user;
    //private TextView tv1;

    private int n1, n2;

    public Operations() {
    }
    public String getSigno() {
        return signo;
    }
    public void setSigno(String signo) {
        this.signo = signo;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /*private void sumar(){
            int n1= Integer.parseInt((et1.getText().toString()));
            int n2=Integer.parseInt(et2.getText().toString());
            int sum=n1+n2;
            tv1.setText(""+sum);
        }*/
    private String sumar(){
        //int n1= Integer.parseInt((et1.getText().toString()));
        //int n2=Integer.parseInt(et2.getText().toString());
        int sum=n1+n2;
        return String.valueOf(sum);
    }

    private String resta(){
        //int n1= Integer.parseInt((et1.getText().toString()));
        //int n2=Integer.parseInt(et2.getText().toString());
        int rest=n1-n2;
        //tv1.setText(""+rest)
        return String.valueOf(rest);
    }
    
    private String multip(){
        //String s1= et1.getText().toString();
        //String s2= et2.getText().toString();
        //int n1= Integer.parseInt((et1.getText().toString()));
        //int n2=Integer.parseInt(et2.getText().toString());
        int multi=n1*n2;
        //tv1.setText(""+multi);
        return String.valueOf(multi);
    }
    
    private String div(){
        //int n1= Integer.parseInt((et1.getText().toString()));
        //int n2=Integer.parseInt(et2.getText().toString());
        int div=n1/n2;
        //tv1.setText(""+div);
        return String.valueOf(div);
    }

    public int result(){
        int r=0;
        switch (signo){
            case "+":
                r= n1+n2;
                break;
            case "-":
                r= n1-n2;
                break;
            case "*":
                r= n1*n2;
                break;
            case "/":
                r= n1/n2;
                break;
            default:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                break;
        }
        return r;
    }
    protected void calcular(){
        switch (signo){
            case "+":
                //sumar();
                sumar();
                break;
            case "-":
                resta();
                break;
            case "*":
                multip();
                //String.valueOf(multip());
                break;
            case "/":
                div();
                //String.valueOf(div());
                break;
            default:
                Toast.makeText(this, "Fatal error", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
