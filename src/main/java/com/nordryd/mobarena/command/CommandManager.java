package com.nordryd.mobarena.command;

import java.util.List;

import com.nordryd.mobarena.event.EventListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * <p>
 * Listens for and handles issued commands.
 * </p>
 *
 * @author Nordryd
 */
public class CommandManager extends EventListener implements CommandExecutor, TabCompleter
{
    private static final String MASTER_CMD_PREFIX = "marena";

    /**
     * Constructor.
     *
     * @param jPlugin the plugin instance.
     */
    protected CommandManager(final JavaPlugin jPlugin) {
        super(jPlugin);
    }

    @Override
    public boolean onCommand(final CommandSender commandSender, final Command command, final String label,
            final String... args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(final CommandSender commandSender, final Command command, final String label,
            final String... args) {
        return null;
    }
}
