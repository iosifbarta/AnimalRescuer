package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood extends Food{
   private String rewards; //recompensa
   private String typeOfFood; //activitate intensa- normala - dietetic

    public AnimalFood(String name) {
        super(name);
    }



    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
}
