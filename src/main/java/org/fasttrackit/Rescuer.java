package org.fasttrackit;

public class Rescuer {
    private String name;
    private double cash;
    private String gender;
    private String category; //child or man

    public Rescuer(String name) {
        this.name = name;
    }

    public void toFeed(Animal animal, AnimalFood animalFood){
        int hungryLevel = animal.getHungryLevel();

        if (hungryLevel <= 10 && hungryLevel >= 0);
        {
            hungryLevel--;}


        if (animalFood.getName() == animal.getFavFood());{
            int moodLevel = animal.getMoodLevel();
            moodLevel++;
            System.out.println(Rescuer.this.name + " just gave some " + animalFood.getName() + " food to " + animal.getName()
                    + " and hungry level is: " + hungryLevel + ". Mood Level is:  " +moodLevel);
        }

//    }
}public void recreation(Animal animal, Activity activity){
        int moodLevel = animal.getMoodLevel();
        if (moodLevel <= 10 && moodLevel >= 0);
        {moodLevel++;}
        System.out.println("The name of rescuer is: " + Rescuer.this.name );
        System.out.println("New activity available: " + activity.getName() + ", for your dog "+ animal.getName() +
                ".  Happiness for your pet increase to: " + moodLevel);
    }
}





