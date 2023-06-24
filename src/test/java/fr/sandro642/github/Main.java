package fr.sandro642.github;

import fr.sandro642.github.OauthAPI.OauthAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Player player = Bukkit.getPlayer("Sandro642");

    @Override
    public void onEnable() {
        getLogger().info("Oauth is enabled");


        OauthAPI.getOauth().setStatus(true);
        OauthAPI.getOauth().launchData();
        OauthAPI.getOauth().oauthGui(player);
    }

    @Override
    public void onDisable() {
        getLogger().info("Oauth is disabled");
    }

}