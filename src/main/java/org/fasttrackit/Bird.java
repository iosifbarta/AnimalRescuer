package org.fasttrackit;

public class Bird extends Animal{
    private boolean eggs;
    private int numberOfEggs;
    private boolean flyingOrNot;
    protected String species;

    public Bird(String name, String species) {
        super(name);
        this.species = species;
    }


    public boolean isEggs() {
        return eggs;
    }

    public void setEggs(boolean eggs) {
        this.eggs = eggs;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

    public boolean isFlyingOrNot() {
        return flyingOrNot;
    }

    public void setFlyingOrNot(boolean flyingOrNot) {
        this.flyingOrNot = flyingOrNot;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void displayMoodlevel(String name) {
        System.out.println("My " + getSpecies() + " " + name + " " + getAction() + ".");
        super.displayMoodlevel(name);
    }
}
