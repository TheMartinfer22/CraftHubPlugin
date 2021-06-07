package team.martin.hub.management;

import team.martin.hub.Main;
import team.martin.hub.chat.events.ChatBadMessage;
import team.martin.hub.chat.events.ChatTags;
import team.martin.hub.chat.events.JoinPlayer;

public class Events {

    public Events(){
        Main.getInstance().getServer().getPluginManager().registerEvents(new ChatTags(), Main.getInstance());
        Main.getInstance().getServer().getPluginManager().registerEvents(new JoinPlayer(), Main.getInstance());
        Main.getInstance().getServer().getPluginManager().registerEvents(new ChatBadMessage(), Main.getInstance());

    }

}
