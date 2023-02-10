package com.zloyclop;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class EventListener implements Listener {

    @EventHandler()
    public void onEntityClick(PlayerInteractAtEntityEvent e) {
        if (e.getPlayer().isSneaking()) {
            if (e.getRightClicked() instanceof ArmorStand stand) {
                Stand.nextPose(stand);
            }
        }
    }

    @EventHandler()
    public void onCreatureSpawn(CreatureSpawnEvent e) {
        if (!(e.getEntity() instanceof ArmorStand stand)) return;
        stand.setArms(true);
        Stand.setPose(stand,Pose.poses[0]);
    }
}
