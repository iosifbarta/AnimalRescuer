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
        int moodLevel = animal.getMoodLevel();

        if (hungryLevel <= 10 && hungryLevel > 0) ;
        {
            hungryLevel--;
        }
        if (animalFood.getName().equals(animal.getFavoriteFood()))
        {
            moodLevel++;
        }else {moodLevel = animal.getMoodLevel();}
            System.out.println(Rescuer.this.name + " just gave some " + animalFood.getName() + "'s food to " + animal.getName()
                    + " and hungry level is: " + hungryLevel + ". \nMood Level is:  " + moodLevel);
    }


    public void recreation(Pet animal, Entertainment activity) {
        int moodLevel = animal.getMoodLevel();
        if (activity.getName().equals(animal.getFavoriteEntertainment())){
            moodLevel = moodLevel + 2;
        }else {moodLevel++;}

        System.out.println("Your pet " + animal.getName() + " playing " + activity.getName() + ".");
        System.out.println("Mood level for your pet increase to: " + moodLevel);
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