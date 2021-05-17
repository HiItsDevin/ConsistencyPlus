package io.github.consistencyplus.consistency_plus.blocks.crying_obsidian

import net.minecraft.block.BlockState
import net.minecraft.block.SlabBlock
import net.minecraft.particle.DefaultParticleType
import net.minecraft.particle.ParticleTypes
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import java.util.*

class CryingObsidianSlabBlock(settings: Settings?) : SlabBlock(settings) {
    override fun randomDisplayTick(obsidianState: BlockState, world: World, position: BlockPos, random: Random) {
        if (random.nextInt(5) == 0) {
            for (int_1 in 0 until random.nextInt(1) + 1) {
                world.addParticle(
                    ParticleTypes.DRIPPING_OBSIDIAN_TEAR,
                    (position.x.toFloat() + 0.5f).toDouble(),
                    position.y.toFloat().toDouble(),
                    (position.z.toFloat() + 0.5f).toDouble(),
                    (random.nextFloat() / 2.0f).toDouble(), 5.0E-5, (random.nextFloat() / 2.0f).toDouble()
                )
            }
        }
    }
}