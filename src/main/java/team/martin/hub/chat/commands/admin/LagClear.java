package team.martin.hub.chat.commands.admin;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hub.Main;
import team.martin.hub.utils.MessagesUtils;
import team.martin.hub.utils.PermissionsUtils;

import java.util.Timer;
import java.util.TimerTask;

public class LagClear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission(PermissionsUtils.STAFF)) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                Integer c = 11;
                public void run() {
                    c--;
                    Bukkit.getServer().broadcastMessage(MessagesUtils.msg1ClearLag
                            .replace("{t_int}", c.toString()));
                    if (c == 1) {
                        deleteItens();
                        cancel();
                    }
                }
            }, 0, 1000);
            return true;
        }
        return false;
    }
    public void deleteItens(){
        Bukkit.getScheduler().runTask(Main.getInstance(), () -> {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "kill @e[type=minecraft:item]");
        });
    }
}