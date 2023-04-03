package oxol.oxolscomputers

import net.fabricmc.api.ClientModInitializer
import oxol.oxolscomputers.creativeMenu

object OxolsComputersClient : ClientModInitializer {
	override fun onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		creativeMenu.registerCreativeMenu()
	}
}