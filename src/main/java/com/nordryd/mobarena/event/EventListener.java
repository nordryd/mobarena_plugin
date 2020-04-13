package com.nordryd.mobarena.event;

import com.nordryd.mobarena.command.CommandManager;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * <p>
 * Master {@link Listener event listener} for the MobArena plugin.
 * </p>
 *
 * @author Nordryd
 */
public abstract class EventListener implements Listener
{
    protected final JavaPlugin jPlugin;

    /**
     * Constructor.
     *
     * @param jPlugin the plugin instance.
     */
    protected EventListener(final JavaPlugin jPlugin) {
        this.jPlugin = jPlugin;
    }

    public static void registerEventListeners(final JavaPlugin jPlugin) {
        final PluginManager pluginManager = jPlugin.getServer().getPluginManager();
        pluginManager.registerEvents(new CommandManager(jPlugin), jPlugin);
    }
}
