
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rakagit.foodcollection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import com.rakagit.foodcollection.FcMod;

public class FcModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, FcMod.MODID);
	public static final RegistryObject<Potion> CAPSAICIN = REGISTRY.register("capsaicin",
			() -> new Potion(new MobEffectInstance(FcModMobEffects.SPICY.get(), 6000, 1, false, true)));
	public static final RegistryObject<Potion> CAPSAICIN_2 = REGISTRY.register("capsaicin_2",
			() -> new Potion(new MobEffectInstance(FcModMobEffects.SPICY.get(), 14400, 1, false, true)));
	public static final RegistryObject<Potion> CAPSAICIN_3 = REGISTRY.register("capsaicin_3",
			() -> new Potion(new MobEffectInstance(FcModMobEffects.SPICY.get(), 3600, 3, false, true)));
}
