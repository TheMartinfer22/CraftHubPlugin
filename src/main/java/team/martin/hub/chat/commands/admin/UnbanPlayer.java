package team.martin.hub.chat.commands.admin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hub.utils.MessagesUtils;
import team.martin.hub.utils.PermissionsUtils;

import static org.bukkit.Bukkit.getBanList;

public class UnbanPlayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission(PermissionsUtils.STAFF)) {

            if (args.length < 1) {
                sender.sendMessage(MessagesUtils.unbanPlayerIncomplete);
                return false;
            }

            OfflinePlayer p = Bukkit.getOfflinePlayer(args[0]);

            if (p.isBanned()){
                getBanList(BanList.Type.NAME).pardon(args[0]);
                sender.sendMessage(MessagesUtils.prefix + ChatColor.GREEN + "Você desbaniu o jogador " + args[0] + " com sucesso!");
                return true;
            } else {
                sender.sendMessage(MessagesUtils.notFoundUnban);
            }

        } else {
            sender.sendMessage(MessagesUtils.noPermission);
        }
        return false;
    }
}
