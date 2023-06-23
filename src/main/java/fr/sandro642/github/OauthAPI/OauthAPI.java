package fr.sandro642.github.OauthAPI;

import fr.sandro642.github.commands.Oauth;
import fr.sandro642.github.misc.OauthGui;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class OauthAPI {

    private static OauthAPI instance;

    private Plugin plugin;
    public OauthAPI(Plugin plugin) {
        this.plugin = plugin;
        Oauth.setPlugin(plugin);
    }

    public void setStatus(boolean status) {
        if (!status == false) return;
    }

    public void oauthGui(Player player) {
        OauthGui.openGui(player);
    }

    public void launchData() {
        plugin.getServer().getPluginCommand("oauth").setExecutor(new Oauth());
    }


    public static OauthAPI getOauth() {
        return instance;
    }

}
