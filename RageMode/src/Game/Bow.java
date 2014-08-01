package Game;

import java.util.ArrayList;
import java.util.UUID;

import me.enderkirkbir.rm.Main;

import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Bow
  implements Listener
{
  ArrayList<UUID> list = new ArrayList();

  @EventHandler
  public void onLaunch(EntityShootBowEvent e) { if (((e.getEntity() instanceof Player)) && 
      ((e.getProjectile() instanceof Arrow)))
      this.list.add(e.getProjectile().getUniqueId());
  }

  @EventHandler
  public void onHit(ProjectileHitEvent e)
  {
    if (this.list.contains(e.getEntity().getUniqueId())) {
      Arrow a = (Arrow)e.getEntity();
      Location loc = a.getLocation();
      a.getWorld().createExplosion(loc.getX(), loc.getY(), loc.getZ(), 1.0F, false, false);
      this.list.remove(a.getUniqueId());
    }
  }
  @EventHandler
  public void onBlockDrop(PlayerDropItemEvent event) {
    Player p = event.getPlayer();
    event.getPlayer().getWorld().getName();

    event.getItemDrop().remove();

    event.setCancelled(true);
    p.sendMessage(Main.px + "§aDu Darfst hier keine Items Droppen!");
  }

  @EventHandler(priority=EventPriority.NORMAL)
  public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
    Entity ent = event.getEntity();
    if ((event.getDamager() instanceof Arrow)) {
      Arrow arw = (Arrow)event.getDamager();
      event.setDamage(5000);
    }
  }
}