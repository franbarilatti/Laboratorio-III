package classes;

public class Product {
    //-------ATTRIBUTES-------//
    private String name = "";
    private double price = 0;
    private int stock = 0;

    //-------CONSTRUCTORS-------//
    public Product() {
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //-------GETTERS AND SETTERS-------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //-------METHODS-------//


    @Override
    public String toString() {
        return "Product{" +
                "\nName='" + name +
                "\nPrice=" + price +
                "\nStock=" + stock +
                "\n}";
    }
}
