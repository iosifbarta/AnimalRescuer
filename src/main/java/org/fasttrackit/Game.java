package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Food> availableFood = new ArrayList<>();
    private Entertainment[] availableActivities = new Entertainment[3];

    public void start(){

    System.out.println(" Welcome to Animal Rescuer");

        System.out.println();
    initializeEntertainment();
    displayEntertainment();
    Entertainment selectedEntertainment = getSelectedEntertainmentFromUser();
        System.out.println("Selected Entertainment: " + selectedEntertainment.getName());

    initializeAvailableFood();
    displayAvailableFood();
    Food selectedFood = getSelectedFoodFromUser();
        System.out.println("Selected Food: " + selectedFood.getName());


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
}
