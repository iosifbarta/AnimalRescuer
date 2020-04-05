package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    private String dedicated; //birds-animal,
    private int quantity;
    private double price;
    private LocalDate dataExpirare;
    private boolean available;
    private String name;

     public Food(String name) {
        this.name = name;
    }

    public String getDedicated() {
        return dedicated;
    }

    public void setDedicated(String dedicated) {
        this.dedicated = dedicated;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(LocalDate dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
