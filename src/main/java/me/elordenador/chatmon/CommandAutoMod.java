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
            sender.sendMessage(ChatColor.BLUE + "AutoMod " + ChatColor.WHITE + " >> " + ChatColor.RESET + "Config Reloaded");
            return true;
        }
        return false;
    }

}
