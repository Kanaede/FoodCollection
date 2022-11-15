
package com.rakagit.foodcollection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import com.rakagit.foodcollection.init.FcModTabs;

public class HotdogItem extends Item {
	public HotdogItem() {
		super(new Item.Properties().tab(FcModTabs.TAB_FOOD).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.3f)

						.build()));
	}
}
