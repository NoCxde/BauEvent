package net.swleague.bauevent.Commands;

import net.swleague.bauevent.BauEvent;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player p = (Player) sender;

        if(p.hasPermission("BauEvent.gamemode")) {
            if(args.length == 0) {
                p.sendMessage(BauEvent.server + "Benutze /gamemode 0/1/2/3");

            } else if(args.length == 1) {
                String gm = args[0];
                if(gm.equalsIgnoreCase("1")) {
                    p.setGameMode(GameMode.CREATIVE);
                }
                if(gm.equalsIgnoreCase("0")) {
                    p.setGameMode(GameMode.SURVIVAL);
                }
                if(gm.equalsIgnoreCase("3")) {
                    p.setGameMode(GameMode.SPECTATOR);
                }
                if(gm.equalsIgnoreCase("2")) {
                    p.setGameMode(GameMode.ADVENTURE);
                }
            } else if(args.length == 2) {
                String name = args[1];
                String gm = args[0];
                if(gm.equalsIgnoreCase("1")) {
                    if(Bukkit.getPlayer(name) != null) {
                        Player pe = Bukkit.getPlayer(name);
                        pe.setGameMode(GameMode.CREATIVE);
                    } else {
                        p.sendMessage(BauEvent.server + "§cDer Spieler ist nicht online!");
                    }
                }
                if(gm.equalsIgnoreCase("0")) {
                    if(Bukkit.getPlayer(name) != null) {
                        Player pe = Bukkit.getPlayer(name);
                        pe.setGameMode(GameMode.SURVIVAL);
                    } else {
                        p.sendMessage(BauEvent.server + "§cDer Spieler ist nicht online!");
                    }
                }
                if(gm.equalsIgnoreCase("3")) {
                    if(Bukkit.getPlayer(name) != null) {
                        Player pe = Bukkit.getPlayer(name);
                        pe.setGameMode(GameMode.SPECTATOR);
                    } else {
                        p.sendMessage(BauEvent.server + "§cDer Spieler ist nicht online!");
                    }
                }
                if(gm.equalsIgnoreCase("2")) {
                    if(Bukkit.getPlayer(name) != null) {
                        Player pe = Bukkit.getPlayer(name);
                        pe.setGameMode(GameMode.ADVENTURE);
                    } else {
                        p.sendMessage(BauEvent.server + "§cDer Spieler ist nicht online!");
                    }
                }
            }
        } else {
            p.sendMessage(BauEvent.server + "§cDazu hast du keine Rechte");
        }



        return false;
    }
}
