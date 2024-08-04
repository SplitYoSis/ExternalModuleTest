package com.octanepvp.splityosis.externalmoduletest;

import com.octanepvp.splityosis.commandsystem.SYSCommand;
import com.octanepvp.splityosis.commandsystem.SYSCommandBranch;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class KaKa extends SYSCommandBranch implements Listener {

    public KaKa() {
        super("ExternalModuleTestCommandBranch");

        setPermission("ExternalModuleTestCommandBranch.test");

        addCommand(new SYSCommand("test")
                .executes((commandSender, strings) -> {
                    commandSender.sendMessage("HELLOOOO");
                }));
    }

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){
        if (e.isSneaking())
            e.getPlayer().sendMessage("Ooo! You sneaky now");
        else
            e.getPlayer().sendMessage("You are NOT sneaky now");

    }
}
