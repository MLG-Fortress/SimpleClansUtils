package me.robomwm.SimpleClansUtils;

import net.sacredlabyrinth.phaed.simpleclans.SimpleClans;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Robo on 2/13/2016.
 */
public class Main extends JavaPlugin
{
    public void onEnable()
    {
        //register listeners in da future
        getServer().getPluginManager().registerEvents(new SimpleClansListener(), this);
    }
}
