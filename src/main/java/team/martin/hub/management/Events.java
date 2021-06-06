package team.martin.hub.management;

import team.martin.hub.Main;
import team.martin.hub.chat.events.ChatTags;

public class Events {

    public Events(){
        Main.getInstance().getServer().getPluginManager().registerEvents(new ChatTags(), Main.getInstance());
    }

}
