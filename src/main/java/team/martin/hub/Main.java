package team.martin.hub;

import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hub.management.Commands;
import team.martin.hub.management.Events;
import team.martin.hub.utils.MessagesUtils;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new Commands();
        new Events();
        System.out.println(MessagesUtils.logo);
        System.out.println(MessagesUtils.startup);
    }
    @Override
    public void onDisable() {
        System.out.println(MessagesUtils.logo);
        System.out.println(MessagesUtils.shutdown);
    }

    public static Main getInstance(){return getPlugin(Main.class); }
}
