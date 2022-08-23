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

    }
    public EventListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }
}
