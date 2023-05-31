package com.example.icecreamproject1.usuarios;

public class Cliente extends Usuario{
    private String direccion;

    public Cliente() {
    }

    public String mostrarLugar() {
        return direccion;
    }
    public void modificarLugar(String direccion) {
        this.direccion = direccion;
    }
}
