package me.elordenador.chatmon;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EventListener implements Listener {
    JavaPlugin plugin;
    public void onMessageSend(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();
        String words = this.plugin.getConfig().getString("blockedWords");
        String enabled = this.plugin.getConfig().getString("enabled");
        if (enabled.equalsIgnoreCase("true")) {
            System.out.println("W");
        }

    }
    public EventListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }
}
