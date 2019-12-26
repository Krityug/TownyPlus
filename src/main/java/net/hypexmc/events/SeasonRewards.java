package net.hypexmc.events;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;
import org.mineacademy.fo.remain.Remain;


public class SeasonRewards implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        Remain.sendTitle(player,20,30,20, Common.colorize("&A&LSeason &C&LRewards"),
                Common.colorize(""));

        player.sendMessage(Common.colorize("&8[&ESeason Manager&8]" + " " + "&AGiven &864x Wood &Aduring December."));
        player.sendMessage(Common.colorize("&8[&ESeason Manager&8]" + " " + "&AYour &Bseason &Areward has been claimed!"));


        ItemStack Wood = ItemCreator.of(CompMaterial.JUNGLE_WOOD,"&FJungle Wood")
                .build().make();


        player.getInventory().addItem(Wood);

    }
}
