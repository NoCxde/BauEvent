package net.swleague.bauevent.Commands;

import net.swleague.bauevent.BauEvent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MsgCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("BauEvent.msg"))
            if(args.length == 0) {
                p.sendMessage(BauEvent.server + "Benutze /msg (Name) (Nachricht)");
            } else if (args.length == 2) {
                    String name = args[0];
                    String message = args[1];

                    if (Bukkit.getPlayer(name) != null) {
                        if (message != null) {
                            Bukkit.getPlayer(name).sendMessage("§b§lMSG §8| §b" + p.getName() + " §8--> §7" + message);
                            p.sendMessage("§b§lMSG §8| §b" + p.getName() + " §8--> §7" + message);
                        } else {
                            p.sendMessage(BauEvent.server + "Du hast die Nachricht vergessen");
                        }
                    } else {
                        p.sendMessage(BauEvent.server + "Der Spieler existiert nicht!");
                    }
                }

        return false;
    }
}
