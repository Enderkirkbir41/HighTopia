//bal
package me.enderkirkbir.rm;

import Game.Bow;
import Game.JoinLeave;
import Game.KlllP;
import Game.Listenerx;
import Game.SetSpawn;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Note.Tone;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class Main extends JavaPlugin
  implements Listener
{
  public static boolean Game = false;
  public static boolean Schutz = true;
  public static String px = "§f[§cRageMode§f] §a";
  public static int i = 60;
  public static int schutz = 15;

  public void onEnable() { getServer().getPluginManager().registerEvents(this, this);
    getServer().getPluginManager().registerEvents(new Bow(), this);
    getServer().getPluginManager().registerEvents(new JoinLeave(this), this);
    getServer().getPluginManager().registerEvents(new Listenerx(), this);
    getServer().getPluginManager().registerEvents(new KlllP(), this);
    getServer().getPluginManager().registerEvents(new SetSpawn(this), this);
    getCommand("ragemode").setExecutor(new SetSpawn(this));
    lobby();
    setScoreboard(); } 
  public void onDisable() {
  }

  @EventHandler
  public void DMg(EntityDamageByEntityEvent e) {
    Player p = (Player)e.getEntity();
    if (Schutz)
      e.setCancelled(true);
  }

  public void setScoreboard()
  {
    Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable()
    {
      public void run() {
        for (Player p : Bukkit.getOnlinePlayers())
        {
          int online = Bukkit.getOnlinePlayers().length;
          String fight = "";
          ScoreboardManager manager = Bukkit.getScoreboardManager();
          Scoreboard board = manager.getNewScoreboard();
          Objective objective = board.registerNewObjective("test", "dummy");

          objective.setDisplaySlot(DisplaySlot.SIDEBAR);
          objective.setDisplayName("§f[§cRageMode§f]");

          Score score1 = objective.getScore(Bukkit.getOfflinePlayer("§aOnline§7:"));
          if (!Main.Game) {
            Score score2 = objective.getScore(Bukkit.getOfflinePlayer("§a§lZeit§7:"));
            score2.setScore(Main.i);
            score1.setScore(online);
            p.playSound(p.getLocation(), Sound.CLICK, 1.0F, 1000.0F);

            board.resetScores(p);
            p.setScoreboard(board);
          }
        }
      }
    }
    , 20L, 20L);
  }

  public void lobby()
  {
    Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable()
    {
      public void run()
      {
        if ((Bukkit.getOnlinePlayers().length >= 2) && (Bukkit.getOnlinePlayers().length <= 8))
        {
          if (!Main.Game)
          {
            if (((Main.i == 10) || (Main.i <= 10)) && (Main.i > 0))
            {
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage("");
              Bukkit.broadcastMessage(Main.px + "§7Noch §6" + Main.i + " Sekunden §7bis zum Start.");

              for (Player Player : Bukkit.getOnlinePlayers())
              {
                Player.setLevel(Main.i);
                Player.setExp(Main.i);
                int in = 10;
                Player.setExp(Main.i / in);
              }
            }
            if (Main.i == 0)
            {
              for (Player Player : Bukkit.getOnlinePlayers()) {
                Player.setLevel(0);
                Main.this.xp();
              }
              Main.Game = true;
            }
            Main.i -= 1;
          }
          else
          {
            Main.i = 10;
          }
        }
      }
    }
    , 0L, 20L);
  }

  public void xp()
  {
    if (Schutz)
      for (Player p : Bukkit.getOnlinePlayers()) {
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("§f[§cRage    §f]");
        Bukkit.broadcastMessage("");
        Bukkit.broadcastMessage("§610 sekunden §aschutzphase!");
        p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));
        p.teleport(
          new Location(Bukkit.getServer().getWorld(getConfig().getString("rm.spawn.world")), 
          getConfig().getDouble("rm.spawn.x"), 
          getConfig().getDouble("rm.spawn.y"), 
          getConfig().getDouble("rm.spawn.z"), 
          getConfig().getInt("rm.spawn.yaw"), 
          getConfig().getInt("rm.spawn.pitch")));
        getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable(p)
        {
          public void run() {
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("§f[§cRageMode§f]");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("§b§lGo!");
            Main.Schutz = false;

            this.val$p.playNote(this.val$p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));
            Main.this.Items();
          }
        }
        , 200L);
      }
  }

  public void Items()
  {
    for (Player Player : Bukkit.getOnlinePlayers()) {
      ItemStack Bow = new ItemStack(Material.BOW);
      ItemMeta BowMeta = Bow.getItemMeta();
      BowMeta.setDisplayName(px);
      BowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
      Bow.setItemMeta(BowMeta);

      Player.getInventory().setArmorContents(null);
      Player.setFoodLevel(20);
      Player.setGameMode(GameMode.ADVENTURE);
      Player.getInventory().setItem(0, Bow);
      Player.getInventory().addItem(new ItemStack[] { new ItemStack(Material.ARROW) });
    }
  }

  @EventHandler
  public void die(PlayerRespawnEvent e) {
    Player p = e.getPlayer();
    getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable(p)
    {
      public void run() {
        this.val$p.playNote(this.val$p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));

        Main.this.Items();
      }
    }
    , 20L);
  }
}
