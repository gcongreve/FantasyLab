package players;

import enums.TreasureType;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private boolean goodie;
    private ArrayList<TreasureType> treasure;

    public Player(String name, boolean goodie) {
        this.name = name;
        this.health = 10;
        this.goodie = goodie;
        this.treasure = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int loseHealth(int damage){
        return this.health -= damage;
    }

    public int gainHealth(int damage){
        return this.health += damage;
    }

    public boolean isGoodie() {
        return goodie;
    }

    public void addTreasure(TreasureType treasure){
        this.treasure.add(treasure);
    }

    public ArrayList<TreasureType> getTreasure() {
        return treasure;
    }
}
