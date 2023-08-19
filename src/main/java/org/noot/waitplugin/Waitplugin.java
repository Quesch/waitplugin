package org.noot.waitplugin;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Async;

public final class Waitplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this,this);
        this.getLogger().info("runs1");
    }
    @EventHandler
    public void  SendmessgeEV(/*io.papermc.paper.event.player.AsyncChatEvent*/AsyncPlayerChatEvent event){

        Bukkit.getScheduler().runTaskLater(this, () -> {
            // code

            Player player = event.getPlayer();
            this.getLogger().info("noot");
            player.sendRawMessage("noot1");
        },20L);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
