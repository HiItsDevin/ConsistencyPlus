package io.github.consistencyplus.consistency_plus.blocks.dirt

import io.github.consistencyplus.consistency_plus.base.HasGrownGrassVariant
import io.github.consistencyplus.consistency_plus.base.HasGrownMyceliumVariant
import io.github.consistencyplus.consistency_plus.registry.Blocks.GRASS_SLAB
import io.github.consistencyplus.consistency_plus.registry.Blocks.MYCELIUM_SLAB
import net.minecraft.block.BlockState
import net.minecraft.block.SlabBlock
import net.minecraft.block.enums.SlabType
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class DirtSlabBlock(settings: Settings?) : SlabBlock(settings), HasGrownGrassVariant,
    HasGrownMyceliumVariant {
    override fun getGrownGrassVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return GRASS_SLAB.getDefaultState().with<SlabType, SlabType>(TYPE, oldState.get(TYPE)).with<Boolean, Boolean>(
            WATERLOGGED, oldState.get(WATERLOGGED)
        )
    }

    override fun getGrownMyceliumVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return MYCELIUM_SLAB.getDefaultState().with<SlabType, SlabType>(TYPE, oldState.get(TYPE))
            .with<Boolean, Boolean>(
                WATERLOGGED, oldState.get(WATERLOGGED)
            )
    }
}