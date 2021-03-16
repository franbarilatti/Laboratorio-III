import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int corte = 0;
        int opc;
        while(corte == 0){
            System.out.println("Trabajo Practico de Introduccion");
            System.out.println("[1] - Ejercicio 1\n[2]- Ejercicio 2\n[3]- Ejercicio 3\n[4]- Ejercicio 4\n[5]- Ejercicio 5\n[6]- Ejercicio 6\n[7]- Ejercicio 7\n[8]- Ejercicio 8\n[9]- Ejercicio 9\n[10]- Ejercicio 10\n[11]- Ejercicio 11\n[12]- Ejercicio 12\n[13]- Ejercicio 13\n[14]- Ejercicio 14\n[15]- Ejercicio 15\n[16]- Ejercicio 16\n[17]- Ejercicio 17\n[18]- Ejercicio 18\n\n[0]");
            System.out.println("Elegir una opcion: ");

            opc = scan.nextInt();
            switch (opc){
                case 1:
                    Guia.ejercicio1();
                    break;
                case 2:
                    Guia.ejercicio2();
                    break;
                case 3:
                    Guia.ejercicio3();
                    break;
                case 4:
                    Guia.ejercicio4();
                    break;
                case 5:
                    Guia.ejercicio5();
                    break;
                case 6:
                    Guia.ejercicio6();
                    break;
                case 7:
                    Guia.ejercicio7();
                    break;
                case 8:
                    Guia.ejercicio8(scan);
                    break;
                case 9:
                    Guia.ejercicio9(scan);
                    break;
                case 10:
                    Guia.ejercicio10(scan);
                    break;
                case 11:
                    Guia.ejercicio11(scan);
                    break;
                case 12:
                    Guia.ejercicio12(scan);
                    break;
                case 13:
                    Guia.ejercicio13(scan);
                    break;
                case 14:
                    Guia.ejercicio14(scan);
                    break;
                case 15:
                    Guia.ejercicio15(scan);
                    break;
                case 16:
                    Guia.ejercicio16(scan);
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 0:
                    corte++;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opc);
            }

        }


    }
}
