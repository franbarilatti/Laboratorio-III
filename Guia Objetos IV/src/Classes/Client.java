package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {

    //-------ATTRIBUTES-------//
    private UUID id = UUID.randomUUID();
    private String name = "";
    private String phone = "";
    private String adress = "";
    private List<Rent> rents = new ArrayList<>();

    //-------CONSTRUCTORS-------//

    public Client() {
    }

    public Client(String name, String phone, String adress) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    //-------GETTERS AND SETTERS-------//

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

    //-------METHODS-------//

    @Override
    public String toString() {
        return "Client{" +
                "\nId= " + id +
                "\nName= " + name +
                "\nPhone= " + phone +
                "\nAdress= " + adress +
                "\n}";
    }

    public void addRent(Rent newRent){
        this.rents.add(newRent);
    }

    public void showRent(){
        System.out.println(rents.toString());
    }

    public void showAllRents(){
        for (Rent rent : this.rents){
            System.out.println(rent.toString());
        }
    }
}


