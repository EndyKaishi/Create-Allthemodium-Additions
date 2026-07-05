package com.endykaishi.createatm.registry;

import com.endykaishi.createatm.helper.ModBlockHelpers;
import com.endykaishi.createatm.visual.ModSpriteShifts;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

	public static final BlockEntry<CasingBlock> ALLTHEMODIUM_CASING = ModBlockHelpers.casing(
		"allthemodium_casing",
		MapColor.GOLD,
		() -> ModSpriteShifts.ALLTHEMODIUM_CASING
	);
	public static final BlockEntry<CasingBlock> VIBRANIUM_CASING = ModBlockHelpers.casing(
		"vibranium_casing",
		MapColor.COLOR_CYAN,
		() -> ModSpriteShifts.VIBRANIUM_CASING
	);
	public static final BlockEntry<CasingBlock> UNOBTAINIUM_CASING = ModBlockHelpers.casing(
		"unobtainum_casing",
		MapColor.COLOR_PURPLE,
		() -> ModSpriteShifts.UNOBTAINIUM_CASING
	);
	public static void register(){}
}
