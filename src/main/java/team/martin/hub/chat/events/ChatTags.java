package team.martin.hub.chat.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import team.martin.hub.utils.PermissionsUtils;


public class ChatTags implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        if (event.getPlayer().hasPermission(PermissionsUtils.STAFF)){
            event.setFormat(ChatColor.RED + "[Staff] " + ChatColor.RESET + event.getPlayer().getName() + ": " + event.getMessage());
        } else {
            event.setFormat(ChatColor.GREEN + "[Hubble] " + ChatColor.RESET + event.getPlayer().getName() + ": " + event.getMessage());
        }
    }
}
