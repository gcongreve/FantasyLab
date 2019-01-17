package enums;

public enum WeaponType {
    SWORD(5),
    STICK(2);

    public final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }
}
