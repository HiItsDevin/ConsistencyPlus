package io.github.consistencyplus.consistency_plus.blocks.mycelium

import io.github.consistencyplus.consistency_plus.base.HasUngrownVariant
import io.github.consistencyplus.consistency_plus.base.IsSpreadableMyceliumBlock
import io.github.consistencyplus.consistency_plus.registry.Blocks.DIRT_SLAB
import net.minecraft.block.*
import net.minecraft.block.enums.SlabType
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.World
import net.minecraft.world.WorldView
import net.minecraft.world.chunk.light.ChunkLightProvider
import java.util.*

class MyceliumSlabBlock(settings: Settings?) : SlabBlock(settings), HasUngrownVariant,
    IsSpreadableMyceliumBlock {
    override fun customCanSurvive(state: BlockState?, worldView: WorldView, pos: BlockPos): Boolean {
        val stateAbove = worldView.getBlockState(pos.up())
        return if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
            true
        } else if (stateAbove.fluidState.level == 8) {
            false
        } else {
            if (worldView.getBlockState(pos).block is MyceliumSlabBlock) {
                if (worldView.getBlockState(pos).get(TYPE) == SlabType.TOP) {
                    return true // technically not correct but good enough
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

    override fun randomTick(state: BlockState, world: ServerWorld, pos: BlockPos, random: Random) {
        grow(state, world, pos, random)
    }

    override fun getUngrownVariant(world: World?, pos: BlockPos?): BlockState? {
        val oldState = world!!.getBlockState(pos)
        return DIRT_SLAB.getDefaultState().with<SlabType, SlabType>(TYPE, oldState.get(TYPE))
    }
}
