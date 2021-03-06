package players;

import behaviours.IDamage;
import behaviours.IHeal;
import enums.MythicalCreatureType;
import enums.SpellType;

public class Wizard extends Player implements IDamage, IHeal {

    private SpellType spell;
    private MythicalCreatureType mythicalCreature;

    public Wizard(String name, boolean goodie) {
        super(name, goodie);
        this.spell = null;
        this.mythicalCreature = null;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void addSpell(SpellType spell) {
        this.spell = spell;
    }

    public int castSpell(){
        return this.spell.getDamage();
    }

    public MythicalCreatureType getCreature() {
        return mythicalCreature;
    }

    public void addCreature(MythicalCreatureType creature) {
        this.mythicalCreature = creature;
    }

    public int summonCreature(){
        return this.mythicalCreature.getDamage();
    }

    public void fight(Player player) {
        if(player instanceof Enemy){
            player.loseHealth(castSpell());
        }
    }

    @Override
    public void revive(Player player) {
        if(player.isGoodie()){
            player.gainHealth(castSpell());
        }
    }


}
