package io.github.consistencyplus.consistency_plus.registry

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object ItemGroups {
    val CONSISTENCY_PLUS_STONE = FabricItemGroupBuilder.build(
        Identifier("consistency_plus", "stone")
    ) { ItemStack(Blocks.STONE_BRICK_PILLAR) }
    val CONSISTENCY_PLUS_DYEABLE = FabricItemGroupBuilder.build(
        Identifier("consistency_plus", "dyeable")
    ) { ItemStack(Blocks.TERRACOTTA_STAIRS) }
    val CONSISTENCY_PLUS_MISC = FabricItemGroupBuilder.build(
        Identifier("consistency_plus", "misc")
    ) { ItemStack(Blocks.PURPUR_BLOCK) }

    fun consistencyPlusStoneItemSettings(): Item.Settings {
        return Item.Settings().group(CONSISTENCY_PLUS_STONE)
    }

    fun consistencyPlusDyeableItemSettings(): Item.Settings {
        return Item.Settings().group(CONSISTENCY_PLUS_DYEABLE)
    }

    fun consistencyPlusMiscItemSettings(): Item.Settings {
        return Item.Settings().group(CONSISTENCY_PLUS_MISC)
    }
}