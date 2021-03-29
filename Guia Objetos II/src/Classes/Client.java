package Classes;

import java.util.UUID;

public class Client {
    private String name;
    private String email;
    private double discount;
    private UUID id = UUID.randomUUID();

    public Client() {
    }

    public Client(String name, String email, double discount) {
        this.name = name;
        this.email = email;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente[id= "+id+" , nombre= "+name+" , email= "+email+" , descuento= "+discount+" ]";
    }
}
