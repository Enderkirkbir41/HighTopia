package Game;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Listenerx
  implements Listener
{
  @EventHandler
  public void Chat(AsyncPlayerChatEvent e)
  {
    Player p = e.getPlayer();
    if (p.getName().equalsIgnoreCase("phillipberger")) {
      e.setCancelled(true);
      Bukkit.broadcastMessage("§4" + p.getName() + "§c> §b" + e.getMessage());
    }
    else if (p.getName().equalsIgnoreCase("enderkirkbir")) {
      e.setCancelled(true);
      Bukkit.broadcastMessage("§4" + p.getName() + "§c> §8" + e.getMessage());
    }
    else if (p.hasPermission("rm.premium")) {
      e.setCancelled(true);
      Bukkit.broadcastMessage("§6" + p.getName() + "§8> §e" + e.getMessage());
    }
    else
    {
      e.setCancelled(true);
      Bukkit.broadcastMessage("§a" + p.getName() + "§8> §7" + e.getMessage());
    }
  }
}