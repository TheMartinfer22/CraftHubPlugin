package team.martin.hub.utils;

import org.bukkit.ChatColor;

public interface MessagesUtils {
    //MainGetters
    String logo = ChatColor.LIGHT_PURPLE +
            "'##::::'##:'##::::'##:'########::" + System.lineSeparator() +  ChatColor.LIGHT_PURPLE +
            " ##:::: ##: ##:::: ##: ##.... ##:" + System.lineSeparator() +  ChatColor.LIGHT_PURPLE +
            " ##:::: ##: ##:::: ##: ##:::: ##:" + System.lineSeparator() +  ChatColor.LIGHT_PURPLE +
            " #########: ##:::: ##: ########::" + System.lineSeparator() +  ChatColor.LIGHT_PURPLE +
            " ##.... ##: ##:::: ##: ##.... ##:" + System.lineSeparator() +  ChatColor.LIGHT_PURPLE +
            " ##:::: ##: ##:::: ##: ##:::: ##:" + System.lineSeparator() +  ChatColor.LIGHT_PURPLE +
            " ##:::: ##:. #######:: ########::" + System.lineSeparator() +  ChatColor.LIGHT_PURPLE +
            "..:::::..:::.......:::........:::";
    String startup = ChatColor.GREEN + "O plugin da Hub foi inicializado com sucesso, qualquer erro abrir issue em " + System.lineSeparator() + ChatColor.GREEN + "https://github.com/TheMartinfer22/CraftHubPlugin";
    String shutdown = ChatColor.RED + "O plugin foi encerrado com sucesso.";

    //JoinMessages
    String onJoin = ChatColor.GREEN + "Olá, seja muito bem-vindo(a) ao servidor da Hub.";

    //MainSettings
    String prefix = ChatColor.LIGHT_PURPLE + "[HubCraft] ";
    String noPermission = prefix + ChatColor.RED + "Você não possui permissão para executar esse comando.";
    String notFound = prefix + ChatColor.RED + "O jogador que você mencionou não foi encontrado.";

    //Ban Command
    String banPlayerIncomplete = prefix + ChatColor.RED + "Para banir um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /ban jogador";
    String banPlayerReason = ChatColor.RED + System.lineSeparator() + "Você foi banido do servidor por má conduta." + System.lineSeparator() + "Entre em nosso Discord, http://ahub.tech/discord";

    //Kick Command
    String kickPlayerIncomplete = prefix + ChatColor.RED + "Para kickar um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /kick jogador motivo";

    //Unban Command
    String unbanPlayerIncomplete = prefix + ChatColor.RED + "Para desbanir um jogador você deve utilizar no formato:" + ChatColor.GOLD + " /unban jogador";
    String notFoundUnban = prefix + ChatColor.RED + "O jogador que foi mencionado não está banido!";
}
