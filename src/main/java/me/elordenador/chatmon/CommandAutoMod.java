package me.elordenador.chatmon;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandAutoMod implements CommandExecutor {
    JavaPlugin plugin;
    public CommandAutoMod(JavaPlugin e) {
        this.plugin = e;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equals("reload")) {
            this.plugin.reloadConfig();
            String serverName = this.plugin.getConfig().getString("ServerName");
            sender.sendMessage(ChatColor.BLUE + serverName + " " + ChatColor.WHITE + " >> " + ChatColor.RESET + this.plugin.getConfig().getString("messages.automod_reload"));
            return true;
        }
        return false;
    }

}
