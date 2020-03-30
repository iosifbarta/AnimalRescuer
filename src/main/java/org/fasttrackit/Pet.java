package org.fasttrackit;

public class Pet extends Animal{
    private String breed; //Cat, dog, bird, etc
    
    public Pet(String name, String breed) {
        super(name); this.breed = getBreed();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void displayMoodlevel(String name) {
        System.out.println("My " + getBreed() + " " + name + " " + getAction() + ".");
        super.displayMoodlevel(name);
    }
}
