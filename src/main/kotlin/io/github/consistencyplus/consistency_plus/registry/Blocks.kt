package io.github.consistencyplus.consistency_plus.registry

import io.github.consistencyplus.consistency_plus.base.BaseConsistencyCarvedPumpkinBlock
import io.github.consistencyplus.consistency_plus.base.BaseConsistencyStairBlock
import io.github.consistencyplus.consistency_plus.blocks.WarpedNetherWartPlantBlock
import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtSlabBlock
import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtStairsBlock
import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtWallBlock
import io.github.consistencyplus.consistency_plus.blocks.grass.GrassSlabBlock
import io.github.consistencyplus.consistency_plus.blocks.grass.GrassStairsBlock
import io.github.consistencyplus.consistency_plus.blocks.grass.GrassWallBlock
import io.github.consistencyplus.consistency_plus.blocks.mycelium.MyceliumSlabBlock
import io.github.consistencyplus.consistency_plus.blocks.mycelium.MyceliumStairsBlock
import io.github.consistencyplus.consistency_plus.blocks.mycelium.MyceliumWallBlock
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricMaterialBuilder
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.*
import net.minecraft.block.Blocks
import net.minecraft.block.piston.PistonBehavior
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


object Blocks {
    @kotlin.jvm.JvmField
    /*
        templates
        block:  public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
        slab:   public static final Block POLISHED_STONE_SLAB  = register("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        stairs: public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        pillar: public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        wall:   public static final Block STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        fence: public static final Block FORMAT_FENCE = register("format_fence", new FenceBlock(FabricBlockSettings.of(Material.STONE)));
        gate: public static final Block FORMAT_FENCE_GATE = register("format_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE)));
        public static final Block _GATE = register("_gate", new FenceGateBlock(FabricBlockSettings.copy()));
        public static final Block CUT__GATE = register("cut__gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_)));
        public static final Block _BRICK_GATE = register("_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(_BRICKS)));
        public static final Block POLISHED__GATE = register("polished__gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_)));
        public static final Block SMOOTH__GATE = register("smooth__gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_)));
         */
    //Stone
    val STONE_WALL = register("stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.STONE)))
    val STONE_GATE = register("stone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.STONE)))
    val COBBLESTONE_GATE = register("cobblestone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE)))
    val MOSSY_COBBLESTONE_GATE =
        register("mossy_cobblestone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.MOSSY_COBBLESTONE)))

    //Smooth
    val SMOOTH_STONE_STAIRS = register(
        "smooth_stone_stairs", BaseConsistencyStairBlock(
            Blocks.SMOOTH_STONE.defaultState, FabricBlockSettings.copy(
                Blocks.SMOOTH_STONE
            )
        )
    )
    val SMOOTH_STONE_WALL = register("smooth_stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE)))
    val SMOOTH_STONE_GATE = register("smooth_stone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE)))

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Polished
    val POLISHED_STONE = register("polished_stone", Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val POLISHED_STONE_SLAB = register("polished_stone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val POLISHED_STONE_STAIRS = register(
        "polished_stone_stairs", BaseConsistencyStairBlock(
            Blocks.STONE_BRICKS.defaultState, FabricBlockSettings.copy(
                Blocks.STONE_BRICKS
            )
        )
    )
    val POLISHED_STONE_WALL = register("polished_stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val POLISHED_STONE_GATE = register(
        "polished_stone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_STONE
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_STONE = register("cut_stone", Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val CUT_STONE_SLAB = register("cut_stone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val CUT_STONE_STAIRS = register(
        "cut_stone_stairs", BaseConsistencyStairBlock(
            Blocks.STONE_BRICKS.defaultState, FabricBlockSettings.copy(
                Blocks.STONE_BRICKS
            )
        )
    )
    val CUT_STONE_WALL = register("cut_stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val CUT_STONE_GATE = register("cut_stone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    // Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    // Bricks
    val STONE_BRICK_GATE = register("stone_brick_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))

    // Cracked
    val CRACKED_STONE_BRICK_SLAB =
        register("cracked_stone_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS)))
    val CRACKED_STONE_BRICK_STAIRS = register(
        "cracked_stone_brick_stairs", BaseConsistencyStairBlock(
            Blocks.CRACKED_STONE_BRICKS.defaultState, FabricBlockSettings.copy(
                Blocks.CRACKED_STONE_BRICKS
            )
        )
    )
    val CRACKED_STONE_BRICK_WALL =
        register("cracked_stone_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS)))
    val CRACKED_STONE_BRICK_GATE = register(
        "cracked_stone_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.CRACKED_STONE_BRICKS
            )
        )
    )

    // Mossy
    val MOSSY_STONE_BRICK_GATE =
        register("mossy_stone_brick_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS)))

    // Pillar and Chiseled
    val STONE_BRICK_PILLAR = register("stone_brick_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val CRACKED_STONE_BRICK_PILLAR = register(
        "cracked_stone_brick_pillar", PillarBlock(
            FabricBlockSettings.copy(
                Blocks.STONE_BRICKS
            )
        )
    )
    val MOSSY_STONE_BRICK_PILLAR =
        register("mossy_stone_brick_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))
    val CRACKED_CHISELED_STONE_BRICKS = register(
        "cracked_chiseled_stone_bricks", Block(
            FabricBlockSettings.copy(
                Blocks.STONE_BRICKS
            )
        )
    )
    val MOSSY_CHISELED_STONE_BRICKS =
        register("mossy_chiseled_stone_bricks", Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))

    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_STONE_BRICKS = register("carved_stone_bricks", Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)))

    //cracked carved
    //mossy carved
    //Blackstone
    val BLACKSTONE_GATE = register("blackstone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)))
    val BLACKSTONE_BRICK_GATE =
        register("blackstone_brick_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))
    val POLISHED_BLACKSTONE_GATE = register(
        "polished_blackstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_BLACKSTONE
            )
        )
    )

    //Smooth
    val SMOOTH_BLACKSTONE = register("smooth_blackstone", Block(FabricBlockSettings.copy(Blocks.BLACKSTONE)))
    val SMOOTH_BLACKSTONE_SLAB =
        register("smooth_blackstone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)))
    val SMOOTH_BLACKSTONE_STAIRS = register(
        "smooth_blackstone_stairs", BaseConsistencyStairBlock(
            Blocks.BLACKSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.BLACKSTONE
            )
        )
    )
    val SMOOTH_BLACKSTONE_WALL =
        register("smooth_blackstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)))
    val SMOOTH_BLACKSTONE_GATE = register(
        "smooth_blackstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_BLACKSTONE
            )
        )
    )

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_BLACKSTONE = register("cut_blackstone", Block(FabricBlockSettings.copy(Blocks.BLACKSTONE)))
    val CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)))
    val CUT_BLACKSTONE_STAIRS = register(
        "cut_blackstone_stairs", BaseConsistencyStairBlock(
            Blocks.BLACKSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.BLACKSTONE
            )
        )
    )
    val CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.BLACKSTONE)))
    val CUT_BLACKSTONE_GATE = register(
        "cut_blackstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_BLACKSTONE
            )
        )
    )

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cracked
    val CRACKED_BLACKSTONE_BRICK_SLAB = register(
        "cracked_blackstone_brick_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS
            )
        )
    )
    val CRACKED_BLACKSTONE_BRICK_STAIRS = register(
        "cracked_blackstone_brick_stairs", BaseConsistencyStairBlock(
            Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultState,
            FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS)
        )
    )
    val CRACKED_BLACKSTONE_BRICK_WALL = register(
        "cracked_blackstone_brick_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS
            )
        )
    )
    val CRACKED_BLACKSTONE_BRICK_GATE = register(
        "cracked_blackstone_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS
            )
        )
    )

    //Mossy
    val MOSSY_BLACKSTONE_BRICKS =
        register("mossy_blackstone_bricks", Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))
    val MOSSY_BLACKSTONE_BRICK_SLAB = register(
        "mossy_blackstone_brick_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_BLACKSTONE_BRICKS
            )
        )
    )
    val MOSSY_BLACKSTONE_BRICK_STAIRS = register(
        "mossy_blackstone_brick_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_BLACKSTONE_BRICKS.defaultState, FabricBlockSettings.copy(
                Blocks.STONE_BRICKS
            )
        )
    )
    val MOSSY_BLACKSTONE_BRICK_WALL = register(
        "mossy_blackstone_brick_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_BLACKSTONE_BRICKS
            )
        )
    )
    val MOSSY_BLACKSTONE_BRICK_GATE = register(
        "mossy_blackstone_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_BLACKSTONE_BRICKS
            )
        )
    )

    //Pillars and Chiseled
    val MOSSY_BLACKSTONE_BRICK_PILLAR = register(
        "mossy_blackstone_brick_pillar", PillarBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_BLACKSTONE_BRICKS
            )
        )
    )
    val CRACKED_BLACKSTONE_BRICK_PILLAR = register(
        "cracked_blackstone_brick_pillar", PillarBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_BLACKSTONE_BRICKS
            )
        )
    )
    val BLACKSTONE_BRICK_PILLAR =
        register("blackstone_brick_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))
    val CHISELED_BLACKSTONE =
        register("chiseled_blackstone", Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))
    val MOSSY_CHISELED_BLACKSTONE =
        register("mossy_chiseled_blackstone", Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))
    val CRACKED_CHISELED_BLACKSTONE =
        register("cracked_chiseled_blackstone", Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))

    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val MOSSY_CARVED_BLACKSTONE =
        register("mossy_carved_blackstone", Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))
    val CRACKED_CARVED_BLACKSTONE =
        register("cracked_carved_blackstone", Block(FabricBlockSettings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)))

    //Sandstone
    val SANDSTONE_GATE = register("sandstone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)))

    //Smooth
    val SMOOTH_SANDSTONE_WALL =
        register("smooth_sandstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE)))
    val SMOOTH_SANDSTONE_GATE =
        register("smooth_sandstone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE)))

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_SANDSTONE_STAIRS = register(
        "cut_sandstone_stairs", BaseConsistencyStairBlock(
            Blocks.CUT_SANDSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.CUT_SANDSTONE
            )
        )
    )
    val CUT_SANDSTONE_WALL = register("cut_sandstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)))
    val CUT_SANDSTONE_GATE =
        register("cut_sandstone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)))

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Polished
    val POLISHED_SANDSTONE = register("polished_sandstone", Block(FabricBlockSettings.copy(Blocks.SANDSTONE)))
    val POLISHED_SANDSTONE_SLAB =
        register("polished_sandstone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)))
    val POLISHED_SANDSTONE_STAIRS = register(
        "polished_sandstone_stairs", BaseConsistencyStairBlock(
            Blocks.SANDSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.SANDSTONE
            )
        )
    )
    val POLISHED_SANDSTONE_WALL =
        register("polished_sandstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)))
    val POLISHED_SANDSTONE_GATE = register(
        "polished_sandstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_SANDSTONE
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val SANDSTONE_BRICKS = register("sandstone_bricks", Block(FabricBlockSettings.copy(Blocks.SANDSTONE)))
    val SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)))
    val SANDSTONE_BRICK_STAIRS = register(
        "sandstone_brick_stairs", BaseConsistencyStairBlock(
            Blocks.SANDSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.SANDSTONE
            )
        )
    )
    val SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)))
    val SANDSTONE_BRICK_GATE = register(
        "sandstone_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SANDSTONE_BRICKS
            )
        )
    )

    //Cracked Bricks
    //cracked_sandstone_bricks
    //cracked_sandstone_brick_slab
    //cracked_sandstone_brick_stairs
    //cracked_sandstone_brick_wall
    //gate
    //Mossy Bricks
    //mossy_sandstone_bricks
    //mossy_sandstone_brick_slab
    //mossy_sandstone_brick_stairs
    //mossy_sandstone_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_SANDSTONE = register("chiseled_sandstone", Block(FabricBlockSettings.copy(Blocks.SANDSTONE)))

    //cracked_chiseled_sandstone_bricks
    //mossy_chiseled_sandstone_bricks
    val SANDSTONE_PILLAR = register("sandstone_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.SANDSTONE)))

    //cracked_sandstone_brick_pillar
    //mossy_sandstone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    //cracked carved
    //mossy carved
    //Red Sandstone
    val RED_SANDSTONE_GATE =
        register("red_sandstone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))

    //Smooth
    val SMOOTH_RED_SANDSTONE_WALL =
        register("smooth_red_sandstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))
    val SMOOTH_RED_SANDSTONE_GATE = register(
        "smooth_red_sandstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.SMOOTH_RED_SANDSTONE
            )
        )
    )

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_RED_SANDSTONE_STAIRS = register(
        "cut_red_sandstone_stairs", BaseConsistencyStairBlock(
            Blocks.CUT_SANDSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.CUT_SANDSTONE
            )
        )
    )
    val CUT_RED_SANDSTONE_WALL =
        register("cut_red_sandstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.CUT_SANDSTONE)))
    val CUT_RED_SANDSTONE_GATE =
        register("cut_red_sandstone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.CUT_RED_SANDSTONE)))

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Polished
    val POLISHED_RED_SANDSTONE =
        register("polished_red_sandstone", Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))
    val POLISHED_RED_SANDSTONE_SLAB = register(
        "polished_red_sandstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.RED_SANDSTONE
            )
        )
    )
    val POLISHED_RED_SANDSTONE_STAIRS = register(
        "polished_red_sandstone_stairs", BaseConsistencyStairBlock(
            Blocks.RED_SANDSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.SANDSTONE
            )
        )
    )
    val POLISHED_RED_SANDSTONE_WALL = register(
        "polished_red_sandstone_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.RED_SANDSTONE
            )
        )
    )
    val POLISHED_RED_SANDSTONE_GATE = register(
        "polished_red_sandstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_RED_SANDSTONE
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))
    val RED_SANDSTONE_BRICK_SLAB =
        register("red_sandstone_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))
    val RED_SANDSTONE_BRICK_STAIRS = register(
        "red_sandstone_brick_stairs", BaseConsistencyStairBlock(
            Blocks.RED_SANDSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.SANDSTONE
            )
        )
    )
    val RED_SANDSTONE_BRICK_WALL =
        register("red_sandstone_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))
    val RED_SANDSTONE_BRICK_GATE = register(
        "red_sandstone_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                RED_SANDSTONE_BRICKS
            )
        )
    )

    //Cracked Bricks
    //cracked_red_sandstone_bricks
    //cracked_red_sandstone_brick_slab
    //cracked_red_sandstone_brick_stairs
    //cracked_red_sandstone_brick_pillar
    //gate
    //Mossy Bricks
    //mossy_red_sandstone_bricks
    //mossy_red_sandstone_brick_slab
    //mossy_red_sandstone_brick_stairs
    //mossy_red_sandstone_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_RED_SANDSTONE =
        register("chiseled_red_sandstone", Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))

    //cracked_chiseled_red_sandstone_bricks
    //mossy_chiseled_red_sandstone_bricks
    val RED_SANDSTONE_PILLAR =
        register("red_sandstone_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.RED_SANDSTONE)))

    //cracked_red_sandstone_brick_pillar
    //mossy_red_sandstone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    //cracked carved
    //mossy carved
    //Quartz
    //Block
    val QUARTZ_WALL = register("quartz_wall", WallBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val QUARTZ_GATE = register("quartz_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))

    //Smooth
    val SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", WallBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val SMOOTH_QUARTZ_GATE =
        register("smooth_quartz_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ)))

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_QUARTZ = register("cut_quartz", Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val CUT_QUARTZ_SLAB = register("cut_quartz_slab", SlabBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val CUT_QUARTZ_STAIRS = register(
        "cut_quartz_stairs", BaseConsistencyStairBlock(
            Blocks.QUARTZ_BLOCK.defaultState, FabricBlockSettings.copy(
                Blocks.QUARTZ_BLOCK
            )
        )
    )
    val CUT_QUARTZ_WALL = register("cut_quartz_wall", WallBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val CUT_QUARTZ_GATE = register(
        "cut_quartz_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_QUARTZ
            )
        )
    )

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Polished
    val POLISHED_QUARTZ = register("polished_quartz", Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val POLISHED_QUARTZ_SLAB =
        register("polished_quartz_slab", SlabBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val POLISHED_QUARTZ_STAIRS = register(
        "polished_quartz_stairs", BaseConsistencyStairBlock(
            Blocks.QUARTZ_BLOCK.defaultState, FabricBlockSettings.copy(
                Blocks.QUARTZ_BLOCK
            )
        )
    )
    val POLISHED_QUARTZ_WALL =
        register("polished_quartz_wall", WallBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))
    val POLISHED_QUARTZ_GATE = register(
        "polished_quartz_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_QUARTZ
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val QUARTZ_BRICK_SLAB = register("quartz_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS)))
    val QUARTZ_BRICK_STAIRS = register(
        "quartz_brick_stairs", BaseConsistencyStairBlock(
            Blocks.QUARTZ_BRICKS.defaultState, FabricBlockSettings.copy(
                Blocks.QUARTZ_BRICKS
            )
        )
    )
    val QUARTZ_BRICK_WALL = register("quartz_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS)))
    val QUARTZ_BRICK_GATE =
        register("quartz_brick_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.QUARTZ_BRICKS)))

    //Cracked Bricks
    //cracked_quartz_bricks
    //cracked_quartz_brick_slab
    //cracked_quartz_brick_stairs
    //cracked_quartz_brick_wall
    //gate
    //Mossy Bricks
    //mossy_quartz_bricks
    //mossy_quartz_brick_slab
    //mossy_quartz_brick_stairs
    //mossy_quartz_brick_wall
    //gate
    //Pillar and Chiseled
    //cracked_chiseled_quartz_bricks
    //mossy_chiseled_quartz_bricks
    //cracked_quartz_pillar
    //mossy_quartz_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_QUARTZ = register("carved_quartz", Block(FabricBlockSettings.copy(Blocks.QUARTZ_BLOCK)))

    //cracked carved
    //mossy carved
    //Andesite
    val ANDESITE_GATE = register("andesite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.ANDESITE)))

    // Mossy
    val MOSSY_ANDESITE = register("mossy_andesite", Block(FabricBlockSettings.copy(Blocks.ANDESITE)))
    val MOSSY_ANDESITE_SLAB = register("mossy_andesite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE)))
    val MOSSY_ANDESITE_STAIRS = register(
        "mossy_andesite_stairs", BaseConsistencyStairBlock(
            Blocks.ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.ANDESITE
            )
        )
    )
    val MOSSY_ANDESITE_WALL = register("mossy_andesite_wall", WallBlock(FabricBlockSettings.copy(Blocks.ANDESITE)))
    val MOSSY_ANDESITE_GATE = register("mossy_andesite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.ANDESITE)))

    //Polished
    val POLISHED_ANDESITE_WALL =
        register("polished_andesite_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val POLISHED_ANDESITE_GATE =
        register("polished_andesite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))

    //Cracked Polished
    val CRACKED_POLISHED_ANDESITE =
        register("cracked_polished_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CRACKED_POLISHED_ANDESITE_SLAB = register(
        "cracked_polished_andesite_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_POLISHED_ANDESITE_STAIRS = register(
        "cracked_polished_andesite_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)
        )
    )
    val CRACKED_POLISHED_ANDESITE_WALL = register(
        "cracked_polished_andesite_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_POLISHED_ANDESITE_GATE = register(
        "cracked_polished_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)
        )
    )

    //Mossy Polished
    val MOSSY_POLISHED_ANDESITE =
        register("mossy_polished_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_POLISHED_ANDESITE_SLAB = register(
        "mossy_polished_andesite_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val MOSSY_POLISHED_ANDESITE_STAIRS = register(
        "mossy_polished_andesite_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val MOSSY_POLISHED_ANDESITE_WALL = register(
        "mossy_polished_andesite_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val MOSSY_POLISHED_ANDESITE_GATE = register(
        "mossy_polished_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )

    //Smooth
    val SMOOTH_ANDESITE = register("smooth_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val SMOOTH_ANDESITE_SLAB =
        register("smooth_andesite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val SMOOTH_ANDESITE_STAIRS = register(
        "smooth_andesite_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val SMOOTH_ANDESITE_WALL =
        register("smooth_andesite_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val SMOOTH_ANDESITE_GATE = register(
        "smooth_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_ANDESITE
            )
        )
    )

    //Cracked Smooth
    val CRACKED_SMOOTH_ANDESITE =
        register("cracked_smooth_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CRACKED_SMOOTH_ANDESITE_SLAB = register(
        "cracked_smooth_andesite_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_SMOOTH_ANDESITE_STAIRS = register(
        "cracked_smooth_andesite_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_SMOOTH_ANDESITE_WALL = register(
        "cracked_smooth_andesite_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_SMOOTH_ANDESITE_GATE = register(
        "cracked_smooth_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )

    //Mossy Smooth
    val MOSSY_SMOOTH_ANDESITE =
        register("mossy_smooth_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_SMOOTH_ANDESITE_SLAB =
        register("mossy_smooth_andesite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_SMOOTH_ANDESITE_STAIRS = register(
        "mossy_smooth_andesite_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val MOSSY_SMOOTH_ANDESITE_WALL =
        register("mossy_smooth_andesite_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_SMOOTH_ANDESITE_GATE = register(
        "mossy_smooth_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )

    //Cut
    val CUT_ANDESITE = register("cut_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CUT_ANDESITE_SLAB = register("cut_andesite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CUT_ANDESITE_STAIRS = register(
        "cut_andesite_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.QUARTZ_BLOCK
            )
        )
    )
    val CUT_ANDESITE_WALL = register("cut_andesite_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CUT_ANDESITE_GATE = register(
        "cut_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )

    //Cracked Cut
    val CRACKED_CUT_ANDESITE = register(
        "cracked_cut_andesite", Block(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )
    val CRACKED_CUT_ANDESITE_SLAB = register(
        "cracked_cut_andesite_slab", SlabBlock(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )
    val CRACKED_CUT_ANDESITE_STAIRS = register(
        "cracked_cut_andesite_stairs", BaseConsistencyStairBlock(
            CUT_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_CUT_ANDESITE_WALL = register(
        "cracked_cut_andesite_wall", WallBlock(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )
    val CRACKED_CUT_ANDESITE_GATE = register(
        "cracked_cut_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )

    //Mossy Cut
    val MOSSY_CUT_ANDESITE = register(
        "mossy_cut_andesite", Block(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )
    val MOSSY_CUT_ANDESITE_SLAB = register(
        "mossy_cut_andesite_slab", SlabBlock(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )
    val MOSSY_CUT_ANDESITE_STAIRS = register(
        "mossy_cut_andesite_stairs", BaseConsistencyStairBlock(
            CUT_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val MOSSY_CUT_ANDESITE_WALL = register(
        "mossy_cut_andesite_wall", WallBlock(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )
    val MOSSY_CUT_ANDESITE_GATE = register(
        "mossy_cut_andesite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_ANDESITE
            )
        )
    )

    //Bricks
    val ANDESITE_BRICKS = register("andesite_bricks", Block(FabricBlockSettings.copy(Blocks.ANDESITE)))
    val ANDESITE_BRICK_SLAB = register("andesite_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE)))
    val ANDESITE_BRICK_STAIRS = register(
        "andesite_brick_stairs", BaseConsistencyStairBlock(
            Blocks.ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.ANDESITE
            )
        )
    )
    val ANDESITE_BRICK_WALL = register("andesite_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.ANDESITE)))
    val ANDESITE_BRICK_GATE = register(
        "andesite_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                ANDESITE_BRICKS
            )
        )
    )

    //Cracked Bricks
    val CRACKED_ANDESITE_BRICKS =
        register("cracked_andesite_bricks", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CRACKED_ANDESITE_BRICK_SLAB = register(
        "cracked_andesite_brick_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_ANDESITE_BRICK_STAIRS = register(
        "cracked_andesite_brick_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_ANDESITE_BRICK_WALL = register(
        "cracked_andesite_brick_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val CRACKED_ANDESITE_BRICK_GATE = register(
        "cracked_andesite_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                ANDESITE_BRICKS
            )
        )
    )

    //Mossy Bricks
    val MOSSY_ANDESITE_BRICKS =
        register("mossy_andesite_bricks", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_ANDESITE_BRICK_SLAB =
        register("mossy_andesite_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_ANDESITE_BRICK_STAIRS = register(
        "mossy_andesite_brick_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_ANDESITE.defaultState, FabricBlockSettings.copy(
                Blocks.POLISHED_ANDESITE
            )
        )
    )
    val MOSSY_ANDESITE_BRICK_WALL =
        register("mossy_andesite_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_ANDESITE_BRICK_GATE = register(
        "mossy_andesite_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                ANDESITE_BRICKS
            )
        )
    )

    //Pillars and Chiseled
    val ANDESITE_PILLAR = register("andesite_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CRACKED_ANDESITE_PILLAR =
        register("cracked_andesite_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_ANDESITE_PILLAR =
        register("mossy_andesite_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CHISELED_ANDESITE = register("chiseled_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CRACKED_CHISELED_ANDESITE =
        register("cracked_chiseled_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_CHISELED_ANDESITE =
        register("mossy_chiseled_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))

    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_ANDESITE = register("carved_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val CRACKED_CARVED_ANDESITE =
        register("cracked_carved_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))
    val MOSSY_CARVED_ANDESITE =
        register("mossy_carved_andesite", Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE)))

    //Diorite
    val DIORITE_GATE = register("diorite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.DIORITE)))

    //Polished
    val POLISHED_DIORITE_WALL =
        register("polished_diorite_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)))
    val POLISHED_DIORITE_GATE =
        register("polished_diorite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)))

    //Smooth
    val SMOOTH_DIORITE = register("smooth_diorite", Block(FabricBlockSettings.copy(Blocks.DIORITE)))
    val SMOOTH_DIORITE_SLAB = register("smooth_diorite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE)))
    val SMOOTH_DIORITE_STAIRS = register(
        "smooth_diorite_stairs", BaseConsistencyStairBlock(
            Blocks.DIORITE.defaultState, FabricBlockSettings.copy(
                Blocks.GRANITE
            )
        )
    )
    val SMOOTH_DIORITE_WALL = register("smooth_diorite_wall", WallBlock(FabricBlockSettings.copy(Blocks.DIORITE)))
    val SMOOTH_DIORITE_GATE =
        register("smooth_diorite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE)))

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_DIORITE = register("cut_diorite", Block(FabricBlockSettings.copy(Blocks.DIORITE)))
    val CUT_DIORITE_SLAB = register("cut_diorite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE)))
    val CUT_DIORITE_STAIRS = register(
        "cut_diorite_stairs", BaseConsistencyStairBlock(
            Blocks.DIORITE.defaultState, FabricBlockSettings.copy(
                Blocks.DIORITE
            )
        )
    )
    val CUT_DIORITE_WALL = register("cut_diorite_wall", WallBlock(FabricBlockSettings.copy(Blocks.DIORITE)))
    val CUT_DIORITE_GATE = register(
        "cut_diorite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_DIORITE
            )
        )
    )

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val DIORITE_BRICKS = register("diorite_bricks", Block(FabricBlockSettings.copy(Blocks.DIORITE)))
    val DIORITE_BRICK_SLAB = register("diorite_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE)))
    val DIORITE_BRICK_STAIRS = register(
        "diorite_brick_stairs", BaseConsistencyStairBlock(
            Blocks.DIORITE.defaultState, FabricBlockSettings.copy(
                Blocks.DIORITE
            )
        )
    )
    val DIORITE_BRICK_WALL = register("diorite_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.DIORITE)))
    val DIORITE_BRICK_GATE = register(
        "diorite_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                DIORITE_BRICKS
            )
        )
    )

    //Cracked Bricks
    //cracked_diorite_bricks
    //cracked_diorite_brick_slab
    //cracked_diorite_brick_stairs
    //cracked_diorite_brick_wall
    //gate
    //Mossy Bricks
    //mossy_diorite_bricks
    //mossy_diorite_brick_slab
    //mossy_diorite_brick_stairs
    //mossy_diorite_brick_wall
    //gate
    //Pillars and Chiseled
    val DIORITE_PILLAR = register("diorite_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)))

    //cracked_diorite_pillar
    //mossy_diorite_pillar
    val CHISELED_DIORITE = register("chiseled_diorite", Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)))

    //cracked_chiseled_diorite_bricks
    //mossy_chiseled_diorite_bricks
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_DIORITE = register("carved_diorite", Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE)))

    //cracked carved
    //mossy carved
    //Granite
    val GRANITE_GATE = register("granite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.GRANITE)))

    //Polished
    val POLISHED_GRANITE_WALL =
        register("polished_granite_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))
    val POLISHED_GRANITE_GATE =
        register("polished_granite_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))

    //Smooth
    val SMOOTH_GRANITE = register("smooth_granite", Block(FabricBlockSettings.copy(Blocks.GRANITE)))
    val SMOOTH_GRANITE_SLAB = register("smooth_granite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE)))
    val SMOOTH_GRANITE_STAIRS = register(
        "smooth_granite_stairs", BaseConsistencyStairBlock(
            Blocks.GRANITE.defaultState, FabricBlockSettings.copy(
                Blocks.GRANITE
            )
        )
    )
    val SMOOTH_GRANITE_WALL = register("smooth_granite_wall", WallBlock(FabricBlockSettings.copy(Blocks.GRANITE)))
    val SMOOTH_GRANITE_GATE = register(
        "smooth_granite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_GRANITE
            )
        )
    )

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_GRANITE = register("cut_granite", Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))
    val CUT_GRANITE_SLAB = register("cut_granite_slab", SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))
    val CUT_GRANITE_STAIRS = register(
        "cut_granite_stairs", BaseConsistencyStairBlock(
            Blocks.POLISHED_GRANITE.defaultState, FabricBlockSettings.copy(
                Blocks.QUARTZ_BLOCK
            )
        )
    )
    val CUT_GRANITE_WALL = register("cut_granite_wall", WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))
    val CUT_GRANITE_GATE = register(
        "cut_granite_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_GRANITE
            )
        )
    )

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val GRANITE_BRICKS = register("granite_bricks", Block(FabricBlockSettings.copy(Blocks.GRANITE)))
    val GRANITE_BRICK_SLAB = register("granite_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE)))
    val GRANITE_BRICK_STAIRS = register(
        "granite_brick_stairs", BaseConsistencyStairBlock(
            Blocks.GRANITE.defaultState, FabricBlockSettings.copy(
                Blocks.GRANITE
            )
        )
    )
    val GRANITE_BRICK_WALL = register("granite_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.GRANITE)))
    val GRANITE_BRICK_GATE = register(
        "granite_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                GRANITE_BRICKS
            )
        )
    )

    //Cracked Bricks
    //cracked_granite_bricks
    //cracked_granite_brick_slab
    //cracked_granite_brick_stairs
    //cracked_granite_brick_wall
    //gate
    //Mossy Bricks
    //mossy_granite_bricks
    //mossy_granite_brick_slab
    //mossy_granite_brick_stairs
    //mossy_granite_brick_wall
    //gate
    //Pillars and Chiseled
    val GRANITE_PILLAR = register("granite_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))

    //cracked_granite_pillar
    //mossy_granite_pillar
    val CHISELED_GRANITE = register("chiseled_granite", Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))

    //cracked_chiseled_granite_bricks
    //mossy_chiseled_granite_bricks
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_GRANITE = register("carved_granite", Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE)))

    //cracked carved
    //mossy carved
    //Clay
    val CLAY_SLAB = register("clay_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CLAY)))
    val CLAY_STAIRS = register(
        "clay_stairs", BaseConsistencyStairBlock(
            Blocks.CLAY.defaultState, FabricBlockSettings.copy(
                Blocks.CLAY
            )
        )
    )
    val CLAY_WALL = register("clay_wall", WallBlock(FabricBlockSettings.copy(Blocks.CLAY)))
    val POLISHED_CLAY = register("polished_clay", Block(FabricBlockSettings.copy(Blocks.CLAY)))
    val POLISHED_CLAY_SLAB = register("polished_clay_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CLAY)))
    val POLISHED_CLAY_STAIRS = register(
        "polished_clay_stairs", BaseConsistencyStairBlock(
            Blocks.CLAY.defaultState, FabricBlockSettings.copy(
                Blocks.CLAY
            )
        )
    )
    val POLISHED_CLAY_WALL = register("polished_clay_wall", WallBlock(FabricBlockSettings.copy(Blocks.CLAY)))

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    val CUT_CLAY = register("cut_clay", Block(FabricBlockSettings.copy(Blocks.CLAY)))
    val CUT_CLAY_SLAB = register("cut_clay_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CLAY)))
    val CUT_CLAY_STAIRS = register(
        "cut_clay_stairs", BaseConsistencyStairBlock(
            Blocks.CLAY.defaultState, FabricBlockSettings.copy(
                Blocks.CLAY
            )
        )
    )
    val CUT_CLAY_WALL = register("cut_clay_wall", WallBlock(FabricBlockSettings.copy(Blocks.CLAY)))
    val SMOOTH_CLAY = register("smooth_clay", Block(FabricBlockSettings.copy(Blocks.CLAY)))
    val SMOOTH_CLAY_SLAB = register("smooth_clay_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CLAY)))
    val SMOOTH_CLAY_STAIRS = register(
        "smooth_clay_stairs", BaseConsistencyStairBlock(
            Blocks.CLAY.defaultState, FabricBlockSettings.copy(
                Blocks.CLAY
            )
        )
    )
    val SMOOTH_CLAY_WALL = register("smooth_clay_wall", WallBlock(FabricBlockSettings.copy(Blocks.CLAY)))

    //Bricks
    val BRICK_GATE = register("brick_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BRICKS)))

    //Cracked Bricks
    //cracked_bricks
    //cracked_brick_slab
    //cracked_brick_stairs
    //cracked_brick_wall
    //gate
    //Mossy Bricks
    //mossy_bricks
    //mossy_brick_slab
    //mossy_brick_stairs
    //mossy_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_BRICKS = register("chiseled_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS)))

    //mossy_chiseled_bricks
    //cracked_chiseled_bricks
    val BRICK_PILLAR = register("brick_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.BRICKS)))

    //mossy_brick_pillar
    //cracked_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_BRICKS = register("carved_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS)))

    //cracked carved
    //mossy carved
    //Nether Bricks
    //Cracked Bricks
    val CRACKED_NETHER_BRICK_SLAB =
        register("cracked_nether_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)))
    val CRACKED_NETHER_BRICK_STAIRS = register(
        "cracked_nether_brick_stairs", BaseConsistencyStairBlock(
            Blocks.NETHER_BRICKS.defaultState, FabricBlockSettings.copy(
                Blocks.NETHER_BRICKS
            )
        )
    )
    val CRACKED_NETHER_BRICK_WALL =
        register("cracked_nether_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)))
    val CRACKED_NETHER_BRICK_FENCE_GATE = register(
        "cracked_nether_brick_fence_gate", FenceGateBlock(
            FabricBlockSettings.copy(Blocks.NETHER_BRICKS)
        )
    )

    //Mossy Bricks
    //mossy_nether_bricks
    //mossy_nether_brick_slab
    //mossy_nether_brick_stairs
    //mossy_nether_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_NETHER_BRICKS =
        register("chiseled_nether_bricks", Block(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)))

    //mossy_chiseled_nether_bricks
    //cracked_chiseled_nether_bricks
    val NETHER_BRICK_PILLAR =
        register("nether_brick_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)))

    //mossy_nether_brick_pillar
    //cracked_nether_brick_pillar
    //Red Nether Bricks
    val RED_NETHER_BRICK_FENCE_GATE = register(
        "red_nether_brick_fence_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.RED_NETHER_BRICKS
            )
        )
    )

    //Cracked Bricks
    //cracked_red_nether_bricks
    //cracked_red_nether_brick_slab
    //cracked_red_nether_brick_stairs
    //cracked_red_nether_brick_wall
    //gate
    //Mossy Bricks
    //mossy_red_nether_bricks
    //mossy_red_nether_brick_slab
    //mossy_red_nether_brick_stairs
    //mossy_red_nether_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_RED_NETHER_BRICKS =
        register("chiseled_red_nether_bricks", Block(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)))

    //mossy_chiseled_red_nether_bricks
    //cracked_chiseled_red_nether_bricks
    val RED_NETHER_BRICK_PILLAR =
        register("red_nether_brick_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)))

    //mossy_red_nether_brick_pillar
    //cracked_red_nether_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_RED_NETHER_BRICKS =
        register("carved_red_nether_bricks", Block(FabricBlockSettings.copy(Blocks.RED_NETHER_BRICKS)))

    //cracked carved
    //mossy carved
    //Blue Nether Bricks
    //Bricks
    val BLUE_NETHER_BRICKS = register("blue_nether_bricks", Block(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)))
    val BLUE_NETHER_BRICK_SLAB =
        register("blue_nether_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)))
    val BLUE_NETHER_BRICK_STAIRS = register(
        "blue_nether_brick_stairs", BaseConsistencyStairBlock(
            Blocks.NETHER_BRICKS.defaultState, FabricBlockSettings.copy(
                Blocks.NETHER_BRICKS
            )
        )
    )
    val BLUE_NETHER_BRICK_WALL =
        register("blue_nether_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS)))
    val BLUE_NETHER_BRICK_FENCE_GATE = register(
        "blue_nether_brick_fence_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                BLUE_NETHER_BRICKS
            )
        )
    )

    //Cracked Bricks
    val CRACKED_BLUE_NETHER_BRICKS =
        register("cracked_blue_nether_bricks", Block(FabricBlockSettings.copy(Blocks.CRACKED_NETHER_BRICKS)))
    val CRACKED_BLUE_NETHER_BRICK_SLAB = register(
        "cracked_blue_nether_brick_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.CRACKED_NETHER_BRICKS
            )
        )
    )
    val CRACKED_BLUE_NETHER_BRICK_STAIRS = register(
        "cracked_blue_nether_brick_stairs", BaseConsistencyStairBlock(
            Blocks.CRACKED_NETHER_BRICKS.defaultState, FabricBlockSettings.copy(Blocks.NETHER_BRICKS)
        )
    )
    val CRACKED_BLUE_NETHER_BRICK_WALL = register(
        "cracked_blue_nether_brick_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.CRACKED_NETHER_BRICKS
            )
        )
    )
    val CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = register(
        "cracked_blue_nether_brick_fence_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CRACKED_BLUE_NETHER_BRICKS
            )
        )
    )

    //Mossy Bricks
    //mossy_blue_nether_bricks
    //mossy_blue_nether_brick_slab
    //mossy_blue_nether_brick_stairs
    //mossy_blue_nether_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_BLUE_NETHER_BRICKS = register(
        "chiseled_blue_nether_bricks", Block(
            FabricBlockSettings.copy(
                BLUE_NETHER_BRICKS
            )
        )
    )

    //mossy_chiseled_blue_nether_bricks
    //cracked_chiseled_blue_nether_bricks
    val BLUE_NETHER_BRICK_PILLAR = register(
        "blue_nether_brick_pillar", PillarBlock(
            FabricBlockSettings.copy(
                BLUE_NETHER_BRICKS
            )
        )
    )

    //mossy_blue_nether_brick_pillar
    //cracked_blue_nether_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_BLUE_NETHER_BRICKS = register(
        "carved_blue_nether_bricks", Block(
            FabricBlockSettings.copy(
                BLUE_NETHER_BRICKS
            )
        )
    )

    //cracked carved
    //mossy carved
    //Prismarine
    val PRISMARINE_GATE = register("prismarine_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)))

    //Polished
    val POLISHED_PRISMARINE = register("polished_prismarine", Block(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val POLISHED_PRISMARINE_SLAB =
        register("polished_prismarine_slab", SlabBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val POLISHED_PRISMARINE_STAIRS = register(
        "polished_prismarine_stairs", BaseConsistencyStairBlock(
            POLISHED_PRISMARINE.defaultState, FabricBlockSettings.copy(Blocks.PRISMARINE)
        )
    )
    val POLISHED_PRISMARINE_WALL =
        register("polished_prismarine_wall", WallBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val POLISHED_PRISMARINE_GATE = register(
        "polished_prismarine_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_PRISMARINE
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Smooth
    val SMOOTH_PRISMARINE = register("smooth_prismarine", Block(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val SMOOTH_PRISMARINE_SLAB =
        register("smooth_prismarine_slab", SlabBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val SMOOTH_PRISMARINE_STAIRS = register(
        "smooth_prismarine_stairs", BaseConsistencyStairBlock(
            SMOOTH_PRISMARINE.defaultState, FabricBlockSettings.copy(
                Blocks.PRISMARINE
            )
        )
    )
    val SMOOTH_PRISMARINE_WALL =
        register("smooth_prismarine_wall", WallBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val SMOOTH_PRISMARINE_GATE = register(
        "smooth_prismarine_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_PRISMARINE
            )
        )
    )

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_PRISMARINE = register("cut_prismarine", Block(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val CUT_PRISMARINE_SLAB = register("cut_prismarine_slab", SlabBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val CUT_PRISMARINE_STAIRS = register(
        "cut_prismarine_stairs", BaseConsistencyStairBlock(
            CUT_PRISMARINE.defaultState, FabricBlockSettings.copy(
                Blocks.PRISMARINE
            )
        )
    )
    val CUT_PRISMARINE_WALL = register("cut_prismarine_wall", WallBlock(FabricBlockSettings.copy(Blocks.PRISMARINE)))
    val CUT_PRISMARINE_GATE = register(
        "cut_prismarine_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_PRISMARINE
            )
        )
    )

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val PRISMARINE_BRICK_WALL =
        register("prismarine_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)))
    val PRISMARINE_BRICK_GATE =
        register("prismarine_brick_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)))

    //Cracked Bricks
    //cracked_prismarine_bricks
    //cracked_prismarine_brick_slab
    //cracked_prismarine_brick_stairs
    //cracked_prismarine_brick_wall
    //gate
    //Mossy Bricks
    //mossy_prismarine_bricks
    //mossy_prismarine_brick_slab
    //mossy_prismarine_brick_stairs
    //mossy_prismarine_brick_wall
    //gate
    //Pillar and Chiseled
    val CHISELED_PRISMARINE = register("chiseled_prismarine", Block(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)))

    //mossy_chiseled_prismarine
    //cracked_chiseled_prismarine
    val PRISMARINE_PILLAR =
        register("prismarine_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)))

    //mossy_prismarine_pillar
    //cracked_prismarine_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_PRISMARINE = register("carved_prismarine", Block(FabricBlockSettings.copy(Blocks.PRISMARINE_BRICKS)))

    //cracked carved
    //mossy carved
    //Dark Prismarine
    //Block
    val DARK_PRISMARINE_WALL =
        register("dark_prismarine_wall", WallBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val DARK_PRISMARINE_GATE =
        register("dark_prismarine_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))

    //Polished
    val POLISHED_DARK_PRISMARINE =
        register("polished_dark_prismarine", Block(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val POLISHED_DARK_PRISMARINE_SLAB = register(
        "polished_dark_prismarine_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.DARK_PRISMARINE
            )
        )
    )
    val POLISHED_DARK_PRISMARINE_STAIRS = register(
        "polished_dark_prismarine_stairs", BaseConsistencyStairBlock(
            Blocks.DARK_PRISMARINE.defaultState, FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)
        )
    )
    val POLISHED_DARK_PRISMARINE_WALL = register(
        "polished_dark_prismarine_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.DARK_PRISMARINE
            )
        )
    )
    val POLISHED_DARK_PRISMARINE_GATE = register(
        "polished_dark_prismarine_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_DARK_PRISMARINE
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Smooth
    val SMOOTH_DARK_PRISMARINE =
        register("smooth_dark_prismarine", Block(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val SMOOTH_DARK_PRISMARINE_SLAB = register(
        "smooth_dark_prismarine_slab", SlabBlock(
            FabricBlockSettings.copy(
                Blocks.DARK_PRISMARINE
            )
        )
    )
    val SMOOTH_DARK_PRISMARINE_STAIRS = register(
        "smooth_dark_prismarine_stairs", BaseConsistencyStairBlock(
            SMOOTH_DARK_PRISMARINE.defaultState, FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)
        )
    )
    val SMOOTH_DARK_PRISMARINE_WALL = register(
        "smooth_dark_prismarine_wall", WallBlock(
            FabricBlockSettings.copy(
                Blocks.DARK_PRISMARINE
            )
        )
    )
    val SMOOTH_DARK_PRISMARINE_GATE = register(
        "smooth_dark_prismarine_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_DARK_PRISMARINE
            )
        )
    )

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_DARK_PRISMARINE = register("cut_dark_prismarine", Block(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val CUT_DARK_PRISMARINE_SLAB =
        register("cut_dark_prismarine_slab", SlabBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val CUT_DARK_PRISMARINE_STAIRS = register(
        "cut_dark_prismarine_stairs", BaseConsistencyStairBlock(
            Blocks.DARK_PRISMARINE.defaultState, FabricBlockSettings.copy(
                Blocks.DARK_PRISMARINE
            )
        )
    )
    val CUT_DARK_PRISMARINE_WALL =
        register("cut_dark_prismarine_wall", WallBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val CUT_DARK_PRISMARINE_GATE = register(
        "cut_dark_prismarine_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_DARK_PRISMARINE
            )
        )
    )

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val DARK_PRISMARINE_BRICKS =
        register("dark_prismarine_bricks", Block(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val DARK_PRISMARINE_BRICK_SLAB =
        register("dark_prismarine_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val DARK_PRISMARINE_BRICK_STAIRS = register(
        "dark_prismarine_brick_stairs", BaseConsistencyStairBlock(
            Blocks.DARK_PRISMARINE.defaultState, FabricBlockSettings.copy(
                Blocks.DARK_PRISMARINE
            )
        )
    )
    val DARK_PRISMARINE_BRICK_WALL =
        register("dark_prismarine_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))
    val DARK_PRISMARINE_BRICK_GATE = register(
        "dark_prismarine_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                DARK_PRISMARINE_BRICKS
            )
        )
    )

    //Cracked Bricks
    //cracked_dark_prismarine_bricks
    //cracked_dark_prismarine_brick_slab
    //cracked_dark_prismarine_brick_stairs
    //cracked_dark_prismarine_brick_wall
    //gate
    //Mossy Bricks
    //mossy_dark_prismarine_bricks
    //mossy_dark_prismarine_brick_slab
    //mossy_dark_prismarine_brick_stairs
    //mossy_dark_prismarine_brick_wall
    //gate
    //Pillar and Chiseled
    val CHISELED_DARK_PRISMARINE =
        register("chiseled_dark_prismarine", Block(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))

    //mossy_chiseled_dark_prismarine
    //cracked_chiseled_dark_prismarine
    val DARK_PRISMARINE_PILLAR =
        register("dark_prismarine_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))

    //mossy_dark_prismarine_pillar
    //cracked_dark_prismarine_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_DARK_PRISMARINE =
        register("carved_dark_prismarine", Block(FabricBlockSettings.copy(Blocks.DARK_PRISMARINE)))

    //cracked carved
    //mossy carved
    //Purpur
    //Block
    val PURPUR_BLOCK = register("purpur_block", Block(FabricBlockSettings.copy(Blocks.PURPUR_PILLAR)))
    val PURPUR_SLAB = register(
        "purpur_slab", SlabBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val PURPUR_STAIRS = register(
        "purpur_stairs", BaseConsistencyStairBlock(
            PURPUR_BLOCK.defaultState, FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val PURPUR_WALL = register(
        "purpur_wall", WallBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val PURPUR_GATE = register(
        "purpur_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )

    //Smooth
    val SMOOTH_PURPUR_BLOCK = register(
        "smooth_purpur_block", Block(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val SMOOTH_PURPUR_SLAB = register(
        "smooth_purpur_slab", SlabBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val SMOOTH_PURPUR_STAIRS = register(
        "smooth_purpur_stairs", BaseConsistencyStairBlock(
            PURPUR_BLOCK.defaultState, FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val SMOOTH_PURPUR_WALL = register(
        "smooth_purpur_wall", WallBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val SMOOTH_PURPUR_GATE = register(
        "smooth_purpur_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_PURPUR_BLOCK
            )
        )
    )

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Polished
    val POLISHED_PURPUR_BLOCK = register(
        "polished_purpur_block", Block(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val POLISHED_PURPUR_SLAB = register(
        "polished_purpur_slab", SlabBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val POLISHED_PURPUR_STAIRS = register(
        "polished_purpur_stairs", BaseConsistencyStairBlock(
            PURPUR_BLOCK.defaultState, FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val POLISHED_PURPUR_WALL = register(
        "polished_purpur_wall", WallBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val POLISHED_PURPUR_GATE = register(
        "polished_purpur_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_PURPUR_BLOCK
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_PURPUR_WALL = register("cut_purpur_wall", WallBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)))
    val CUT_PURPUR_GATE = register("cut_purpur_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.PURPUR_BLOCK)))

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Bricks
    val PURPUR_BRICKS = register("purpur_bricks", Block(FabricBlockSettings.copy(Blocks.PURPUR_PILLAR)))
    val PURPUR_BRICK_SLAB = register(
        "purpur_brick_slab", SlabBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val PURPUR_BRICK_STAIRS = register(
        "purpur_brick_stairs", BaseConsistencyStairBlock(
            PURPUR_BLOCK.defaultState, FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val PURPUR_BRICK_WALL = register(
        "purpur_brick_wall", WallBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val PURPUR_BRICK_GATE = register(
        "purpur_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                PURPUR_BRICKS
            )
        )
    )

    //Cracked Bricks
    val CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", Block(FabricBlockSettings.copy(Blocks.PURPUR_PILLAR)))
    val CRACKED_PURPUR_BRICK_SLAB = register(
        "cracked_purpur_brick_slab", SlabBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val CRACKED_PURPUR_BRICK_STAIRS = register(
        "cracked_purpur_brick_stairs", BaseConsistencyStairBlock(
            PURPUR_BLOCK.defaultState, FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )
    val CRACKED_PURPUR_BRICK_WALL = register(
        "cracked_purpur_brick_wall", WallBlock(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )

    //gate
    //Mossy Bricks
    //mossy_purpur_bricks
    //mossy_purpur_brick_slab
    //mossy_purpur_brick_stairs
    //mossy_purpur_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_PURPUR_BLOCK = register(
        "chiseled_purpur_block", Block(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )

    //mossy_chiseled_purpur
    //cracked_chiseled_purpur
    //mossy_purpur_pillar
    //cracked_purpur_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_PURPUR = register(
        "carved_purpur", Block(
            FabricBlockSettings.copy(
                PURPUR_BLOCK
            )
        )
    )

    //cracked carved
    //mossy carved
    //End Stone
    val END_STONE_BRICK_GATE =
        register("end_stone_brick_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.END_STONE_BRICKS)))

    //Block
    val END_STONE_SLAB = register("end_stone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val END_STONE_STAIRS = register(
        "end_stone_stairs", BaseConsistencyStairBlock(
            Blocks.END_STONE.defaultState, FabricBlockSettings.copy(
                Blocks.END_STONE
            )
        )
    )
    val END_STONE_WALL = register("end_stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val END_STONE_GATE = register("end_stone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.END_STONE)))

    //Smooth
    val SMOOTH_END_STONE = register("smooth_end_stone", Block(FabricBlockSettings.copy(Blocks.END_STONE)))
    val SMOOTH_END_STONE_SLAB = register("smooth_end_stone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val SMOOTH_END_STONE_STAIRS = register(
        "smooth_end_stone_stairs", BaseConsistencyStairBlock(
            Blocks.END_STONE.defaultState, FabricBlockSettings.copy(
                Blocks.END_STONE
            )
        )
    )
    val SMOOTH_END_STONE_WALL = register("smooth_end_stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val SMOOTH_END_STONE_GATE = register(
        "smooth_end_stone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_END_STONE
            )
        )
    )

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate
    //Polished
    val POLISHED_END_STONE = register("polished_end_stone", Block(FabricBlockSettings.copy(Blocks.END_STONE)))
    val POLISHED_END_STONE_SLAB =
        register("polished_end_stone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val POLISHED_END_STONE_STAIRS = register(
        "polished_end_stone_stairs", BaseConsistencyStairBlock(
            Blocks.END_STONE.defaultState, FabricBlockSettings.copy(
                Blocks.END_STONE
            )
        )
    )
    val POLISHED_END_STONE_WALL =
        register("polished_end_stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val POLISHED_END_STONE_GATE = register(
        "polished_end_stone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_END_STONE
            )
        )
    )

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cut
    val CUT_END_STONE = register("cut_end_stone", Block(FabricBlockSettings.copy(Blocks.END_STONE)))
    val CUT_END_STONE_SLAB = register("cut_end_stone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val CUT_END_STONE_STAIRS = register(
        "cut_end_stone_stairs", BaseConsistencyStairBlock(
            Blocks.END_STONE.defaultState, FabricBlockSettings.copy(
                Blocks.END_STONE
            )
        )
    )
    val CUT_END_STONE_WALL = register("cut_end_stone_wall", WallBlock(FabricBlockSettings.copy(Blocks.END_STONE)))
    val CUT_END_STONE_GATE = register(
        "cut_end_stone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_END_STONE
            )
        )
    )

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate
    //Cracked Bricks
    //cracked_end_stone_bricks
    //cracked_end_stone_brick_slab
    //cracked_end_stone_brick_stairs
    //cracked_end_stone_brick_wall
    //gate
    //Mossy Bricks
    //mossy_end_stone_bricks
    //mossy_end_stone_brick_slab
    //mossy_end_stone_brick_stairs
    //mossy_end_stone_brick_wall
    //gate
    //Pillars and Chiseled
    val CHISELED_END_STONE = register("chiseled_end_stone", Block(FabricBlockSettings.copy(Blocks.END_STONE)))

    //mossy_chiseled_end_stone_bricks
    //cracked_chiseled_end_stone_bricks
    val END_STONE_BRICK_PILLAR =
        register("end_stone_brick_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.END_STONE_BRICKS)))

    //mossy_end_stone_brick_pillar
    //cracked_end_stone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_END_STONE = register("carved_end_stone", Block(FabricBlockSettings.copy(Blocks.END_STONE_BRICKS)))

    //cracked carved
    //mossy carved
    //Soul Sandstone
    // Block
    val SOUL_SANDSTONE =
        register("soul_sandstone", Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).strength(0.8f)))
    val SOUL_SANDSTONE_SLAB = register(
        "soul_sandstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val SOUL_SANDSTONE_STAIRS = register(
        "soul_sandstone_stairs", BaseConsistencyStairBlock(
            SOUL_SANDSTONE.defaultState, FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val SOUL_SANDSTONE_WALL = register(
        "soul_sandstone_wall", WallBlock(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val SOUL_SANDSTONE_GATE = register(
        "soul_sandstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val SOUL_SANDSTONE_PILLAR = register(
        "soul_sandstone_pillar", PillarBlock(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )

    // Smooth
    val SMOOTH_SOUL_SANDSTONE = register(
        "smooth_soul_sandstone", Block(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val SMOOTH_SOUL_SANDSTONE_SLAB = register(
        "smooth_soul_sandstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                SMOOTH_SOUL_SANDSTONE
            )
        )
    )
    val SMOOTH_SOUL_SANDSTONE_STAIRS = register(
        "smooth_soul_sandstone_stairs", BaseConsistencyStairBlock(
            SMOOTH_SOUL_SANDSTONE.defaultState, FabricBlockSettings.copy(
                SMOOTH_SOUL_SANDSTONE
            )
        )
    )
    val SMOOTH_SOUL_SANDSTONE_WALL = register(
        "smooth_soul_sandstone_wall", WallBlock(
            FabricBlockSettings.copy(
                SMOOTH_SOUL_SANDSTONE
            )
        )
    )
    val SMOOTH_SOUL_SANDSTONE_GATE = register(
        "smooth_soul_sandstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SMOOTH_SOUL_SANDSTONE
            )
        )
    )

    // Polished
    val POLISHED_SOUL_SANDSTONE = register(
        "polished_soul_sandstone", Block(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val POLISHED_SOUL_SANDSTONE_SLAB = register(
        "polished_soul_sandstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                POLISHED_SOUL_SANDSTONE
            )
        )
    )
    val POLISHED_SOUL_SANDSTONE_STAIRS = register(
        "polished_soul_sandstone_stairs", BaseConsistencyStairBlock(
            POLISHED_SOUL_SANDSTONE.defaultState, FabricBlockSettings.copy(
                POLISHED_SOUL_SANDSTONE
            )
        )
    )
    val POLISHED_SOUL_SANDSTONE_WALL = register(
        "polished_soul_sandstone_wall", WallBlock(
            FabricBlockSettings.copy(
                POLISHED_SOUL_SANDSTONE
            )
        )
    )
    val POLISHED_SOUL_SANDSTONE_GATE = register(
        "polished_soul_sandstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                POLISHED_SOUL_SANDSTONE
            )
        )
    )

    // Bricks
    val SOUL_SANDSTONE_BRICKS = register(
        "soul_sandstone_bricks", Block(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val SOUL_SANDSTONE_BRICK_SLAB = register(
        "soul_sandstone_brick_slab", SlabBlock(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE_BRICKS
            )
        )
    )
    val SOUL_SANDSTONE_BRICK_STAIRS = register(
        "soul_sandstone_brick_stairs", BaseConsistencyStairBlock(
            SOUL_SANDSTONE_BRICKS.defaultState, FabricBlockSettings.copy(
                SOUL_SANDSTONE_BRICKS
            )
        )
    )
    val SOUL_SANDSTONE_BRICK_WALL = register(
        "soul_sandstone_brick_wall", WallBlock(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE_BRICKS
            )
        )
    )
    val SOUL_SANDSTONE_BRICK_GATE = register(
        "soul_sandstone_brick_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE_BRICKS
            )
        )
    )

    // Cut
    val CUT_SOUL_SANDSTONE = register(
        "cut_soul_sandstone", Block(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val CUT_SOUL_SANDSTONE_SLAB = register(
        "cut_soul_sandstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                CUT_SOUL_SANDSTONE
            )
        )
    )
    val CUT_SOUL_SANDSTONE_STAIRS = register(
        "cut_soul_sandstone_stairs", BaseConsistencyStairBlock(
            CUT_SOUL_SANDSTONE.defaultState, FabricBlockSettings.copy(
                CUT_SOUL_SANDSTONE
            )
        )
    )
    val CUT_SOUL_SANDSTONE_WALL = register(
        "cut_soul_sandstone_wall", WallBlock(
            FabricBlockSettings.copy(
                CUT_SOUL_SANDSTONE
            )
        )
    )
    val CUT_SOUL_SANDSTONE_GATE = register(
        "cut_soul_sandstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CUT_SOUL_SANDSTONE
            )
        )
    )
    val CARVED_SOUL_SANDSTONE = register(
        "carved_soul_sandstone", Block(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )
    val CHISELED_SOUL_SANDSTONE = register(
        "chiseled_soul_sandstone", Block(
            FabricBlockSettings.copy(
                SOUL_SANDSTONE
            )
        )
    )

    // Terracotta
    // Terracotta Slab
    val RED_TERRACOTTA_SLAB =
        register("red_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)))
    val ORANGE_TERRACOTTA_SLAB =
        register("orange_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)))
    val YELLOW_TERRACOTTA_SLAB =
        register("yellow_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)))
    val LIME_TERRACOTTA_SLAB =
        register("lime_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)))
    val GREEN_TERRACOTTA_SLAB =
        register("green_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)))
    val BLUE_TERRACOTTA_SLAB =
        register("blue_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)))
    val CYAN_TERRACOTTA_SLAB =
        register("cyan_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)))
    val LIGHT_BLUE_TERRACOTTA_SLAB =
        register("light_blue_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)))
    val PURPLE_TERRACOTTA_SLAB =
        register("purple_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)))
    val MAGENTA_TERRACOTTA_SLAB =
        register("magenta_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)))
    val PINK_TERRACOTTA_SLAB =
        register("pink_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)))
    val WHITE_TERRACOTTA_SLAB =
        register("white_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)))
    val LIGHT_GRAY_TERRACOTTA_SLAB =
        register("light_gray_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)))
    val GRAY_TERRACOTTA_SLAB =
        register("gray_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)))
    val BLACK_TERRACOTTA_SLAB =
        register("black_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)))
    val BROWN_TERRACOTTA_SLAB =
        register("brown_terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)))
    val TERRACOTTA_SLAB = register("terracotta_slab", SlabBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)))

    // Terracotta Stairs
    val RED_TERRACOTTA_STAIRS = register(
        "red_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val ORANGE_TERRACOTTA_STAIRS = register(
        "orange_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val YELLOW_TERRACOTTA_STAIRS = register(
        "yellow_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val LIME_TERRACOTTA_STAIRS = register(
        "lime_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val GREEN_TERRACOTTA_STAIRS = register(
        "green_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val BLUE_TERRACOTTA_STAIRS = register(
        "blue_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val CYAN_TERRACOTTA_STAIRS = register(
        "cyan_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val LIGHT_BLUE_TERRACOTTA_STAIRS = register(
        "light_blue_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val PURPLE_TERRACOTTA_STAIRS = register(
        "purple_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val MAGENTA_TERRACOTTA_STAIRS = register(
        "magenta_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val PINK_TERRACOTTA_STAIRS = register(
        "pink_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val WHITE_TERRACOTTA_STAIRS = register(
        "white_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val LIGHT_GRAY_TERRACOTTA_STAIRS = register(
        "light_gray_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val GRAY_TERRACOTTA_STAIRS = register(
        "gray_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val BLACK_TERRACOTTA_STAIRS = register(
        "black_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val BROWN_TERRACOTTA_STAIRS = register(
        "brown_terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )
    val TERRACOTTA_STAIRS = register(
        "terracotta_stairs", BaseConsistencyStairBlock(
            Blocks.TERRACOTTA.defaultState, FabricBlockSettings.copy(
                Blocks.TERRACOTTA
            )
        )
    )

    // Terracotta Wall
    val RED_TERRACOTTA_WALL =
        register("red_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)))
    val ORANGE_TERRACOTTA_WALL =
        register("orange_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)))
    val YELLOW_TERRACOTTA_WALL =
        register("yellow_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)))
    val LIME_TERRACOTTA_WALL =
        register("lime_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)))
    val GREEN_TERRACOTTA_WALL =
        register("green_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)))
    val BLUE_TERRACOTTA_WALL =
        register("blue_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)))
    val CYAN_TERRACOTTA_WALL =
        register("cyan_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)))
    val LIGHT_BLUE_TERRACOTTA_WALL =
        register("light_blue_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)))
    val PURPLE_TERRACOTTA_WALL =
        register("purple_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)))
    val MAGENTA_TERRACOTTA_WALL =
        register("magenta_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)))
    val PINK_TERRACOTTA_WALL =
        register("pink_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)))
    val WHITE_TERRACOTTA_WALL =
        register("white_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)))
    val LIGHT_GRAY_TERRACOTTA_WALL =
        register("light_gray_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)))
    val GRAY_TERRACOTTA_WALL =
        register("gray_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)))
    val BLACK_TERRACOTTA_WALL =
        register("black_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)))
    val BROWN_TERRACOTTA_WALL =
        register("brown_terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)))
    val TERRACOTTA_WALL = register("terracotta_wall", WallBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)))

    // Terracotta
    val RED_TERRACOTTA_GATE =
        register("red_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.RED_TERRACOTTA)))
    val ORANGE_TERRACOTTA_GATE =
        register("orange_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.ORANGE_TERRACOTTA)))
    val YELLOW_TERRACOTTA_GATE =
        register("yellow_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.YELLOW_TERRACOTTA)))
    val LIME_TERRACOTTA_GATE =
        register("lime_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.LIME_TERRACOTTA)))
    val GREEN_TERRACOTTA_GATE =
        register("green_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.GREEN_TERRACOTTA)))
    val BLUE_TERRACOTTA_GATE =
        register("blue_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BLUE_TERRACOTTA)))
    val CYAN_TERRACOTTA_GATE =
        register("cyan_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.CYAN_TERRACOTTA)))
    val LIGHT_BLUE_TERRACOTTA_GATE = register(
        "light_blue_terracotta_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.LIGHT_BLUE_TERRACOTTA
            )
        )
    )
    val PURPLE_TERRACOTTA_GATE =
        register("purple_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.PURPLE_TERRACOTTA)))
    val MAGENTA_TERRACOTTA_GATE =
        register("magenta_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.MAGENTA_TERRACOTTA)))
    val PINK_TERRACOTTA_GATE =
        register("pink_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.PINK_TERRACOTTA)))
    val WHITE_TERRACOTTA_GATE =
        register("white_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.WHITE_TERRACOTTA)))
    val LIGHT_GRAY_TERRACOTTA_GATE = register(
        "light_gray_terracotta_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.LIGHT_GRAY_TERRACOTTA
            )
        )
    )
    val GRAY_TERRACOTTA_GATE =
        register("gray_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.GRAY_TERRACOTTA)))
    val BLACK_TERRACOTTA_GATE =
        register("black_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BLACK_TERRACOTTA)))
    val BROWN_TERRACOTTA_GATE =
        register("brown_terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BROWN_TERRACOTTA)))
    val TERRACOTTA_GATE = register("terracotta_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.TERRACOTTA)))

    // Concrete
    // Concrete Slab
    val RED_CONCRETE_SLAB = register("red_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE)))
    val ORANGE_CONCRETE_SLAB =
        register("orange_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)))
    val YELLOW_CONCRETE_SLAB =
        register("yellow_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)))
    val LIME_CONCRETE_SLAB = register("lime_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE)))
    val GREEN_CONCRETE_SLAB =
        register("green_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)))
    val BLUE_CONCRETE_SLAB = register("blue_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)))
    val CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)))
    val LIGHT_BLUE_CONCRETE_SLAB =
        register("light_blue_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)))
    val PURPLE_CONCRETE_SLAB =
        register("purple_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)))
    val MAGENTA_CONCRETE_SLAB =
        register("magenta_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)))
    val PINK_CONCRETE_SLAB = register("pink_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE)))
    val WHITE_CONCRETE_SLAB =
        register("white_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val LIGHT_GRAY_CONCRETE_SLAB =
        register("light_gray_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE)))
    val GRAY_CONCRETE_SLAB = register("gray_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)))
    val BLACK_CONCRETE_SLAB =
        register("black_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)))
    val BROWN_CONCRETE_SLAB =
        register("brown_concrete_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)))

    // Concrete Stairs
    val RED_CONCRETE_STAIRS = register(
        "red_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.RED_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.RED_CONCRETE
            )
        )
    )
    val ORANGE_CONCRETE_STAIRS = register(
        "orange_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.ORANGE_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.ORANGE_CONCRETE
            )
        )
    )
    val YELLOW_CONCRETE_STAIRS = register(
        "yellow_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.YELLOW_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.YELLOW_CONCRETE
            )
        )
    )
    val LIME_CONCRETE_STAIRS = register(
        "lime_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.LIME_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.LIME_CONCRETE
            )
        )
    )
    val GREEN_CONCRETE_STAIRS = register(
        "green_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.GREEN_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.GREEN_CONCRETE
            )
        )
    )
    val BLUE_CONCRETE_STAIRS = register(
        "blue_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.BLUE_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.BLUE_CONCRETE
            )
        )
    )
    val CYAN_CONCRETE_STAIRS = register(
        "cyan_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.CYAN_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.CYAN_CONCRETE
            )
        )
    )
    val LIGHT_BLUE_CONCRETE_STAIRS = register(
        "light_blue_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.LIGHT_BLUE_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.LIGHT_BLUE_CONCRETE
            )
        )
    )
    val PURPLE_CONCRETE_STAIRS = register(
        "purple_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.PURPLE_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.PURPLE_CONCRETE
            )
        )
    )
    val MAGENTA_CONCRETE_STAIRS = register(
        "magenta_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.MAGENTA_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.MAGENTA_CONCRETE
            )
        )
    )
    val PINK_CONCRETE_STAIRS = register(
        "pink_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.PINK_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.PINK_CONCRETE
            )
        )
    )
    val WHITE_CONCRETE_STAIRS = register(
        "white_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.WHITE_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.WHITE_CONCRETE
            )
        )
    )
    val LIGHT_GRAY_CONCRETE_STAIRS = register(
        "light_gray_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.LIGHT_GRAY_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.LIGHT_GRAY_CONCRETE
            )
        )
    )
    val GRAY_CONCRETE_STAIRS = register(
        "gray_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.GRAY_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.GRAY_CONCRETE
            )
        )
    )
    val BLACK_CONCRETE_STAIRS = register(
        "black_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.BLACK_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.BLACK_CONCRETE
            )
        )
    )
    val BROWN_CONCRETE_STAIRS = register(
        "brown_concrete_stairs", BaseConsistencyStairBlock(
            Blocks.BROWN_CONCRETE.defaultState, FabricBlockSettings.copy(
                Blocks.BROWN_CONCRETE
            )
        )
    )

    // Concrete Wall
    val RED_CONCRETE_WALL = register("red_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE)))
    val ORANGE_CONCRETE_WALL =
        register("orange_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)))
    val YELLOW_CONCRETE_WALL =
        register("yellow_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)))
    val LIME_CONCRETE_WALL = register("lime_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE)))
    val GREEN_CONCRETE_WALL =
        register("green_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)))
    val BLUE_CONCRETE_WALL = register("blue_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)))
    val CYAN_CONCRETE_WALL = register("cyan_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)))
    val LIGHT_BLUE_CONCRETE_WALL =
        register("light_blue_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_CONCRETE)))
    val PURPLE_CONCRETE_WALL =
        register("purple_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)))
    val MAGENTA_CONCRETE_WALL =
        register("magenta_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)))
    val PINK_CONCRETE_WALL = register("pink_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE)))
    val WHITE_CONCRETE_WALL =
        register("white_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val LIGHT_GRAY_CONCRETE_WALL =
        register("light_gray_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_CONCRETE)))
    val GRAY_CONCRETE_WALL = register("gray_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)))
    val BLACK_CONCRETE_WALL =
        register("black_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)))
    val BROWN_CONCRETE_WALL =
        register("brown_concrete_wall", WallBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)))

    // Concrete Gate
    val RED_CONCRETE_GATE = register("red_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.RED_CONCRETE)))
    val ORANGE_CONCRETE_GATE =
        register("orange_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.ORANGE_CONCRETE)))
    val YELLOW_CONCRETE_GATE =
        register("yellow_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.YELLOW_CONCRETE)))
    val LIME_CONCRETE_GATE =
        register("lime_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.LIME_CONCRETE)))
    val GREEN_CONCRETE_GATE =
        register("green_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.GREEN_CONCRETE)))
    val BLUE_CONCRETE_GATE =
        register("blue_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)))
    val CYAN_CONCRETE_GATE =
        register("cyan_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.CYAN_CONCRETE)))
    val LIGHT_BLUE_CONCRETE_GATE = register(
        "light_blue_concrete_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.LIGHT_BLUE_CONCRETE
            )
        )
    )
    val PURPLE_CONCRETE_GATE =
        register("purple_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.PURPLE_CONCRETE)))
    val MAGENTA_CONCRETE_GATE =
        register("magenta_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.MAGENTA_CONCRETE)))
    val PINK_CONCRETE_GATE =
        register("pink_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.PINK_CONCRETE)))
    val WHITE_CONCRETE_GATE =
        register("white_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val LIGHT_GRAY_CONCRETE_GATE = register(
        "light_gray_concrete_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                Blocks.LIGHT_GRAY_CONCRETE
            )
        )
    )
    val GRAY_CONCRETE_GATE =
        register("gray_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.GRAY_CONCRETE)))
    val BLACK_CONCRETE_GATE =
        register("black_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE)))
    val BROWN_CONCRETE_GATE =
        register("brown_concrete_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BROWN_CONCRETE)))

    // Ice
    val RED_ICE = register(
        "red_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.RED).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val ORANGE_ICE = register(
        "orange_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.ORANGE).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val YELLOW_ICE = register(
        "yellow_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.YELLOW).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val LIME_ICE = register(
        "lime_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIME).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val GREEN_ICE = register(
        "green_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.GREEN).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val CYAN_ICE = register(
        "cyan_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.CYAN).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val LIGHT_BLUE_ICE = register(
        "light_blue_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIGHT_BLUE).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val PURPLE_ICE = register(
        "purple_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.PURPLE).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val MAGENTA_ICE = register(
        "magenta_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.MAGENTA).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val PINK_ICE = register(
        "pink_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.PINK).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val WHITE_ICE = register(
        "white_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.WHITE).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val LIGHT_GRAY_ICE = register(
        "light_gray_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIGHT_GRAY).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val GRAY_ICE = register(
        "gray_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.GRAY).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val BLACK_ICE = register(
        "black_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.BLACK).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val BROWN_ICE = register(
        "brown_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.BROWN).strength(2.0f).slipperiness(0.980f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )
    val SOUL_ICE = register(
        "soul_ice",
        Block(
            FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIGHT_BLUE).strength(3.0f).slipperiness(1.1f)
                .sounds(BlockSoundGroup.GLASS)
        )
    )

    // Ice Slab
    val RED_ICE_SLAB = register(
        "red_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                RED_ICE
            )
        )
    )
    val ORANGE_ICE_SLAB = register(
        "orange_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                ORANGE_ICE
            )
        )
    )
    val YELLOW_ICE_SLAB = register(
        "yellow_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                YELLOW_ICE
            )
        )
    )
    val LIME_ICE_SLAB = register(
        "lime_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                LIME_ICE
            )
        )
    )
    val GREEN_ICE_SLAB = register(
        "green_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                GREEN_ICE
            )
        )
    )
    val BLUE_ICE_SLAB = register("blue_ice_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE)))
    val CYAN_ICE_SLAB = register(
        "cyan_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                CYAN_ICE
            )
        )
    )
    val LIGHT_BLUE_ICE_SLAB = register(
        "light_blue_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                LIGHT_BLUE_ICE
            )
        )
    )
    val PURPLE_ICE_SLAB = register(
        "purple_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                PURPLE_ICE
            )
        )
    )
    val MAGENTA_ICE_SLAB = register(
        "magenta_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                MAGENTA_ICE
            )
        )
    )
    val PINK_ICE_SLAB = register(
        "pink_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                PINK_ICE
            )
        )
    )
    val WHITE_ICE_SLAB = register(
        "white_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                WHITE_ICE
            )
        )
    )
    val LIGHT_GRAY_ICE_SLAB = register(
        "light_gray_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                LIGHT_GRAY_ICE
            )
        )
    )
    val GRAY_ICE_SLAB = register(
        "gray_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                GRAY_ICE
            )
        )
    )
    val BLACK_ICE_SLAB = register(
        "black_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                BLACK_ICE
            )
        )
    )
    val BROWN_ICE_SLAB = register(
        "brown_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                BROWN_ICE
            )
        )
    )
    val SOUL_ICE_SLAB = register(
        "soul_ice_slab", SlabBlock(
            FabricBlockSettings.copy(
                SOUL_ICE
            )
        )
    )

    // Ice Stairs
    val RED_ICE_STAIRS = register(
        "red_ice_stairs", BaseConsistencyStairBlock(
            RED_ICE.defaultState, FabricBlockSettings.copy(
                RED_ICE
            )
        )
    )
    val ORANGE_ICE_STAIRS = register(
        "orange_ice_stairs", BaseConsistencyStairBlock(
            ORANGE_ICE.defaultState, FabricBlockSettings.copy(
                ORANGE_ICE
            )
        )
    )
    val YELLOW_ICE_STAIRS = register(
        "yellow_ice_stairs", BaseConsistencyStairBlock(
            YELLOW_ICE.defaultState, FabricBlockSettings.copy(
                YELLOW_ICE
            )
        )
    )
    val LIME_ICE_STAIRS = register(
        "lime_ice_stairs", BaseConsistencyStairBlock(
            LIME_ICE.defaultState, FabricBlockSettings.copy(
                LIME_ICE
            )
        )
    )
    val GREEN_ICE_STAIRS = register(
        "green_ice_stairs", BaseConsistencyStairBlock(
            GREEN_ICE.defaultState, FabricBlockSettings.copy(
                GREEN_ICE
            )
        )
    )
    val BLUE_ICE_STAIRS = register(
        "blue_ice_stairs", BaseConsistencyStairBlock(
            Blocks.BLUE_ICE.defaultState, FabricBlockSettings.copy(
                Blocks.BLUE_ICE
            )
        )
    )
    val CYAN_ICE_STAIRS = register(
        "cyan_ice_stairs", BaseConsistencyStairBlock(
            CYAN_ICE.defaultState, FabricBlockSettings.copy(
                CYAN_ICE
            )
        )
    )
    val LIGHT_BLUE_ICE_STAIRS = register(
        "light_blue_ice_stairs", BaseConsistencyStairBlock(
            LIGHT_BLUE_ICE.defaultState, FabricBlockSettings.copy(
                LIGHT_BLUE_ICE
            )
        )
    )
    val PURPLE_ICE_STAIRS = register(
        "purple_ice_stairs", BaseConsistencyStairBlock(
            PURPLE_ICE.defaultState, FabricBlockSettings.copy(
                PURPLE_ICE
            )
        )
    )
    val MAGENTA_ICE_STAIRS = register(
        "magenta_ice_stairs", BaseConsistencyStairBlock(
            MAGENTA_ICE.defaultState, FabricBlockSettings.copy(
                MAGENTA_ICE
            )
        )
    )
    val PINK_ICE_STAIRS = register(
        "pink_ice_stairs", BaseConsistencyStairBlock(
            PINK_ICE.defaultState, FabricBlockSettings.copy(
                PINK_ICE
            )
        )
    )
    val WHITE_ICE_STAIRS = register(
        "white_ice_stairs", BaseConsistencyStairBlock(
            WHITE_ICE.defaultState, FabricBlockSettings.copy(
                WHITE_ICE
            )
        )
    )
    val LIGHT_GRAY_ICE_STAIRS = register(
        "light_gray_ice_stairs", BaseConsistencyStairBlock(
            LIGHT_GRAY_ICE.defaultState, FabricBlockSettings.copy(
                LIGHT_GRAY_ICE
            )
        )
    )
    val GRAY_ICE_STAIRS = register(
        "gray_ice_stairs", BaseConsistencyStairBlock(
            GRAY_ICE.defaultState, FabricBlockSettings.copy(
                GRAY_ICE
            )
        )
    )
    val BLACK_ICE_STAIRS = register(
        "black_ice_stairs", BaseConsistencyStairBlock(
            BLACK_ICE.defaultState, FabricBlockSettings.copy(
                BLACK_ICE
            )
        )
    )
    val BROWN_ICE_STAIRS = register(
        "brown_ice_stairs", BaseConsistencyStairBlock(
            BROWN_ICE.defaultState, FabricBlockSettings.copy(
                BROWN_ICE
            )
        )
    )
    val SOUL_ICE_STAIRS = register(
        "soul_ice_stairs", BaseConsistencyStairBlock(
            SOUL_ICE.defaultState, FabricBlockSettings.copy(
                SOUL_ICE
            )
        )
    )

    // Ice Wall
    val RED_ICE_WALL = register(
        "red_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                RED_ICE
            )
        )
    )
    val ORANGE_ICE_WALL = register(
        "orange_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                ORANGE_ICE
            )
        )
    )
    val YELLOW_ICE_WALL = register(
        "yellow_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                YELLOW_ICE
            )
        )
    )
    val LIME_ICE_WALL = register(
        "lime_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                LIME_ICE
            )
        )
    )
    val GREEN_ICE_WALL = register(
        "green_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                GREEN_ICE
            )
        )
    )
    val BLUE_ICE_WALL = register("blue_ice_wall", WallBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE)))
    val CYAN_ICE_WALL = register(
        "cyan_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                CYAN_ICE
            )
        )
    )
    val LIGHT_BLUE_ICE_WALL = register(
        "light_blue_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                LIGHT_BLUE_ICE
            )
        )
    )
    val PURPLE_ICE_WALL = register(
        "purple_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                PURPLE_ICE
            )
        )
    )
    val MAGENTA_ICE_WALL = register(
        "magenta_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                MAGENTA_ICE
            )
        )
    )
    val PINK_ICE_WALL = register(
        "pink_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                PINK_ICE
            )
        )
    )
    val WHITE_ICE_WALL = register(
        "white_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                WHITE_ICE
            )
        )
    )
    val LIGHT_GRAY_ICE_WALL = register(
        "light_gray_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                LIGHT_GRAY_ICE
            )
        )
    )
    val GRAY_ICE_WALL = register(
        "gray_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                GRAY_ICE
            )
        )
    )
    val BLACK_ICE_WALL = register(
        "black_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                BLACK_ICE
            )
        )
    )
    val BROWN_ICE_WALL = register(
        "brown_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                BROWN_ICE
            )
        )
    )
    val SOUL_ICE_WALL = register(
        "soul_ice_wall", WallBlock(
            FabricBlockSettings.copy(
                SOUL_ICE
            )
        )
    )

    // Ice Gate
    val RED_ICE_GATE = register(
        "red_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                RED_ICE
            )
        )
    )
    val ORANGE_ICE_GATE = register(
        "orange_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                ORANGE_ICE
            )
        )
    )
    val YELLOW_ICE_GATE = register(
        "yellow_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                YELLOW_ICE
            )
        )
    )
    val LIME_ICE_GATE = register(
        "lime_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                LIME_ICE
            )
        )
    )
    val GREEN_ICE_GATE = register(
        "green_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                GREEN_ICE
            )
        )
    )
    val BLUE_ICE_GATE = register("blue_ice_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE)))
    val CYAN_ICE_GATE = register(
        "cyan_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CYAN_ICE
            )
        )
    )
    val LIGHT_BLUE_ICE_GATE = register(
        "light_blue_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                LIGHT_BLUE_ICE
            )
        )
    )
    val PURPLE_ICE_GATE = register(
        "purple_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                PURPLE_ICE
            )
        )
    )
    val MAGENTA_ICE_GATE = register(
        "magenta_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                MAGENTA_ICE
            )
        )
    )
    val PINK_ICE_GATE = register(
        "pink_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                PINK_ICE
            )
        )
    )
    val WHITE_ICE_GATE = register(
        "white_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                WHITE_ICE
            )
        )
    )
    val LIGHT_GRAY_ICE_GATE = register(
        "light_gray_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                LIGHT_GRAY_ICE
            )
        )
    )
    val GRAY_ICE_GATE = register(
        "gray_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                GRAY_ICE
            )
        )
    )
    val BLACK_ICE_GATE = register(
        "black_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                BLACK_ICE
            )
        )
    )
    val BROWN_ICE_GATE = register(
        "brown_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                BROWN_ICE
            )
        )
    )
    val SOUL_ICE_GATE = register(
        "soul_ice_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SOUL_ICE
            )
        )
    )

    //Glowstone
    val RED_GLOWSTONE = register(
        "red_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.RED).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val ORANGE_GLOWSTONE = register(
        "orange_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.YELLOW).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val YELLOW_GLOWSTONE = register(
        "yellow_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.ORANGE).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val LIME_GLOWSTONE = register(
        "lime_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.LIME).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val GREEN_GLOWSTONE = register(
        "green_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.GREEN).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val BLUE_GLOWSTONE = register(
        "blue_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val CYAN_GLOWSTONE = register(
        "cyan_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.CYAN).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val LIGHT_BLUE_GLOWSTONE = register(
        "light_blue_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.LIGHT_BLUE).strength(0.3f)
                .sounds(BlockSoundGroup.GLASS).luminance(15)
        )
    )
    val PURPLE_GLOWSTONE = register(
        "purple_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.PURPLE).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val MAGENTA_GLOWSTONE = register(
        "magenta_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.MAGENTA).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val PINK_GLOWSTONE = register(
        "pink_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.PINK).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val WHITE_GLOWSTONE = register(
        "white_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.WHITE).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val LIGHT_GRAY_GLOWSTONE = register(
        "light_gray_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.LIGHT_GRAY).strength(0.3f)
                .sounds(BlockSoundGroup.GLASS).luminance(15)
        )
    )
    val GRAY_GLOWSTONE = register(
        "gray_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val BLACK_GLOWSTONE = register(
        "black_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val BROWN_GLOWSTONE = register(
        "brown_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.BROWN).strength(0.3f).sounds(BlockSoundGroup.GLASS)
                .luminance(15)
        )
    )
    val SOUL_GLOWSTONE = register(
        "soul_glowstone",
        Block(
            FabricBlockSettings.of(Material.GLASS, MaterialColor.LIGHT_BLUE).strength(0.3f)
                .sounds(BlockSoundGroup.GLASS).luminance(10)
        )
    )

    // Glowstone Slab
    val RED_GLOWSTONE_SLAB = register(
        "red_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                RED_GLOWSTONE
            )
        )
    )
    val ORANGE_GLOWSTONE_SLAB = register(
        "orange_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                ORANGE_GLOWSTONE
            )
        )
    )
    val YELLOW_GLOWSTONE_SLAB = register(
        "yellow_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                YELLOW_GLOWSTONE
            )
        )
    )
    val LIME_GLOWSTONE_SLAB = register(
        "lime_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                LIME_GLOWSTONE
            )
        )
    )
    val GREEN_GLOWSTONE_SLAB = register(
        "green_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                GREEN_GLOWSTONE
            )
        )
    )
    val BLUE_GLOWSTONE_SLAB = register(
        "blue_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                BLUE_GLOWSTONE
            )
        )
    )
    val CYAN_GLOWSTONE_SLAB = register(
        "cyan_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                CYAN_GLOWSTONE
            )
        )
    )
    val LIGHT_BLUE_GLOWSTONE_SLAB = register(
        "light_blue_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                LIGHT_BLUE_GLOWSTONE
            )
        )
    )
    val PURPLE_GLOWSTONE_SLAB = register(
        "purple_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                PURPLE_GLOWSTONE
            )
        )
    )
    val MAGENTA_GLOWSTONE_SLAB = register(
        "magenta_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                MAGENTA_GLOWSTONE
            )
        )
    )
    val PINK_GLOWSTONE_SLAB = register(
        "pink_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                PINK_GLOWSTONE
            )
        )
    )
    val WHITE_GLOWSTONE_SLAB = register(
        "white_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                WHITE_GLOWSTONE
            )
        )
    )
    val LIGHT_GRAY_GLOWSTONE_SLAB = register(
        "light_gray_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                LIGHT_GRAY_GLOWSTONE
            )
        )
    )
    val GRAY_GLOWSTONE_SLAB = register(
        "gray_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                GRAY_GLOWSTONE
            )
        )
    )
    val BLACK_GLOWSTONE_SLAB = register(
        "black_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                BLACK_GLOWSTONE
            )
        )
    )
    val BROWN_GLOWSTONE_SLAB = register(
        "brown_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                BROWN_GLOWSTONE
            )
        )
    )
    val SOUL_GLOWSTONE_SLAB = register(
        "soul_glowstone_slab", SlabBlock(
            FabricBlockSettings.copy(
                SOUL_GLOWSTONE
            )
        )
    )
    val GLOWSTONE_SLAB = register("glowstone_slab", SlabBlock(FabricBlockSettings.copy(Blocks.GLOWSTONE)))

    // Glowstone Stairs
    val RED_GLOWSTONE_STAIRS = register(
        "red_glowstone_stairs", BaseConsistencyStairBlock(
            RED_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                RED_GLOWSTONE
            )
        )
    )
    val ORANGE_GLOWSTONE_STAIRS = register(
        "orange_glowstone_stairs", BaseConsistencyStairBlock(
            ORANGE_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                ORANGE_GLOWSTONE
            )
        )
    )
    val YELLOW_GLOWSTONE_STAIRS = register(
        "yellow_glowstone_stairs", BaseConsistencyStairBlock(
            YELLOW_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                YELLOW_GLOWSTONE
            )
        )
    )
    val LIME_GLOWSTONE_STAIRS = register(
        "lime_glowstone_stairs", BaseConsistencyStairBlock(
            LIME_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                LIME_GLOWSTONE
            )
        )
    )
    val GREEN_GLOWSTONE_STAIRS = register(
        "green_glowstone_stairs", BaseConsistencyStairBlock(
            GREEN_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                GREEN_GLOWSTONE
            )
        )
    )
    val BLUE_GLOWSTONE_STAIRS = register(
        "blue_glowstone_stairs", BaseConsistencyStairBlock(
            BLUE_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                BLUE_GLOWSTONE
            )
        )
    )
    val CYAN_GLOWSTONE_STAIRS = register(
        "cyan_glowstone_stairs", BaseConsistencyStairBlock(
            CYAN_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                CYAN_GLOWSTONE
            )
        )
    )
    val LIGHT_BLUE_GLOWSTONE_STAIRS = register(
        "light_blue_glowstone_stairs", BaseConsistencyStairBlock(
            LIGHT_BLUE_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                LIGHT_BLUE_GLOWSTONE
            )
        )
    )
    val PURPLE_GLOWSTONE_STAIRS = register(
        "purple_glowstone_stairs", BaseConsistencyStairBlock(
            PURPLE_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                PURPLE_GLOWSTONE
            )
        )
    )
    val MAGENTA_GLOWSTONE_STAIRS = register(
        "magenta_glowstone_stairs", BaseConsistencyStairBlock(
            MAGENTA_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                MAGENTA_GLOWSTONE
            )
        )
    )
    val PINK_GLOWSTONE_STAIRS = register(
        "pink_glowstone_stairs", BaseConsistencyStairBlock(
            PINK_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                PINK_GLOWSTONE
            )
        )
    )
    val WHITE_GLOWSTONE_STAIRS = register(
        "white_glowstone_stairs", BaseConsistencyStairBlock(
            WHITE_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                WHITE_GLOWSTONE
            )
        )
    )
    val LIGHT_GRAY_GLOWSTONE_STAIRS = register(
        "light_gray_glowstone_stairs", BaseConsistencyStairBlock(
            LIGHT_GRAY_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                LIGHT_GRAY_GLOWSTONE
            )
        )
    )
    val GRAY_GLOWSTONE_STAIRS = register(
        "gray_glowstone_stairs", BaseConsistencyStairBlock(
            GRAY_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                GRAY_GLOWSTONE
            )
        )
    )
    val BLACK_GLOWSTONE_STAIRS = register(
        "black_glowstone_stairs", BaseConsistencyStairBlock(
            BLACK_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                BLACK_GLOWSTONE
            )
        )
    )
    val BROWN_GLOWSTONE_STAIRS = register(
        "brown_glowstone_stairs", BaseConsistencyStairBlock(
            BROWN_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                BROWN_GLOWSTONE
            )
        )
    )
    val SOUL_GLOWSTONE_STAIRS = register(
        "soul_glowstone_stairs", BaseConsistencyStairBlock(
            SOUL_GLOWSTONE.defaultState, FabricBlockSettings.copy(
                SOUL_GLOWSTONE
            )
        )
    )
    val GLOWSTONE_STAIRS = register(
        "glowstone_stairs", BaseConsistencyStairBlock(
            Blocks.GLOWSTONE.defaultState, FabricBlockSettings.copy(
                Blocks.GLOWSTONE
            )
        )
    )

    // Glowstone Wall
    val RED_GLOWSTONE_WALL = register(
        "red_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                RED_GLOWSTONE
            )
        )
    )
    val ORANGE_GLOWSTONE_WALL = register(
        "orange_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                ORANGE_GLOWSTONE
            )
        )
    )
    val YELLOW_GLOWSTONE_WALL = register(
        "yellow_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                YELLOW_GLOWSTONE
            )
        )
    )
    val LIME_GLOWSTONE_WALL = register(
        "lime_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                LIME_GLOWSTONE
            )
        )
    )
    val GREEN_GLOWSTONE_WALL = register(
        "green_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                GREEN_GLOWSTONE
            )
        )
    )
    val BLUE_GLOWSTONE_WALL = register(
        "blue_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                BLUE_GLOWSTONE
            )
        )
    )
    val CYAN_GLOWSTONE_WALL = register(
        "cyan_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                CYAN_GLOWSTONE
            )
        )
    )
    val LIGHT_BLUE_GLOWSTONE_WALL = register(
        "light_blue_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                LIGHT_BLUE_GLOWSTONE
            )
        )
    )
    val PURPLE_GLOWSTONE_WALL = register(
        "purple_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                PURPLE_GLOWSTONE
            )
        )
    )
    val MAGENTA_GLOWSTONE_WALL = register(
        "magenta_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                MAGENTA_GLOWSTONE
            )
        )
    )
    val PINK_GLOWSTONE_WALL = register(
        "pink_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                PINK_GLOWSTONE
            )
        )
    )
    val WHITE_GLOWSTONE_WALL = register(
        "white_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                WHITE_GLOWSTONE
            )
        )
    )
    val LIGHT_GRAY_GLOWSTONE_WALL = register(
        "light_gray_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                LIGHT_GRAY_GLOWSTONE
            )
        )
    )
    val GRAY_GLOWSTONE_WALL = register(
        "gray_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                GRAY_GLOWSTONE
            )
        )
    )
    val BLACK_GLOWSTONE_WALL = register(
        "black_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                BLACK_GLOWSTONE
            )
        )
    )
    val BROWN_GLOWSTONE_WALL = register(
        "brown_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                BROWN_GLOWSTONE
            )
        )
    )
    val SOUL_GLOWSTONE_WALL = register(
        "soul_glowstone_wall", WallBlock(
            FabricBlockSettings.copy(
                SOUL_GLOWSTONE
            )
        )
    )
    val GLOWSTONE_WALL = register("glowstone_wall", WallBlock(FabricBlockSettings.copy(Blocks.GLOWSTONE)))

    // Glowstone Gate
    val RED_GLOWSTONE_GATE = register(
        "red_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                RED_GLOWSTONE
            )
        )
    )
    val ORANGE_GLOWSTONE_GATE = register(
        "orange_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                ORANGE_GLOWSTONE
            )
        )
    )
    val YELLOW_GLOWSTONE_GATE = register(
        "yellow_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                YELLOW_GLOWSTONE
            )
        )
    )
    val LIME_GLOWSTONE_GATE = register(
        "lime_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                LIME_GLOWSTONE
            )
        )
    )
    val GREEN_GLOWSTONE_GATE = register(
        "green_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                GREEN_GLOWSTONE
            )
        )
    )
    val BLUE_GLOWSTONE_GATE = register(
        "blue_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                BLUE_GLOWSTONE
            )
        )
    )
    val CYAN_GLOWSTONE_GATE = register(
        "cyan_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                CYAN_GLOWSTONE
            )
        )
    )
    val LIGHT_BLUE_GLOWSTONE_GATE = register(
        "light_blue_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                LIGHT_BLUE_GLOWSTONE
            )
        )
    )
    val PURPLE_GLOWSTONE_GATE = register(
        "purple_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                PURPLE_GLOWSTONE
            )
        )
    )
    val MAGENTA_GLOWSTONE_GATE = register(
        "magenta_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                MAGENTA_GLOWSTONE
            )
        )
    )
    val PINK_GLOWSTONE_GATE = register(
        "pink_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                PINK_GLOWSTONE
            )
        )
    )
    val WHITE_GLOWSTONE_GATE = register(
        "white_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                WHITE_GLOWSTONE
            )
        )
    )
    val LIGHT_GRAY_GLOWSTONE_GATE = register(
        "light_gray_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                LIGHT_GRAY_GLOWSTONE
            )
        )
    )
    val GRAY_GLOWSTONE_GATE = register(
        "gray_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                GRAY_GLOWSTONE
            )
        )
    )
    val BLACK_GLOWSTONE_GATE = register(
        "black_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                BLACK_GLOWSTONE
            )
        )
    )
    val BROWN_GLOWSTONE_GATE = register(
        "brown_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                BROWN_GLOWSTONE
            )
        )
    )
    val SOUL_GLOWSTONE_GATE = register(
        "soul_glowstone_gate", FenceGateBlock(
            FabricBlockSettings.copy(
                SOUL_GLOWSTONE
            )
        )
    )
    val GLOWSTONE_GATE = register("glowstone_gate", FenceGateBlock(FabricBlockSettings.copy(Blocks.GLOWSTONE)))

    //Obsidian
    val OBSIDIAN_SLAB = register(
        "obsidian_slab", SlabBlock(
            FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f)
        )
    )
    val OBSIDIAN_STAIRS = register(
        "obsidian_stairs", BaseConsistencyStairBlock(
            Blocks.OBSIDIAN.defaultState, FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f)
        )
    )
    val OBSIDIAN_WALL = register(
        "obsidian_wall", WallBlock(
            FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f)
        )
    )
    val OBSIDIAN_GATE = register(
        "obsidian_gate", FenceGateBlock(
            FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f)
        )
    )
    val CRYING_OBSIDIAN_SLAB = register(
        "crying_obsidian_slab", SlabBlock(
            FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f).luminance(10)
        )
    )
    val CRYING_OBSIDIAN_STAIRS = register(
        "crying_obsidian_stairs", BaseConsistencyStairBlock(
            Blocks.CRYING_OBSIDIAN.defaultState, FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f).luminance(10)
        )
    )
    val CRYING_OBSIDIAN_WALL = register(
        "crying_obsidian_wall", WallBlock(
            FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f).luminance(10)
        )
    )
    val CRYING_OBSIDIAN_GATE = register(
        "crying_obsidian_gate", FenceGateBlock(
            FabricBlockSettings.of(
                FabricMaterialBuilder(MaterialColor.BLACK).pistonBehavior(PistonBehavior.BLOCK).build()
            ).requiresTool().breakByTool(
                FabricToolTags.PICKAXES, 3
            ).strength(50.0f, 1200.0f).luminance(10)
        )
    )

    // Dirt
    val DIRT_SLAB = register("dirt_slab", DirtSlabBlock(FabricBlockSettings.copy(Blocks.DIRT)))
    val DIRT_STAIRS = register(
        "dirt_stairs", DirtStairsBlock(
            Blocks.DIRT.defaultState, FabricBlockSettings.copy(
                Blocks.DIRT
            )
        )
    )
    val DIRT_WALL = register("dirt_wall", DirtWallBlock(FabricBlockSettings.copy(Blocks.DIRT)))

    // Grass
    val GRASS_SLAB = register("grass_slab", GrassSlabBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)))
    val GRASS_STAIRS = register(
        "grass_stairs", GrassStairsBlock(
            Blocks.GRASS_BLOCK.defaultState, FabricBlockSettings.copy(
                Blocks.GRASS_BLOCK
            )
        )
    )
    val GRASS_WALL = register("grass_wall", GrassWallBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)))

    // Mycelium
    val MYCELIUM_SLAB = register("mycelium_slab", MyceliumSlabBlock(FabricBlockSettings.copy(Blocks.MYCELIUM)))
    val MYCELIUM_STAIRS = register(
        "mycelium_stairs", MyceliumStairsBlock(
            Blocks.MYCELIUM.defaultState, FabricBlockSettings.copy(
                Blocks.MYCELIUM
            )
        )
    )
    val MYCELIUM_WALL = register("mycelium_wall", MyceliumWallBlock(FabricBlockSettings.copy(Blocks.MYCELIUM)))

    // Miscellaneous
    val JACK_O_SOUL = register(
        "jack_o_soul",
        BaseConsistencyCarvedPumpkinBlock(
            FabricBlockSettings.of(Material.GOURD, MaterialColor.ORANGE).strength(1.0f).sounds(BlockSoundGroup.WOOD)
                .luminance(10)
        )
    )
    val WARPED_WART = register(
        "warped_wart",
        WarpedNetherWartPlantBlock(
            FabricBlockSettings.of(Material.PLANT, MaterialColor.BLUE).noCollision().ticksRandomly()
                .sounds(BlockSoundGroup.NETHER_WART).nonOpaque()
        )
    )
    val NETHERITE_STAIRS = register(
        "netherite_stairs", BaseConsistencyStairBlock(
            Blocks.NETHERITE_BLOCK.defaultState, FabricBlockSettings.copy(
                Blocks.NETHERITE_BLOCK
            )
        )
    )
    val SUSPICIOUS_SLAB = register("suspicious_slab", SlabBlock(FabricBlockSettings.copy(Blocks.CLAY)))

    //  public static final Block SIUOLS_SANITY = register("is_a_crab", new Block(FabricBlockSettings.copy(HELP_ME)));
    //  You are having funny fun because your playing a Siuolplexplex contributed mod
    private fun register(name: String, block: Block): Block {
        return Registry.register(Registry.BLOCK, Identifier("consistency_plus", name), block)
    }

    fun init() {}
}