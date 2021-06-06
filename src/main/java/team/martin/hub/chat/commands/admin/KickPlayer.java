package team.martin.hub.chat.commands.admin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hub.utils.MessagesUtils;
import team.martin.hub.utils.PermissionsUtils;

import java.util.Optional;

public class KickPlayer implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission(PermissionsUtils.STAFF)) {

            if (args.length < 2) {
                sender.sendMessage(MessagesUtils.kickPlayerIncomplete);
                return false;
            }

            OfflinePlayer p = Bukkit.getServer().getOfflinePlayer(args[0]);

            if (p.getPlayer() == null){
                sender.sendMessage(MessagesUtils.notFound);
                return false;
            }

            Optional.of(args[1]).ifPresent(action-> {
                sender.sendMessage(MessagesUtils.prefix + ChatColor.GREEN + "Você kickou o jogador " + p.getName() + " com sucesso!");
                p.getPlayer().kickPlayer(args[1]);
            });
            return true;

        } else {
            sender.sendMessage(MessagesUtils.noPermission);
        }
        return false;
    }
}
