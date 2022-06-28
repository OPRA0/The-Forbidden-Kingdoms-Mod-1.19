package net.nyogu.forbiddenkingdoms.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.nyogu.forbiddenkingdoms.FkgMod;
import net.nyogu.forbiddenkingdoms.item.FkgItems;

public class FkgRegistries {
    public static void registerFkgStuff() {
        registerFkgFuels();

    }
    private static void registerFkgFuels() {
        FkgMod.LOGGER.info("Registering Fuels for" + FkgMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(FkgItems.MOON_POWDER, 300);
        registry.add(FkgItems.SUN_POWDER, 300000);

    }

}
