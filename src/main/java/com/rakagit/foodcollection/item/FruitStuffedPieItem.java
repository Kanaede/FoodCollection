
package com.rakagit.foodcollection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import com.rakagit.foodcollection.init.FcModTabs;

public class FruitStuffedPieItem extends Item {
	public FruitStuffedPieItem() {
		super(new Item.Properties().tab(FcModTabs.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.3f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 20;
	}
}
