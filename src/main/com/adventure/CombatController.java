package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        int monsterlife = monster.getHealth();
        int playerlife = player.getHealth();
        int monsterdamage = monster.getPower();
        int playerdamage = player.getPower();
        while (monsterlife > 0 && !isPlayerDefeated()) {
            monsterlife -= playerdamage;
            playerlife -= monsterdamage;
        }
        player.setHealth(playerlife);
        monster.setHealth(monsterlife);

    }
    /**
      * * Checks if the player was defeated by seeing if the player's health is at or below 0.
      * @return true if the player is defeated
     */
    public boolean isPlayerDefeated() {
        int playerlife = player.getHealth();
        if (playerlife >= 0) {
            return false;
        }
        return true;
    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        player.setHealth(10);
        monster.setHealth(10);

    }
}
