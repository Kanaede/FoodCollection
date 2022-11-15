
package com.rakagit.foodcollection.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.rakagit.foodcollection.init.FcModTabs;

public class BreadWithHoneyJamItem extends Item {
	public BreadWithHoneyJamItem() {
		super(new Item.Properties().tab(FcModTabs.TAB_FOOD).stacksTo(64).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(20).saturationMod(0.01f)

						.build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Owner this mod Like this!"));
	}
}
