package net.hypexmc.commands;

import net.hypexmc.menus.HammerShop;
import org.mineacademy.fo.command.SimpleCommand;

public class HammerShopCommand extends SimpleCommand {
    public HammerShopCommand() {
        super("hammer");
    }

    @Override
    protected void onCommand() {
        checkConsole();
        new HammerShop().displayTo(getPlayer());
    }
}
