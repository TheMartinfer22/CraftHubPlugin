package team.martin.hub.chat.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = Bukkit.getServer().getPlayer(args[0]);

        if ()
        p.kickPlayer(args[1]);



        return false;
    }

//
//    @EventHandler
//    public void onCommandAdmin(AsyncPlayerChatEvent event){
//        if (event.getPlayer().hasPermission(Permissions.STAFF.getPermission())){
//            Date time = new Date(300000);
//            String[] args = event.getMessage().split(" ");
//            CommandSender sender = event.getPlayer();
//
//            Player p = Bukkit.getServer().getPlayer(args[1]);
//
//                switch (args[0]){
//
//                    case "!ban":
//                        Optional.of(args[2]).ifPresent(action -> {
//                            Bukkit.getServer().getBanList(BanList.Type.NAME).addBan(p.getDisplayName(), args[2], time, event.getPlayer().getName());
//                        });
//                        event.setCancelled(true);
//                        break;
//
//                    case "!kick":
//                        Optional.of(args[2]).ifPresent(action -> {
//                            p.getPlayer().kickPlayer(args[2]);
//                        });
//                        event.setCancelled(true);
//                        break;
//
//                    case "!unban":
//                        Optional.of(args[1]).ifPresent(action ->{
//                            Bukkit.getServer().getBanList(BanList.Type.NAME).pardon(args[1]);
//                        });
//                        event.setCancelled(true);
//                        break;
//
//                    case "!": sender.sendMessage(ChatColor.RED + "Você deve preencher algum argumento, os existentes são: ban, kick e unban"); event.setCancelled(true); break;
//                }



//            Optional.of(args[0].startsWith("!ban")).ifPresent(action -> {
//                Bukkit.getServer().getBanList(BanList.Type.NAME).addBan(args[1], args[2], time, "Hub");
//                event.setCancelled(true);
//            });
//            Optional.of(args[0].startsWith("!kick")).ifPresent(action -> {
//                Bukkit.getPlayer(args[1]).kickPlayer(args[2]);
//                event.setCancelled(true);
//            });
//            Optional.of(args[0].startsWith("!unban")).ifPresent(action -> {
//                Bukkit.getServer().getBanList(BanList.Type.NAME).pardon(args[1]);
//                event.setCancelled(true);
//            });
}