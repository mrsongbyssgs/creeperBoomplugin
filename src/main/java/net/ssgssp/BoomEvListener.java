package net.ssgssp;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class BoomEvListener implements Listener {
    @EventHandler
    public void Entexpevent(EntityExplodeEvent ee){
        EntityType ent1 = ee.getEntityType();
        if(ent1 == EntityType.CREEPER || ent1 == EntityType.ENDER_CRYSTAL || ent1 == EntityType.FIREBALL){
            ee.setCancelled(true);
        }
    }
}
