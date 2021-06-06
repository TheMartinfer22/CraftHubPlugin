package team.martin.hub.chat.commands.admin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import team.martin.hub.utils.MessagesUtils;
import team.martin.hub.utils.PermissionsUtils;

import java.sql.Date;

public class BanPlayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = Bukkit.getServer().getPlayer(args[0]);
        if (sender.hasPermission(PermissionsUtils.STAFF.getPermission())){
            if (!args[0].isEmpty()){
                Bukkit.getBanList(BanList.Type.NAME).addBan(p.getDisplayName(), MessagesUtils.banPlayerReason, new Date(300000), sender.getName());
                sender.sendMessage(ChatColor.GREEN + "Você baniu o jogador " + p.getPlayer().getDisplayName() + " com sucesso!");
            } else {
                sender.sendMessage(MessagesUtils.banPlayerIncomplete);
            }
            return true;
        } else {
            sender.sendMessage(MessagesUtils.noPermission);
        }
        return false;
    }
}
