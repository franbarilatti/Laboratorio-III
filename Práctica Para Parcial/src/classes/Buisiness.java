package classes;

import java.util.ArrayList;

public class Buisiness extends Client{

    //-------CONSTRUCTORS-------//

    public Buisiness() {
    }

    public Buisiness(String name, String adress, String phone) {
        super(name, adress, phone);
    }

    //-------GETTERS AND SETTERS-------//

    public ArrayList<Order> getOrders() {
        return orders;
    }

    //-------METHODS-------//

    @Override
    public String toString() {
        return super.toString() + "Buisiness{" +
                "orders=" + orders +
                '}';
    }
}
