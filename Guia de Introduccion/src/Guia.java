import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Guia {
    public static void ejercicio1(){
        int n = 7;
        double a = 8;
        char c = 'r';
        int suma = n + (int)a;
        System.out.println("\n\n\nResultado de N + A ="+ suma);
        int entero = Character.getNumericValue(c);
        System.out.println("El valor numerico de R en: "+ entero);
    }

    public static void ejercicio2(){
        int x = 5,y = 9;
        double n = 2,m = 4;
        System.out.println("\nX + Y = "+ (x+y));
        System.out.println("\nX - Y = "+ (x-y));
        System.out.println("\nX * Y = "+ (x*y));
        System.out.println("\nX / Y = "+ (x/y));
        System.out.println("\nN + M = "+(n+m));
        System.out.println("\nN - M = "+(n-m));
        System.out.println("\nN * M = "+(n*m));
        System.out.println("\nN / M = "+(n/m));

    }

    public static void ejercicio3(){
        int n = 6;
        System.out.println("\nN vale: "+n);
        while(n < 77){
            n++;
        }
        System.out.println("\nN incrementado vale: "+n);
        while(n > 3){
            n--;
        }
        System.out.println("\nN reducido vale: "+n);

        System.out.println("\nN duplicado vale: "+(n * 2));
    }

    public static void ejercicio4(){
        int a = 2, b = 6, c = 8, d = 4;
        System.out.println("\nA = "+a+" B = "+b+" C = "+c+" D = "+d);
        c = a;
        a = d;
        d = b;
        b = c;
        System.out.println("\nA = "+a+" B = "+b+" C = "+c+" D = "+d);
    }
    public static void ejercicio5(){
        int a = 8;
        System.out.println("\nA vale: "+a);
        if(a % 2 == 0){
            System.out.println("\nEl numero es par");
        }
        else {
            System.out.println("\nEl numero es impar");
        }
    }
    public static void ejercicio6(){
        int b = -1;
        System.out.println("\nB vale: "+b);
        if(b > 0){
            System.out.println("\nEl numero es positivo");
        }
        else{
            System.out.println("\nEl numero es negativo");
        }
    }

    public static void ejercicio7(){
        int c = 120;
        System.out.println("\nC vale: "+c);

        if(c > 0){
            System.out.println("\nEl numero es positivo");
        }
        else{
            System.out.println("\nEl numero es negativo");
        }

        if(c % 2 == 0){
            System.out.println("\nEl numero es par");
        }
        else {
            System.out.println("\nEl numero es impar");
        }

        if(c % 5 == 0){
            System.out.println("\nEl numero es multiplo de 5");
        }
        else {
            System.out.println("\nEl numero no es multiplo de 5");
        }

        if(c % 10 == 0){
            System.out.println("\nEl numero es multiplo de 10");
        }
        else {
            System.out.println("\nEl numero no es multiplo de 10");
        }

        if(c > 100){
            System.out.println("\nEl numero es mayor a 100");
        }
        else{
            System.out.println("\nEl numero es menor a 100 ");
        }
    }
    public static void ejercicio8(Scanner scan){
        String nombre;
        System.out.println("\nIngrese un nombre: ");
        nombre = scan.next();
        System.out.println("\nBuenos dias, "+nombre);
    }

    public static void  ejercicio9(Scanner scan){
        int num;
        System.out.println("\nIngrese un numero: ");
        num = scan.nextInt();
        System.out.println("El doble de "+ num + " es = "+ num*2);
        System.out.println("El triple de "+ num + " es = "+ num*3);
    }

    public static void ejercicio10(Scanner scan){
        double celsius;
        System.out.println("\nIngrese grados celsius: ");
        celsius = scan.nextFloat();
        double fahren = (celsius * 1.8) + 32;
        System.out.println("\n"+celsius+"° celcius son "+fahren+"° fahrenheit");
    }

    public static void ejercicio11(Scanner scan){
        double radio;
        System.out.println("\nIngrese radio del circulo: ");
        radio = scan.nextDouble();
        double circ = 2* Math.PI * radio;
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("\nLa circunferencia es: "+circ);
        System.out.println("\nEl area es: "+area);
    }

    public static void ejercicio12(Scanner scan){
        float kmh;
        System.out.println("\nIngrese una velocidad en Km/h: ");
        kmh = scan.nextFloat();
        float mts = (float) (kmh / 3.6);
        System.out.println("\nLa velocidad ingresada en m/s es: "+mts);
    }

    public static void ejercicio13(Scanner scan){
        float cate1, cate2;
        System.out.println("\nIngrese la longitud del cateto 1: ");
        cate1 = scan.nextFloat();
        System.out.println("\nIngrese la longitud del cateto 2: ");
        cate2 = scan.nextFloat();
        float hipo = (float) sqrt(Math.pow(cate1, 2) + Math.pow(cate2, 2));
        System.out.println("\nLa longitud de la hipotenusa es: "+hipo);
    }

    public static void ejercicio14(Scanner scan){
        float radio;
        System.out.println("\nIngrese radio del circulo: ");
        radio = scan.nextFloat();
        float volum = (float) ( (4/3) * Math.PI * Math.pow(radio,3));
        System.out.println("\nEl volumen es: "+volum);
    }

    public static void ejercicio15(Scanner scan){
        float base, altura;
        System.out.println("\nIngrese la longitud de la base: ");
        base = scan.nextFloat();
        System.out.println("\nIngrese la longitud de la altura: ");
        altura = scan.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("\nEl area es: "+area);
    }

    public static void ejercicio16(Scanner scan){
        int num,cent,dec,uni;
        System.out.println("\nIngresar numero de 3 cifras: ");
        num = scan.nextInt();
        cent = num / 100;
        dec = (num % 100) / 100;
        uni = (num % 100) % 100 / 10;

        System.out.println("\nEl numero "+ num +" separado es "+ cent + dec + uni);
    }

    public static void ejercicio17()
}

