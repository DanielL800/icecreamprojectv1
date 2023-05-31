package com.example.icecreamproject1.usuarios;

public class Usuario {
    private int idUsurario;
    private String documento;
    private String nombres;
    private String usuario;
    private String contrasena;
    private String email;
    private String telefono;
    private String rol;
    private String estado;

    public Usuario() {
    }

    public int mostrarPersona() {
        return idUsurario;
    }
    public void modificarPersona(int idUsurario) {
        this.idUsurario = idUsurario;
    }

    public String mostrarNI() {
        return documento;
    }
    public void modificarNI(String documento) {
        this.documento = documento;
    }

    public String mostrarDatoN() {
        return nombres;
    }
    public void modificarDatoN(String nombre) {
        this.nombres = nombre;
    }

    public String mostrarUs() {
        return usuario;
    }
    public void modificarUs(String usuario) {
        this.usuario = usuario;
    }

    public String mostrarPas() {
        return contrasena;
    }
    public void modificarPas(String contrasena) {
        this.contrasena = contrasena;
    }

    public String mostrarCorr() {
        return email;
    }
    public void modificarCorr(String email) {
        this.email = email;
    }

    public String mostrarContact() {
        return telefono;
    }
    public void modificarContact(String telefono) {
        this.telefono = telefono;
    }

    public String mostrarTipoP() {
        return rol;
    }
    public void modificarTipoP(String rol) {
        this.rol = rol;
    }

    public String mostrarActual() {
        return estado;
    }
    public void modificarActual(String estado) {
        this.estado = estado;
    }
}
