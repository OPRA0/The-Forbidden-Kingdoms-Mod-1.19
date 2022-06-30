package net.nyogu.forbiddenkingdoms.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.StewItem;
import net.minecraft.world.World;
import net.nyogu.forbiddenkingdoms.item.FkgItems;

public class FkgPlateItem extends StewItem {
    public FkgPlateItem(Settings settings) {
        super(settings);
    }
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(FkgItems.PLATE);
    }
}
