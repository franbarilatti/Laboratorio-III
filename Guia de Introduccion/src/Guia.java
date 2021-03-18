import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.sqrt;

public class Guia {

    /*Programa java que realice lo siguiente: declarar una variable N de tipo int, una
    variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
    A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
    diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
    variable C.*/


    public static void ejercicio1(){
        int n = 7;
        double a = 8;
        char c = 'r';
        int suma = n + (int)a;
        System.out.println("\n\n\nResultado de N + A ="+ suma);
        int entero = Character.getNumericValue(c);
        System.out.println("El valor numerico de R en: "+ entero);
    }

    /*Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
    variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
    por pantalla una serie de operaciones entre ellas.*/


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

    /*Programa Java que declare una variable entera N, asignarle un valor. A continuación
    escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
    valor a 3, duplicar su valor.*/


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

    /*Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
    cada una. A continuación realiza las instrucciones necesarias para que: B tome el
    valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.*/

    public static void ejercicio4(){
        int a = 2, b = 6, c = 8, d = 4;
        System.out.println("\nA = "+a+" B = "+b+" C = "+c+" D = "+d);
        c = a;
        a = d;
        d = b;
        b = c;
        System.out.println("\nA = "+a+" B = "+b+" C = "+c+" D = "+d);
    }

    /*Programa Java que declare una variable A de tipo entero, asignarle un valor. A
    continuación mostrar un mensaje indicando si A es par o impar.*/

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

    /*Programa Java que declare una variable B de tipo entero y asignarle un valor. A
    continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.*/

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

    /*Programa Java que declare una variable C de tipo entero y asignarle un valor. A
    continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
    si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
    100.*/

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

//    Programa Java que lea un nombre y muestre por pantalla:
//    “Buenos días, {NOMBRE}”.

    public static void ejercicio8(Scanner scan){
        String nombre;
        System.out.println("\nIngrese un nombre: ");
        nombre = scan.next();
        System.out.println("\nBuenos dias, "+nombre);
    }

    /*Programa Java que lea un número entero por teclado y calcule el doble y el triple de
    ese número y lo muestre por pantalla.*/

    public static void  ejercicio9(Scanner scan){
        int num;
        System.out.println("\nIngrese un numero: ");
        num = scan.nextInt();
        System.out.println("El doble de "+ num + " es = "+ num*2);
        System.out.println("El triple de "+ num + " es = "+ num*3);
    }

    /*Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
      centígrados */

    public static void ejercicio10(Scanner scan){
        double celsius;
        System.out.println("\nIngrese grados celsius: ");
        celsius = scan.nextFloat();
        double fahren = (celsius * 1.8) + 32;
        System.out.println("\n"+celsius+"° celcius son "+fahren+"° fahrenheit");
    }

    /*Programa que lee por teclado el valor del radio de una circunferencia, calcula y
    muestra por pantalla la longitud y el área de la circunferencia.*/

    public static void ejercicio11(Scanner scan){
        double radio;
        System.out.println("\nIngrese radio del circulo: ");
        radio = scan.nextDouble();
        double circ = 2* Math.PI * radio;
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("\nLa circunferencia es: "+circ);
        System.out.println("\nEl area es: "+area);
    }

    /*Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/

    public static void ejercicio12(Scanner scan){
        float kmh;
        System.out.println("\nIngrese una velocidad en Km/h: ");
        kmh = scan.nextFloat();
        float mts = (float) (kmh / 3.6);
        System.out.println("\nLa velocidad ingresada en m/s es: "+mts);
    }

    /*Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
    longitud de la hipotenusa según el teorema de Pitágoras.*/

    public static void ejercicio13(Scanner scan){
        float cate1, cate2;
        System.out.println("\nIngrese la longitud del cateto 1: ");
        cate1 = scan.nextFloat();
        System.out.println("\nIngrese la longitud del cateto 2: ");
        cate2 = scan.nextFloat();
        float hipo = (float) sqrt(Math.pow(cate1, 2) + Math.pow(cate2, 2));
        System.out.println("\nLa longitud de la hipotenusa es: "+hipo);
    }

    /*Programa que calcula el volumen de una esfera*/

    public static void ejercicio14(Scanner scan){
        float radio;
        System.out.println("\nIngrese radio del circulo: ");
        radio = scan.nextFloat();
        float volum = (float) ( (4/3) * Math.PI * Math.pow(radio,3));
        System.out.println("\nEl volumen es: "+volum);
    }

    /*Programa que calcula el área de un triángulo a partir de la longitud de sus lados*/

    public static void ejercicio15(Scanner scan){
        float base, altura;
        System.out.println("\nIngrese la longitud de la base: ");
        base = scan.nextFloat();
        System.out.println("\nIngrese la longitud de la altura: ");
        altura = scan.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("\nEl area es: "+area);
    }
    /*Programa que lee un número de 3 cifras y muestra sus cifras por separado.*/

    public static void ejercicio16(Scanner scan){
        int num;
        System.out.println("\nIngresar numero de 3 cifras: ");
        num = scan.nextInt();
        String cifras = String.valueOf(num);
        char[]decimal = cifras.toCharArray();

        for(int index = 0; index < decimal.length;index++){
            System.out.println("[ " + decimal[index] + " ]" );
        }

    }

    /*Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
    posiciones impares.*/

    public static void ejercicio17(Scanner scan){
        int num;
        System.out.println("\nIngresar numero de 5 cifras: ");
        num = scan.nextInt();
        String cifras = String.valueOf(num);
        char[]decimal = cifras.toCharArray();

        for(int index = 0; index < decimal.length;index++){
            if (decimal[index] % 2 != 0){
                System.out.println("[ " + decimal[index] + " ]" );
            }
        }
    }

    /*Programa que lea tres números enteros H, M, S que contienen hora, minutos y
    segundos respectivamente, y comprueba si la hora que indican es una hora válida.*/

    public static void ejercicio18(Scanner scan){
        int h,m,s;
        System.out.println("Ingrese la hora: ");
        h = scan.nextInt();
        System.out.println("Ingrese los minutos: ");
        m = scan.nextInt();
        System.out.println("Ingrese los segundos: ");
        s = scan.nextInt();

        boolean hrVal = h >= 0 && h <= 24;
        boolean minVal = m >= 0 && m <= 60;
        boolean segVal = s >= 0 && s <=60;

        boolean val = hrVal && minVal && segVal;

        if(val){
            System.out.println("la hora es: "+ h + ":" + m + ":" + s);
        }
        else {
            System.out.println("La hora ingresada no es valida.");
        }

    }

}

