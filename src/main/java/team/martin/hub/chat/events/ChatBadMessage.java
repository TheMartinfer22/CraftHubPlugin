package team.martin.hub.chat.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import team.martin.hub.utils.FileInternalManager;
import team.martin.hub.utils.MessagesUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ChatBadMessage implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        FileInternalManager file = new FileInternalManager();
        String[] msg = file.getResourcesBufferedReader("chat/badwords.message")
                .lines()
                .collect(Collectors.joining())
                .split(",");

        Arrays.stream(msg).forEach(line -> {
            if (event.getMessage().contains(line)){
                event.setCancelled(true);
                event.getPlayer().sendMessage(MessagesUtils.prefix + ChatColor.RED + "Você precisa lavar a boca com sabão antes de digitar.");
            }
        });
    }
}
