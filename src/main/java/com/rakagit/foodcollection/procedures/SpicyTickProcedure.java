package com.rakagit.foodcollection.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import com.rakagit.foodcollection.init.FcModMobEffects;

public class SpicyTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FcModMobEffects.SPICY.get())
				? _livEnt.getEffect(FcModMobEffects.SPICY.get()).getAmplifier()
				: 0) <= 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("IT'S SPICY!!!").bypassArmor(), (float) 0.1);
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FcModMobEffects.SPICY.get())
				? _livEnt.getEffect(FcModMobEffects.SPICY.get()).getAmplifier()
				: 0) > 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("IT'S SPICY!!!").bypassArmor(),
						(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FcModMobEffects.SPICY.get())
								? _livEnt.getEffect(FcModMobEffects.SPICY.get()).getAmplifier()
								: 0) * 1.2));
			entity.setSprinting((true));
		}
	}
}
