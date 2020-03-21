package org.fasttrackit;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {

        System.out.println( "Hello to Animal Rescuer!!" );
        System.out.println();
        Animal dog = new Animal();
        dog.name = "Kido";
        dog.healthyLevel = 9;
        dog.age = 11;
        dog.hungryLevel = 6;
        dog.moodLevel = 8;
        System.out.println();
        System.out.println("Name of the pet: " + dog.name);
        System.out.println("Age of the pet: " + dog.age + " years");
        System.out.println("Healthy Level: " + dog.healthyLevel);
        System.out.println("Hungry Level: " + dog.hungryLevel);
        System.out.println("Mood Level: " + dog.moodLevel);
        System.out.println();

        Rescuer adoptator = new Rescuer();
        adoptator.name = "Phil";
        adoptator.cash = 250;
        System.out.println();
        System.out.println("Rescuer name: " + adoptator.name);
        System.out.println("Cash: " + adoptator.cash + " $");
        System.out.println();

        Vet veterinar = new Vet();
        veterinar.name ="Peter";
        veterinar.speciality = "VetDentist";
        System.out.println("Vet name: " + veterinar.name);
        System.out.println("Speciality: " + veterinar.speciality);

        AnimalFood mancare = new AnimalFood("Eukanuba", 15, "Dog");
        mancare.name = "Eukanuba";
        mancare.dataExpirare = LocalDate.of(2020,11,10);
        mancare.price = 15;
        mancare.typeOfFood = "Dietetic";
        mancare.quantity = 1;
        mancare.available = true;
        System.out.println();
        System.out.println("Food name: " + mancare.name);
        System.out.println("Expire due: " + mancare.dataExpirare);
        System.out.println("Price: " + mancare.price + " $");


    }
}
