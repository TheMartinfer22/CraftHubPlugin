package team.martin.hub.chat.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeftPlayer implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerQuitEvent event){
        event.setQuitMessage(ChatColor.RED + "[-] " + ChatColor.RESET + event.getPlayer().getDisplayName());
    }
}
