package com.demo.guru99.models;

public class DatosRegistro {

    String nombre;
    String apellido;
    String telefono;
    String correo;
    String direccion;
    String ciudad;
    String estado;
    String codigoPostal;
    String usuario;
    String clave;
    String confirmacionClave;


    public DatosRegistro(String nombre, String apellido, String telefono, String correo, String direccion, String ciudad, String estado, String codigoPostal, String usuario, String clave, String confirmacionClave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.usuario = usuario;
        this.clave = clave;
        this.confirmacionClave = confirmacionClave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getConfirmacionClave() {
        return confirmacionClave;
    }
}
