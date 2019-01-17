package enums;

public enum SpellType {

    ABRACADABRA(3),
    HOCUSPOCUS(2);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
