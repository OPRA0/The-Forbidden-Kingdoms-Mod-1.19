package net.nyogu.forbiddenkingdoms.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.nyogu.forbiddenkingdoms.block.FkgBlocks;

public class CorruptedFungusBlock extends FkgFlowerBlock{
    public CorruptedFungusBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
    }
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos)
                || floor.isOf(Blocks.STONE) ||
                floor.isOf(Blocks.SOUL_SAND) ||
                floor.isOf(Blocks.GRASS_BLOCK) ||
                floor.isOf(Blocks.STONE) ||
                floor.isOf(FkgBlocks.TERRIFIED_AMALGAMATION) ||
                floor.isOf(FkgBlocks.WHITE_GOLD_STONE) ||
                floor.isOf(FkgBlocks.MOSS_STONE) ||
                floor.isOf(FkgBlocks.VENOMOUS_PODZOL) ||
                floor.isOf(Blocks.SOUL_SOIL);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        VoxelShape voxelShape = this.getOutlineShape(state, world, pos, ShapeContext.absent());
        Vec3d vec3d = voxelShape.getBoundingBox().getCenter();
        double d = (double)pos.getX() + vec3d.x;
        double e = (double)pos.getZ() + vec3d.z;

        for(int i = 0; i < 3; ++i) {
            if (random.nextBoolean()) {
                world.addParticle(ParticleTypes.PORTAL, d + random.nextDouble() / 5.0, (double)pos.getY() + (0.5 - random.nextDouble()), e + random.nextDouble() / 5.0, 0.0, 0.0, 0.0);
            }
        }

    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                if (!livingEntity.isInvulnerableTo(DamageSource.LAVA)) {
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 80));
                }
            }

        }
    }
}
