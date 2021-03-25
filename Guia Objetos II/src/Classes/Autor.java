package Classes;

public class Autor {
    public String name;
    public String surname;
    public String email;
    public char genere;

    public Autor() {
    }

    public Autor(String name, String surname, String email, char genere) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.genere = genere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    public void showAutor(){
        System.out.println("name............ "+this.name);
        System.out.println("surname......... "+this.surname);
        System.out.println("email........... "+this.email);
        System.out.println("genere.......... "+this.genere);
    }
}
