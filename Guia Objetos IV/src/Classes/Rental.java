package Classes;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.UUID;

public class Rental {
    //-------ATTRIBUTES-------//
    public UUID rentid;
    public Movie movie;
    public Client client;
    public LocalDate rentDate;
    public LocalDate returnDate;

    //-------CONSTRUCTORS-------//

    public Rental() {
    }

    public Rental(Movie movie, Client client) {
        this.rentid = UUID.randomUUID();
        this.movie = movie;
        this.client = client;
        this.rentDate = LocalDate.now();
        this.returnDate = LocalDate.now().plusDays(2);
    }

    //-------GETTERS AND SETTERS-------//

    public UUID getRentid() {
        return rentid;
    }

    public void setRentid(UUID rentid) {
        this.rentid = rentid;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    //-------METHODS-------//

    @Override
    public String toString() {
        return "Rental{" +
                "\nRentid= " + rentid +
                "\nMovie= " + movie +
                "\nClient= " + client +
                "\nRentDate= " + rentDate +
                "\nReturnDate= " + returnDate +
                "\n}";
    }
}
