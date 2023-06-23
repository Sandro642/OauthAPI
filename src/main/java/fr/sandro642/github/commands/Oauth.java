package fr.sandro642.github.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Oauth implements CommandExecutor {

    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        Oauth.setPlugin(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) return true;
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("oauth")) {
            // Put code here
        }
        return false;
    }
}