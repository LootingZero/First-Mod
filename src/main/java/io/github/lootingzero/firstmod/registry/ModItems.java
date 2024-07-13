package io.github.lootingzero.firstmod.registry;

import io.github.lootingzero.firstmod.FirstMod;
import io.github.lootingzero.firstmod.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, FirstMod.id(name), item);
    }

    public static final Item COFFEE_BEAN = register("coffee_bean",
            new Item(new Item.Settings().food(FoodList.COFFEE_BEAN_COMPONENT))
    );

    public static final Item COFFEE_MUG = register("coffee_mug",
            new Item(new Item.Settings().maxCount(1).food(FoodList.COFFEE_MUG_COMPONENT))
    );

    public static final Item EMPTY_MUG = register("empty_mug",
            new Item(new Item.Settings())
    );
    public static final Item GROUND_COFFEE = register("ground_coffee",
            new Item(new Item.Settings())
    );
    public static final Item COFFEE_GRINDER = register("coffee_grinder",
            new Item(new Item.Settings().maxCount(1))
    );

    public static void load(){

    }
}
