package com.nordryd.mobarena;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * <p>
 * Main class for the MobArena plugin.
 * </p>
 *
 * @author Nordryd
 */
public class Main extends JavaPlugin
{
    private final Logger logger = getLogger();

    @Override
    public void onEnable() {
        logger.info("[MobArena] MobArena plugin is now enabled.");
    }

    @Override
    public void onDisable() {
        logger.info("[MobArena] MobArena plugin is now disabled.");
    }
}
