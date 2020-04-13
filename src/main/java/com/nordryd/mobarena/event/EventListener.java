package com.nordryd.mobarena.event;

import org.bukkit.event.Listener;
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
}
