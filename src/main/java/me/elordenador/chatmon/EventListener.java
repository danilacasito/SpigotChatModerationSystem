package me.elordenador.chatmon;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class EventListener implements Listener {
    JavaPlugin plugin;
    @EventHandler
    public void onMessageSend(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        Utilities utils = new Utilities();
        String message = event.getMessage();
        List<String> words;
        words = (List<String>) this.plugin.getConfig().getList("blockedWords");
        String enabled = this.plugin.getConfig().getString("enabled");
        if (enabled.equalsIgnoreCase("true")) {
            if (utils.StringPresent(words, message)) {
                event.setCancelled(true);
                for (Player p : this.plugin.getServer().getOnlinePlayers()) {
                    if (p.hasPermission("ChatMod.ViewBlocks")) {
                        p.sendMessage(ChatColor.DARK_RED + "CS " + player.getName() + "Sent a message and automod blocked it");
                        p.sendMessage("Message: " + message);
                    }
                }
            }
        }

    }
    public EventListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }
}
