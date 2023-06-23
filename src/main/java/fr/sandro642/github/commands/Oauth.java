package fr.sandro642.github.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Oauth implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) return true;
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("oauth")) {
            if (args.length == 0) {
                player.sendMessage("§cUsage: /oauth <code>");
                return true;
            }
            if (args.length == 1) {

            }
        }
        return false;
    }
}