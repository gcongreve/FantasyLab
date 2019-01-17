package players;

import behaviours.IHeal;
import enums.HealingToolType;

public class Cleric extends Player implements IHeal {

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


    @Override
    public void revive(Player player) {
        if(player.isGoodie()){
            player.gainHealth(useHealingTool());
        }
    }
}
