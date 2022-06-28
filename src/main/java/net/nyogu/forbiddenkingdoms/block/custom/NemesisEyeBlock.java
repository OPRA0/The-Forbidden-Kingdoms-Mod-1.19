package net.nyogu.forbiddenkingdoms.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.MagmaBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NemesisEyeBlock extends MagmaBlock {
    public NemesisEyeBlock(Settings settings) {
        super(settings);
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity) entity)) {
            entity.damage(DamageSource.LAVA, 2.0F);
            if (entity instanceof LivingEntity) {
                LivingEntity LivingEntity = ((net.minecraft.entity.LivingEntity) entity);
                LivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200));
            }

            super.onSteppedOn(world, pos, state, entity);
        }
    }
}

