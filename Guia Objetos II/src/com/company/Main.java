package com.company;

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int cut = 0, option;
        Scanner scan = new Scanner(System.in);

        while (cut == 0){
            System.out.println("GUIA DE OBJETOS II");
            System.out.println("[1] - Ejercicio 1\n[2]-Ejercicio 2\n[3]-Ejercicio 3\n[0]-Salir");
            option = scan.nextInt();
            switch (option){
                case 1:
                    Ejercicio1.resolution();
                    break;
                case 2:
                    Ejercicio2.resolution();
                    break;
                case 3:
                    Ejercicio3.resolution();
                    break;
                case 0:
                    cut++;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }
}
