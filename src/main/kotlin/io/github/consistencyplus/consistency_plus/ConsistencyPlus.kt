package io.github.consistencyplus.consistency_plus

import com.mojang.serialization.Lifecycle
import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtBlock
import net.fabricmc.api.ModInitializer
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Blocks
import net.minecraft.block.Material
import net.minecraft.block.MaterialColor
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.Items
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey
import org.apache.logging.log4j.LogManager

// For support join https://discord.gg/v6v4pMv

object ConsistencyPlus : ModInitializer {
    @kotlin.jvm.JvmField
    public val LOGGER = LogManager.getLogger()
    var DIRT_ID = 0

    override fun onInitialize() {
        LOGGER.info("Consistency+ Main - Version RC-0.3 - Starting initialization")
        LOGGER.debug("Consistency+ Main - Beginning block initialization")
        io.github.consistencyplus.consistency_plus.registry.Blocks.init()

        // making dirt not stupid
        DIRT_ID = Registry.BLOCK.getRawId(Blocks.DIRT)
        Registry.BLOCK.set(
            DIRT_ID, RegistryKey.of(
                Registry.BLOCK_KEY,
                Identifier("minecraft", "dirt")
            ),
            DirtBlock(
                AbstractBlock.Settings.of(Material.SOIL, MaterialColor.DIRT).strength(0.5f)
                    .sounds(BlockSoundGroup.GRAVEL)
            ),
            Lifecycle.stable()
        )
        Registry.ITEM.set(
            Registry.ITEM.getRawId(Items.DIRT), RegistryKey.of(
                Registry.ITEM_KEY,
                Identifier("minecraft", "dirt")
            ),
            BlockItem(
                Registry.BLOCK[Registry.BLOCK.getRawId(Blocks.DIRT)],
                Item.Settings().group(ItemGroup.BUILDING_BLOCKS)
            ), Lifecycle.stable()
        )
        LOGGER.debug("Consistency+ Main - Blocks initialized")
        LOGGER.debug("Consistency+ Main - Beginning item initialization")
        io.github.consistencyplus.consistency_plus.registry.Items.init()
        LOGGER.debug("Consistency+ Main - Items initialized")
        LOGGER.info("Consistency+ Main - Finished initialization")
    }
}
