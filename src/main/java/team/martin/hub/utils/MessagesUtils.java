package team.martin.hub.utils;

import org.bukkit.ChatColor;

public class MessagesUtils {

    public static String prefix = ChatColor.DARK_PURPLE + "[Hub] ";
    public static String noPermission = prefix + ChatColor.RED + "Você não possui permissão para executar esse comando.";

    public static String banPlayerIncomplete = prefix + ChatColor.RED + "Para banir um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /ban jogador";
    public static String banPlayerReason = ChatColor.RED + "Você foi banido do servidor por má conduta.\n Entre em nosso Discord, http://ahub.tech/discord";

    public static String kickPlayerIncomplete = prefix + ChatColor.RED + "";
    public static String unbanPlayerIncomplete = prefix + ChatColor.RED + "";
}
