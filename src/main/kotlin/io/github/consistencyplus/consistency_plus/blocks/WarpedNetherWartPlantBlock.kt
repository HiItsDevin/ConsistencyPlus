package io.github.consistencyplus.consistency_plus.blocks

import io.github.consistencyplus.consistency_plus.registry.Items
import net.minecraft.block.BlockState
import net.minecraft.block.NetherWartBlock
import net.minecraft.item.ItemStack
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView

class WarpedNetherWartPlantBlock(settings: Settings?) : NetherWartBlock(settings) {
    override fun getPickStack(world: BlockView, pos: BlockPos, state: BlockState): ItemStack {
        return ItemStack(Items.WARPED_WART)
    }
}