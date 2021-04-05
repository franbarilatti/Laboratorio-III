package com.company;

import ejercicio1.Cylinder;

public class Main {

    public static void main(String[] args) {


        Cylinder cilindro1 = new Cylinder();
        Cylinder cilindro2 = new Cylinder(2.3,"blue",4.1);

        System.out.println("<==== EJERCICIO 1 ====>");
        System.out.println(cilindro1.toString());
        System.out.println(cilindro2.toString());
    }
}
