package Classes;

import java.util.UUID;

public class BankAccount {
    private UUID id;
    private double balance;
    private BankClient client;

    public BankAccount() {
    }

    public BankAccount(double balance, BankClient client) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankClient getClient() {
        return client;
    }

    public void setClient(BankClient client) {
        this.client = client;
    }

    public double deposit(double amount){
        System.out.println("El cliente "+this.client.getName()+", deposito "+amount);
        return this.balance+amount;
    }
    public double extract(double amount){
        boolean check = this.balance > -2000;

        if (check){
            System.out.println("El cliente "+this.client.getName()+", retiro "+amount);
            this.balance = this.balance - amount;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return this.balance;
    }



}
