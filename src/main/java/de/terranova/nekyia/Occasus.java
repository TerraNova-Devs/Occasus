package de.terranova.nekyia;

import de.terranova.nekyia.listener.Advancements;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;
import java.util.UUID;

public final class Occasus extends JavaPlugin {

    public static Map<UUID, SettingsBean> players;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Advancements(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
