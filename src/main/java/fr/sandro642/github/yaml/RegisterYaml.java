package fr.sandro642.github.yaml;

import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class RegisterYaml {

    private FileConfiguration configuration;

    public static Configuration configyamldatastatus;
    public static Configuration configyamlplayerdatasecret;

    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        RegisterYaml.setPlugin(plugin);
    }

    public static void registerYamlStatus() throws IOException {
        File file = new File(plugin.getDataFolder(), "datastatus.yml");

        configyamldatastatus = YamlConfiguration.loadConfiguration(file);

        plugin.getDataFolder().mkdirs();
        file.createNewFile();
    }

    public static void registerYamlSecret() throws IOException {
        File file = new File(plugin.getDataFolder(), "playerdatasecret.yml");

        configyamlplayerdatasecret = YamlConfiguration.loadConfiguration(file);

        plugin.getDataFolder().mkdirs();
        file.createNewFile();
    }
}
