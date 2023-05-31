package com.example.icecreamproject.model;

public class Cliente extends Usuario{
    private String nacimiento;
    private String direccion;
    private String numCliente;
    private String tipoCliente;

    public Cliente() {
    }

    public String mostrarAnos() {
        return nacimiento;
    }
    public void modificarAnos(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String mostrarAddr() {
        return direccion;
    }
    public void modificarAddr(String direccion) {
        this.direccion = direccion;
    }

    public String mostrarNCli() {
        return numCliente;
    }
    public void modifiNCli(String numCliente) {
        this.numCliente = numCliente;
    }

    public String mostrarEsCliente() {
        return tipoCliente;
    }
    public void modificarEsCleiente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
