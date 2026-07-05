package com.endykaishi.createatm.helper;

import com.endykaishi.createatm.CreateAllthemodium;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.util.entry.BlockEntry;
import java.util.function.Supplier;
import net.minecraft.world.level.material.MapColor;

public class ModBlockHelpers {

	public static BlockEntry<CasingBlock> casing(
		String name,
		MapColor color,
		Supplier<CTSpriteShiftEntry> spriteShift
	) {
		return CreateAllthemodium.REGISTRATE
			.block(name, CasingBlock::new)
			.properties(p -> p.mapColor(color))
			.transform(BuilderTransformers.casing(spriteShift))
			.register();
	}
}
