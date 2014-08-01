package Game;

import me.enderkirkbir.rm.Main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class SetSpawn
  implements Listener, CommandExecutor
{
  private final Main pl;

  public SetSpawn(Main pl)
  {
    this.pl = pl;
  }

  public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args)
  {
    if ((sender instanceof Player)) {
      Player player = (Player)sender;
      if ((cmd.getName().equalsIgnoreCase("ragemode")) && 
        (player.hasPermission("xD.spawn"))) {
        if (args.length == 0) {
          player.sendMessage("§b======================");
          player.sendMessage("§3Dev: §6EnderKirkbir");
          player.sendMessage("§b======================");
          player.sendMessage("§6/ragemode setspawn");
          player.sendMessage("§6/ragemode setlobby");
          player.sendMessage("§b====== §cRageMode §f=======");

          return true;
        }
        if (args[0].equalsIgnoreCase("setspawn")) {
          this.pl.getConfig().set("rm.spawn.x", Double.valueOf(player.getLocation().getX()));
          this.pl.getConfig().set("rm.spawn.y", Double.valueOf(player.getLocation().getY()));
          this.pl.getConfig().set("rm.spawn.z", Double.valueOf(player.getLocation().getZ()));
          this.pl.getConfig().set("rm.spawn.pitch", Float.valueOf(player.getLocation().getPitch()));
          this.pl.getConfig().set("rm.spawn.yaw", Float.valueOf(player.getLocation().getYaw()));
          this.pl.getConfig().set("rm.spawn.world", player.getWorld().getName());
          this.pl.saveConfig();
          sender.sendMessage(Main.px + ChatColor.GREEN + "Lobby set at " + player.getLocation().getX() + ", " + player.getLocation().getY() + ", " + player.getLocation().getZ());
        }
        else if (args[0].equalsIgnoreCase("setlobby")) {
          this.pl.getConfig().set("rm.lobby.x", Double.valueOf(player.getLocation().getX()));
          this.pl.getConfig().set("rm.lobby.y", Double.valueOf(player.getLocation().getY()));
          this.pl.getConfig().set("rm.lobby.z", Double.valueOf(player.getLocation().getZ()));
          this.pl.getConfig().set("rm.lobby.pitch", Float.valueOf(player.getLocation().getPitch()));
          this.pl.getConfig().set("rm.lobby.yaw", Float.valueOf(player.getLocation().getYaw()));
          this.pl.getConfig().set("rm.lobby.world", player.getWorld().getName());
          this.pl.saveConfig();
          sender.sendMessage(Main.px + ChatColor.GREEN + "Lobby set at " + player.getLocation().getX() + ", " + player.getLocation().getY() + ", " + player.getLocation().getZ());
        }

      }

    }

    return false;
  }
}