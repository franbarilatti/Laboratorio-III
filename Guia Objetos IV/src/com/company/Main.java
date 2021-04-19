package com.company;

import Classes.Audience;
import Classes.Genre;
import Classes.Movie;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	    Movie hp = new Movie("Harry potter", LocalDate.of(2001, Month.AUGUST,13), 120, Genre.adventure, Audience.pg,"ING","And The Philosofer's Stone",13);
        System.out.println(hp.toString());
        UUID id = UUID.randomUUID();
        System.out.println(id.toString().replace("-",""));
    }
}
