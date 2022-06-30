package net.nyogu.forbiddenkingdoms.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nyogu.forbiddenkingdoms.FkgMod;
import net.nyogu.forbiddenkingdoms.block.FkgBlocks;

public class FkgItemGroup {
    public static final ItemGroup FKG_BUILDING = FabricItemGroupBuilder.build(new Identifier(FkgMod.MOD_ID, "fkg_building"),
            () -> new ItemStack(FkgBlocks.MOSS_STONE));

    public static final ItemGroup FKG_DECORATE = FabricItemGroupBuilder.build(new Identifier(FkgMod.MOD_ID, "fkg_decorate"),
            () -> new ItemStack(FkgBlocks.OAK_DRAWER));
    public static final ItemGroup FKG_ITEMS = FabricItemGroupBuilder.build(new Identifier(FkgMod.MOD_ID, "fkg_items"),
            () -> new ItemStack(FkgItems.OSTRYVIAN_BOOK));
    public static final ItemGroup FKG_FOODS = FabricItemGroupBuilder.build(new Identifier(FkgMod.MOD_ID, "fkg_foods"),
            () -> new ItemStack(FkgItems.BEER_MUG));

    public static final ItemGroup FKG_TOOLS = FabricItemGroupBuilder.build(new Identifier(FkgMod.MOD_ID, "fkg_tools"),
            () -> new ItemStack(FkgItems.WHITE_GOLD_PICKAXE));
}
