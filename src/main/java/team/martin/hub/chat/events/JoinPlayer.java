package team.martin.hub.chat.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import team.martin.hub.utils.MessagesUtils;

public class JoinPlayer implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.getPlayer().sendMessage(MessagesUtils.onJoin);
        event.setJoinMessage(ChatColor.GREEN + "[+] " + ChatColor.RESET + event.getPlayer().getDisplayName());
    }
}
