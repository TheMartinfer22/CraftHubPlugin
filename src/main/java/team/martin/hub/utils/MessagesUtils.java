package team.martin.hub.utils;

import org.bukkit.ChatColor;

public interface MessagesUtils {
    /*
     * O plugin foi pensado em inicialização para usuários do Linux,
     * caso o sistema foi Windows, deverá alterar o "\n".
     * Para não poluir o código foi deixado como padrão.
     */

    String logo = ChatColor.LIGHT_PURPLE +
            "'##::::'##:'##::::'##:'########::\n" + ChatColor.LIGHT_PURPLE +
            " ##:::: ##: ##:::: ##: ##.... ##:\n" + ChatColor.LIGHT_PURPLE +
            " ##:::: ##: ##:::: ##: ##:::: ##:\n" + ChatColor.LIGHT_PURPLE +
            " #########: ##:::: ##: ########::\n" + ChatColor.LIGHT_PURPLE +
            " ##.... ##: ##:::: ##: ##.... ##:\n" + ChatColor.LIGHT_PURPLE +
            " ##:::: ##: ##:::: ##: ##:::: ##:\n" + ChatColor.LIGHT_PURPLE +
            " ##:::: ##:. #######:: ########::\n" + ChatColor.LIGHT_PURPLE +
            "..:::::..:::.......:::........:::";
    String startup = ChatColor.GREEN + "O plugin da Hub foi inicializado com sucesso, qualquer erro abrir issue em \n" + ChatColor.GREEN + "https://github.com/TheMartinfer22/CraftHubPlugin";
    String shutdown = ChatColor.RED + "O plugin foi encerrado com sucesso.";

    String prefix = ChatColor.DARK_PURPLE + "[HubCraft] ";
    String noPermission = prefix + ChatColor.RED + "Você não possui permissão para executar esse comando.";
    String notFound = prefix + ChatColor.RED + "O jogador que você mencionou não foi encontrado.";

    String banPlayerIncomplete = prefix + ChatColor.RED + "Para banir um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /ban jogador";
    String banPlayerReason = ChatColor.RED + "\nVocê foi banido do servidor por má conduta.\n Entre em nosso Discord, http://ahub.tech/discord";

    String kickPlayerIncomplete = prefix + ChatColor.RED + "Para kickar um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /kick jogador motivo";
    String unbanPlayerIncomplete = prefix + ChatColor.RED + "Para desbanir um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /unban jogador";
    String notFoundUnban = prefix + ChatColor.RED + "O jogador que foi mencionado não está banido!";
}
