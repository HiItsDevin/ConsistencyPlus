package io.github.consistencyplus.consistency_plus

import io.github.consistencyplus.consistency_plus.registry.Blocks
import io.github.consistencyplus.consistency_plus.registry.Items
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry
import net.minecraft.client.color.item.ItemColorProvider
import net.minecraft.client.color.world.GrassColors
import net.minecraft.client.render.RenderLayer
import net.minecraft.item.ItemStack
import org.apache.logging.log4j.LogManager

class ConsistencyPlusClientside : ClientModInitializer {
    override fun onInitializeClient() {
        LOGGER.info("Consistency+ Main - Starting client initialization")
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.WARPED_WART, RenderLayer.getCutout())
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.GRASS_SLAB, RenderLayer.getCutout())
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.GRASS_STAIRS, RenderLayer.getCutout())
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.GRASS_WALL, RenderLayer.getCutout())
        ColorProviderRegistry.ITEM.register(ItemColorProvider { stack: ItemStack?, tintIndex: Int ->
            GrassColors.getColor(
                0.5,
                1.0
            )
        }, Items.GRASS_SLAB, Items.GRASS_STAIRS, Items.GRASS_WALL)
        LOGGER.info("Consistency+ Main - Finished client initialization")
    }

    companion object {
        private val LOGGER = LogManager.getLogger()
    }
}