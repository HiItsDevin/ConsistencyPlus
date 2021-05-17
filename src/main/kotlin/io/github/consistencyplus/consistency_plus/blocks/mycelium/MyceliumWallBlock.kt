package io.github.consistencyplus.consistency_plus.blocks.mycelium

import io.github.consistencyplus.consistency_plus.base.HasUngrownVariant
import io.github.consistencyplus.consistency_plus.base.IsSpreadableGrassBlock
import io.github.consistencyplus.consistency_plus.registry.Blocks.DIRT_WALL
import net.minecraft.block.*
import net.minecraft.block.enums.WallShape
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.World
import net.minecraft.world.WorldView
import net.minecraft.world.chunk.light.ChunkLightProvider
import java.util.*

class MyceliumWallBlock(settings: Settings?) : WallBlock(settings), HasUngrownVariant,
    IsSpreadableGrassBlock {
    override fun customCanSurvive(state: BlockState?, worldView: WorldView, pos: BlockPos): Boolean {
        val stateAbove = worldView.getBlockState(pos.up())
        return if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
            true
        } else if (stateAbove.fluidState.level == 8) {
            false
        } else {
            if (state!!.block is MyceliumWallBlock) {
                if (stateAbove.block !== Blocks.AIR) {
                    return false
                }
            }
            val i = ChunkLightProvider.getRealisticOpacity(
                worldView,
                state,
                pos,
                stateAbove,
                pos.up(),
                Direction.UP,
                stateAbove.getOpacity(worldView, pos.up())
            )
            i < worldView.maxLightLevel
        }
    }

    override fun getUngrownVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return DIRT_WALL.getDefaultState().with<Boolean, Boolean>(UP, oldState.get(UP)).with<Boolean, Boolean>(
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

    override fun randomTick(state: BlockState, world: ServerWorld, pos: BlockPos, random: Random) {
        grow(state, world, pos, random)
    }
}
