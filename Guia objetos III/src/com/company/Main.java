package com.company;

import ejercicio1.Cylinder;
import ejercicio2.Person;
import ejercicio2.Staff;
import ejercicio2.Student;

public class Main {

    public static void main(String[] args) {

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

        Cylinder cilindro1 = new Cylinder();
        Cylinder cilindro2 = new Cylinder(2.3,"blue",4.1);

        System.out.println("<==== EJERCICIO 1 ====>");
        System.out.println(cilindro1.toString());
        System.out.println(cilindro2.toString());


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
                Inicializar 4 estudiantes diferentes.

                Inicializar 4 miembros de staff con características diferentes.

                Crear un array que permita almacenar juntos los tipos anteriores y
                almacenar las 8 instancias creadas anteriormente.

                Investigar el uso de la palabra reservada instanceof.

                Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
                la cantidad de miembros de staff.
                Recorrer el array y sumar el total de ingresos que percibe la
                institución por parte de la cuota de estudiantes.*/


        Person[] personas = new Person[8];

        Student estudiante1 = new Student("39763107","luke","skywalker","lalal@hotmail","lalala 123",2020,4550.0,"programcion");
        Student estudiante2 = new Student("41213365","daniel","san","lolol@hotmail","lololo 123",2020,4550.0,"contador");
        Student estudiante3 = new Student("39365421","peter","parker","papap@hotmail","papap 123",2020,4550.0,"administracion");
        Student estudiante4 = new Student("39763210","john","creed","lasda@hotmail","lasda 123",2020,4550.0,"psicologia");

        Staff staff1 = new Staff("39763107","maestro","yoda","lalal@hotmail","lalala 123",40300.00,"noche");
        Staff staff2 = new Staff("35456452","señor","miyagi","asdaa@hotmail","asdaa 123",40355.00,"mañana");
        Staff staff3 = new Staff("39554231","tio","ben","qweqrr@hotmail","qweqrr 123",48200.00,"mañama");
        Staff staff4 = new Staff("15664481","rocky","balboa","cvvx@hotmail","zxczxc 123",47600.00,"noche");

        personas[0] = estudiante1;
        personas[1] = estudiante2;
        personas[2] = estudiante3;
        personas[3] = estudiante4;
        personas[4] = staff1;
        personas[5] = staff2;
        personas[6] = staff3;
        personas[7] = staff4;

        System.out.println("<==== EJERCICIO 2 ====>");
        for(Person e : personas){
            if(e instanceof Student){
                System.out.println(e.toString());
            }
            if (e instanceof Staff){
                System.out.println(e.toString());
            }
        }

        double amount = 0;

        for (Person e : personas){
            if(e instanceof Student){
                amount = amount + ((Student) e).getFee();
            }
        }
        System.out.println("La isntitucion ganara: "+amount);
        System.out.println("\n\n\n");

        System.out.println("<==== EJERCICIO 3 ====>");



    }


}
