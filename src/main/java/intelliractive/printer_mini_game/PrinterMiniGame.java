/*
    This is a Minecraft mini-game made with Spigot
 */
package intelliractive.printer_mini_game;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getServer;

public class PrinterMiniGame implements Listener {

    public boolean isStarted = false;

    public void countDown() {
        // set the game to started
        isStarted = true;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        // get how many players are in the server
        int playerCount = getServer().getOnlinePlayers().size();

        // count down to the game starting
//        if (playerCount == 1) {
//            PrinterMiniGame.game.countDown();
//        }

        // if the game is already started, don't count down
        if (isStarted) {
            return;
        } else {
            // if the game is not started, but there are more than one player, start the game
            if (playerCount > 1) {
                countDown();
            }
        }
    }
}