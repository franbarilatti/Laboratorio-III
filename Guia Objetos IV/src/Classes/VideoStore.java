package Classes;

import java.util.ArrayList;

public class VideoStore {
    //-------ATTRIBUTES-------//
    public ArrayList<Movie> movies;
    public ArrayList<Client> clients;
    public ArrayList<Rental> rents;

    //-------CONSTRUCTORS-------//

    public VideoStore() {
    }

    public VideoStore(ArrayList<Movie> movies, ArrayList<Client> clients, ArrayList<Rental> rents) {
        this.movies = movies;
        this.clients = clients;
        this.rents = rents;
    }

    //-------GETTERS AND SETTERS-------//
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
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
        return "VideoStore{" +
                "\nMovies= " + movies +
                "\nClients= " + clients +
                "\nCents= " + rents +
                "\n}";
    }
}
