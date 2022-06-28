package net.nyogu.forbiddenkingdoms.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VenomousPodzolBlock extends GrassBlock {
    public VenomousPodzolBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient()) {
            if(entity instanceof LivingEntity) {
                LivingEntity LivingEntity = ((net.minecraft.entity.LivingEntity) entity);
                LivingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200));


            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
