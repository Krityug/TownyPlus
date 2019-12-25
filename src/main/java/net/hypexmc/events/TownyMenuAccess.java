package net.hypexmc.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

public class TownyMenuAccess implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        ItemStack TownyMenuAccessLayout = ItemCreator.of(CompMaterial.COMPASS,"&ATowny Menu",
                "&8Towny Gadget","","&7Basic tool to access the towny","&7menu remotely.","","&EClick to open!")
                .build().make();

        player.getInventory().setItem(9,TownyMenuAccessLayout);

    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {

        Player player = e.getPlayer();



    }
}
