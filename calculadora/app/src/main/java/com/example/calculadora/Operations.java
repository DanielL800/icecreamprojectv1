package com.example.calculadora;

import android.widget.Toast;

public class Operations {
    private int n1, n2;
    private String signo;

    public Operations() {
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
    public String getSigno() {
        return signo;
    }
    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String result(){
        String operation="";
        switch (signo){
            case "+":
                operation = String.valueOf(n1+n2);
                break;
            case "-":
                operation = String.valueOf(n1-n2);
                break;
            case "*":
                operation = String.valueOf(n1*n2);
                break;
            case "/":
                operation = String.valueOf(n1/n2);
                break;
            default:
                operation = "F";
        }
        return operation;
    }
    
    /*public void valid(Context context String operation){
        String message = "There is an Error";
        if (operation == "F"){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }*/
}
