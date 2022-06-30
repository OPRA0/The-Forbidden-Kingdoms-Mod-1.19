package net.nyogu.forbiddenkingdoms.block.custom;

import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;

public class FkgFlowerBlock extends FlowerBlock {
    public FkgFlowerBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
    }
}
