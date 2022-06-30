package net.nyogu.forbiddenkingdoms.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.nyogu.forbiddenkingdoms.item.FkgItems;

public class TurnipCropBlock extends CropBlock {
    public TurnipCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return FkgItems.TURNIP;
    }
}
