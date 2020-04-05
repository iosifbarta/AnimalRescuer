package org.fasttrackit;

public class Entertainment extends Activity {
    private String games;
    private String toys;


    public Entertainment(String name) {
        super(name);
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }
}
