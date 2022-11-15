
package com.rakagit.foodcollection.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class TeaItem extends Item {
	public TeaItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(2f)

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(Items.BUCKET);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}
}
