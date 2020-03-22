package org.fasttrackit;

public class Animal{
    String name;
     int age;
     int healthyLevel;
     int hungryLevel;
     int moodLevel;
     String breed; //caine, pisica, iepure, cal, reptila etc
     String typeOfHair;
     String favFood;
     String favEntertainment;
     String size;
     String gender;
     boolean clean;
     boolean fiziologicNeed;

    public Animal(String name) {
        this.name = name;

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

    public String getRase() {
        return breed;
    }

    public void setRase(String rase) {
        this.breed = rase;
    }

    public String getTypeOfHair() {
        return typeOfHair;
    }

    public void setTypeOfHair(String typeOfHair) {
        this.typeOfHair = typeOfHair;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavEntertainment() {
        return favEntertainment;
    }

    public void setFavEntertainment(String favEntertainment) {
        this.favEntertainment = favEntertainment;
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
}
