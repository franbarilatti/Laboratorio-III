package ejercicio2;

public class Person {
    private String dni;
    private String name;
    private String surname;
    private String email;
    private String adress;

    public Person() {
    }

    public Person(String dni, String name, String surname, String email, String adress) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.adress = adress;

    }

    public String getDni() {
        return dni;
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

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return " Persona [ dni: "+ dni+
                " nombre: " + name+
                " apellido: "+surname+
                " email: "+email+
                "direccion: "+adress;
    }
}
