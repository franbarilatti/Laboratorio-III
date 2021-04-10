package com.company;

import ejercicio1.Cylinder;
import ejercicio1.MenuEjercicio1;
import ejercicio2.MenuEjercicio2;
import ejercicio2.Person;
import ejercicio2.Staff;
import ejercicio2.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cut = 0;
        int opc;
        while (cut == 0) {
            System.out.println("Menu guia de objetos 3");
            System.out.println("1- Ejercicio 1\n2- Ejercicio 2\n3- Ejercicio 3\n\n0- Salir");
            System.out.print("\nElegir opcion: ");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    /*1. Para comenzar esta guía, vamos a empezar con un ejemplo sencillo, que nos
                         permita entender el concepto de herencia, superclase y subclase. Para esto vamos a
                         definir el tipo Círculo, que posee un radio cuyo valor por defecto al ser inicializado
                         sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,
                         un método para calcular el área y otro para imprimir sus características. Puede
                         reutilizar la clase Circulo de las guías anteriores.
                         Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por
                         ende se convierte en subclase de Círculo. El Cilindro a diferencia del Círculo posee
                         un atributo altura, que también se inicializa en 1.0 cuando no le pasamos un valor a
                         su constructor. Y un método para calcular el volumen. Codifique ambas clases y
                         realice las siguientes pruebas.
                                ● Inicializar un Cilindro y debuguear analizando los constructores a los que va
                                  llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
                                  radio del cilindro, la altura, el área de la base y el volumen.
                                ● Inicializar un segundo CIlindro esta vez especificando la altura y radio.
                                    Imprimir por pantalla el radio, la altura, el área de la base y el volumen.
                                ● Sobreescribir el método calcular area declarado en Círculo, para que nos
                                  permita calcular el área del cilindro.
                                                        (2π×radius×height + 2×areaBase)
                          Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el
                          cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método
                          calcular area y ahora nos calcula el área de un cilindro. Modificar el método calcular
                          volumen en la clase cilindro para que llame al método de la SUPERclase que calcula
                          el área.
                                       ● Modificar el método toString() de la clase cilindro para que imprima por
                                         pantalla lo siguiente:
                                       Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};*/
                    MenuEjercicio1.menu1();
                    break;
                case 2:
                    /*2. Vamos a diseñar un programa que nos permita gestionar el personal que concurre
                        a un colegio. Para no hacerlo muy extenso vamos a limitarnos a estudiantes y
                        miembros de staff que a diferencia de los estudiantes, estos perciben una
                         remuneración. Ambos tipos comparten la característica de Persona que posee los
                        atributos de dni, nombre, apellido, email y direccion.
                        Por otro lado tenemos al Estudiante que posee las características de
                         Persona y las de un estudiante, que en este caso son, año de ingreso, cuota
                        mensual y carrera.
                        Y finalmente tenemos al miembro de Staff que también es una Persona pero
                        con características propias de alguien que trabaja para una institución, por ejemplo
                        salario y turno, este puede ser mañana o noche.
                        Diagramar el UML identificando superclase y subclases, crear constructores
                         necesarios, getters y setters, métodos de ayuda como salario anual y toString para
                            facilitar la impresión.
                                    #Inicializar 4 estudiantes diferentes.

                                    #Inicializar 4 miembros de staff con características diferentes.
                                    #Crear un array que permita almacenar juntos los tipos anteriores y
                                    almacenar las 8 instancias creadas anteriormente.
                                    #Investigar el uso de la palabra reservada instanceof.
                                    #Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
                                    la cantidad de miembros de staff.
                                    #Recorrer el array y sumar el total de ingresos que percibe la
                                    institución por parte de la cuota de estudiantes.*/
                    MenuEjercicio2.menu2();
                    break;
                case 3:
                    break;
                case 0:
                    cut++;
                    break;
                default:
                    System.out.println("opcion incorrcta");
                    break;

            }
        }

        scan.close();

    }





}
