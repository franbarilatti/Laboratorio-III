package Classes;

import java.time.LocalDate;
import java.util.*;
import java.lang.String;
import java.util.stream.Collectors;

public class VideoStore {
    //-------ATTRIBUTES-------//
    private List<Movie> movies = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Rent> rents = new ArrayList<>();

    //-------CONSTRUCTORS-------//

    public VideoStore() {
    }

    public VideoStore(ArrayList<Movie> movies, ArrayList<Client> clients, ArrayList<Rent> rents) {
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

    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(ArrayList<Rent> rents) {
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

    public List<Rent> serchClientRents(String clientName){
        Client c = searchClient(clientName);
        return this.rents.stream().filter((Rent r)->r.getClient().equals(c)).collect(Collectors.toList());
    }

    public void createNewRent(String clientName, String movieTitle){
        Client cl = searchClient(clientName);
        Movie mv = searchMovie(movieTitle);

        if(cl != null){
            if(mv != null && mv.getStock()>0){
                Rent newRent = new Rent(mv,cl);
                cl.getRents().add(newRent);
                this.rents.add(newRent);
                mv.setRents(mv.getRents()+1);
                mv.setStock(mv.getStock()-1);
            }
            else{
                throw new RuntimeException("the movie doesn't exist");
            }

        }else
        {
            System.out.println("The neme ingressed doesn't exist. We have creted a new client with this name: "+clientName);
            Client newCL = new Client();
            newCL.setName(clientName);
            this.clients.add(newCL);
        }
    }

    public void addClientRent(Rent newRent) {
        rents.add(newRent);
    }

    public void addRent(Rent newRent) {
        rents.add(newRent);
    }

    public void showRents() {
        if (rents != null) {
            rents.stream().forEach(System.out::println);
        } else {
            throw new RuntimeException("The Movie list is empty");
        }
    }

    public List<Rent> rentsToDay() {
        if (rents != null){
            return rents.stream().filter((Rent rnt) -> rnt.getReturnDate().equals(LocalDate.now())).collect(Collectors.toList());
        }
        throw new RuntimeException("empty list");
    }

    public void showLastClientRent(String clientName) {
        Client cl = searchClient(clientName);
        if (cl != null){
            cl.showAllRents();
        }
        else{
            throw new RuntimeException("the client doesn't exist");
        }
    }

    public List<Movie> sortMostRentsMovies(){
        List<Movie> sortedMovies = movies;

        return sortedMovies.stream().sorted((Movie m1, Movie m2) -> m2.getRents() - m1.getRents()).collect(Collectors.toList());
    }

   public void showMostRentMovies(){
       List<Movie> sortedMovies = sortMostRentsMovies();

       sortedMovies.stream().forEach(System.out :: println);

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
