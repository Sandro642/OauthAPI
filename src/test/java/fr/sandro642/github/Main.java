package fr.sandro642.github;

import fr.sandro642.github.OauthAPI.OauthAPI;
import fr.sandro642.github.commands.Oauth;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin {


    public static Player player = Bukkit.getPlayer("Sandro642");

    @Override
    public void onEnable() {
        getLogger().info("Oauth is enabled");


        OauthAPI.getOauth().setStatus(true);
        try {
            OauthAPI.getOauth().launchData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        OauthAPI.getOauth().oauthGui(player);
    }


    @Override
    public void onDisable() {
        getLogger().info("Oauth is disabled");
    }

}
