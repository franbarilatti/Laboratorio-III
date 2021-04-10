package ejercicio1;

import java.util.Scanner;

public class MenuEjercicio1 {
    private static Scanner scan = new Scanner(System.in);

    public static void menu1(){
        int cut = 0;
        while (cut == 0){
            System.out.println("Ejercicio numero 1");
            System.out.println("1. Inicializar Cilindro\n2. Inicializar segundo Cilindro\n\n0. Salir");
            System.out.print("\n\nElegir Opcion: ");

            int opc = scan.nextInt();
            switch (opc) {
                case 1:
                    char pass;
                    System.out.print("\n\nDesea crear un Cilindro? S/N ");
                    pass = scan.next().charAt(0);
                    if (pass == 's') {
                        Cylinder cilindro = new Cylinder();
                        System.out.println("Cilindro creado: \n\n");
                        System.out.println(cilindro.toString());
                    } else {
                        System.out.println("Adios!");
                    }
                    break;
                case 2:
                    Cylinder cilindro2 = new Cylinder();
                    System.out.print("Ingresar radio: ");
                    double rad = scan.nextDouble();
                    if (rad > 0) {
                        cilindro2.setRadio(rad);
                    } else {
                        System.out.println("radio debe ser mayor a 0");
                    }
                    System.out.print("\n\nIngresar color: ");
                    String colour = scan.next();
                    cilindro2.setColor(colour);
                    System.out.println("\n\nIngresar altura: ");
                    double height = scan.nextDouble();
                    if (height > 0) {
                        cilindro2.setHeight(height);
                    } else {
                        System.out.println("altura debe ser mayor a 0\n\n");
                    }
                    System.out.println(cilindro2.toString());
                    break;
                case 0:
                    cut++;
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        }
        scan.close();

    }
}
