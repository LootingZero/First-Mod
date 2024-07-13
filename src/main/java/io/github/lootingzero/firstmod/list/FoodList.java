package io.github.lootingzero.firstmod.list;

import net.minecraft.component.type.FoodComponent;

public class FoodList {
    public static final FoodComponent COFFEE_BEAN_COMPONENT = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent COFFEE_MUG_COMPONENT = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.3f)
            .build();

}
