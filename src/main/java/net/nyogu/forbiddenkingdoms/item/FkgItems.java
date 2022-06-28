package net.nyogu.forbiddenkingdoms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.StewItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nyogu.forbiddenkingdoms.FkgMod;
import net.nyogu.forbiddenkingdoms.item.custom.FkgMug;

public class FkgItems {

    //Items de Troca com os Ostryacos:
    public static final Item ALLAY_DOLL = registerItem("allay_doll",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item DOLPHIN_DOLL = registerItem("dolphin_doll",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item VILLAGER_TOTEM = registerItem("villager_totem",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item MIRROR = registerItem("mirror",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item GOLD_MIRROR = registerItem("gold_mirror",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item OSTRYVIAN_COINS = registerItem("ostryvian_coins",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item OSTRYVIAN_GOLD_COINS = registerItem("ostryvian_gold_coins",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item PAPYRUS_PAGE = registerItem("papyrus_page",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item PAPYRUS = registerItem("papyrus",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item ANIMAL_FAT = registerItem("animal_fat",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item OSTRYVIAN_BOOK = registerItem("ostryvian_book",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item ELDORIAN_ANCIENT_BOOK = registerItem("eldorian_ancient_book",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item GOLD_WAY_OLD_BOOK = registerItem("gold_way_old_book",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item MUG = registerItem("mug",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item SPOON = registerItem("spoon",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item FORK = registerItem("fork",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item GOLD_SPOON = registerItem("gold_spoon",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item GOLD_FORK = registerItem("gold_fork",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item BULLET = registerItem("bullet",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item ESOPHAGUS = registerItem("esophagus",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));


    //Materials
    public static final Item SUN_POWDER = registerItem("sun_powder",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item MOON_POWDER = registerItem("moon_powder",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item WHITE_GOLD_INGOT = registerItem("white_gold_ingot",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));


    //Foods

    public static final Item CURRY_BOWL = registerItem("curry_bowl",
            new StewItem(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.CURRY_BOWL).maxCount(1)));
    public static final Item BEER_MUG = registerItem("beer_mug",
            new FkgMug(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.BEER_MUG).maxCount(1)));
    public static final Item APPLE_JUICE_MUG = registerItem("apple_juice_mug",
            new FkgMug(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.APLLE_JUICE_MUG).maxCount(1)));



    //EGGS




    //REGISTRO:

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FkgMod.MOD_ID, name), item);
    }
    public static void registerFkgItems() {
        FkgMod.LOGGER.info("Registering Fkg Items for" + FkgMod.MOD_ID);
    }
}
