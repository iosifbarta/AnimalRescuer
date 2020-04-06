package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Food> availableFood = new ArrayList<>();
    private Entertainment[] availableActivities = new Entertainment[5];
    private Pet[] availablePets = new  Pet[2];

    public void start(){

    System.out.println(" Welcome to Animal Rescuer");

        System.out.println();
        initRescuer();
        initAnimal();
        displayAvailablePets();
        Pet selectedPet = getSelectedPetFromUser();
        System.out.println("Selected pet: " + selectedPet.getBreed());



        initializeAvailableFood();
        displayAvailableFood();
        Food selectedFood = getSelectedFoodFromUser();
        System.out.println("Selected Food: " + selectedFood.getName());

        initializeEntertainment();
        displayEntertainment();
        Entertainment selectedEntertainment = getSelectedEntertainmentFromUser();
        System.out.println("Selected Entertainment: " + selectedEntertainment.getName());


    }
    private void initAnimal(){
        Pet pet = new Pet("Kido", "Dog");
        pet.setAge(7);
        pet.setFavoriteFood("Eukanuba");
        pet.setFavoriteEntertainment("Hide & Seek");
        pet.setHealthyLevel(9);
        pet.setHungryLevel(5);
        pet.setMoodLevel(8);
        pet.setTypeOfHair("long");
        pet.setSize("big");
        pet.setGender("male");
        pet.setClean(false);
        pet.setFiziologicNeed(true);
        pet.setAction("sleeping");
        availablePets[0] = pet;

        Pet pet1 = new Pet("Garfield", "Cat");
        pet1.setAge(4);
        pet1.setFavoriteFood("Purina");
        pet1.setFavoriteEntertainment("Catching Mouse");
        pet1.setHealthyLevel(7);
        pet1.setHungryLevel(6);
        pet1.setMoodLevel(5);
        pet1.setTypeOfHair("short");
        pet1.setSize("kitten");
        pet1.setGender("female");
        pet1.setClean(true);
        pet1.setFiziologicNeed(false);
        pet1.setAction("purring");
        availablePets[1] = pet1;


    }
    private void initializeAvailableFood(){
        System.out.println("Available Food");
            Food food = new Food("Eukanuba");
            food.setDataExpirare(LocalDate.of(2021, 7, 10));
            food.setQuantity(2);
            food.setPrice(25);
            Food food1 = new Food("Purina");
            food1.setQuantity(3);
            food1.setPrice(15);
            food1.setDataExpirare((LocalDate.of(2020, 12,21)));
            Food food2 = new Food("Brit");
            food2.setQuantity(4);
            food2.setPrice(20);
            food2.setDataExpirare(LocalDate.of(2021, 5,15));
            availableFood.add(food);
            availableFood.add(food1);
            availableFood.add(food2);

    }

    private void initializeEntertainment(){
        Entertainment game1 = new Entertainment("Hide & Seek");
        game1.setDuration(30);
        availableActivities[0] = game1;

        Entertainment game2 = new Entertainment("Play frisbee");
        game2.setDuration(60);
        availableActivities[1] = game2;

        Entertainment game3 = new Entertainment("Tug of War");
        game3.setDuration(15);
        availableActivities[2] = game3;

        Entertainment game4 = new Entertainment("Catching Mice");
        game4.setDuration(60);
        availableActivities[3] = game4;

        Entertainment game5 = new Entertainment("Watching birds");
        game5.setDuration(60);
        availableActivities[4] = game5;

    }
    public void displayEntertainment(){
        System.out.println("Available entertainment: ");
        for (int i=0; i<availableActivities.length; i++) {
            System.out.println((i+1) + ". "  + (char)34 + availableActivities[i].getName() + (char)34 + " - duration "
                    + availableActivities[i].getDuration() + " min.");
        }
    }

    private Entertainment getSelectedEntertainmentFromUser(){
        System.out.println("Please select entertainment: ");
        Scanner scanner = new Scanner(System.in);
        int entertainmentNumber = scanner.nextInt();
        return availableActivities[entertainmentNumber - 1];
    }
    public  void displayAvailableFood() {
//        for (int i = 0; i < availableFood.size(); i++) {
//            System.out.println((i + 1) + ". " + (char) 34 + availableFood.get(i).getName() + (char) 34 + " and the price is "+
//                    + availableFood.get(i).getPrice() + " $" + " - Expire on: " + availableFood.get(i).getDataExpirare());
//        }
        for (Food food : availableFood){
           if(food != null){
               System.out.println(food.getName());
           }
        }
    }
    private Food  getSelectedFoodFromUser(){

        System.out.println("Please select food: ");
        Scanner scanner = new Scanner(System.in);
        int selectFood = scanner.nextInt();
        return availableFood.get(selectFood-1);


    }
    public void displayAvailablePets(){
        System.out.println("Available pets for you: ");
        for (int i=0; i<availablePets.length; i++){
            System.out.println((i+1) + ". " + availablePets[i].getBreed() + " " + availablePets[i].getAge() + " months old.");
        }
    }
    private Pet getSelectedPetFromUser(){
        System.out.println("Please select a pet for you from list.");
        Scanner scanner = new Scanner(System.in);
        int selectedNumber = scanner.nextInt();
        return availablePets[selectedNumber-1];
    }
    public void initRescuer(){
        System.out.println("Hello rescuer, please enter your name!");
        Scanner scanner = new Scanner(System.in);
        String nameOfRescuer = scanner.nextLine();
        Rescuer rescuer = new Rescuer(nameOfRescuer);
        rescuer.setCash(500);
        System.out.println("Hello " + nameOfRescuer + ". Welcome to " +(char)34 + "Animal Rescuer" + (char)34 + ".");
    }
}
