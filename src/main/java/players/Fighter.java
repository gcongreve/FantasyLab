package players;

import behaviours.IDamage;
import enums.WeaponType;

public class Fighter extends Player implements IDamage {

    private WeaponType weapon;


    public Fighter(String name, WeaponType weapon, boolean goodie) {
        super(name, goodie);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void changeWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public int useWeapon(){
        return weapon.damage;
    }


}
