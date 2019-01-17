package game;

import enums.HealingToolType;
import enums.TreasureType;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    Enemy enemy;
    Wizard wizard;
    Fighter fighter;
    Cleric cleric;
    Room room;
    ArrayList<Player> squad;

    @Before
    public void before(){
        enemy = new Enemy("Paul", WeaponType.STICK, false);
        wizard = new Wizard("Gandalf", true);
        fighter = new Fighter("Jake", WeaponType.SWORD, true);
        cleric = new Cleric("Tim", HealingToolType.HERBS, true);
        squad = new ArrayList<>();
        squad.add(wizard);
        squad.add(fighter);
        squad.add(cleric);
        room = new Room("Haunted Forest", TreasureType.TIN, enemy, squad);
    }

    @Test
    public void getName() {
        assertEquals("Haunted Forest", room.getName());
    }

    @Test
    public void getTreasure() {
        assertEquals(TreasureType.TIN, room.getTreasure());
    }

    @Test
    public void getEnemy() {
        assertEquals(enemy, room.getEnemy());
    }

    @Test
    public void getSquad() {
        assertEquals(squad, room.getSquad());
    }

    @Test
    public void findSpecificPlayer(){
        assertEquals(cleric, room.findPlayer(cleric));
    }

    @Test
    public void playerCanBattle(){
        room.battle(enemy, fighter);
        assertEquals(5, enemy.getHealth());
    }
    
}