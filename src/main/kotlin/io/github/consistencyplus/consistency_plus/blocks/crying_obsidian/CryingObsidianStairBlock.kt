package io.github.consistencyplus.consistency_plus.blocks.crying_obsidian

import net.minecraft.block.BlockState
import net.minecraft.block.StairsBlock
import net.minecraft.particle.ParticleTypes
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import java.util.*

class CryingObsidianStairBlock(baseBlockState: BlockState?, settings: Settings?) :
    StairsBlock(baseBlockState, settings) {
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
            val randoms = (Math.random() * 5000).toInt()
            if (randoms > 4500) {
                world.addParticle(
                    ParticleTypes.DRIPPING_OBSIDIAN_TEAR,
                    position.x.toFloat() + Math.random() * 1,
                    (position.y
                        .toFloat() + 0.8f).toDouble(),
                    position.z.toFloat() + Math.random() * 0.9,
                    (random.nextFloat() / 2.0f).toDouble(),
                    5.0E-5,
                    (random.nextFloat() / 2.0f).toDouble()
                )
                world.addParticle(
                    ParticleTypes.DRIPPING_OBSIDIAN_TEAR,
                    position.x.toFloat() + Math.random() * 0.8,
                    (position.y
                        .toFloat() + 0.8f).toDouble(),
                    position.z.toFloat() + Math.random() * 1,
                    (random.nextFloat() / 2.0f).toDouble(),
                    5.0E-5,
                    (random.nextFloat() / 2.0f).toDouble()
                )
                world.addParticle(
                    ParticleTypes.DRIPPING_OBSIDIAN_TEAR,
                    position.x.toFloat() + Math.random() * 0.2,
                    (position.y
                        .toFloat() + 0.8f).toDouble(),
                    position.z.toFloat() + Math.random() * 1,
                    (random.nextFloat() / 2.0f).toDouble(),
                    5.0E-5,
                    (random.nextFloat() / 2.0f).toDouble()
                )
                world.addParticle(
                    ParticleTypes.DRIPPING_OBSIDIAN_TEAR,
                    position.x.toFloat() + Math.random() * 1,
                    (position.y
                        .toFloat() + 0.8f).toDouble(),
                    position.z.toFloat() + Math.random() * 0.2,
                    (random.nextFloat() / 2.0f).toDouble(),
                    5.0E-5,
                    (random.nextFloat() / 2.0f).toDouble()
                )
            }
        }
    }
}