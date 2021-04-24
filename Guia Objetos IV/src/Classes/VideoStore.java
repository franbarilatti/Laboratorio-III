package Classes;

import java.time.LocalDate;
import java.util.*;
import java.lang.String;
import java.util.stream.Collectors;

public class VideoStore {
    //-------ATTRIBUTES-------//
    private List<Movie> movies = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Rental> rents = new ArrayList<>();

    //-------CONSTRUCTORS-------//

    public VideoStore() {
    }

    public VideoStore(ArrayList<Movie> movies, ArrayList<Client> clients, ArrayList<Rental> rents) {
        this.movies = movies;
        this.clients = clients;
        this.rents = rents;
    }

    //-------GETTERS AND SETTERS-------//
    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public List<Rental> getRents() {
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

    //-------RENTS METHODS-------//

    public List<Rental> serchClientRents(String clientName){
        Client c = searchClient(clientName);
        return this.rents.stream().filter((Rental r)->r.getClient().equals(c)).collect(Collectors.toList());
    }

    public void createNewRent(String clientName, String movieTitle){
        Client cl = searchClient(clientName);
        Movie mv = searchMovie(movieTitle);

        System.out.println(cl.toString());
        System.out.println(mv.toString());

        if(mv != null && mv.getStock()> 0){
            if(cl != null){
                Rental newRent = new Rental(mv,cl);
                cl.getRents().add(newRent);
                this.rents.add(newRent);
                mv.setRents(mv.getRents()+1);
            }
            throw new RuntimeException("the client doesn't exist");
        }

        throw new RuntimeException("The movie doesn't exist or hasn't stock");

    }

    public void addClientRent(Rental newRent) {
        rents.add(newRent);
    }

    public void addRent(Rental newRent) {
        rents.add(newRent);
    }

    public void showRents() {
        if (rents != null) {
            rents.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The Movie list is empty");
        }
    }

    public List<Rental> rentsToDay() {
        if (rents != null){
            return rents.stream().filter((Rental rnt) -> rnt.getReturnDate().equals(LocalDate.now())).collect(Collectors.toList());
        }
        throw new RuntimeException("empty list");
    }

    public void showLastClientRent() {
        int index;
        for (Client c : this.clients) {
            for (index = 0; index < 10; index++) {
                c.showRent();
            }
        }
    }

    public List<Movie> sortMostRentsMovies(){
        List<Movie> sortedMovies = movies;

        return sortedMovies.stream().sorted((Movie m1, Movie m2) -> m2.getRents() - m1.getRents()).collect(Collectors.toList());
    }

   public void showMostRentMovies(){
       List<Movie> sortedMovies = sortMostRentsMovies();

       sortedMovies.stream().sorted((Movie m1, Movie m2) -> m2.getRents() - m1.getRents()).forEach(System.out :: println);

   }

    //-------MOVIE METHODS-------//
    public void addMovie(Movie newMovie) {
        this.movies.add(newMovie);
    } // Add a new movie to the movies List

    public void showMovies() {                                       // Show all disponible movies in the VideoStore
        if (movies != null) {
            movies.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The Movie list is empty");
        }
    }

    public Movie searchMovie(String movieTitle){
        Optional<Movie> opMovie = this.movies.stream().filter((Movie m)-> m.getTitle().equalsIgnoreCase(movieTitle)).findFirst();
        return opMovie.isPresent() ? opMovie.get() : null;
    }

    //-------CLIENT METHODS-------//

    public void addCLient(Client client){
        this.clients.add(client);
    }

    public void showClients(){
        if(this.clients != null){
            clients.stream().forEach(System.out::println);
        }
        else{
            throw new RuntimeException("The Client Lists is empty");
        }
    }

    public Client searchClient(String clientName){
        Optional<Client> opClient = this.clients.stream().filter((Client c)->c.getName().equalsIgnoreCase(clientName)).findFirst();
        return opClient.isPresent() ? opClient.get() : null;
    }


}
