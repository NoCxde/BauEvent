package net.swleague.bauevent.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BlocksCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Inventory inventory = Bukkit.createInventory(null, 27, "§b§lBlöcke");
            ((Player) sender).openInventory(inventory);
            inventory.addItem(new ItemStack(Material.STONE, 64));
        } else {
            sender.sendMessage("Du bist kein Spieler");
        }
        return false;

    }
}
