package ejercicio2;

public class Staff extends Person {

    private double wage;
    private String turn;

    public Staff() {
    }

    public Staff(String dni, String name, String surname, String email, String adress, double wage, String turn) {
        super(dni, name, surname, email, adress);
        this.wage = wage;
        this.turn = turn;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return super.toString()+
                " salario: "+wage+
                " turno: "+turn;
    }
}
