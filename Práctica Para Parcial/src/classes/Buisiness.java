package classes;

import java.util.ArrayList;

public class Buisiness extends Client{
    //-------ATTRIBUTES-------//

    private ArrayList<Order> orders = new ArrayList<>();
    private final double discount = 0.15;

    //-------CONSTRUCTORS-------//

    public Buisiness() {
    }

    public Buisiness(String name, String adress, String phone) {
        super(name, adress, phone);
    }

    //-------GETTERS AND SETTERS-------//

    public double getDiscount() {
        return discount;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    //-------METHODS-------//

    @Override
    public String toString() {
        return super.toString() + "Buisiness{" +
                "orders=" + orders +
                ", discount=" + discount +
                '}';
    }
}
