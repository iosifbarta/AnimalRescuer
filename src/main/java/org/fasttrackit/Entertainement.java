package org.fasttrackit;

public class Entertainement extends Activity{
       //tipul de activitate int-ext, plimbare - joaca;
    String activityType;
    String name;
    String toys;

    public Entertainement(String name, int price, int duration) {
        super(name, price, duration);
    }
}
