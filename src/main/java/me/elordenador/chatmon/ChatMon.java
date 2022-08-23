package me.elordenador.chatmon;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class ChatMon extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = this.getLogger();
        logger.info("[+ CS ] Chat Moderation System Loading");
        this.saveResource("config.yml", false);
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
        this.getCommand("automod").setExecutor(new CommandAutoMod(this));
        logger.info("[+ CS ] Chat Moderation System Loaded"); // Termino la carga
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
