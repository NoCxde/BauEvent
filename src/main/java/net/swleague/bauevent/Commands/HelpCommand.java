package net.swleague.bauevent.Commands;


import net.swleague.bauevent.BauEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(BauEvent.server + "§b§lHilfe:");
        p.sendMessage(BauEvent.server + "/gamemode §7--> §7Um zwischen den Modis zu wechseln");
        p.sendMessage(BauEvent.server + "/plot auto §7--> §7Um ein Plot zu erhalten");
        p.sendMessage(BauEvent.server + "/plot home §7--> §7Um zu seinem Plot zu gelangen");
        p.sendMessage(BauEvent.server + "/plot auto §7--> §7Um zum Spawn zu kommen");




        return false;
    }
}
