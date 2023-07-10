/*
    This is a Minecraft mini-game made with Spigot

    The game goes like this: players enter, with a sufficient number of players, the game begins.
    A picture is selected that will be printed by a large printer.
    The picture is divided into blocks. Picture size is 10 by 10.
    Players are "jets" that have their own color (a cell in the inventory is selected).
    Printing takes place line by line, 1-2 blocks depending on the number of players.
    The goal is to print the picture correctly (each block is in right place and of right color).
    The game differs depending on the coherence of the team of players.
    The game is over when all the blocks are printed.
 */
package intelliractive.printer_mini_game

import org.bukkit.Bukkit.getOnlinePlayers
import org.bukkit.Bukkit.getServer
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class Game() : Listener {
    // Состояние игры
    var isStarted: Boolean = false

    // Событие - игрок присоединился
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        // if the game is already started, don't count down
        if (isStarted) {
            return
        } else {
            // if the game is not started, but there are more than one player, start the game
            if (getServer().onlinePlayers.size >= 2)
                countDownAndStart()
        }
    }

    // Отсчёт до игры
    fun countDownAndStart() {
        for (i in 1..10) {
            getServer().broadcastMessage("&aИгра начнётся через &e" + i + "&r&a секунд")
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }

        // set the game to started
        var isStarted: Boolean = true

        getServer().broadcastMessage("&bИГРА СТАРТУЕТ!")
    }

    // Алгоритм игры
    fun start() {
        // Игроки телепортируются на игровое поле.
        getOnlinePlayers().forEach { player ->
            getServer().getWorld("world")?.let { player.teleport(it.spawnLocation) }
        }

        // Each row of a picture is an array of blocks. From the end to beginning, a row is selected.
        // Next players stand in place of a block and hold it ih their hand to print it. If the printed row is the same as the selected row from the original picture, players get 10 points.
        // The game is over when all the rows are printed.

        // Select a random picture
        var picture = Picture.entries.random().grid.reversed()

        for (row in picture) {

        }
    }
}