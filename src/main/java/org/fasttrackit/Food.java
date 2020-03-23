package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    String dedicated; //birds-animal,
    int quantity;
    double price;
    LocalDate dataExpirare;
    boolean available;
    String name;

     public Food(String name) {
        this.name = name;
    }

  }
