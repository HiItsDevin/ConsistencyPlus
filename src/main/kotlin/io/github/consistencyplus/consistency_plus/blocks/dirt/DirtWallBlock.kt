package io.github.consistencyplus.consistency_plus.blocks.dirt

import io.github.consistencyplus.consistency_plus.base.HasGrownGrassVariant
import io.github.consistencyplus.consistency_plus.base.HasGrownMyceliumVariant
import io.github.consistencyplus.consistency_plus.registry.Blocks.GRASS_WALL
import io.github.consistencyplus.consistency_plus.registry.Blocks.MYCELIUM_WALL
import net.minecraft.block.BlockState
import net.minecraft.block.WallBlock
import net.minecraft.block.enums.WallShape
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class DirtWallBlock(settings: Settings?) : WallBlock(settings), HasGrownGrassVariant,
    HasGrownMyceliumVariant {
    override fun getGrownGrassVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return GRASS_WALL.getDefaultState().with<Boolean, Boolean>(UP, oldState.get(UP)).with<Boolean, Boolean>(
            WATERLOGGED, oldState.get(WATERLOGGED)
        )
            .with<WallShape, WallShape>(NORTH_SHAPE, oldState.get(NORTH_SHAPE)).with<WallShape, WallShape>(
                SOUTH_SHAPE, oldState.get(
                    SOUTH_SHAPE
                )
            )
            .with<WallShape, WallShape>(EAST_SHAPE, oldState.get(EAST_SHAPE)).with<WallShape, WallShape>(
                WEST_SHAPE, oldState.get(
                    WEST_SHAPE
                )
            )
    }

    override fun getGrownMyceliumVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return MYCELIUM_WALL.getDefaultState().with<Boolean, Boolean>(UP, oldState.get(UP)).with<Boolean, Boolean>(
            WATERLOGGED, oldState.get(WATERLOGGED)
        )
            .with<WallShape, WallShape>(NORTH_SHAPE, oldState.get(NORTH_SHAPE)).with<WallShape, WallShape>(
                SOUTH_SHAPE, oldState.get(
                    SOUTH_SHAPE
                )
            )
            .with<WallShape, WallShape>(EAST_SHAPE, oldState.get(EAST_SHAPE)).with<WallShape, WallShape>(
                WEST_SHAPE, oldState.get(
                    WEST_SHAPE
                )
            )
    }
}