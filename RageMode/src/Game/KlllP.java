package Game;

import me.enderkirkbir.rm.Main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KlllP
  implements Listener
{
  @EventHandler
  public void kills(PlayerDeathEvent e)
  {
    Player k = e.getEntity().getKiller();
    Player d = e.getEntity();
    e.setKeepLevel(true);
    e.setDroppedExp(0);
    e.getDrops().clear();
    e.setDeathMessage(null);
    k.giveExpLevels(1);
    if (k.getLevel() != 0)
    {
      if (k.getLevel() == 1) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 2) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 3) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 4) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 5) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 6) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 7) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 8) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 9) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 10) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 11) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 12) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 13) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 14) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 15) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 16) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 17) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 18) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
      }
      else if (k.getLevel() == 19) {
        Bukkit.broadcastMessage(Main.px + "§a" + k.getName() + " §c> §a" + d.getName());
        Bukkit.broadcastMessage(Main.px + "§a§l" + k.getName() + " §bHat gewonnen mit §e20 §bKills");
        Bukkit.broadcastMessage(Main.px + "§a§l" + k.getName() + " §bHat gewonnen mit §e20 §bKills");
        Bukkit.broadcastMessage(Main.px + "§a§l" + k.getName() + " §bHat gewonnen mit §e20 §bKills");
        Bukkit.broadcastMessage(Main.px + "§a§l" + k.getName() + " §bHat gewonnen mit §e20 §bKills");
        Bukkit.broadcastMessage(Main.px + "§a§l" + k.getName() + " §bHat gewonnen mit §e20 §bKills");
        for (Player p : Bukkit.getOnlinePlayers())
          p.kickPlayer(Main.px + "§a" + k.getName() + " §cHat gewonnen!");
      }
    }
  }
}