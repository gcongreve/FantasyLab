package players;

import enums.HealingToolType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Clarke", HealingToolType.MAGICSPONGE, true);
    }

    @Test
    public void getHealingTool() {
        assertEquals(HealingToolType.MAGICSPONGE, cleric.getHealingTool());
    }

    @Test
    public void changeHealingTool() {
        cleric.changeHealingTool(HealingToolType.HERBS);
        assertEquals(HealingToolType.HERBS, cleric.getHealingTool());
    }

    @Test
    public void useHealingTool() {
        assertEquals(2, cleric.useHealingTool());
    }
}