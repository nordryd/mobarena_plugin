package com.nordryd.mobarena.command;

/**
 * <p>
 * All commands for the MobArena plugin.
 * </p>
 *
 * @author Nordryd
 */
public enum Command
{
    HELLO_WORLD("hello_world", false),
    ECHO("echo", false, "arg"),
    ADD("add", false, "numX", "numY"),
    MULTIPLY("multiply",true,"numX","numY");

    private final String command;
    private final boolean isAdminCommand;
    private final String[] parameters;

    Command(final String command, final boolean isAdminCommand, final String... autocompleteFields) {
        this.command = command;
        this.isAdminCommand = isAdminCommand;
        this.parameters = autocompleteFields;
    }

    Command(final String command, final boolean isAdminCommand) {
        this(command, isAdminCommand, "");
    }

    /**
     * @return the command itself.
     */
    public String getCommand() {
        return command;
    }

    /**
     * @return the name for this command's parameter(s).
     */
    public String[] getParameters() {
        return parameters;
    }

    /**
     * @return {@code true} if this command may only be used by {@code marena.admin} level users. {@code false} if they may be used by anyone.
     */
    public boolean isAdminCommand() {
        return isAdminCommand;
    }
}
