package org.fasttrackit;

public class Animal{
    String name;
     private int age;
     private int healthyLevel;
     private int hungryLevel;
     private int moodLevel;
     private String typeOfHair;
     private String favoriteFood;
     private String favoriteEntertainment;
     private String size;
     private String gender;
     private boolean clean;
     private boolean fiziologicNeed;
     private String action;// da din coada, toarce, latra, miauna

    public Animal(String name) {
        this.name = name;
    }


    public void displayMoodlevel(String name) {
        int moodLevel = getMoodLevel();
        if (action != null){moodLevel++;}
        else moodLevel = getMoodLevel();
        System.out.println(name + " has happiness level: " + moodLevel);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthyLevel() {
        return healthyLevel;
    }

    public void setHealthyLevel(int healthyLevel) {
        this.healthyLevel = healthyLevel;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getTypeOfHair() {
        return typeOfHair;
    }

    public void setTypeOfHair(String typeOfHair) {
        this.typeOfHair = typeOfHair;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteEntertainment() {
        return favoriteEntertainment;
    }

    public void setFavoriteEntertainment(String favoriteEntertainment) {
        this.favoriteEntertainment = favoriteEntertainment;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isFiziologicNeed() {
        return fiziologicNeed;
    }

    public void setFiziologicNeed(boolean fiziologicNeed) {
        this.fiziologicNeed = fiziologicNeed;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
