package intelliractive.printer_mini_game;

import org.bukkit.plugin.java.JavaPlugin;

public final class Printer_mini_game extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Успешный запуск мини-игры \"Принтер\"!");
        getServer().getPluginManager().registerEvents(new Game(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
