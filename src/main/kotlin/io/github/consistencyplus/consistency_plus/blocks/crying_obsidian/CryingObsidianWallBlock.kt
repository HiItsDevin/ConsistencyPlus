package io.github.consistencyplus.consistency_plus.blocks.crying_obsidian

import net.minecraft.block.BlockState
import net.minecraft.block.WallBlock
import net.minecraft.particle.ParticleTypes
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import java.util.*

class CryingObsidianWallBlock(settings: Settings?) : WallBlock(settings) {
    override fun randomDisplayTick(obsidianState: BlockState, world: World, position: BlockPos, random: Random) {
        if (random.nextInt(5) == 0) {
            //for (int int_1 = 0; int_1 < random.nextInt(1) + 1; ++int_1)
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