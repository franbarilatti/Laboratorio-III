package classes;

import java.util.ArrayList;

public class Particular extends Client{
    //-------ATTRIBUTES-------//

    private ArrayList<Order> orders = new ArrayList<>();

    //-------CONSTRUCTORS-------//

    public Particular() {
    }

    public Particular(String name, String adress, String phone) {
        super(name, adress, phone);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    //-------METHODS-------//

    @Override
    public String toString() {
        return super.toString()+"\nOrders= "+this.orders;
    }
}
