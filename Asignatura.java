package com.company;

public class Asignatura {

        private String clase;
        private String hora;
        private String catedratico;
        private int unidades;
        private String[] alumnos;

        public Asignatura(String cl){
                 this.clase = cl;
        }

    @Override
    public String toString() {
        return "asignatura{" +
                "clase='" + clase + '\'' +
                ", hora='" + hora + '\'' +
                ", catedratico='" + catedratico + '\'' +
                ", unidades=" + unidades +
                '}';
    }

    public Asignatura(){

        }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
