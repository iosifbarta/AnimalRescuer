package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;

import java.time.LocalDate;
import java.util.*;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;


public class Game {
    private List<Food> availableFood = new ArrayList<>();
    private Entertainment[] availableActivities = new Entertainment[5];
    private Pet[] availablePets = new  Pet[2];
    private Rescuer player;
    private Pet selectedPet;

    public void start() throws Exception {

    System.out.println(" Welcome to Animal Rescuer\n");

        initRescuer();
        initAnimal();
        displayAvailablePets();
        selectedPet = getSelectedPetFromUser();
        System.out.println("The pet you chosen is a " + selectedPet.getBreed());
        selectedPet.setName(nameAnimal());
        System.out.println(selectedPet.getName() + "'s status is:\n-happiness level: "+ selectedPet.getMoodLevel() + "\n-hungry level: "
        + selectedPet.getHungryLevel());
        initializeAvailableFood();
        requireFeeding();
        initializeEntertainment();
        requireActivity();
        while (selectedPet.getHungryLevel() > 0 && selectedPet.getMoodLevel() <10){
            requireFeeding();requireActivity();
        }

    }


    private void initAnimal(){
        Pet pet = new Pet("", "dog");
        pet.setAge(7);
        pet.setFavoriteFood("Eukanuba");
        pet.setFavoriteEntertainment("Hide & Seek");
        pet.setHealthyLevel(9);
        pet.setHungryLevel(ThreadLocalRandom.current().nextInt(0,10));
        pet.setMoodLevel(ThreadLocalRandom.current().nextInt(0,10));
        pet.setTypeOfHair("long");
        pet.setSize("big");
        pet.setGender("male");
        pet.setClean(false);
        pet.setFiziologicNeed(true);
        pet.setAction("sleeping");
        availablePets[0] = pet;

        Pet pet1 = new Pet("", "cat");
        pet1.setAge(4);
        pet1.setFavoriteFood("Purina");
        pet1.setFavoriteEntertainment("Catching Mouse");
        pet1.setHealthyLevel(7);
        pet1.setHungryLevel(ThreadLocalRandom.current().nextInt(0,10));
        pet1.setMoodLevel(ThreadLocalRandom.current().nextInt(0,10));
        pet1.setTypeOfHair("short");
        pet1.setSize("kitten");
        pet1.setGender("female");
        pet1.setClean(true);
        pet1.setFiziologicNeed(false);
        pet1.setAction("purring");
        availablePets[1] = pet1;


    }
    private void initializeAvailableFood(){
        System.out.println("\nAvailable Food: ");
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
            availableFood.add(0,food);
            availableFood.add(1,food1);
            availableFood.add(2,food2);

    }

    private void initializeEntertainment(){
        Entertainment game1 = new Entertainment("Hide & Seek");
        game1.setDuration(30);
        availableActivities[0] = game1;

        Entertainment game2 = new Entertainment("Frisbee");
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
        System.out.println("\nAvailable entertainment: ");
        for (int i=0; i<availableActivities.length; i++) {
            System.out.println((i+1) + ". "  + (char)34 + availableActivities[i].getName() + (char)34 + " - duration "
                    + availableActivities[i].getDuration() + " min.");
        }
    }

