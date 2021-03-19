package com.main;

import classes.Empleado;
import classes.ItemDeVenta;
import classes.Rectangulo;

import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //Descomentar los metodos para probarlos.

        //ejercicio1(scan);
        //ejercicio2(scan);
        //ejercicio3(scan);
    }

   /* 1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
         1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
         debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
         siguientes pruebas:
                a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
                b. Imprimir por pantalla el alto y ancho.
                c. Imprimir por pantalla el área y perímetro.
                d. Modificar el alto y el ancho de la instancia.
                e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
                f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.*/


    public static void ejercicio1(Scanner scan){


        System.out.println("Ingresar el ancho: ");
        double ancho = scan.nextDouble();
        System.out.println("Ingresar el alto: ");
        double alto = scan.nextDouble();

        Rectangulo rectangulo = new Rectangulo(alto,ancho);

        System.out.println("Alto del rectangulo: "+ rectangulo.getAlto(alto));
        System.out.println("Ancho del Rectangulo: "+ rectangulo.getAncho(ancho));
        System.out.println("Area: "+ rectangulo.calcArea());
        System.out.println("Perimetro: "+ rectangulo.calcPerimetro());

        Rectangulo rectangulito = new Rectangulo();
        System.out.println("Alto del rectangulo: "+ rectangulito.getAlto(alto));
        System.out.println("Ancho del Rectangulo: "+ rectangulito.getAncho(ancho));
        System.out.println("Area: "+ rectangulito.calcArea());
        System.out.println("Perimetro: "+ rectangulito.calcPerimetro());
    }

    /*2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
    apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
    anual. A su vez se requiere otro método que permita aumentar el salario
    dependiendo del porcentaje que se le pase por parámetro. Considere crear un
    método que facilite imprimir por pantalla las características del objeto de la
    siguiente forma:
        Empleado[dni=?, nombre=?, apellido=?, salario=?]
        a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
            25000.
        b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
            27500.
        c. Imprima ambos objetos por pantalla
        d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
            salario anual del mismo.*/

    public static void ejercicio2(Scanner scan){

        System.out.println("Ingrese Nombre del empleado: ");
        String name = scan.next();
        System.out.println("Ingrese Apellido del empleado");
        String surname = scan.next();
        System.out.println("Ingrese dni del empleado");
        int dni = scan.nextInt();
        System.out.println("Ingrese salario del empleado");
        double wage = scan.nextDouble();
        Empleado employe1 = new Empleado(dni,name,surname,wage);
        employe1.showEmploye();

        System.out.println("Salario aumentado: "+ employe1.wageIncrese(wage, 1.5));
        System.out.println("Ingrese Nombre del empleado: ");
        name = scan.next();
        System.out.println("Ingrese Apellido del empleado");
        surname = scan.next();
        System.out.println("Ingrese dni del empleado");
        dni = scan.nextInt();
        System.out.println("Ingrese salario del empleado");
        wage = scan.nextDouble();
        Empleado employe2 = new Empleado(dni,name,surname,wage);
        employe2.showEmploye();
    }

    /*3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
    descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
    total teniendo en cuenta el precio unitario y cantidad. Un método que permita
    imprimir por pantalla los atributos del objeto de la siguiente forma:
           ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
        a. Inicialice el objeto con los atributos necesarios
        b. Imprima por pantalla el objeto inicializado.*/

    public static void ejercicio3(Scanner scan){

        System.out.println("Ingrese id del producto: ");
        int id = scan.nextInt();
        System.out.println("Ingrese descripcion del producto");
        String descript = scan.next();
        System.out.println("Ingrese cantidad del producto");
        int amount = scan.nextInt();
        System.out.println("Ingrese precio unitario del producto");
        double unitPrice = scan.nextDouble();

        ItemDeVenta product = new ItemDeVenta(id,descript,amount,unitPrice);

        product.showItem();

    }

}



