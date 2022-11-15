
package com.rakagit.foodcollection.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import com.rakagit.foodcollection.procedures.SpicyTickProcedure;
import com.rakagit.foodcollection.procedures.SpicyStopProcedure;
import com.rakagit.foodcollection.procedures.SpicyStartedProcedure;

public class SpicyMobEffect extends MobEffect {
	public SpicyMobEffect() {
		super(MobEffectCategory.HARMFUL, -39936);
	}

	@Override
	public String getDescriptionId() {
		return "effect.fc.spicy";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SpicyStartedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SpicyTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SpicyStopProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
