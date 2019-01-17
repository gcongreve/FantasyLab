package players;

import enums.MythicalCreatureType;
import enums.SpellType;
import enums.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    Wizard gandalf;
    TreasureType treasure;

    @Before
    public void before(){
        gandalf = new Wizard("Gandalf", true);
        treasure = TreasureType.TIN;
    }

    @Test
    public void addSpell() {
        gandalf.addSpell(SpellType.ABRACADABRA);
        assertEquals(SpellType.ABRACADABRA, gandalf.getSpell());
    }


    @Test
    public void castSpell() {
        gandalf.addSpell(SpellType.ABRACADABRA);
        assertEquals(SpellType.ABRACADABRA, gandalf.getSpell());
        assertEquals(3, gandalf.castSpell());
    }

    @Test
    public void addCreature(){
        gandalf.addCreature(MythicalCreatureType.DRAGON);
        assertEquals(MythicalCreatureType.DRAGON, gandalf.getCreature());
    }

    @Test
    public void summonCreature(){
        gandalf.addCreature(MythicalCreatureType.UNICORN);
        assertEquals(1, gandalf.summonCreature());
    }

    @Test
    public void canGetTreasure(){
        gandalf.addTreasure(treasure);
        assertEquals(1, gandalf.getTreasure().size());
    }
}