package oxol.oxolscomputers.items

import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.item.Item
import net.minecraft.util.Identifier

object itemRegister {

    fun registerItem(item: Item, name: String) {
        Registry.register(Registries.ITEM, Identifier("oxolscomputers", name), item)
    }

}