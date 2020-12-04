package com.company;

public class Maestros {
    private String nombre;
    private String asignatura;
    private String telefono;

    public Maestros(String nombre, String asignatura, String telefono) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Maestros{" +
                "nombre='" + nombre + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
