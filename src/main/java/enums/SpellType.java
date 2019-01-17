package enums;

public enum SpellType {

    ABRACADABRA(3),
    HOCUSPOCUS(-3);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
