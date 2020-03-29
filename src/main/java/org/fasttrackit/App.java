package org.fasttrackit;

import java.time.LocalDate;

public class App
{

    public static void main(String[] args ) {

        System.out.println( "Hello to Animal Rescuer!!" );
        System.out.println();

//        dog.getHealthyLevel();
//        dog.getAge();
//        dog.getHungryLevel();
//        dog.getMoodLevel();
//        System.out.println();
//        System.out.println("Name of the pet: " + dog.name);
//        System.out.println("Age of the pet: " + dog.age + " years");
//        System.out.println("Healthy Level: " + dog.healthyLevel);
//        System.out.println("Hungry Level: " + dog.hungryLevel);
//        System.out.println("Mood Level: " + dog.moodLevel);
//        System.out.println();

        Rescuer rescuer = new Rescuer("John");
        Animal animal = new Animal("Kido");
        animal.setFavoriteFood("Eukanuba");
        animal.setFavoriteEntertainment("Hide & Seek");
        animal.setHungryLevel(5);
        animal.setMoodLevel(7);


        Activity activity = new Activity("walking");
        AnimalFood animalFood = new AnimalFood("Purina");
        AnimalFood animalFood1 = new AnimalFood("Eukanuba");
        rescuer.toFeed(animal, animalFood);
        rescuer.toFeed(animal, animalFood1);
        System.out.println();
        rescuer.recreation(animal, activity);

        Activity activity1 = new Activity("Hide & Seek");
        rescuer.recreation(animal, activity1);



        //adoptator.name = "Phil";
//        adoptator.cash = 250;
//        System.out.println();
//        System.out.println("Rescuer name: " + adoptator.name);
//        System.out.println("Cash: " + adoptator.cash + " $");
//        System.out.println();

//        Vet veterinar = new Vet();
//        veterinar.name ="Peter";
//        veterinar.speciality = "VetDentist";
//        System.out.println("Vet name: " + veterinar.name);
//        System.out.println("Speciality: " + veterinar.speciality);
//
        AnimalFood mancare = new AnimalFood("Eukanuba");
        mancare.dataExpirare = LocalDate.of(2020,11,10);
        mancare.price = 15;
        mancare.setTypeOfFood("Dietetic");
        mancare.quantity = 1;
        mancare.available = true;
        System.out.println();
        System.out.println("Food name: " + mancare.getName());
        System.out.println("Expire due: " + mancare.dataExpirare);
        System.out.println("Price: " + mancare.price + " $");

    }
}
