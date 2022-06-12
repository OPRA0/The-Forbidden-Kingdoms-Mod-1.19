package net.nyogu.forbiddenkingdoms.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.nyogu.forbiddenkingdoms.FkgMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FkgMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		FkgMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
