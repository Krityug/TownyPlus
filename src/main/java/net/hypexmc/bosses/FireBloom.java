package net.hypexmc.bosses;


import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.mineacademy.fo.Common;

public class FireBloom implements Listener {

    @EventHandler
    public void FireBloom(CreatureSpawnEvent event) {

        Entity entity = event.getEntity();

        if(entity.getType() == EntityType.MAGMA_CUBE)
            return;

        entity.setCustomName(Common.colorize("&6&LFire &E&LBloom"));
        entity.setCustomNameVisible(true);



    }
}
