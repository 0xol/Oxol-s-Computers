package oxol.oxolscomputers

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory
import oxol.oxolscomputers.items.itemRegister

object OxolsComputers : ModInitializer {
	private val logger = LoggerFactory.getLogger("oxols-computers")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Starting MS-DOS...")
		itemRegister.init()
	}
}