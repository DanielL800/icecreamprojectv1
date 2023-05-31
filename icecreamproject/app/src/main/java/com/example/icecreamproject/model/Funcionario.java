package com.example.icecreamproject.model;

public class Funcionario  extends Usuario{
    private String horaInicio;
    private String horaFin;

    public Funcionario() {
    }

    public String mostrarPrincipio() {
        return horaInicio;
    }
    public void modificarPrincipio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String mostrarFin() {
        return horaFin;
    }
    public void modificarFin(String horaFin) {
        this.horaFin = horaFin;
    }
}
