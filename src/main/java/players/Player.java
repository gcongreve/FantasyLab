package players;

public abstract class Player {

    private String name;
    private int health;
    private boolean goodie;

    public Player(String name, boolean goodie) {
        this.name = name;
        this.health = 10;
        this.goodie = goodie;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isGoodie() {
        return goodie;
    }
}
