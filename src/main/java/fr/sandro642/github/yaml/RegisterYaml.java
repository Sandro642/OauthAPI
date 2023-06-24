package fr.sandro642.github.yaml;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class RegisterYaml {

    private FileConfiguration configuration;

    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        RegisterYaml.setPlugin(plugin);
    }

    public static void registerYamlStatus() throws IOException {
        File file = new File(plugin.getDataFolder(), "datastatus.yml");

        plugin.getDataFolder().mkdirs();
        file.createNewFile();
    }

    public static void registerYamlSecret() throws IOException {
        File file = new File(plugin.getDataFolder(), "playerdatasecret.yml");

        plugin.getDataFolder().mkdirs();
        file.createNewFile();
    }
}
