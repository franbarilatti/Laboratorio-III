package classes;

public class Empleado {
    private int dni;
    private String name;
    private String surname;
    private double wage;

    public Empleado(int dni, String name, String surname, double wage) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.wage = wage;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double calcAnualWage(double wage){
        return wage * 12;
    }

    public double wageIncrese (double wage, double increse){
        return wage * increse;
    }

    public void showEmploye(){
        System.out.println ("Empleado [ dni = "+ this.dni +", nombre= "+this.name+", apellido= "+this.surname+", salario= "+this.wage+"]");
    }

}
