package io.github.consistencyplus.consistency_plus.base

import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.block.SnowBlock
import net.minecraft.block.SnowyBlock
import net.minecraft.server.world.ServerWorld
import net.minecraft.tag.FluidTags
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.WorldView
import net.minecraft.world.chunk.light.ChunkLightProvider
import java.util.*

interface IsSpreadableGrassBlock {
    fun customCanSurvive(state: BlockState?, worldView: WorldView, pos: BlockPos): Boolean {
        val stateAbove = worldView.getBlockState(pos.up())
        return if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
            true
        } else if (stateAbove.fluidState.level == 8) {
            false
        } else {
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

    fun customCanSpread(state: BlockState?, worldView: WorldView, pos: BlockPos): Boolean {
        val blockPos = pos.up()
        return customCanSurvive(state, worldView, pos) && !worldView.getFluidState(blockPos).isIn(FluidTags.WATER)
    }

    fun grow(state: BlockState?, world: ServerWorld, pos: BlockPos, random: Random) {
        if (!customCanSurvive(state, world, pos)) {
            world.setBlockState(pos, (this as HasUngrownVariant).getUngrownVariant(world, pos))
        } else {
            if (world.getLightLevel(pos.up()) >= 9) {
                for (i in 0..3) {
                    val targetPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1)

                    // vanilla handling
                    if (world.getBlockState(targetPos).isOf(Blocks.DIRT) && customCanSpread(
                            world.getBlockState(pos),
                            world,
                            targetPos
                        )
                    ) {
                        // snow check
                        if (world.getBlockState(targetPos.up())
                                .isOf(Blocks.SNOW_BLOCK) || world.getBlockState(targetPos.up()).isOf(
                                Blocks.SNOW
                            )
                        ) {
                            world.setBlockState(targetPos, Blocks.GRASS_BLOCK.defaultState.with(SnowyBlock.SNOWY, true))
                        } else {
                            world.setBlockState(targetPos, Blocks.GRASS_BLOCK.defaultState)
                        }
                    }

                    // HasGrownGrassVariant handling
                    if (world.getBlockState(targetPos).block is HasGrownGrassVariant && customCanSpread(
                            world.getBlockState(
                                pos
                            ), world, targetPos
                        )
                    ) {
                        val targetBlock = world.getBlockState(targetPos).block as HasGrownGrassVariant

                        // snow check
                        if (world.getBlockState(targetPos.up())
                                .isOf(Blocks.SNOW_BLOCK) || world.getBlockState(targetPos.up()).isOf(
                                Blocks.SNOW
                            )
                        ) {
                            world.setBlockState(
                                targetPos, targetBlock.getGrownGrassVariant(world, targetPos)!!
                                    .with(SnowyBlock.SNOWY, true)
                            )
                        } else {
                            world.setBlockState(targetPos, targetBlock.getGrownGrassVariant(world, targetPos))
                        }
                    }
                }
            }
        }
    }
}
