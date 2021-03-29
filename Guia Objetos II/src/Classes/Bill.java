package Classes;

import java.time.LocalDate;
import java.util.UUID;

public class Bill {
    private UUID id = UUID.randomUUID();
    private Client client;
    private double amount;
    private LocalDate date = LocalDate.now();
    private SellItem[] item;

    public Bill() {
    }

    public Bill(Client client, double amount) {
        this.client = client;
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public double amountDiscont(double amount){
        return amount * (1 - client.getDiscount());
    }

    public double totalAmount(){
        int total;
        int index;
        for (index = 0;index<)
    }
    
    @Override
    public String toString() {
        return "Factura[id= "+id+" , fecha= "+date+" , monto= "+ amount +" , montoDesc= "+(amount * (1 - client.getDiscount()))+" "+client.toString()+" ]";
    }
}
