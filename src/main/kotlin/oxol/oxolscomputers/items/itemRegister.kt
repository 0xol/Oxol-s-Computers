package oxol.oxolscomputers.items

import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.fabricmc.fabric.api.item.v1.FabricItemSettings

//item imports
import oxol.oxolscomputers.items.t1_cpuItem
import oxol.oxolscomputers.items.t2_cpuItem
import oxol.oxolscomputers.items.t3_cpuItem

object itemRegister {

    val t1_cpu = t1_cpuItem(FabricItemSettings())
    val t2_cpu = t2_cpuItem(FabricItemSettings())
    val t3_cpu = t3_cpuItem(FabricItemSettings())

    fun registerItem(item: Item, name: String) {
        Registry.register(Registries.ITEM, Identifier("oxolscomputers", name), item)
    }

    fun init() {
        registerItem(t1_cpu, t1_cpu.NAME)
        registerItem(t2_cpu, t2_cpu.NAME)
        registerItem(t3_cpu, t3_cpu.NAME)
    }

}