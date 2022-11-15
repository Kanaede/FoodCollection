
package com.rakagit.foodcollection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import com.rakagit.foodcollection.init.FcModTabs;

public class RedAppleItem extends Item {
	public RedAppleItem() {
		super(new Item.Properties().tab(FcModTabs.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(2f)

						.build()));
	}
}
