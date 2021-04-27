package classes;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Optional;

public class Company {
    //-------ATTRIBUTES-------//
    ArrayList<Client> clients = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();
    //-------CONSTRUCTORS-------//

    public Company() {
    }

    //-------GETTERS AND SETTERS-------//

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }


    //-------METHODS-------//


    @Override
    public String toString() {
        return "Company{" +
                "clients=" + clients +
                ", products=" + products +
                ", orders=" + orders +
                '}';
    }

    //-------CLIENT METHODS-------//
    public void addClient(Client newClient){
        this.clients.add(newClient);
    }

    public Client searchClient(String clientName){
        Optional<Client> opClient = this.clients.stream().filter((Client c)->c.getName().equalsIgnoreCase(clientName)).findFirst();
        return opClient.isPresent()?opClient.get():null;
    }

    //-------PRODUCT METHODS-------//

    public void addProduct(Product newProduct){
        this.products.add(newProduct);
    }

    public Product searchProduct(String productName){
        Optional<Product> opProduct = this.products.stream().filter((Product p)->p.getName().equalsIgnoreCase(productName)).findFirst();
        return opProduct.isPresent()?opProduct.get():null;
    }

    //-------ORDER METHODS-------//
    public void addOrder(Order newOrder){
        this.orders.add(newOrder);
    }

    public void registOrder(String clientName,String productName,double distance,double deliveryPrice){
        
    }

    public void createNewOrder(String clientName,String productName,double distance,double deliveryPrice){
        Client client = searchClient(clientName);
        Product product = searchProduct(productName);


    }
}
