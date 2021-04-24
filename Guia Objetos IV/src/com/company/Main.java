package com.company;

import Classes.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Movie hp = new Movie("Harry Potter", LocalDate.of(2001, Month.AUGUST,13), 120, Genre.adventure, Audience.pg,"ING","And The Sorcerer's Stone",13);
	    Movie mk = new Movie("Mortal Kombat", LocalDate.of(2021, Month.APRIL,15), 110, Genre.action, Audience.pg,"USA","2021",11);
	    Movie wwz = new Movie("World War Z", LocalDate.of(2013, Month.JUNE,27), 123, Genre.horror, Audience.pg,"USA","Another zombie film",15);
	    Movie ib = new Movie("Inglorious Bastards", LocalDate.of(2009, Month.AUGUST,31), 153, Genre.action, Audience.pg,"USA","Jews vs nazis",20);

	    VideoStore netflixPlus = new VideoStore();

        netflixPlus.addMovie(hp);
        netflixPlus.addMovie(mk);
        netflixPlus.addMovie(wwz);
        netflixPlus.addMovie(ib);

        Client john = new Client("John Salchichon","213123123","Salve Desconocida");
        Client harry = new Client("Harry Postre", "4234231", "Privet Drive");
        Client vader = new Client("Darth Vader", "4543523","Death Star");
        Client luke = new Client("Luke Skywalker","8483234","The Republic");

        netflixPlus.addCLient(john);
        netflixPlus.addCLient(harry);
        netflixPlus.addCLient(vader);
        netflixPlus.addCLient(luke);

        System.out.println("Mostrando la lista de Clientes: ");


        netflixPlus.createNewRent("Harry Postre","mortal kombat");
        netflixPlus.createNewRent("Luke Skywalker","mortal kombat");
        netflixPlus.createNewRent("Harry Postre","Inglorious Bastards");
        netflixPlus.createNewRent("Darth Vader","mortal kombat");
        netflixPlus.createNewRent("Harry Postre","World War Z");
        netflixPlus.createNewRent("John Salchichon","Harry potter");
        netflixPlus.createNewRent("John Salchichon","mortal kombat");
        netflixPlus.createNewRent("Darth Vader","Harry potter");

        netflixPlus.showRents();

    }
}
