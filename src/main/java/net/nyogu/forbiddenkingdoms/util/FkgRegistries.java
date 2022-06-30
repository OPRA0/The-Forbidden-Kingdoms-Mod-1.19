package net.nyogu.forbiddenkingdoms.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.nyogu.forbiddenkingdoms.FkgMod;
import net.nyogu.forbiddenkingdoms.block.FkgBlocks;
import net.nyogu.forbiddenkingdoms.command.FkgReturnHomeCommand;
import net.nyogu.forbiddenkingdoms.command.FkgSetHomeCommand;
import net.nyogu.forbiddenkingdoms.event.FkgPlayerBase;
import net.nyogu.forbiddenkingdoms.item.FkgItems;

public class FkgRegistries {
    public static void registerFkgStuff() {
        registerFkgFuels();
        registerFlammableBlocks();
        registerStrippables();
        registerCommands();
        registerEvents();

    }
    private static void registerFkgFuels() {
        FkgMod.LOGGER.info("Registering Fuels for" + FkgMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(FkgItems.MOON_POWDER, 3000);
        registry.add(FkgItems.SUN_POWDER, 10000);

    }
    private static void registerFlammableBlocks() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(FkgBlocks.OAK_DRAWER, 5, 5);
        instance.add(FkgBlocks.SPRUCE_DRAWER, 5, 5);
        instance.add(FkgBlocks.BIRCH_DRAWER, 5, 5);
        instance.add(FkgBlocks.ACACIA_DRAWER, 5, 5);
        instance.add(FkgBlocks.DARK_OAK_DRAWER, 5, 5);
        instance.add(FkgBlocks.JUNGLE_DRAWER, 5, 5);
        instance.add(FkgBlocks.MANGROVE_DRAWER, 5, 5);
        instance.add(FkgBlocks.ELM_DRAWER, 5, 5);

        instance.add(FkgBlocks.OAK_TABLE, 5, 5);
        instance.add(FkgBlocks.BIRCH_TABLE, 5, 5);
        instance.add(FkgBlocks.SPRUCE_TABLE, 5, 5);
        instance.add(FkgBlocks.ACACIA_TABLE, 5, 5);
        instance.add(FkgBlocks.DARK_OAK_TABLE, 5, 5);
        instance.add(FkgBlocks.JUNGLE_TABLE, 5, 5);
        instance.add(FkgBlocks.MANGROVE_TABLE, 5, 5);
        instance.add(FkgBlocks.ELM_TABLE, 5, 5);

        instance.add(FkgBlocks.ELM_LOG, 5, 5);
        instance.add(FkgBlocks.ELM_WOOD, 5, 5);
        instance.add(FkgBlocks.STRIPPED_ELM_LOG, 5, 5);
        instance.add(FkgBlocks.STRIPPED_ELM_WOOD, 5, 5);
        instance.add(FkgBlocks.ELM_PLANKS, 5, 20);

        instance.add(FkgBlocks.OAK_CRUMBS, 5, 5);
        instance.add(FkgBlocks.BIRCH_CRUMBS, 5, 5);
        instance.add(FkgBlocks.ACACIA_CRUMBS, 5, 5);
        instance.add(FkgBlocks.DARK_OAK_CRUMBS, 5, 5);
        instance.add(FkgBlocks.JUNGLE_CRUMBS, 5, 5);
        instance.add(FkgBlocks.MANGROVE_CRUMBS, 5, 5);
        instance.add(FkgBlocks.SPRUCE_CRUMBS, 5, 5);

    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(FkgBlocks.ELM_WOOD, FkgBlocks.STRIPPED_ELM_WOOD);
        StrippableBlockRegistry.register(FkgBlocks.ELM_LOG, FkgBlocks.STRIPPED_ELM_LOG);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(FkgSetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(FkgReturnHomeCommand::register);
    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new FkgPlayerBase());
    }

}
