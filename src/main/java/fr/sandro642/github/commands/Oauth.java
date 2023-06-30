package fr.sandro642.github.commands;

import fr.sandro642.github.OauthAPI.OauthAPI;
import fr.sandro642.github.core.Action;
import fr.sandro642.github.yaml.RegisterYaml;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class Oauth implements CommandExecutor {

    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        Oauth.setPlugin(plugin);
    }

    private static List<String> data = RegisterYaml.configyamlplayerdatasecret.getStringList("key");

    private static Action action;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String key = args[1];

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
                    if (key.equals(true)) {
                        OauthAPI.getOauth().setStatus(true);
                    } else {
                        OauthAPI.getOauth().setStatus(false);
                    }
                }

                if (args[0].equalsIgnoreCase("register")) {



                    /**
                     * @TODO Add key in list
                     */


                    if(!data.contains(key)) {
                        data.add(key);
                    }

                    /**
                     * @TODO send Message confirmation
                     */

                    player.sendTitle("§aSuccess", "§aYour key has been added", 10, 10, 10);

                }

                if (args[0].equalsIgnoreCase("secret")) {
                    if (args[0].equalsIgnoreCase("data")) {
                        if (!data.equals(key)) {
                            /**
                             * @TODO send Message error
                             */

                            player.sendTitle("§cError", "§cYour key is not valid", 10, 10, 10);
                        } else {
                            /**
                             * @TODO send Message confirmation
                             */

                            player.sendTitle("§aSuccess", "§aYour key is valid", 10, 10, 10);

                            action.call();
                        }
                    }

                    if (args[0].equalsIgnoreCase("admin")) {
                    }
                }
            }
        }
        return false;
    }
}