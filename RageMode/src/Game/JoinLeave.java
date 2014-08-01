package Game;

import me.enderkirkbir.rm.Main;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeave
  implements Listener
{
  private final Main pl;

  public JoinLeave(Main pl)
  {
    this.pl = pl;
  }
  @EventHandler
  public void join(PlayerJoinEvent e) { Player p = e.getPlayer();
    if (Bukkit.getOnlinePlayers().length < 5) {
      p.sendMessage("§6======================================");
      p.sendMessage("§3 Es sind gerade §cnicht §3genug Spieler §aOnline");
      p.sendMessage("§3               Warte Kurz.");
      p.sendMessage("§3         Warten auf §a5 §3Spieler.");
      p.sendMessage("§6======================================");
      e.setJoinMessage(Main.px + " §8[§a+§8] §7" + p.getName());
      this.pl.getServer().getScheduler().scheduleSyncDelayedTask(this.pl, new Runnable(p) {
        public void run() {
          this.val$p.teleport(
            new Location(Bukkit.getServer().getWorld(JoinLeave.this.pl.getConfig().getString("rm.lobby.world")), 
            JoinLeave.this.pl.getConfig().getDouble("rm.lobby.x"), 
            JoinLeave.this.pl.getConfig().getDouble("rm.lobby.y"), 
            JoinLeave.this.pl.getConfig().getDouble("rm.lobby.z"), 
            JoinLeave.this.pl.getConfig().getInt("rm.lobby.yaw"), 
            JoinLeave.this.pl.getConfig().getInt("rm.lobby.pitch")));
        }
      }
      , 60L);
    } }

  @EventHandler
  public void jq(PlayerQuitEvent e) {
    Player p = e.getPlayer();
    e.setQuitMessage(Main.px + " §8[§c-§8] §7" + p.getName());
    if ((Main.Game) && 
      (Bukkit.getOnlinePlayers().length < 2))
      win();
  }

  public void win()
  {
    for (Player p : Bukkit.getOnlinePlayers()) {
      BarAPI.setMessage(Main.px + "§4Der server restartet in §c3 §4sekunden!", 3);
      Bukkit.broadcastMessage(Main.px + "§4Der server restartet in §c3 §4sekunden!");

      this.pl.getServer().getScheduler().scheduleSyncDelayedTask(this.pl, new Runnable(p)
      {
        public void run() {
          this.val$p.kickPlayer(Main.px + "§cRestart!");

          Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "reload");
        }
      }
      , 60L);
    }
  }
}