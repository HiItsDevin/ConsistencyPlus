package io.github.consistencyplus.consistency_plus.blocks.dirt

import io.github.consistencyplus.consistency_plus.base.HasGrownGrassVariant
import io.github.consistencyplus.consistency_plus.base.HasGrownMyceliumVariant
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class DirtBlock(settings: Settings?) : Block(settings),
    HasGrownGrassVariant, HasGrownMyceliumVariant {
    override fun getGrownGrassVariant(world: World?, pos: BlockPos?): BlockState? {
        return Blocks.GRASS_BLOCK.defaultState
    }

    override fun getGrownMyceliumVariant(world: World?, pos: BlockPos?): BlockState? {
        return Blocks.MYCELIUM.defaultState
    }
}