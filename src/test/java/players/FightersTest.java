package players;

import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FightersTest {

    Fighter fighter;

    @Before
    public void before(){
        fighter = new Fighter("Ross", WeaponType.SWORD, true);
    }

    @Test
    public void getWeapon() {
        assertEquals(WeaponType.SWORD, fighter.getWeapon());
    }

    @Test
    public void changeWeapon() {
        fighter.changeWeapon(WeaponType.STICK);
        assertEquals(WeaponType.STICK, fighter.getWeapon());
    }

    @Test
    public void useWeapon() {
        assertEquals(5, fighter.useWeapon());
    }
}