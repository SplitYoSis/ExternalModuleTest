package com.octanepvp.splityosis.externalmoduletest;

import com.octanepvp.splityosis.nucleuscore.module.Module;
import com.octanepvp.splityosis.nucleuscore.module.Signature;
import org.bukkit.Bukkit;

@Signature(
        name = "ExternalModuleTest",
        authors = "SplitYoSis",
        description = "This is a test"
)
public final class ExternalModuleTest extends Module {

    @Override
    public void onEnable() {
        KaKa kaka = new KaKa();

        registerCommandBranch(kaka);
        registerEvents(kaka);


    }

    @Override
    public void onDisable() {
        Bukkit.broadcast("Disabling", "");
    }

    @Override
    public void onReload() {
        Bukkit.broadcast("Reloading", "");
    }
}
