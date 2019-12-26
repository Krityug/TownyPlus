package net.hypexmc.configuration;

import com.massivecraft.massivecore.SimpleConfig;
import org.bukkit.plugin.Plugin;

import java.io.File;

public class YAMLEditor extends SimpleConfig {
    public YAMLEditor(Plugin plugin, File file) {
        super(plugin, file);
    }
}
