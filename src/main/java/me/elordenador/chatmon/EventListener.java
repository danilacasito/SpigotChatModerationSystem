package me.elordenador.chatmon;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class EventListener implements Listener {
    JavaPlugin plugin;
    @EventHandler
    public void onMessageSend(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        Utilities utils = new Utilities();
        String message = event.getMessage();
        List words;
        words = this.plugin.getConfig().getList("blockedWords");
        String enabled = this.plugin.getConfig().getString("enabled");
        assert enabled != null;
        if (enabled.equalsIgnoreCase("true")) {
            assert words != null;
            if (utils.StringPresent(words, message)) {
                event.setCancelled(true);
                for (Player p : this.plugin.getServer().getOnlinePlayers()) {
                    if (p.hasPermission("ChatMod.ViewBlocks")) {
                        p.sendMessage(ChatColor.DARK_RED + this.plugin.getConfig().getString("ServerName") + ChatColor.RESET + " >> " + player.getName() + this.plugin.getConfig().getString("messages.automod_blocked"));
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
