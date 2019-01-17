package game;

import behaviours.IDamage;
import behaviours.IHeal;
import enums.TreasureType;
import players.Cleric;
import players.Enemy;
import players.Player;
import players.Wizard;

import java.util.ArrayList;

public class Room {

    private String name;
    private TreasureType treasure;
    private Enemy enemy;
    private ArrayList<Player> squad;

    public Room(String name, TreasureType treasure, Enemy enemy, ArrayList<Player> squad) {
        this.name = name;
        this.treasure = treasure;
        this.enemy = enemy;
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public TreasureType getTreasure() {
        return treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public ArrayList<Player> getSquad() {
        return squad;
    }

    public boolean findPlayer(Player player){
        return squad.contains(player);
    }

    public void playerBattleEnemy(Enemy enemy, IDamage player){
        player.fight(enemy);
    }

    public void enemyBattlePlayer(IDamage enemy, Player player){
        enemy.fight(player);
    }


    public void playerGetsRevived(IHeal healer, Player player) {
        healer.revive(player);
    }
}
