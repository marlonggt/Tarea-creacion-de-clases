package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Asignatura cl1 = new Asignatura("matematicas");

        cl1.setCatedratico("Irvin Garcia");
        cl1.setHora("6:30pm");
        cl1.setUnidades(3);

        System.out.println(cl1.toString());




    }
}
