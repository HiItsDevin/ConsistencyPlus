package io.github.consistencyplus.consistency_plus.blocks.dirt

import io.github.consistencyplus.consistency_plus.base.HasGrownGrassVariant
import io.github.consistencyplus.consistency_plus.base.HasGrownMyceliumVariant
import io.github.consistencyplus.consistency_plus.registry.Blocks.GRASS_STAIRS
import io.github.consistencyplus.consistency_plus.registry.Blocks.MYCELIUM_STAIRS
import net.minecraft.block.BlockState
import net.minecraft.block.StairsBlock
import net.minecraft.block.enums.BlockHalf
import net.minecraft.block.enums.StairShape
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.World

class DirtStairsBlock(baseBlockState: BlockState?, settings: Settings?) :
    StairsBlock(baseBlockState, settings), HasGrownGrassVariant, HasGrownMyceliumVariant {
    override fun getGrownGrassVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return GRASS_STAIRS.getDefaultState().with<Boolean, Boolean>(WATERLOGGED, oldState.get(WATERLOGGED))
            .with<Direction, Direction>(
                FACING, oldState.get(FACING)
            )
            .with<BlockHalf, BlockHalf>(HALF, oldState.get(HALF))
            .with<StairShape, StairShape>(SHAPE, oldState.get(SHAPE))
    }

    override fun getGrownMyceliumVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return MYCELIUM_STAIRS.getDefaultState().with<Boolean, Boolean>(WATERLOGGED, oldState.get(WATERLOGGED))
            .with<Direction, Direction>(
                FACING, oldState.get(FACING)
            )
            .with<BlockHalf, BlockHalf>(HALF, oldState.get(HALF))
            .with<StairShape, StairShape>(SHAPE, oldState.get(SHAPE))
    }
}
