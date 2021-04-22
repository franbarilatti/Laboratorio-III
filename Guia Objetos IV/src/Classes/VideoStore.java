package Classes;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.lang.String;

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

    public ArrayList<Rental> getRents() { return rents; }

    public void setRents(ArrayList<Rental> rents) { this.rents = rents; }


    //-------METHODS-------//

    @Override
    public String toString() {
        return "VideoStore{" +
                "\nMovies= " + movies +
                "\nClients= " + clients +
                "\nCents= " + rents +
                "\n}";
    }

    //-------RENTS METHODS-------//

    /*public Rental serchRent(String clientName){

    }*/

    public void addClientRent(Rental newRent){
        rents.add(newRent);
    }

    public void addRent(Rental newRent){
        rents.add(newRent);
    }

    public void showRent(){

        for (Rental rent : this.rents){
            System.out.println(rent.toString());
        }
    }

    public void rentsToDay(){
        for(Rental rent : this.rents){
            if (rent.returnDate.equals(LocalDate.now(Clock.systemDefaultZone()))){
                System.out.println(rent.toString());
            }
        }
    }

    public void showLastClientRent(){
        int index;
        for(Client c : this.clients){
            for(index = 0;index < 10;index++){
                c.showRent();
            }
        }
    }

   /* public void showMostRentMovies(){

    }*/

    //-------MOVIE METHODS-------//
    public void addMovie(Movie newMovie){
        movies.add(newMovie);
    }

    public void showMovies(){
        if(movies != null){
           movies.stream().forEach(System.out::println);
        }
        else{
            throw new RuntimeException("The list is empty");
        }
    }

    //-------CLIENT METHODS-------//
    /*public Client searchClient(String name){
        clients.stream().sorted(Client cl)
    }*/


}
