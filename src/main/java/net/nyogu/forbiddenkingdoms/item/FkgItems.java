package net.nyogu.forbiddenkingdoms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.nyogu.forbiddenkingdoms.FkgMod;
import net.nyogu.forbiddenkingdoms.block.FkgBlocks;
import net.nyogu.forbiddenkingdoms.item.custom.*;

public class FkgItems {

    public static final Item RAW_WHITE_GOLD = registerItem("raw_white_gold",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item WHITE_GOLD_INGOT = registerItem("white_gold_ingot",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));

    //Runes
    public static final Item FIRE_RUNE = registerItem("fire_rune",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item WATER_RUNE = registerItem("water_rune",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item NATURE_RUNE = registerItem("nature_rune",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item PAIN_RUNE = registerItem("pain_rune",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item THUNDER_RUNE = registerItem("thunder_rune",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));

    //Items de Troca com os Ostryacos:

    public static final Item ALLAY_DOLL = registerItem("allay_doll",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item AXOLOTL_DOLL = registerItem("axolotl_doll",
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
    public static final Item AMETHYST_COLLAR = registerItem("amethyst_collar",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item DIAMOND_COLLAR = registerItem("diamond_collar",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item EMERALD_COLLAR = registerItem("emerald_collar",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item AMETHYST_GOLD_COLLAR = registerItem("amethyst_gold_collar",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item DIAMOND_GOLD_COLLAR = registerItem("diamond_gold_collar",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item EMERALD_GOLD_COLLAR = registerItem("emerald_gold_collar",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item GOLDEN_JACKAL_IDOL = registerItem("golden_jackal_idol",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));

    public static final Item OSTRYVIAN_BOOK = registerItem("ostryvian_book",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item ELDORIAN_ANCIENT_BOOK = registerItem("eldorian_ancient_book",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item GOLD_WAY_OLD_BOOK = registerItem("gold_way_old_book",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item MUG = registerItem("mug",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_ITEMS)));
    public static final Item PLATE = registerItem("plate",
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


    //Foods

    public static final Item CURRY_PLATE = registerItem("curry_plate",
            new FkgPlateItem(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.CURRY_BOWL).maxCount(1)));
    public static final Item BEER_MUG = registerItem("beer_mug",
            new FkgMug(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.BEER_MUG).maxCount(1)));
    public static final Item APPLE_JUICE_MUG = registerItem("apple_juice_mug",
            new FkgMug(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.JUICE_MUG).maxCount(1)));
    public static final Item BLUE_BERRY_JUICE_MUG = registerItem("blue_berry_juice_mug",
            new FkgMug(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.JUICE_MUG).maxCount(1)));
    public static final Item BERLINER_CAKE = registerItem("berliner_cake",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.MINI_CAKE)));
    public static final Item BLUE_BERRIES = registerItem("blue_berries",
            new AliasedBlockItem(FkgBlocks.BLUE_BERRY_BUSH, new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.BLUE_BERRY)));
    public static final Item ROTTEN_BREAD = registerItem("rotten_bread",
            new Item(new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FkgFoodComponents.ROTTEN_FOOD)));
    public static final Item TURNIP = registerItem("turnip",
            new AliasedBlockItem(FkgBlocks.TURNIP_CROP, new FabricItemSettings().group(FkgItemGroup.FKG_FOODS).food(FoodComponents.CARROT)));


    //TOOLS
    public static final Item WHITE_GOLD_SWORD = registerItem("white_gold_sword",
            new FkgSwordItem(FkgToolMaterials.WHITE_GOLD, 3, 1f, new FabricItemSettings().group(FkgItemGroup.FKG_TOOLS)));
    public static final Item WHITE_GOLD_AXE = registerItem("white_gold_axe",
            new FkgAxeItem(FkgToolMaterials.WHITE_GOLD, 5, 2f, new FabricItemSettings().group(FkgItemGroup.FKG_TOOLS)));
    public static final Item WHITE_GOLD_HOE = registerItem("white_gold_hoe",
            new FkgHoeItem(FkgToolMaterials.WHITE_GOLD, 0, 0f, new FabricItemSettings().group(FkgItemGroup.FKG_TOOLS)));
    public static final Item WHITE_GOLD_SHOVEL = registerItem("white_gold_shovel",
            new FkgShovelItem(FkgToolMaterials.WHITE_GOLD, 0, 1f, new FabricItemSettings().group(FkgItemGroup.FKG_TOOLS)));
    public static final Item WHITE_GOLD_PICKAXE = registerItem("white_gold_pickaxe",
            new FkgPickaxeItem(FkgToolMaterials.WHITE_GOLD, 2, 0f, new FabricItemSettings().group(FkgItemGroup.FKG_TOOLS)));


    //Swords
    public static final Item WITHER_LORD_SWORD = registerItem("wither_lord_sword",
            new WitherLordSwordItem(FkgToolMaterials.WITHER_ITEM, 5, 1f, new FabricItemSettings().group(FkgItemGroup.FKG_TOOLS)
                    .rarity(Rarity.RARE)));














































    //REGISTRO:

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FkgMod.MOD_ID, name), item);
    }
    public static void registerFkgItems() {
        FkgMod.LOGGER.info("Registering Fkg Items for" + FkgMod.MOD_ID);
    }
}
