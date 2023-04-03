package oxol.oxolscomputers

import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import oxol.oxolscomputers.registerItems
import net.minecraft.text.Text

private val CREATIVEMENU: ItemGroup = FabricItemGroup.builder(Identifier("oxolscomputers", "test"))
                                    .icon { ItemStack(registerItems.CUSTOM_ITEM) }
                                    .displayName(Text.of("test"))
                                    .build()

object creativeMenu{
    fun registerCreativeMenu() {
        CREATIVEMENU   
        ItemGroupEvents.modifyEntriesEvent(CREATIVEMENU).register { x ->
            x.add(ItemStack(registerItems.CUSTOM_ITEM))
        }
    }
}