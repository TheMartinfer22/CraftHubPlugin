package team.martin.hub.chat.events;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import team.martin.hub.utils.MessagesUtils;

public class JoinPlayer implements Listener {

    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(MessagesUtils.onJoin);
    }
}
