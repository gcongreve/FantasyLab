package players;

import enums.WeaponType;

public class Enemy extends Fighter {

    public Enemy(String name, WeaponType weapon, boolean goodie) {
        super(name, weapon, goodie);
    }

    public void fight(Player player) {
        player.loseHealth(useWeapon());
    }


}
