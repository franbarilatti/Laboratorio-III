package classes;

import org.w3c.dom.ls.LSOutput;

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
        Optional<Client> opClient = this.clients.stream().
                filter((Client c)->c.getName().equalsIgnoreCase(clientName)).
                findFirst();
        return opClient.isPresent()?opClient.get():null;
    }

    public void showClients(){
        if(this.clients != null){
            this.clients.stream().forEach(System.out::println);
        }
        else {
            throw new RuntimeException("The list is empty");
        }
    }

    public Client clientWithMoreOrders(){
        Optional<Client> opcClient = this.clients.stream().
                sorted((Client c1, Client c2)->c2.getOrders().size()-c1.getOrders().size()).
                findFirst();
        return opcClient.get();
    }

    //-------PRODUCT METHODS-------//

    public void addProduct(Product newProduct){
        this.products.add(newProduct);
    }

    public Product searchProduct(String productName){
        Optional<Product> opProduct = this.products.stream().filter((Product p)->p.getName().equalsIgnoreCase(productName)).findFirst();
        return opProduct.isPresent()?opProduct.get():null;
    }

    public void showProducts(){
        if(this.products != null){
            this.products.stream().forEach(System.out::println);
        }
        else {
            throw new RuntimeException("The list is empty");
        }
    }

    //-------ORDER METHODS-------//
    public void addOrder(Order newOrder){
        this.orders.add(newOrder);
    }

    public void showOrders(){
        if(this.orders != null){
            this.orders.stream().forEach(System.out::println);
        }
        else {
            throw new RuntimeException("The list is empty");
        }
    }

    public void registOrderBuisiness(Client client,Product product,double distance){
        Order newOrder = new Order(client,product,distance);
        if(client instanceof Buisiness){
            double newDeliveryPrice = newOrder.getDeliveryPrice() / 1.15;
            newOrder.setDeliveryPrice(newDeliveryPrice);
            ((Buisiness) client).getOrders().add(newOrder);
        }
        this.orders.add(newOrder);
    }

    public void registOrderParticular(Client client,Product product,double distance){
        Order newOrder = new Order(client,product,distance);
        if(client instanceof Particular){
            ((Particular) client).getOrders().add(newOrder);
        }
        this.orders.add(newOrder);
    }

    public void createNewOrder(String clientName,String productName,double distance){
        Client client = searchClient(clientName);
        Product product = searchProduct(productName);
        if (client instanceof Buisiness) {
            registOrderBuisiness(client, product, distance);
        } else {
            registOrderParticular(client, product, distance);
        }
    }
}
