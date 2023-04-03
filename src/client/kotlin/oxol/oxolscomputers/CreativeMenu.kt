package oxol.oxolscomputers

import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.text.Text
import oxol.oxolscomputers.items.itemRegister

private val CREATIVEMENU: ItemGroup = FabricItemGroup.builder(Identifier("oxolscomputers", "test"))
                                    .icon { ItemStack(itemRegister.t1_cpu) }
                                    .displayName(Text.of("Oxol's Computers"))
                                    .build()

object creativeMenu{
    fun registerCreativeMenu() {
        CREATIVEMENU
        
        registerItem(itemRegister.t1_cpu)
        registerItem(itemRegister.t2_cpu)
        registerItem(itemRegister.t3_cpu)
    }

    fun registerItem(item: Item) {
        ItemGroupEvents.modifyEntriesEvent(CREATIVEMENU).register { x ->
            x.add(ItemStack(item))
        }
    }
}