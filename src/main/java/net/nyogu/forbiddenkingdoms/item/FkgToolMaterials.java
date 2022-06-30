package net.nyogu.forbiddenkingdoms.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum FkgToolMaterials implements ToolMaterial {
    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }),
    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
    }),
    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),
    DIAMOND(3, 2561, 14.0F, 4.0F, 20, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    GOLD(0, 32, 15.0F, 0.0F, 22, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_INGOT});
    }),
    NETHERITE(4, 4031, 10.0F, 6.0F, 25, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    }),
    WHITE_GOLD(3, 2561, 14.0F, 8.0F, 30, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{FkgItems.WHITE_GOLD_INGOT});
    }),
    WITHER_ITEM(6, 8031, 1.0F, 20.1F, 3, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_STAR});
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private FkgToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

}
