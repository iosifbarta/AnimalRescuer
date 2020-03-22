package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    String dedicated; //birds-animal,
    int quantity;
    double price;
    LocalDate dataExpirare;
    boolean available;
    String name;

//    public Food(String name, double price, String dedicated) {
//        this.price = price;
//        this.dedicated = dedicated;
//        this.name = name;

//
//    public Food(String name, double price, String dedicated) {
//    this.name = name;
//    this.price = price;
//    this.dedicated = dedicated;

    public Food(String name) {
        this.name = name;
    }

  }
