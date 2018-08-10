package me.eric.trident;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Trident plugin has been enabled.");
        getServer().getPluginManager().registerEvents(new ListenerClass(), this);
    }
    @Override
    public void onDisable(){
        getLogger().info("Trident plugin has been disabled.");
    }
    public static double dropCalculate(){
        double rate = Math.random();
        return rate;
    }
}
