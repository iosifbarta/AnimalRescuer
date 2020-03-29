package org.fasttrackit;

public class Pet extends Animal{
    private String breed; //Cat, dog, bird, etc
    
    public Pet(String name) {
        super(name);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
