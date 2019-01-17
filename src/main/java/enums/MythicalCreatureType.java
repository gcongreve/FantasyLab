package enums;

public enum MythicalCreatureType {

    DRAGON(2),
    UNICORN(1);

    private final int damage;

    MythicalCreatureType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
