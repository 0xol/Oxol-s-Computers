package oxol.oxolscomputers

import net.minecraft.util.Identifier
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.item.Item
import net.fabricmc.fabric.api.item.v1.FabricItemSettings


object registerItems {
    
    fun registerItem(item: Item, name: String) {
        Registry.register(Registries.ITEM, Identifier("oxolscomputers", name), item)
    }

    val CUSTOM_ITEM: Item = Item(FabricItemSettings())
    
    fun init() {
        registerItem(CUSTOM_ITEM, "test")
    }
}
