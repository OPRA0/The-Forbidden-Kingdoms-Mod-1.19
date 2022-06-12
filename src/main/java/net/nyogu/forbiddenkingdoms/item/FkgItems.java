package net.nyogu.forbiddenkingdoms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nyogu.forbiddenkingdoms.FkgMod;

public class FkgItems {

    //Items de Troca com os Ostryacos:
    public static final Item ALLAY_DOLL = registerItem("allay_doll",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DOLPHIN_DOLL = registerItem("dolphin_doll",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item VILLAGER_TOTEM = registerItem("villager_totem",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));





    //REGISTRO:

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FkgMod.MOD_ID, name), item);
    }
    public static void registerFkgItems() {
        FkgMod.LOGGER.info("Registering Fkg Items for" + FkgMod.MOD_ID);
    }
}
