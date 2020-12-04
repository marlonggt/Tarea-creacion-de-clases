package com.company;

public class Alumnos {

    private String nombre;
    private String numCuenta;
    private String correo;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
