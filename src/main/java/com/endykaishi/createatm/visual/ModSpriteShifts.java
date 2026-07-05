package com.endykaishi.createatm.visual;

import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import net.minecraft.resources.ResourceLocation;

public class ModSpriteShifts {

	public static final CTSpriteShiftEntry ALLTHEMODIUM_CASING = ct("allthemodium_casing");
	public static final CTSpriteShiftEntry VIBRANIUM_CASING = ct("vibranium_casing");
	public static final CTSpriteShiftEntry UNOBTAINIUM_CASING = ct("unobtainium_casing");

	private static CTSpriteShiftEntry ct(String name) {
		return CTSpriteShifter.getCT(
			AllCTTypes.OMNIDIRECTIONAL,
			ResourceLocation.fromNamespaceAndPath("create_allthemodium", "block/" + name),
			ResourceLocation.fromNamespaceAndPath("create_allthemodium", "block/" + name + "_connected")
		);
	}

	public static void init() {}
}
