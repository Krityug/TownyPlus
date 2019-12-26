package net.hypexmc.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.remain.Remain;

public class Greet implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();


        Remain.sendTitle(player,20,30,20,Common.colorize("&9&LHypexMC &F&LNetwork")
                ,Common.colorize("&F&LIntroducing &E&LTreasure &B&LHunt"));
    }
}
