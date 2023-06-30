package fr.sandro642.github.yaml;

import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class RegisterYaml {

    public static FileConfiguration configurationdatastatus;
    public static FileConfiguration configurationplayerdatasecret;

    public static Configuration configyamldatastatus;
    public static Configuration configyamlplayerdatasecret;

    public static File filedatastatus;
    public static File fileplayerdatasecret;




    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        RegisterYaml.setPlugin(plugin);
    }

    public static void registerYamlStatus() throws IOException {
        filedatastatus = new File(plugin.getDataFolder(), "datastatus.yml");

        configyamldatastatus = YamlConfiguration.loadConfiguration(filedatastatus);


        plugin.getDataFolder().mkdirs();
        filedatastatus.createNewFile();
    }

    public static void registerYamlSecret() throws IOException {
        fileplayerdatasecret = new File(plugin.getDataFolder(), "playerdatasecret.yml");

        configyamlplayerdatasecret = YamlConfiguration.loadConfiguration(fileplayerdatasecret);

        plugin.getDataFolder().mkdirs();
        fileplayerdatasecret.createNewFile();
    }
}
