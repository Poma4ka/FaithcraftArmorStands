package com.zloyclop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    public void onEnable() {
        Main.instance = this;
        Bukkit.getServer().getPluginManager().registerEvents(new EventListener(),this);
    }


}
