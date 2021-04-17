package Classes;

import java.util.UUID;

public class Client {

    //-------ATTRIBUTES-------//
    public UUID id;
    public String name;
    public String phone;
    public String adress;

    //-------CONSTRUCTORS-------//

    public Client() {
    }

    public Client(UUID id, String name, String phone, String adress) {
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
}


