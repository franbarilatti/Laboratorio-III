package classes;

import java.util.ArrayList;

public class Client {

    //-------ATTRIBUTES-------//

    private String name = "";
    private String adress = "";
    private String phone = "";
    private ArrayList<Order> orders = new ArrayList<>();
    private double totalAmount = orders.stream().forEach((Order o)->o.getTotalPrice());
    //-------CONSTRUCTORS-------//

    public Client() {
    }

    public Client(String name, String adress, String phone) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }

    //-------GETTERS AND SETTERS-------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    //-------METHODS-------//


    @Override
    public String toString() {
        return "Client{" +
                "\nName='" + name +
                "\nAdress='" + adress +
                "\nPhone='" + phone +
                "\n}";
    }

    public void showClientOrders(){
        if(this.orders != null){
            this.orders.stream().forEach(System.out::println);
        }
        else {
            throw new RuntimeException("The list is empty");
        }
    }
}
