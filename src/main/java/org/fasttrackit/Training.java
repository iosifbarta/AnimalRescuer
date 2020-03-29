package org.fasttrackit;

public class Training extends Activity {
    private boolean trainer;
    private int levelOfTrainer;

    public Training(String name) {
        super(name);
    }

    public boolean isTrainer() {
        return trainer;
    }

    public void setTrainer(boolean trainer) {
        this.trainer = trainer;
    }

    public int getLevelOfTrainer() {
        return levelOfTrainer;
    }

    public void setLevelOfTrainer(int levelOfTrainer) {
        this.levelOfTrainer = levelOfTrainer;
    }
}
