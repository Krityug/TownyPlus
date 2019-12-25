package net.hypexmc.bosses;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.mineacademy.fo.Common;

import java.net.CacheRequest;

public class NightDevil implements Listener {

    @EventHandler
    public void NightDevilSpawn(CreatureSpawnEvent event) {

        Entity entity = event.getEntity();

        if(entity.getType() != EntityType.ZOMBIE)
            return;

        entity.setCustomName(Common.colorize("&9&LNight &F&LDevil"));
        entity.setCustomNameVisible(true);

    }
}
