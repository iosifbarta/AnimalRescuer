package org.fasttrackit;

public class Rescuer {
    private String name;
    private double cash;
    private String gender;

    public Rescuer(String name) {
        this.name = name;
    }

    public void toFeed(Pet animal, Food animalFood) {
        int hungryLevel = animal.getHungryLevel();
//        int moodLevel = animal.getMoodLevel();
        if (hungryLevel <= 10 && hungryLevel > 0);
        {
            animal.setHungryLevel(animal.getHungryLevel()-1);
        }
        if (animalFood.getName().equals(animal.getFavoriteFood()))
        {
            animal.setMoodLevel(animal.getMoodLevel()+1);
        }
//        else {moodLevel = animal.getMoodLevel();}
//            System.out.println(Rescuer.this.name + " just gave some " + animalFood.getName() + "'s food to " + animal.getName()
//                    + " \nHungry level is: " + animal.getHungryLevel() + ". \nHappiness level is:  " + animal.getMoodLevel());
    }

    public void recreation(Pet pet, Entertainment entertainment){
        int happiness = pet.getMoodLevel();
        if (happiness < 10 && happiness >= 0){
            pet.setMoodLevel(pet.getMoodLevel()+1);
        }if (entertainment.getName().equals(pet.getFavoriteEntertainment())){
            pet.setMoodLevel(pet.getMoodLevel() + 1);
        }
//        System.out.println(pet.getName() + "'s happiness level is: " + happiness);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}