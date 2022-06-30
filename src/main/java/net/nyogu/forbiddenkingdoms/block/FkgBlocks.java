package net.nyogu.forbiddenkingdoms.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nyogu.forbiddenkingdoms.FkgMod;
import net.nyogu.forbiddenkingdoms.block.custom.*;
import net.nyogu.forbiddenkingdoms.item.FkgItemGroup;

public class FkgBlocks {
    
    //Nature
    public static final Block MOSS_STONE = registerBlock("moss_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block VENOMOUS_PODZOL = registerBlock("venomous_podzol",
            new VenomousPodzolBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).strength(0.6f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BLUE_BERRY_BUSH = registerBlockWithoutBlockItem("blue_berry_bush",
            new BlueBerryBushBlock(FabricBlockSettings
                    .copy(Blocks.SWEET_BERRY_BUSH)
                    .strength(0)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), FkgItemGroup.FKG_BUILDING);
    public static final Block TURNIP_CROP = registerBlockWithoutBlockItem("turnip_crop",
            new TurnipCropBlock(FabricBlockSettings
                    .copy(Blocks.WHEAT)
                    .nonOpaque()
                    .sounds(BlockSoundGroup.BIG_DRIPLEAF)), FkgItemGroup.FKG_BUILDING);




    //DECORATE

    //Drawers
    public static final Block OAK_DRAWER = registerBlock("oak_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block BIRCH_DRAWER = registerBlock("birch_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block SPRUCE_DRAWER = registerBlock("spruce_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block DARK_OAK_DRAWER = registerBlock("dark_oak_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ACACIA_DRAWER = registerBlock("acacia_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block JUNGLE_DRAWER = registerBlock("jungle_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block MANGROVE_DRAWER = registerBlock("mangrove_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ELM_DRAWER = registerBlock("elm_drawer",
            new DrawerBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);

    //Tables
    public static final Block OAK_TABLE = registerBlock("oak_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block BIRCH_TABLE = registerBlock("birch_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block SPRUCE_TABLE = registerBlock("spruce_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ACACIA_TABLE = registerBlock("acacia_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block JUNGLE_TABLE = registerBlock("jungle_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block MANGROVE_TABLE = registerBlock("mangrove_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ELM_TABLE = registerBlock("elm_table",
            new TableBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);



    //CustomFurnace


    //Enhanced Glass
    public static final Block ENHANCED_GLASS = registerBlock("enhanced_glass",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(2.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);



    //Enhanced Blocks
    public static final Block ENHANCED_OAK_DOOR = registerBlock("enhanced_oak_door",
            new FkgDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ENHANCED_BIRCH_DOOR = registerBlock("enhanced_birch_door",
            new FkgDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ENHANCED_SPRUCE_DOOR = registerBlock("enhanced_spruce_door",
            new FkgDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ENHANCED_DARK_OAK_DOOR = registerBlock("enhanced_dark_oak_door",
            new FkgDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ENHANCED_ACACIA_DOOR = registerBlock("enhanced_acacia_door",
            new FkgDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ENHANCED_JUNGLE_DOOR = registerBlock("enhanced_jungle_door",
            new FkgDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);
    public static final Block ENHANCED_MANGROVE_DOOR = registerBlock("enhanced_mangrove_door",
            new FkgDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.4f).requiresTool().nonOpaque()), FkgItemGroup.FKG_DECORATE);






    // Plants
    public static final Block LITTLE_ROSE_BUSH = registerBlock("little_rose_bush",
            new FkgFlowerBlock(StatusEffects.FIRE_RESISTANCE, 20, FabricBlockSettings.copy(Blocks.ROSE_BUSH).strength(0).requiresTool().nonOpaque()), FkgItemGroup.FKG_BUILDING);
    public static final Block POTTED_LITTLE_ROSE_BUSH = registerBlockWithoutBlockItem("potted_little_rose_bush",
            new FkgPottedFlowerBlock(FkgBlocks.LITTLE_ROSE_BUSH, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).strength(0).requiresTool().nonOpaque()), FkgItemGroup.FKG_BUILDING);

    public static final Block LITTLE_DANDELION_BUSH = registerBlock("little_dandelion_bush",
            new FkgFlowerBlock(StatusEffects.MINING_FATIGUE, 20, FabricBlockSettings.copy(Blocks.DANDELION).strength(0).requiresTool().nonOpaque()), FkgItemGroup.FKG_BUILDING);
    public static final Block POTTED_LITTLE_DANDELION_BUSH = registerBlockWithoutBlockItem("potted_little_dandelion_bush",
            new FkgPottedFlowerBlock(FkgBlocks.LITTLE_DANDELION_BUSH, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).strength(0).requiresTool().nonOpaque()), FkgItemGroup.FKG_BUILDING);

    public static final Block LITTLE_OXEYE_DAISY_BUSH = registerBlock("little_oxeye_daisy_bush",
            new FkgFlowerBlock(StatusEffects.ABSORPTION, 20, FabricBlockSettings.copy(Blocks.OXEYE_DAISY).strength(0).requiresTool().nonOpaque()), FkgItemGroup.FKG_BUILDING);
    public static final Block POTTED_LITTLE_OXEYE_DAISY_BUSH = registerBlockWithoutBlockItem("potted_little_oxeye_daisy_bush",
            new FkgPottedFlowerBlock(FkgBlocks.LITTLE_OXEYE_DAISY_BUSH, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).strength(0).requiresTool().nonOpaque()), FkgItemGroup.FKG_BUILDING);

    public static final Block CORRUPTED_FUNGUS = registerBlock("corrupted_fungus",
            new CorruptedFungusBlock(StatusEffects.NAUSEA, 20, FabricBlockSettings.copy(Blocks.CRIMSON_FUNGUS).strength(0).requiresTool().nonOpaque()), FkgItemGroup.FKG_BUILDING);






    //Crumbs

    public static final Block OAK_CRUMBS = registerBlock("oak_crumbs",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BIRCH_CRUMBS = registerBlock("birch_crumbs",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block SPRUCE_CRUMBS = registerBlock("spruce_crumbs",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block DARK_OAK_CRUMBS = registerBlock("dark_oak_crumbs",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ACACIA_CRUMBS = registerBlock("acacia_crumbs",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block JUNGLE_CRUMBS = registerBlock("jungle_crumbs",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block MANGROVE_CRUMBS = registerBlock("mangrove_crumbs",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);





    //Elm Wood

    public static final Block ELM_LOG = registerBlock("elm_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ELM_WOOD = registerBlock("elm_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block STRIPPED_ELM_LOG = registerBlock("stripped_elm_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block STRIPPED_ELM_WOOD = registerBlock("stripped_elm_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ELM_PLANKS = registerBlock("elm_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ELM_FENCE = registerBlock("elm_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ELM_FENCE_GATE = registerBlock("elm_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ELM_BUTTON = registerBlock("elm_button",
            new FkgButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().noCollision()), FkgItemGroup.FKG_BUILDING);
    public static final Block ELM_PRESSURE_PLATE = registerBlock("elm_pressure_plate",
            new FkgPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ELM_LEAVES = registerBlock("elm_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque().requiresTool()), FkgItemGroup.FKG_BUILDING);


    //White Gold Blocks
    public static final Block WHITE_GOLD_STONE = registerBlock("white_gold_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_GOLD_COBBLESTONE = registerBlock("white_gold_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_GOLD_COBBLESTONE_STAIRS = registerBlock("white_gold_cobblestone_stairs",
            new FkgStairsBlock(FkgBlocks.WHITE_GOLD_COBBLESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_GOLD_BRICKS = registerBlock("white_gold_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_GOLD_BRICKS_STAIRS = registerBlock("white_gold_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.WHITE_GOLD_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_GOLD_BRICKS_WALL = registerBlock("white_gold_bricks_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_GOLD_PRESSURE_PLATE = registerBlock("white_gold_pressure_plate",
            new FkgPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_GOLD_BUTTON = registerBlock("white_gold_button",
            new FkgButtonBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool().noCollision()), FkgItemGroup.FKG_BUILDING);




    //Terracotta Bricks
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);



    //Concrete Bricks
    public static final Block BLACK_CONCRETE_BRICKS = registerBlock("black_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BLUE_CONCRETE_BRICKS = registerBlock("blue_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BROWN_CONCRETE_BRICKS = registerBlock("brown_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block CYAN_CONCRETE_BRICKS = registerBlock("cyan_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GRAY_CONCRETE_BRICKS = registerBlock("gray_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GREEN_CONCRETE_BRICKS = registerBlock("green_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_BLUE_CONCRETE_BRICKS = registerBlock("light_blue_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_GRAY_CONCRETE_BRICKS = registerBlock("light_gray_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIME_CONCRETE_BRICKS = registerBlock("lime_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block MAGENTA_CONCRETE_BRICKS = registerBlock("magenta_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ORANGE_CONCRETE_BRICKS = registerBlock("orange_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PINK_CONCRETE_BRICKS = registerBlock("pink_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PURPLE_CONCRETE_BRICKS = registerBlock("purple_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block RED_CONCRETE_BRICKS = registerBlock("red_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_CONCRETE_BRICKS = registerBlock("white_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block YELLOW_CONCRETE_BRICKS = registerBlock("yellow_concrete_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);


    //Terracotta Bricks Stairs
    public static final Block BLACK_TERRACOTTA_BRICKS_STAIRS = registerBlock("black_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.BLACK_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BLUE_TERRACOTTA_BRICKS_STAIRS = registerBlock("blue_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.BLUE_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BROWN_TERRACOTTA_BRICKS_STAIRS = registerBlock("brown_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.BROWN_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block CYAN_TERRACOTTA_BRICKS_STAIRS = registerBlock("cyan_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.CYAN_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GRAY_TERRACOTTA_BRICKS_STAIRS = registerBlock("gray_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.GRAY_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GREEN_TERRACOTTA_BRICKS_STAIRS = registerBlock("green_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.GREEN_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS = registerBlock("light_blue_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS = registerBlock("light_gray_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIME_TERRACOTTA_BRICKS_STAIRS = registerBlock("lime_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.LIME_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block MAGENTA_TERRACOTTA_BRICKS_STAIRS = registerBlock("magenta_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.MAGENTA_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ORANGE_TERRACOTTA_BRICKS_STAIRS = registerBlock("orange_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.ORANGE_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PINK_TERRACOTTA_BRICKS_STAIRS = registerBlock("pink_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.PINK_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PURPLE_TERRACOTTA_BRICKS_STAIRS = registerBlock("purple_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.PURPLE_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block RED_TERRACOTTA_BRICKS_STAIRS = registerBlock("red_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.RED_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_TERRACOTTA_BRICKS_STAIRS = registerBlock("white_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.WHITE_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block YELLOW_TERRACOTTA_BRICKS_STAIRS = registerBlock("yellow_terracotta_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.YELLOW_TERRACOTTA_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);


    //Concrete Bricks Stairs
    public static final Block BLACK_CONCRETE_BRICKS_STAIRS = registerBlock("black_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.BLACK_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BLUE_CONCRETE_BRICKS_STAIRS = registerBlock("blue_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.BLUE_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BROWN_CONCRETE_BRICKS_STAIRS = registerBlock("brown_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.BROWN_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block CYAN_CONCRETE_BRICKS_STAIRS = registerBlock("cyan_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.CYAN_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GRAY_CONCRETE_BRICKS_STAIRS = registerBlock("gray_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.GRAY_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block GREEN_CONCRETE_BRICKS_STAIRS = registerBlock("green_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.GREEN_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_BLUE_CONCRETE_BRICKS_STAIRS = registerBlock("light_blue_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.LIGHT_BLUE_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIGHT_GRAY_CONCRETE_BRICKS_STAIRS = registerBlock("light_gray_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.LIGHT_GRAY_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block LIME_CONCRETE_BRICKS_STAIRS = registerBlock("lime_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.LIME_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block MAGENTA_CONCRETE_BRICKS_STAIRS = registerBlock("magenta_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.MAGENTA_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block ORANGE_CONCRETE_BRICKS_STAIRS = registerBlock("orange_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.ORANGE_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PINK_CONCRETE_BRICKS_STAIRS = registerBlock("pink_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.PINK_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block PURPLE_CONCRETE_BRICKS_STAIRS = registerBlock("purple_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.PURPLE_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block RED_CONCRETE_BRICKS_STAIRS = registerBlock("red_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.RED_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block WHITE_CONCRETE_BRICKS_STAIRS = registerBlock("white_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.WHITE_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block YELLOW_CONCRETE_BRICKS_STAIRS = registerBlock("yellow_concrete_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.YELLOW_CONCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);



    //Cake
    public static final Block CHOCOLATE_CAKE = registerBlock("chocolate_cake",
            new ChocolateCakeBlock(FabricBlockSettings.of(Material.CAKE)), FkgItemGroup.FKG_FOODS);











    //HELL blocks
    public static final Block NEMESIS_EYE_BLOCK = registerBlock("nemesis_eye_block",
            new NemesisEyeBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(6.9f).requiresTool().sounds(BlockSoundGroup.SOUL_SAND)), FkgItemGroup.FKG_BUILDING);
    public static final Block TERRIFIED_AMALGAMATION = registerBlock("terrified_amalgamation",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(4.5f).requiresTool().sounds(BlockSoundGroup.SCULK)), FkgItemGroup.FKG_BUILDING);



    //Bassalt Blocks
    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);
    public static final Block BASALT_BRICKS_STAIRS = registerBlock("basalt_bricks_stairs",
            new FkgStairsBlock(FkgBlocks.BASALT_BRICKS.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), FkgItemGroup.FKG_BUILDING);



    //Watcher Lamp
    public static final Block WATCHER_LAMP = registerBlock("watcher_lamp",
            new WatcherLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().luminance((state) -> state.get(WatcherLampBlock.CLICKED) ? 15 : 8)), FkgItemGroup.FKG_BUILDING);





    //REGISTROS:

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(FkgMod.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FkgMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FkgMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        FkgMod.LOGGER.info("Registering ModBlocks for " + FkgMod.MOD_ID);
    }
}
