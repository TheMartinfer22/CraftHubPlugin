package team.martin.hub.management;

import team.martin.hub.Main;
import team.martin.hub.chat.commands.admin.BanPlayer;
import team.martin.hub.chat.commands.admin.KickPlayer;
import team.martin.hub.chat.commands.admin.UnbanPlayer;

public class Commands {

    public Commands(){
        Main.getInstance().getCommand("ban").setExecutor(new BanPlayer());
        Main.getInstance().getCommand("unban").setExecutor(new UnbanPlayer());
        Main.getInstance().getCommand("kick").setExecutor(new KickPlayer());
    }

}
