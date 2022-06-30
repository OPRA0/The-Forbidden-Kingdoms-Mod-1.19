package net.nyogu.forbiddenkingdoms;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.nyogu.forbiddenkingdoms.block.FkgBlocks;

public class FkgClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_GLASS, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_OAK_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_ACACIA_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_BIRCH_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_DARK_OAK_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_MANGROVE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_SPRUCE_DOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_JUNGLE_DOOR, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.LITTLE_DANDELION_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.LITTLE_OXEYE_DAISY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.LITTLE_ROSE_BUSH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.POTTED_LITTLE_DANDELION_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.POTTED_LITTLE_OXEYE_DAISY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.POTTED_LITTLE_ROSE_BUSH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.CORRUPTED_FUNGUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.BLUE_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.TURNIP_CROP, RenderLayer.getCutout());


        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.OAK_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.SPRUCE_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.DARK_OAK_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ACACIA_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.BIRCH_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.MANGROVE_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.JUNGLE_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ELM_TABLE, RenderLayer.getCutout());


    }
}
