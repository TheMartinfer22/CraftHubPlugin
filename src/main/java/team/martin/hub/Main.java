package team.martin.hub;

import org.bukkit.plugin.java.JavaPlugin;
import team.martin.hub.chat.ChatTags;
import team.martin.hub.chat.commands.AdminCommands;
import team.martin.hub.chat.commands.admin.BanPlayer;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new ChatTags(), this);
        getCommand("ban").setExecutor(new BanPlayer());



    }

    @Override
    public void onDisable() {
    }
}
