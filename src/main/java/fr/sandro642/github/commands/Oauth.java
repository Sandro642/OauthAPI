package fr.sandro642.github.commands;

import fr.sandro642.github.yaml.RegisterYaml;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.List;

import static fr.sandro642.github.yaml.RegisterYaml.configuration;

public class Oauth implements CommandExecutor {

    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        Oauth.setPlugin(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) return true;
        Player player = (Player) sender;

        if (label.equalsIgnoreCase("oauth")) {
            if (player.hasPermission("oauth.admin")) return true;
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("gui")) {
                    //OauthAPI.getOauth().oauthGui(player);

                    /**
                     * @TODO Create gui
                     * Not available for moment
                     */
                }

                if (args[0].equalsIgnoreCase("status")) {
                    //OauthAPI.getOauth().setStatus(true);
                }

                if (args[0].equalsIgnoreCase("register")) {

                   String key = args[1];

                   List<String> data = RegisterYaml.configyamlplayerdatasecret.getStringList("key");

                    if(!data.contains(key)) {
                        data.add(key);
                    }

                }

                if (args[0].equalsIgnoreCase("secret")) {
                    if (args[0].equalsIgnoreCase("data")) {

                    }

                    if (args[0].equalsIgnoreCase("admin")) {

                    }
                }
            }
        }
        return false;
    }
}