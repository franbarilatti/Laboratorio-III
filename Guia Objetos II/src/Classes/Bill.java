package Classes;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Bill {
    private final UUID id = UUID.randomUUID();
    private Client client;
    private double amount;
    private final LocalDate date = LocalDate.now();
    private SellItem[] items = new SellItem[10] ;

    public Bill() {
    }

    public Bill(Client client, double amount, SellItem[] items) {
        this.client = client;
        this.amount = amount;
        this.items = items;
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

    
    public double amountDiscont(double amount){
        return amount * (1 - client.getDiscount());
    }

    public void showItems(){
        int index;
        for (index = 0; index < 10; index++){
            System.out.println(this.items[index].toString());
        }
    }

    public double totalAmount(){
        double total = 0;
        int index;
        for (index = 0;index<10;index++){
            total += this.items[index].getPrice();
        }
        total = total * (1-client.getDiscount());
        return total;
    }
    
    @Override
    public String toString() {
        return "Factura[id= "+id+" , fecha= "+date+" , monto= "+ amount +" , montoDesc= "+(amount * (1 - client.getDiscount()))+" "+client.toString()+" ]";
    }
}
