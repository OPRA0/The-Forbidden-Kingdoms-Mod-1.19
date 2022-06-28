package net.nyogu.forbiddenkingdoms;

import net.fabricmc.api.ModInitializer;
import net.nyogu.forbiddenkingdoms.block.FkgBlocks;
import net.nyogu.forbiddenkingdoms.item.FkgItems;
import net.nyogu.forbiddenkingdoms.util.FkgRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class FkgMod implements ModInitializer {

	public static final String MOD_ID = "fkgmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		FkgItems.registerFkgItems();
		FkgBlocks.registerModBlocks();
		FkgRegistries.registerFkgStuff();


	}
}
