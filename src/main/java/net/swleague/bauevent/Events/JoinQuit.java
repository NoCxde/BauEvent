package net.swleague.bauevent.Events;


import net.swleague.bauevent.BauEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class JoinQuit implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();

        event.setJoinMessage(BauEvent.server + "§b" + p.getName() + " §7hat das Spiel betreten");
    }
   @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player p = event.getPlayer();

        event.setQuitMessage(BauEvent.server + "§b" + p.getName() + " §7hat das Spiel verlassen");
   }

}
