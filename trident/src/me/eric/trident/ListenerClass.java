package me.eric.trident;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static me.eric.trident.Main.dropCalculate;

public class ListenerClass implements Listener {
    @EventHandler
    public void onDrownedDeath(EntityDeathEvent e){
        Entity a = e.getEntity();
        if(a instanceof Drowned) {
            if(dropCalculate()<0.2) {
                ItemStack trident = new ItemStack(Material.TRIDENT, 1);
                ArrayList<ItemStack> drops = new ArrayList<>();
                drops.add(trident);
                e.getDrops().clear();
                e.getDrops().add(trident);
                return;
            }
        }
    }
}
