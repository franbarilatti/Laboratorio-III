package Classes;

import javax.management.remote.NotificationResult;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Client {

    //-------ATTRIBUTES-------//
    public UUID id;
    public String name;
    public String phone;
    public String adress;
    ArrayList<Rental> rents;

    //-------CONSTRUCTORS-------//

    public Client() {
    }

    public Client(UUID id, String name, String phone, String adress,ArrayList<Rental> rents) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.rents = rents;
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

    public ArrayList<Rental> getRents() {
        return rents;
    }

    public void setRents(ArrayList<Rental> rents) {
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

    public void addRent(Rental newRent){
        this.rents.add(newRent);
    }

    public void showRent(){
        System.out.println(rents.toString());
    }

    public void showAllRents(){
        for (Rental rent : this.rents){
            System.out.println(rent.toString());
        }
    }
}


