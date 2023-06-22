package fr.sandro642.github.OauthAPI;

import org.bukkit.plugin.Plugin;

public class OauthAPI {

    private static OauthAPI instance;

    private Plugin plugin;
    public OauthAPI(Plugin plugin) {
        this.plugin = plugin;
    }

    public void setStatus(boolean status) {
        if (!status == false) return;
    }


    public static OauthAPI getOauth() {
        return instance;
    }

}
