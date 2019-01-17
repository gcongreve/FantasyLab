package players;

import enums.HealingToolType;

public class Cleric extends Player {

    private HealingToolType healingTool;

    public Cleric(String name, HealingToolType healingTool, boolean goodie) {
        super(name, goodie);
        this.healingTool = healingTool;
    }

    public HealingToolType getHealingTool() {
        return healingTool;
    }

    public void changeHealingTool(HealingToolType healingTool) {
        this.healingTool = healingTool;
    }

    public int useHealingTool(){
        return healingTool.getDamage();
    }
}
