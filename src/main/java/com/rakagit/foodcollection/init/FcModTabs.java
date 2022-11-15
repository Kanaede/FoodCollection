
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rakagit.foodcollection.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FcModTabs {
	public static CreativeModeTab TAB_FOOD;

	public static void load() {
		TAB_FOOD = new CreativeModeTab("tabfood") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FcModItems.BREAD_WITH_HONEY_JAM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
