package com.rakagit.foodcollection.procedures;

import net.minecraft.world.entity.Entity;

public class SpicyStopProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSprinting((false));
	}
}
