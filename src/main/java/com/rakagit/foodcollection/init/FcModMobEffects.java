
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.rakagit.foodcollection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import com.rakagit.foodcollection.potion.SpicyMobEffect;
import com.rakagit.foodcollection.FcMod;

public class FcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FcMod.MODID);
	public static final RegistryObject<MobEffect> SPICY = REGISTRY.register("spicy", () -> new SpicyMobEffect());
}
