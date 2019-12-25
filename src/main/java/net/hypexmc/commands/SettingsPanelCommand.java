package net.hypexmc.commands;

import net.hypexmc.menus.SettingsMenu;
import org.mineacademy.fo.command.SimpleCommand;

public class SettingsPanelCommand extends SimpleCommand {
    public SettingsPanelCommand() {
        super("settings");
    }

    @Override
    protected void onCommand() {
      checkConsole();
      new SettingsMenu().displayTo(getPlayer());
    }
}
