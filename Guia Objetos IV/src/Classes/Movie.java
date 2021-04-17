package Classes;

import java.time.LocalDate;

public class Movie {
    //-------ATTRIBUTES -------//
    public String title;
    public LocalDate release;
    public int duration;
    public String genre;
    public String clasif;
    public String countrie;
    public String description;
    public int stock;

    //-------CONSTRUCTORS-------//
    public Movie() {
    }

    public Movie(String title, LocalDate release, int duration, String genre, String clasif, String countrie, String description, int stock) {
        this.title = title;
        this.release = release;
        this.duration = duration;
        this.genre = genre;
        this.clasif = clasif;
        this.countrie = countrie;
        this.description = description;
        this.stock = stock;
    }

    //-------GETTERS AND SETTERS-------//

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getClasif() {
        return clasif;
    }

    public void setClasif(String clasif) {
        this.clasif = clasif;
    }

    public String getCountrie() {
        return countrie;
    }

    public void setCountrie(String countrie) {
        this.countrie = countrie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //-------METHODS-------//

    @Override
    public String toString() {
        return "Movie{" +
                "\nTitle= " + title +
                "\nRelease=" + release +
                "\nDuration=" + duration +
                "\nGenre= " + genre+
                "\nClasification= " + clasif +
                "\nCountrie= " + countrie +
                "\nSescription= " + description +
                "\nStock=" + stock +
                "\n}";
    }
}
