package team.martin.hub.utils;

import org.bukkit.ChatColor;

public interface MessagesUtils {
    String prefix = ChatColor.DARK_PURPLE + "[HubCraft] ";
    String noPermission = prefix + ChatColor.RED + "Você não possui permissão para executar esse comando.";
    String notFound = prefix + ChatColor.RED + "O jogador que você mencionou não foi encontrado.";

    String banPlayerIncomplete = prefix + ChatColor.RED + "Para banir um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /ban jogador";
    String banPlayerReason = ChatColor.RED + "\nVocê foi banido do servidor por má conduta.\n Entre em nosso Discord, http://ahub.tech/discord";

    String kickPlayerIncomplete = prefix + ChatColor.RED + "Para kickar um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /kick jogador";
    String unbanPlayerIncomplete = prefix + ChatColor.RED + "Para desbanir um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /unban jogador";
}
