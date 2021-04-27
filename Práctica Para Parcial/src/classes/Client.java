package classes;

public class Client {

    //-------ATTRIBUTES-------//

    private String name = "";
    private String adress = "";
    private String phone = "";

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

    //-------METHODS-------//


    @Override
    public String toString() {
        return "Client{" +
                "\nName='" + name +
                "\nAdress='" + adress +
                "\nPhone='" + phone +
                "\n}";
    }
}
