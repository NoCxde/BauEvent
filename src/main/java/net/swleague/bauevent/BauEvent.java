package net.swleague.bauevent;

import net.swleague.bauevent.Commands.GamemodeCommand;
import net.swleague.bauevent.Commands.HelpCommand;
import net.swleague.bauevent.Commands.MsgCommand;
import net.swleague.bauevent.Events.JoinQuit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BauEvent extends JavaPlugin {
    public static String server = "§bSWLeague §8| §7";

    @Override
    public void onEnable() {
        System.out.println(server + "Der Server ist gestartet");
        getServer().getPluginManager().registerEvents(new JoinQuit(), this);

        getCommand("help").setExecutor(new HelpCommand());
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("msg").setExecutor(new MsgCommand());
    }

    @Override
    public void onDisable() {
        System.out.println(server + "Der Server wird gestoppt");
    }
}
