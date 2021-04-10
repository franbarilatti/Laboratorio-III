package ejercicio2;

import java.util.Scanner;

public class MenuEjercicio2 {
    public static Scanner scan = new Scanner(System.in);
    public static Person[] people = new Person[7];

    public static void menu2(){
        int cut = 0;
        while (cut == 0) {
            System.out.println("Ejercicio numero 1");
            System.out.println("1. Inicializar students y Staff \n2. Mostrar Alumnos y Staff Area\n3. Ganancia de la institucion\n\n0. Salir");
            System.out.print("\n\nElegir Opcion: ");
            int opc = scan.nextInt();
            switch (opc){
                case 1:
                    int index;
                    for (index = 0;index < 4; index++){
                        Student student = new Student();
                        System.out.println("Ingresar datos del estudiante nro " + (index+1)+"\n");
                        System.out.print("ingresar nombre: ");
                        String name = scan.next();
                        student.setName(name);
                        System.out.print("ingresar apellido: ");
                        String surname = scan.next();
                        student.setSurname(surname);
                        System.out.print("ingresar Dni: ");
                        String dni = scan.next();
                        student.setDni(dni);
                        System.out.print("ingresar email: ");
                        String email = scan.next();
                        student.setEmail(email);
                        System.out.print("ingresar dirección: ");
                        String adress = scan.next();
                        student.setAdress(adress);
                        System.out.print("ingresar año de ingreso: ");
                        int ingressYear = scan.nextInt();
                        student.setIngressYear(ingressYear);
                        System.out.print("ingresar cuota: ");
                        double fee = scan.nextDouble();
                        student.setFee(fee);
                        System.out.print("ingresar carrera: ");
                        String career = scan.next();
                        student.setCareer(career);
                        people[index] = student;
                        System.out.println("Se ingresaron los datos del estudiante nro " + (index+1)+"\n");
                    }
                    for(index = index;index < 8;index++){
                        Staff staff = new Staff();
                        System.out.println("Ingresar datos del Staff nro " + (index-4)+"\n");
                        System.out.print("ingresar nombre: ");
                        String name = scan.next();
                        staff.setName(name);
                        System.out.print("ingresar apellido: ");
                        String surname = scan.next();
                        staff.setSurname(surname);
                        System.out.print("ingresar Dni: ");
                        String dni = scan.next();
                        staff.setDni(dni);
                        System.out.print("ingresar email: ");
                        String email = scan.next();
                        staff.setEmail(email);
                        System.out.print("ingresar dirección: ");
                        String adress = scan.next();
                        staff.setAdress(adress);
                        System.out.print("ingresar salario: ");
                        double wage = scan.nextDouble();
                        staff.setWage(wage);
                        System.out.print("ingresar turnp: ");
                        String turn = scan.next();
                        staff.setTurn(turn);
                        people[index] = staff;
                        System.out.println("Se ingresaron los datos del estudiante nro " + (index-4)+"\n");
                    }
                    break;
                case 2:
                    for(Person person : people){
                        if (person instanceof Student){
                            System.out.println(person.toString());
                        }
                        else {
                            System.out.println(person.toString());
                        }
                    }
                    break;
                case 3:
                    double balance = 0;
                    for (Person person : people){
                        if (person instanceof Student){
                            balance = balance + ((Student) person).getFee();
                        }
                    }
                    System.out.println("el instituto ganará = $"+balance);
                    break;
                case 0:
                    cut++;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
                
            }
        }
        scan.close();
    }
    
}

