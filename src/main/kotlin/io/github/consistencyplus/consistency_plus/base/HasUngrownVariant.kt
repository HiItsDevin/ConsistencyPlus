package io.github.consistencyplus.consistency_plus.base

import net.minecraft.block.BlockState
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

interface HasUngrownVariant {
    fun getUngrownVariant(world: World?, pos: BlockPos?): BlockState?
}
