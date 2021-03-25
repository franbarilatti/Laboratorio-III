package Classes;

public class Book {
    public String title;
    public int stock;
    public double price;
    public Autor autor;

    public Book() {
    }

    public Book(String title, int stock, double price, Autor autor) {
        this.title = title;
        this.stock = stock;
        this.price = price;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }



}
