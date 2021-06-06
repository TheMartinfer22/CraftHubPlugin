package team.martin.hub.chat.commands.admin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.BanList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import team.martin.hub.utils.MessagesUtils;
import team.martin.hub.utils.PermissionsUtils;

import java.util.Optional;

import static org.bukkit.Bukkit.getBanList;

public class UnbanPlayer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission(PermissionsUtils.STAFF)) {

            if (args.length < 1) {
                sender.sendMessage(MessagesUtils.banPlayerIncomplete);
                return false;
            }

            Optional.of(args[0]).ifPresent(action-> {
                getBanList(BanList.Type.NAME).pardon(args[0]);
                sender.sendMessage(MessagesUtils.prefix + ChatColor.GREEN + "Você desbaniu o jogador " + args[0] + " com sucesso!");
            });
            return true;

        } else {
            sender.sendMessage(MessagesUtils.noPermission);
        }
        return false;
    }
}
