package de.terranova.nekyia.listener;

import de.terranova.nekyia.Occasus;
import de.terranova.nekyia.SettingsBean;
import de.terranova.nekyia.util.Chat;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Advancements implements Listener {

    @EventHandler
    public void onAdvancement(PlayerAdvancementDoneEvent e) {
        Player p = e.getPlayer();
        Map<UUID, SettingsBean> playerSettings = Occasus.players;
        Bukkit.getServer().getOnlinePlayers().stream()
                .filter(player -> !playerSettings.containsKey(player.getUniqueId()) || playerSettings.get(player.getUniqueId()).isShowAdvancements())
                .forEach(player -> p.sendMessage(e.getAdvancement().displayName()));
    }

}
