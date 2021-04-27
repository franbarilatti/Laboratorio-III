package classes;

public class Order {
    //-------ATTRIBUTES-------//
    private Client client = new Client();
    private Product product = new Product();
    private double distance = 0;
    private double deliveryPrice = distance * 2;
    private double totalPrice = distance + deliveryPrice;
    //-------CONSTRUCTORS-------//

    public Order() {
    }

    public Order(Client client, Product product, double distance) {
        this.client = client;
        this.product = product;
        this.distance = distance;

    }

    //-------GETTERS AND SETTERS-------//

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {

        this.distance = (distance > 0)? this.distance = distance : Double.parseDouble("distance is not negative");
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    //-------METHODS-------//


    @Override
    public String toString() {
        return "Order{" +
                "\nClient=" + client +
                "\nProduct=" + product +
                "\nDistance=" + distance +
                "\nDelivery Price=" + deliveryPrice +
                "\n}";
    }
}
