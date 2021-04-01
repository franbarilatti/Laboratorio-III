package Classes;

import java.util.UUID;

public class BankClient {
    private UUID id;
    private String name;
    private char genere;

    public BankClient() {
    }

    public BankClient(String name, char genere) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.genere = genere;
    }

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

    public char getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Cliente "+ this.name+" id: "+this.id+" genero: "+genere;
    }
}
