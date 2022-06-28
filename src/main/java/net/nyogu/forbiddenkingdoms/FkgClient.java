package net.nyogu.forbiddenkingdoms;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.nyogu.forbiddenkingdoms.block.FkgBlocks;

public class FkgClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ENHANCED_GLASS, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.OAK_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.SPRUCE_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.DARK_OAK_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ACACIA_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.BIRCH_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.MANGROOVE_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.JUNGLE_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FkgBlocks.ELM_TABLE, RenderLayer.getCutout());


    }
}