    private Entertainment getSelectedEntertainmentFromUser(){
        System.out.println("\nPlease select entertainment: ");
        try {
            int entertainmentNumber = ScannerUtils.nextSingleInt();
            return availableActivities[entertainmentNumber-1];
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Please enter a valid number from list");
            return getSelectedEntertainmentFromUser();
        }
    }
    public  void displayAvailableFood() {
//        for (int i = 0; i < availableFood.size(); i++) {
//            System.out.println((i + 1) + ". " + (char) 34 + availableFood.get(i).getName() + (char) 34 + " and the price is "+
//                    + availableFood.get(i).getPrice() + " $" + " - Expire on: " + availableFood.get(i).getDataExpirare());
//        }
        for (Food food : availableFood){
           if(food != null){
               System.out.println((availableFood.indexOf(food) + 1) + ". " + food.getName());
           }
        }
    }
    private Food  getSelectedFoodFromUser() throws Exception {
        try {
            System.out.println("\nPlease select food: ");
            int selectFood = ScannerUtils.nextSingleInt();
            return availableFood.get(selectFood - 1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter a valid number from list");
            throw new Exception();
        }catch (Exception e){
            System.out.println("Please enter a valid value from list");
            return getSelectedFoodFromUser();
        }


    }
    public void displayAvailablePets(){
        System.out.println("\nAvailable pets for you: ");
        for (int i=0; i<availablePets.length; i++){
            System.out.println((i+1) + ". " + availablePets[i].getBreed() + " " + availablePets[i].getAge() + " months old.");
        }
    }

    public void requireFeeding () throws Exception {
        if (selectedPet.getHungryLevel() >0){
            System.out.println("\nYour pet require feeding");
            displayAvailableFood();
            Food selectedFood = getSelectedFoodFromUser();
            System.out.println("You have selected: " + selectedFood.getName() + "'s food.");
            player.toFeed(selectedPet, selectedFood);
            System.out.println(player.getName() + " feeding his " + selectedPet.getBreed());
            System.out.println(selectedPet.getName() + "'s new status is:\n-happiness level: "+ selectedPet.getMoodLevel() + "\n-hungry level: "
                    + selectedPet.getHungryLevel());
        }else System.out.println("Your pet it's not hungry");
    }

    public  void requireActivity(){
        if (selectedPet.getMoodLevel() < 10){
            System.out.println("\nThe pet needs some activity");
            displayEntertainment();
            Entertainment selectedEntertainment = getSelectedEntertainmentFromUser();
            System.out.println("You have selected: " + selectedEntertainment.getName() + " 's activity.");
            player.recreation(selectedPet, selectedEntertainment);
            System.out.println(player.getName() + " starts play "+ selectedEntertainment.getName() + " with his "+ selectedPet.getBreed());
            System.out.println(selectedPet.getName() + "'s new status is:\n-happiness level: "+ selectedPet.getMoodLevel() + "\n-hungry level: "
                    + selectedPet.getHungryLevel());
        }else System.out.println("Your pet it's very happy");

    }

    private Pet getSelectedPetFromUser(){
        try {System.out.println("\nPlease select a pet for you from list.");
            int selectedNumber = ScannerUtils.nextSingleInt();
            return availablePets[selectedNumber - 1];
        }catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("You have entered a invalid value. Please select a number from list");
            return getSelectedPetFromUser();
        }
    }
    public void initRescuer(){
        String nameOfRescuer = null;
        player = new Rescuer(nameOfRescuer);
        System.out.println("\nHello rescuer, please enter your name!");
        try {
            nameOfRescuer = ScannerUtils.nextLine();
            if (nameOfRescuer.isEmpty()) {
                throw new Exception("Enter a valid value");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid name");
            initRescuer();
        }
        player.setName(nameOfRescuer);
        player.setCash(300);
        System.out.println("Hello " + nameOfRescuer + ". Welcome to " + (char) 34 + "Animal Rescuer" + (char) 34 + ".");
    }
    private String nameAnimal(){
        System.out.println("\nPlease enter a name for your pet");
        String newName = ScannerUtils.nextLine();
        try {
            if (newName.isEmpty()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid name");
             nameAnimal();
        }
        System.out.println("Name for your pet is: " + newName);
        return newName;
    }
//    private int hungryLevel(){
//        int setHungryLevel = ThreadLocalRandom.current().nextInt(0,10);
//        return setHungryLevel;
//    }
//    private int moodLevel(){
//        int setMoodLevel =ThreadLocalRandom.current().nextInt(0,10);
//        return setMoodLevel;
//    }
}

