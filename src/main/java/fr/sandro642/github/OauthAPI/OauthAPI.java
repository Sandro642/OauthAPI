package fr.sandro642.github.OauthAPI;

import fr.sandro642.github.commands.Oauth;
import fr.sandro642.github.misc.OauthGui;
import fr.sandro642.github.yaml.RegisterYaml;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.IOException;

public class  OauthAPI {

    private static OauthAPI instance;

    private Plugin plugin;
    public OauthAPI(Plugin plugin) {
        this.plugin = plugin;
        Oauth.setPlugin(plugin);
        RegisterYaml.setPlugin(plugin);
    }

    public void setStatus(boolean status) {
        if (!status == false) return;
    }

    public void oauthGui(Player player) {
        OauthGui.openGui(player);
    }

    public void launchData() throws IOException {
        RegisterYaml.registerYamlStatus();
        RegisterYaml.registerYamlSecret();
        plugin.getServer().getPluginCommand("oauth").setExecutor(new Oauth());
    }


    public static OauthAPI getOauth() {
        return instance;
    }

}
