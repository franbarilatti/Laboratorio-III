package com.company;

import Classes.Audience;
import Classes.Genre;
import Classes.Movie;
import Classes.VideoStore;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Movie hp = new Movie("Harry potter", LocalDate.of(2001, Month.AUGUST,13), 120, Genre.adventure, Audience.pg,"ING","And The Sorcerer's Stone",13);
	    Movie mk = new Movie("Mortal Kombat", LocalDate.of(2021, Month.APRIL,15), 110, Genre.action, Audience.pg,"USA","2021",11);
	    Movie wwz = new Movie("World War Z", LocalDate.of(2013, Month.JUNE,27), 123, Genre.horror, Audience.pg,"USA","Another zombie film",15);
	    Movie ib = new Movie("Inglorious Bastards", LocalDate.of(2009, Month.AUGUST,31), 153, Genre.action, Audience.pg,"USA","Jews vs nazis",20);

        /*ArrayList<Movie> lista = new ArrayList<>();

        lista.add(hp);
        lista.add(mk);
        lista.add(wwz);
        lista.add(ib);

        lista.stream().forEach(System.out::println);*/


	    VideoStore netflixPlus = new VideoStore();


        netflixPlus.addMovie(hp);
        netflixPlus.addMovie(mk);
        netflixPlus.addMovie(wwz);
        netflixPlus.addMovie(ib);

        netflixPlus.showMovies();

    }
}
