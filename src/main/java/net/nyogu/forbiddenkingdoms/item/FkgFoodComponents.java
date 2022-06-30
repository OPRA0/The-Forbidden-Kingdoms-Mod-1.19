package net.nyogu.forbiddenkingdoms.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class FkgFoodComponents {

    //BOWLS FOODS

    public static final FoodComponent CURRY_BOWL = new FoodComponent.Builder().hunger(7).build();
    public static final FoodComponent MINI_CAKE = new FoodComponent.Builder().hunger(3).build();

    public static final FoodComponent BLUE_BERRY = new FoodComponent.Builder().hunger(1).build();

    //ROTTEN
    public static final FoodComponent ROTTEN_FOOD = new FoodComponent.Builder().hunger(3).statusEffect
            (new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.8F).meat().build();

    //MUGS
    public static final FoodComponent BEER_MUG = new FoodComponent.Builder().hunger(5)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new
                    StatusEffectInstance(StatusEffects.NAUSEA, 500, 0), 1.0F).build();
    public static final FoodComponent JUICE_MUG = new FoodComponent.Builder().hunger(5).statusEffect
            (new StatusEffectInstance(StatusEffects.REGENERATION,100, 1), 1.0F).build();


}
