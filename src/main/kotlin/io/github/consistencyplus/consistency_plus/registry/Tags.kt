package io.github.consistencyplus.consistency_plus.registry

import net.fabricmc.fabric.api.tag.TagRegistry
import net.minecraft.block.Block
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier

// This code is based on code from Draylar's "Tiered" mod, found here: https://github.com/Draylar/tiered/blob/1.16/src/main/java/draylar/tiered/api/TieredItemTags.java
// That code is licensed under MIT.
// Thanks for your work, Draylar!
// Also, code is not being registered/initialized due to the fact that it does not have its usage JUST yet.
object Tags {
    val GATES = register("gates")
    private fun register(id: String): Tag<Block> {
        return TagRegistry.block(Identifier("consistency_plus", id))
    }

    fun init() {}
}