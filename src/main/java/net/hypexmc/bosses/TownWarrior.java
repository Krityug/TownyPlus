package net.hypexmc.bosses;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.mineacademy.fo.Common;

public class TownWarrior implements Listener {

    @EventHandler
    public void Warrior(CreatureSpawnEvent event) {

        Entity entity = event.getEntity();

        if(entity.getType() != EntityType.IRON_GOLEM)
            return;

        entity.setCustomName(Common.colorize("&B&LTowny &F&LWarrior"));
        entity.setCustomNameVisible(true);


    }
}
