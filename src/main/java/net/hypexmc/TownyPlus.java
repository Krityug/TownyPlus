package net.hypexmc;

import net.hypexmc.bosses.FireBloom;
import net.hypexmc.bosses.NightDevil;
import net.hypexmc.bosses.TownWarrior;
import net.hypexmc.commands.HammerShopCommand;
import net.hypexmc.commands.ManagerPanelCommand;
import net.hypexmc.commands.SettingsPanelCommand;
import net.hypexmc.events.Greet;
import net.hypexmc.events.SeasonRewards;
import org.bukkit.Bukkit;
import org.mineacademy.fo.plugin.SimplePlugin;

public final class TownyPlus extends SimplePlugin {

    @Override
    protected void onPluginStart() {
    String server = Bukkit.getServer().getName();
    getLogger().info("TownyPlus has been enabled on server" + " " + server);
    getLogger().info("Auto-Debugger has been enabled across all running machines");

    //Commands for the game mode with Foundation
    registerCommand(new SettingsPanelCommand());
    registerCommand(new ManagerPanelCommand());
    registerCommand(new HammerShopCommand());


    //Foundation events are registered using the foundation library.
        // Sometimes they may crash while foundation gets a error.


        //Gitlab Integration

    //Events which are manually registered are below:
        Bukkit.getPluginManager().registerEvents(new TownWarrior(),this);
        Bukkit.getPluginManager().registerEvents(new NightDevil(),this);
        Bukkit.getPluginManager().registerEvents(new FireBloom(),this);
        Bukkit.getPluginManager().registerEvents(new SeasonRewards(),this);
       //Bukkit.getPluginManager().registerEvents(new Greet(),this);


        //Scoreboard and Bungee Events, Other things will be listed below.

    }
}
