package classes;

public class Cuenta {
    private int id;
    private String name;
    private double balance;

    public Cuenta() {
    }

    public Cuenta(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credit(double credit){
        this.balance = balance + credit;
        return this.balance;
    }

    public double debit(double debit){
        boolean haveMoney = this.balance > debit;
        if(haveMoney){
            this.balance = balance - debit;
        }
        else{
            System.out.println("Dinero insuficiente");
        }
        return this.balance;
    }

    public void showAccount(){
        System.out.println("Nombre de usuario............. "+this.name);
        System.out.println("Id de la cuenta............... "+this.id);
        System.out.println("balance de cuenta............. "+this.balance);
    }
}
