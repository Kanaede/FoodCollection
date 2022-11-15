
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rakagit.foodcollection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.rakagit.foodcollection.item.BreadWithHoneyJamItem;
import com.rakagit.foodcollection.FcMod;

public class FcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FcMod.MODID);
	public static final RegistryObject<Item> BREAD_WITH_HONEY_JAM = REGISTRY.register("bread_with_honey_jam", () -> new BreadWithHoneyJamItem());
}
