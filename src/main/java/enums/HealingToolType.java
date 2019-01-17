package enums;

public enum HealingToolType {
    MAGICSPONGE(2),
    HERBS(1);

    private final int damage;

    HealingToolType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
