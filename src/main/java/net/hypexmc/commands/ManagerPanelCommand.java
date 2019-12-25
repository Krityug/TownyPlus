package net.hypexmc.commands;

import net.hypexmc.menus.ManagerPanel;
import org.mineacademy.fo.command.SimpleCommand;

public class ManagerPanelCommand extends SimpleCommand {
    public ManagerPanelCommand() {
        super("manager|towny");
    }

    @Override
    protected void onCommand() {
     new ManagerPanel().displayTo(getPlayer());
    }
}
