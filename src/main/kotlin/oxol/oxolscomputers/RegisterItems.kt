package oxol.oxolscomputers

import net.minecraft.util.Identifier
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import oxol.oxolscomputers.items.T1CpuItem

object registerItems {
    val CUSTOM_ITEM: Item = T1CpuItem(FabricItemSettings())
    
    fun registerItem(item: Item, name: String) {
        Registry.register(Registries.ITEM, Identifier("oxolscomputers", name), item)
    }

    fun addToItemGroup() {

    }

    fun init() {
        registerItem(CUSTOM_ITEM, "t1_cpu")
    }
}
