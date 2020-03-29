package org.fasttrackit;

public class Bird extends Animal{
    private boolean eggs;
    private int numberOfEggs;
    private boolean flyingOrNot;

    public Bird(String name) {
        super(name);
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
}
