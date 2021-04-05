package com.company;

import ejercicio1.Cylinder;
import ejercicio2.Person;
import ejercicio2.Staff;
import ejercicio2.Student;

public class Main {

    public static void main(String[] args) {


        Cylinder cilindro1 = new Cylinder();
        Cylinder cilindro2 = new Cylinder(2.3,"blue",4.1);

        System.out.println("<==== EJERCICIO 1 ====>");
        System.out.println(cilindro1.toString());
        System.out.println(cilindro2.toString());

        Person[] personas = new Person[8];

        Student estudiante1 = new Student("39763107","luke","skywalker","lalal@hotmail","lalala 123",2020,4550.0,"programcion");
        Student estudiante2 = new Student("41213365","termi","nator","lolol@hotmail","lololo 123",2020,4550.0,"contador");
        Student estudiante3 = new Student("39365421","john","rambo","papap@hotmail","papap 123",2020,4550.0,"administracion");
        Student estudiante4 = new Student("39763210","rocky","balboa","lasda@hotmail","lasda 123",2020,4550.0,"psicologia");

        Staff staff1 = new Staff("39763107","maestro","yoda","lalal@hotmail","lalala 123",40300.00,"noche");
        Staff staff2 = new Staff("35456452","señor","miyagi","asdaa@hotmail","asdaa 123",40355.00,"mañana");
        Staff staff3 = new Staff("39554231","tio","ben","qweqrr@hotmail","qweqrr 123",48200.00,"mañama");
        Staff staff4 = new Staff("15664481","cordell","walker","cvvx@hotmail","zxczxc 123",47600.00,"noche");

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
    }
}
