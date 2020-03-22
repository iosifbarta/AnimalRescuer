package org.fasttrackit;

public class Rescuer {
    String name;
    double cash;

    public Rescuer(String name) {
        this.name = name;
    }

    public void toFeed (Animal animal, int hungryLevel, AnimalFood animalFood){

        if (hungryLevel <= 10 && hungryLevel >= 0);
        {hungryLevel--;}
        System.out.println(Rescuer.this.name + " just gave some " + animalFood.getName() + " food to " + animal.getName() +
                " and hungry level is: " + hungryLevel);
//    }
}public void recreation(Animal animal, int moodLevel, Activity activity){
        if (moodLevel <= 10 && moodLevel >= 0);
        {moodLevel++;}
        System.out.println("The name of rescuer is: " + Rescuer.this.name );
        System.out.println("New activity available: " + activity.getName() + ", for your dog "+ animal.getName() +
                ".  Happiness for your pet increase to: " + moodLevel);
    }
}





