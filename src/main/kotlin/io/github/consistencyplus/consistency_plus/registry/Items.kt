package io.github.consistencyplus.consistency_plus.registry

import net.minecraft.item.AliasedBlockItem
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object Items {
    /*
    templates:
    block item: public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(Blocks.SMOOTH_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));
     */
    //Stone
    //Smooth
    val SMOOTH_STONE_WALL = register(
        "smooth_stone_wall",
        BlockItem(Blocks.SMOOTH_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_STONE_STAIRS = register(
        "smooth_stone_stairs",
        BlockItem(Blocks.SMOOTH_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val STONE_GATE = register("stone_gate", BlockItem(Blocks.STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))
    val SMOOTH_STONE_GATE = register(
        "smooth_stone_gate",
        BlockItem(Blocks.SMOOTH_STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val COBBLESTONE_GATE =
        register("cobblestone_gate", BlockItem(Blocks.COBBLESTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))
    val MOSSY_COBBLESTONE_GATE = register(
        "mossy_cobblestone_gate",
        BlockItem(Blocks.MOSSY_COBBLESTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val CUT_STONE = register("cut_stone", BlockItem(Blocks.CUT_STONE, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_STONE_SLAB =
        register("cut_stone_slab", BlockItem(Blocks.CUT_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_STONE_STAIRS =
        register("cut_stone_stairs", BlockItem(Blocks.CUT_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_STONE_WALL =
        register("cut_stone_wall", BlockItem(Blocks.CUT_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_STONE_GATE =
        register("cut_stone_gate", BlockItem(Blocks.CUT_STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

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
    val POLISHED_STONE =
        register("polished_stone", BlockItem(Blocks.POLISHED_STONE, ItemGroups.consistencyPlusStoneItemSettings()))
    val POLISHED_STONE_WALL = register(
        "polished_stone_wall",
        BlockItem(Blocks.POLISHED_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_STONE_STAIRS = register(
        "polished_stone_stairs",
        BlockItem(Blocks.POLISHED_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_STONE_SLAB = register(
        "polished_stone_slab",
        BlockItem(Blocks.POLISHED_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_STONE_GATE = register(
        "polished_stone_gate",
        BlockItem(Blocks.POLISHED_STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    //Cracked Bricks
    val CRACKED_STONE_BRICK_SLAB = register(
        "cracked_stone_brick_slab",
        BlockItem(Blocks.CRACKED_STONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_STONE_BRICK_STAIRS = register(
        "cracked_stone_brick_stairs",
        BlockItem(Blocks.CRACKED_STONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_STONE_BRICK_WALL = register(
        "cracked_stone_brick_wall",
        BlockItem(Blocks.CRACKED_STONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_STONE_BRICK_GATE = register(
        "cracked_stone_brick_gate",
        BlockItem(Blocks.CRACKED_STONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_STONE_BRICK_GATE = register(
        "mossy_stone_brick_gate",
        BlockItem(Blocks.MOSSY_STONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Pillar and Chiseled
    val STONE_BRICK_PILLAR = register(
        "stone_brick_pillar",
        BlockItem(Blocks.STONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_STONE_BRICK_PILLAR = register(
        "mossy_stone_brick_pillar",
        BlockItem(Blocks.MOSSY_STONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_STONE_BRICK_PILLAR = register(
        "cracked_stone_brick_pillar",
        BlockItem(Blocks.CRACKED_STONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_CHISELED_STONE_BRICKS = register(
        "cracked_chiseled_stone_bricks",
        BlockItem(Blocks.CRACKED_CHISELED_STONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CHISELED_STONE_BRICKS = register(
        "mossy_chiseled_stone_bricks",
        BlockItem(Blocks.MOSSY_CHISELED_STONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val STONE_WALL = register("stone_wall", BlockItem(Blocks.STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()))
    val STONE_BRICK_GATE =
        register("stone_brick_gate", BlockItem(Blocks.STONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_STONE_BRICKS = register(
        "carved_stone_bricks",
        BlockItem(Blocks.CARVED_STONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //cracked carved
    //mossy carved
    //Blackstone
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
    val SMOOTH_BLACKSTONE = register(
        "smooth_blackstone",
        BlockItem(Blocks.SMOOTH_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_BLACKSTONE_SLAB = register(
        "smooth_blackstone_slab",
        BlockItem(Blocks.SMOOTH_BLACKSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_BLACKSTONE_STAIRS = register(
        "smooth_blackstone_stairs",
        BlockItem(Blocks.SMOOTH_BLACKSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_BLACKSTONE_WALL = register(
        "smooth_blackstone_wall",
        BlockItem(Blocks.SMOOTH_BLACKSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val BLACKSTONE_GATE =
        register("blackstone_gate", BlockItem(Blocks.BLACKSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))
    val SMOOTH_BLACKSTONE_GATE = register(
        "smooth_blackstone_gate",
        BlockItem(Blocks.SMOOTH_BLACKSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_BLACKSTONE_GATE = register(
        "polished_blackstone_gate",
        BlockItem(Blocks.POLISHED_BLACKSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val BLACKSTONE_BRICK_GATE = register(
        "blackstone_brick_gate",
        BlockItem(Blocks.BLACKSTONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val CUT_BLACKSTONE =
        register("cut_blackstone", BlockItem(Blocks.CUT_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_BLACKSTONE_SLAB = register(
        "cut_blackstone_slab",
        BlockItem(Blocks.CUT_BLACKSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_BLACKSTONE_STAIRS = register(
        "cut_blackstone_stairs",
        BlockItem(Blocks.CUT_BLACKSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_BLACKSTONE_WALL = register(
        "cut_blackstone_wall",
        BlockItem(Blocks.CUT_BLACKSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_BLACKSTONE_GATE = register(
        "cut_blackstone_gate",
        BlockItem(Blocks.CUT_BLACKSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val CRACKED_BLACKSTONE_BRICK_SLAB = register(
        "cracked_blackstone_brick_slab",
        BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_BLACKSTONE_BRICK_STAIRS = register(
        "cracked_blackstone_brick_stairs",
        BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_BLACKSTONE_BRICK_WALL = register(
        "cracked_blackstone_brick_wall",
        BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_BLACKSTONE_BRICK_GATE = register(
        "cracked_blackstone_brick_gate",
        BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Mossy Bricks
    val MOSSY_BLACKSTONE_BRICKS = register(
        "mossy_blackstone_bricks",
        BlockItem(Blocks.MOSSY_BLACKSTONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_BLACKSTONE_BRICK_SLAB = register(
        "mossy_blackstone_brick_slab",
        BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_BLACKSTONE_BRICK_STAIRS = register(
        "mossy_blackstone_brick_stairs",
        BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_BLACKSTONE_BRICK_WALL = register(
        "mossy_blackstone_brick_wall",
        BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_BLACKSTONE_BRICK_GATE = register(
        "mossy_blackstone_brick_gate",
        BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Pillars and Chiseled
    val CHISELED_BLACKSTONE = register(
        "chiseled_blackstone",
        BlockItem(Blocks.CHISELED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CHISELED_BLACKSTONE = register(
        "mossy_chiseled_blackstone",
        BlockItem(Blocks.MOSSY_CHISELED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_CHISELED_BLACKSTONE = register(
        "cracked_chiseled_blackstone",
        BlockItem(Blocks.CRACKED_CHISELED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val BLACKSTONE_BRICK_PILLAR = register(
        "blackstone_brick_pillar",
        BlockItem(Blocks.BLACKSTONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_BLACKSTONE_BRICK_PILLAR = register(
        "cracked_blackstone_brick_pillar",
        BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_BLACKSTONE_BRICK_PILLAR = register(
        "mossy_blackstone_brick_pillar",
        BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CRACKED_CARVED_BLACKSTONE = register(
        "cracked_carved_blackstone",
        BlockItem(Blocks.CRACKED_CARVED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CARVED_BLACKSTONE = register(
        "mossy_carved_blackstone",
        BlockItem(Blocks.MOSSY_CARVED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Sandstone
    val SANDSTONE_GATE =
        register("sandstone_gate", BlockItem(Blocks.SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

    //Smooth
    val SMOOTH_SANDSTONE_WALL = register(
        "smooth_sandstone_wall",
        BlockItem(Blocks.SMOOTH_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_SANDSTONE_GATE = register(
        "smooth_sandstone_gate",
        BlockItem(Blocks.SMOOTH_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val CUT_SANDSTONE_STAIRS = register(
        "cut_sandstone_stairs",
        BlockItem(Blocks.CUT_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_SANDSTONE_WALL = register(
        "cut_sandstone_wall",
        BlockItem(Blocks.CUT_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_SANDSTONE_GATE = register(
        "cut_sandstone_gate",
        BlockItem(Blocks.CUT_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val POLISHED_SANDSTONE = register(
        "polished_sandstone",
        BlockItem(Blocks.POLISHED_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SANDSTONE_SLAB = register(
        "polished_sandstone_slab",
        BlockItem(Blocks.POLISHED_SANDSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SANDSTONE_STAIRS = register(
        "polished_sandstone_stairs",
        BlockItem(Blocks.POLISHED_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SANDSTONE_WALL = register(
        "polished_sandstone_wall",
        BlockItem(Blocks.POLISHED_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SANDSTONE_GATE = register(
        "polished_sandstone_gate",
        BlockItem(Blocks.POLISHED_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val SANDSTONE_BRICKS =
        register("sandstone_bricks", BlockItem(Blocks.SANDSTONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()))
    val SANDSTONE_BRICK_SLAB = register(
        "sandstone_brick_slab",
        BlockItem(Blocks.SANDSTONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SANDSTONE_BRICk_STAIRS = register(
        "sandstone_brick_stairs",
        BlockItem(Blocks.SANDSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SANDSTONE_BRICK_WALL = register(
        "sandstone_brick_wall",
        BlockItem(Blocks.SANDSTONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SANDSTONE_BRICK_GATE = register(
        "sandstone_brick_gate",
        BlockItem(Blocks.SANDSTONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Bricks
    //cracked_sandstone_bricks
    //cracked_sandstone_brick_slab
    //cracked_sandstone_brick_stairs
    //cracked_sandstone_brick_pillar
    //Mossy Bricks
    //mossy_sandstone_bricks
    //mossy_sandstone_brick_slab
    //mossy_sandstone_brick_stairs
    //mossy_sandstone_brick_wall
    //Pillars and Chiseled
    //cracked_chiseled_sandstone_bricks
    //mossy_chiseled_sandstone_bricks
    val SANDSTONE_PILLAR =
        register("sandstone_pillar", BlockItem(Blocks.SANDSTONE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()))

    //cracked_sandstone_brick_pillar
    //mossy_sandstone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CHISELED_SANDSTONE = register(
        "chiseled_sandstone",
        BlockItem(Blocks.CHISELED_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //cracked carved
    //mossy carved
    //Red Sandstone
    val RED_SANDSTONE_GATE = register(
        "red_sandstone_gate",
        BlockItem(Blocks.RED_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Smooth
    val SMOOTH_RED_SANDSTONE_WALL = register(
        "smooth_red_sandstone_wall",
        BlockItem(Blocks.SMOOTH_RED_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_RED_SANDSTONE_GATE = register(
        "smooth_red_sandstone_gate",
        BlockItem(Blocks.SMOOTH_RED_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
        "cut_red_sandstone_stairs",
        BlockItem(Blocks.CUT_RED_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_RED_SANDSTONE_WALL = register(
        "cut_red_sandstone_wall",
        BlockItem(Blocks.CUT_RED_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_RED_SANDSTONE_GATE = register(
        "cut_red_sandstone_gate",
        BlockItem(Blocks.CUT_RED_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val POLISHED_RED_SANDSTONE = register(
        "polished_red_sandstone",
        BlockItem(Blocks.POLISHED_RED_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_RED_SANDSTONE_SLAB = register(
        "polished_red_sandstone_slab",
        BlockItem(Blocks.POLISHED_RED_SANDSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_RED_SANDSTONE_STAIRS = register(
        "polished_red_sandstone_stairs",
        BlockItem(Blocks.POLISHED_RED_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_RED_SANDSTONE_WALL = register(
        "polished_red_sandstone_wall",
        BlockItem(Blocks.POLISHED_RED_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_RED_SANDSTONE_GATE = register(
        "polished_red_sandstone_gate",
        BlockItem(Blocks.POLISHED_RED_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val RED_SANDSTONE_BRICKS = register(
        "red_sandstone_bricks",
        BlockItem(Blocks.RED_SANDSTONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val RED_SANDSTONE_BRICK_SLAB = register(
        "red_sandstone_brick_slab",
        BlockItem(Blocks.RED_SANDSTONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val RED_SANDSTONE_BRICk_STAIRS = register(
        "red_sandstone_brick_stairs",
        BlockItem(Blocks.RED_SANDSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val RED_SANDSTONE_BRICK_WALL = register(
        "red_sandstone_brick_wall",
        BlockItem(Blocks.RED_SANDSTONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val RED_SANDSTONE_BRICK_GATE = register(
        "red_sandstone_brick_gate",
        BlockItem(Blocks.RED_SANDSTONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Bricks
    //cracked_red_sandstone_bricks
    //cracked_red_sandstone_brick_slab
    //cracked_red_sandstone_brick_stairs
    //cracked_red_sandstone_brick_pillar
    //Mossy Bricks
    //mossy_red_sandstone_bricks
    //mossy_red_sandstone_brick_slab
    //mossy_red_sandstone_brick_stairs
    //mossy_red_sandstone_brick_wall
    //Pillars and Chiseled
    //cracked_chiseled_red_sandstone_bricks
    //mossy_chiseled_red_sandstone_bricks
    val RED_SANDSTONE_PILLAR = register(
        "red_sandstone_pillar",
        BlockItem(Blocks.RED_SANDSTONE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //cracked_red_sandstone_brick_pillar
    //mossy_red_sandstone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CHISELED_RED_SANDSTONE = register(
        "chiseled_red_sandstone",
        BlockItem(Blocks.CHISELED_RED_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //cracked carved
    //mossy carved
    //Quartz
    //Block
    val QUARTZ_WALL =
        register("quartz_wall", BlockItem(Blocks.QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings()))
    val QUARTZ_GATE =
        register("quartz_gate", BlockItem(Blocks.QUARTZ_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

    //Smooth
    val SMOOTH_QUARTZ_WALL = register(
        "smooth_quartz_wall",
        BlockItem(Blocks.SMOOTH_QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_QUARTZ_GATE = register(
        "smooth_quartz_gate",
        BlockItem(Blocks.SMOOTH_QUARTZ_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val CUT_QUARTZ = register("cut_quartz", BlockItem(Blocks.CUT_QUARTZ, ItemGroups.consistencyPlusMiscItemSettings()))
    val CUT_QUARTZ_SLAB =
        register("cut_quartz_slab", BlockItem(Blocks.CUT_QUARTZ_SLAB, ItemGroups.consistencyPlusMiscItemSettings()))
    val CUT_QUARTZ_STAIRS =
        register("cut_quartz_stairs", BlockItem(Blocks.CUT_QUARTZ_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()))
    val CUT_QUARTZ_WALL =
        register("cut_quartz_wall", BlockItem(Blocks.CUT_QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings()))
    val CUT_QUARTZ_GATE =
        register("cut_quartz_gate", BlockItem(Blocks.CUT_QUARTZ_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

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
    val POLISHED_QUARTZ =
        register("polished_quartz", BlockItem(Blocks.POLISHED_QUARTZ, ItemGroups.consistencyPlusMiscItemSettings()))
    val POLISHED_QUARTZ_SLAB = register(
        "polished_quartz_slab",
        BlockItem(Blocks.POLISHED_QUARTZ_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_QUARTZ_STAIRS = register(
        "polished_quartz_stairs",
        BlockItem(Blocks.POLISHED_QUARTZ_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_QUARTZ_WALL = register(
        "polished_quartz_wall",
        BlockItem(Blocks.POLISHED_QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_QUARTZ_GATE = register(
        "polished_quartz_gate",
        BlockItem(Blocks.POLISHED_QUARTZ_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val QUARTZ_BRICK_SLAB =
        register("quartz_brick_slab", BlockItem(Blocks.QUARTZ_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings()))
    val QUARTZ_BRICK_STAIRS = register(
        "quartz_brick_stairs",
        BlockItem(Blocks.QUARTZ_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val QUARTZ_BRICK_WALL =
        register("quartz_brick_wall", BlockItem(Blocks.QUARTZ_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings()))
    val QUARTZ_BRICK_GATE =
        register("quartz_brick_gate", BlockItem(Blocks.QUARTZ_BRICK_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

    //Cracked Bricks
    //cracked_quartz_bricks
    //cracked_quartz_brick_slab
    //cracked_quartz_brick_stairs
    //cracked_quartz_brick_wall
    //Mossy Bricks
    //mossy_quartz_bricks
    //mossy_quartz_brick_slab
    //mossy_quartz_brick_stairs
    //mossy_quartz_brick_wall
    //Pillar and Chiseled
    //cracked_chiseled_quartz_bricks
    //mossy_chiseled_quartz_bricks
    //cracked_quartz_pillar
    //mossy_quartz_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_QUARTZ =
        register("carved_quartz", BlockItem(Blocks.CARVED_QUARTZ, ItemGroups.consistencyPlusMiscItemSettings()))

    //cracked carved
    //mossy carved
    //Andesite
    val ANDESITE_GATE =
        register("andesite_gate", BlockItem(Blocks.ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

    //Mossy
    val MOSSY_ANDESITE =
        register("mossy_andesite", BlockItem(Blocks.MOSSY_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val MOSSY_ANDESITE_SLAB = register(
        "mossy_andesite_slab",
        BlockItem(Blocks.MOSSY_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_STAIRS = register(
        "mossy_andesite_stairs",
        BlockItem(Blocks.MOSSY_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_WALL = register(
        "mossy_andesite_wall",
        BlockItem(Blocks.MOSSY_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_GATE = register(
        "mossy_andesite_gate",
        BlockItem(Blocks.MOSSY_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Polished
    val POLISHED_ANDESITE_WALL = register(
        "polished_andesite_wall",
        BlockItem(Blocks.POLISHED_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_ANDESITE_GATE = register(
        "polished_andesite_gate",
        BlockItem(Blocks.POLISHED_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Polished
    val MOSSY_POLISHED_ANDESITE = register(
        "mossy_polished_andesite",
        BlockItem(Blocks.MOSSY_POLISHED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_POLISHED_ANDESITE_SLAB = register(
        "mossy_polished_andesite_slab",
        BlockItem(Blocks.MOSSY_POLISHED_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_POLISHED_ANDESITE_STAIRS = register(
        "mossy_polished_andesite_stairs",
        BlockItem(Blocks.MOSSY_POLISHED_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_POLISHED_ANDESITE_WALL = register(
        "mossy_polished_andesite_wall",
        BlockItem(Blocks.MOSSY_POLISHED_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_POLISHED_ANDESITE_GATE = register(
        "mossy_polished_andesite_gate",
        BlockItem(Blocks.MOSSY_POLISHED_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Mossy Polished
    val CRACKED_POLISHED_ANDESITE = register(
        "cracked_polished_andesite",
        BlockItem(Blocks.CRACKED_POLISHED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_POLISHED_ANDESITE_SLAB = register(
        "cracked_polished_andesite_slab",
        BlockItem(Blocks.CRACKED_POLISHED_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_POLISHED_ANDESITE_STAIRS = register(
        "cracked_polished_andesite_stairs",
        BlockItem(Blocks.CRACKED_POLISHED_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_POLISHED_ANDESITE_WALL = register(
        "cracked_polished_andesite_wall",
        BlockItem(Blocks.CRACKED_POLISHED_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_POLISHED_ANDESITE_GATE = register(
        "cracked_polished_andesite_gate",
        BlockItem(Blocks.CRACKED_POLISHED_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Smooth
    val SMOOTH_ANDESITE =
        register("smooth_andesite", BlockItem(Blocks.SMOOTH_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val SMOOTH_ANDESITE_SLAB = register(
        "smooth_andesite_slab",
        BlockItem(Blocks.SMOOTH_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_ANDESITE_STAIRS = register(
        "smooth_andesite_stairs",
        BlockItem(Blocks.SMOOTH_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_ANDESITE_WALL = register(
        "smooth_andesite_wall",
        BlockItem(Blocks.SMOOTH_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_ANDESITE_GATE = register(
        "smooth_andesite_gate",
        BlockItem(Blocks.SMOOTH_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Smooth
    val CRACKED_SMOOTH_ANDESITE = register(
        "cracked_smooth_andesite",
        BlockItem(Blocks.CRACKED_SMOOTH_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_SMOOTH_ANDESITE_SLAB = register(
        "cracked_smooth_andesite_slab",
        BlockItem(Blocks.CRACKED_SMOOTH_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_SMOOTH_ANDESITE_STAIRS = register(
        "cracked_smooth_andesite_stairs",
        BlockItem(Blocks.CRACKED_SMOOTH_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_SMOOTH_ANDESITE_WALL = register(
        "cracked_smooth_andesite_wall",
        BlockItem(Blocks.CRACKED_SMOOTH_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_SMOOTH_ANDESITE_GATE = register(
        "cracked_smooth_andesite_gate",
        BlockItem(Blocks.CRACKED_SMOOTH_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Mossy Smooth
    val MOSSY_SMOOTH_ANDESITE = register(
        "mossy_smooth_andesite",
        BlockItem(Blocks.MOSSY_SMOOTH_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_SMOOTH_ANDESITE_SLAB = register(
        "mossy_smooth_andesite_slab",
        BlockItem(Blocks.MOSSY_SMOOTH_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_SMOOTH_ANDESITE_STAIRS = register(
        "mossy_smooth_andesite_stairs",
        BlockItem(Blocks.MOSSY_SMOOTH_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_SMOOTH_ANDESITE_WALL = register(
        "mossy_smooth_andesite_wall",
        BlockItem(Blocks.MOSSY_SMOOTH_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_SMOOTH_ANDESITE_GATE = register(
        "mossy_smooth_andesite_gate",
        BlockItem(Blocks.MOSSY_SMOOTH_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cut
    val CUT_ANDESITE =
        register("cut_andesite", BlockItem(Blocks.CUT_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_ANDESITE_SLAB = register(
        "cut_andesite_slab",
        BlockItem(Blocks.CUT_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_ANDESITE_STAIRS = register(
        "cut_andesite_stairs",
        BlockItem(Blocks.CUT_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_ANDESITE_WALL = register(
        "cut_andesite_wall",
        BlockItem(Blocks.CUT_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_ANDESITE_GATE = register(
        "cut_andesite_gate",
        BlockItem(Blocks.CUT_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Cut
    val CRACKED_CUT_ANDESITE = register(
        "cracked_cut_andesite",
        BlockItem(Blocks.CRACKED_CUT_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_CUT_ANDESITE_SLAB = register(
        "cracked_cut_andesite_slab",
        BlockItem(Blocks.CRACKED_CUT_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_CUT_ANDESITE_STAIRS = register(
        "cracked_cut_andesite_stairs",
        BlockItem(Blocks.CRACKED_CUT_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_CUT_ANDESITE_WALL = register(
        "cracked_cut_andesite_wall",
        BlockItem(Blocks.CRACKED_CUT_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_CUT_ANDESITE_GATE = register(
        "cracked_cut_andesite_gate",
        BlockItem(Blocks.CRACKED_CUT_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Mossy Cut
    val MOSSY_CUT_ANDESITE = register(
        "mossy_cut_andesite",
        BlockItem(Blocks.MOSSY_CUT_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CUT_ANDESITE_SLAB = register(
        "mossy_cut_andesite_slab",
        BlockItem(Blocks.MOSSY_CUT_ANDESITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CUT_ANDESITE_STAIRS = register(
        "mossy_cut_andesite_stairs",
        BlockItem(Blocks.MOSSY_CUT_ANDESITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CUT_ANDESITE_WALL = register(
        "mossy_cut_andesite_wall",
        BlockItem(Blocks.MOSSY_CUT_ANDESITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CUT_ANDESITE_GATE = register(
        "mossy_cut_andesite_gate",
        BlockItem(Blocks.MOSSY_CUT_ANDESITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Bricks
    val ANDESITE_BRICKS =
        register("andesite_bricks", BlockItem(Blocks.ANDESITE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()))
    val ANDESITE_BRICK_SLAB = register(
        "andesite_brick_slab",
        BlockItem(Blocks.ANDESITE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val ANDESITE_BRICK_STAIRS = register(
        "andesite_brick_stairs",
        BlockItem(Blocks.ANDESITE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val ANDESITE_BRICK_WALL = register(
        "andesite_brick_wall",
        BlockItem(Blocks.ANDESITE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val ANDESITE_BRICK_GATE = register(
        "andesite_brick_gate",
        BlockItem(Blocks.ANDESITE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Bricks
    val CRACKED_ANDESITE_BRICKS = register(
        "cracked_andesite_bricks",
        BlockItem(Blocks.CRACKED_ANDESITE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_ANDESITE_BRICK_SLAB = register(
        "cracked_andesite_brick_slab",
        BlockItem(Blocks.CRACKED_ANDESITE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_ANDESITE_BRICK_STAIRS = register(
        "cracked_andesite_brick_stairs",
        BlockItem(Blocks.CRACKED_ANDESITE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_ANDESITE_BRICK_WALL = register(
        "cracked_andesite_brick_wall",
        BlockItem(Blocks.CRACKED_ANDESITE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_ANDESITE_BRICK_GATE = register(
        "cracked_andesite_brick_gate",
        BlockItem(Blocks.CRACKED_ANDESITE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Mossy Bricks
    val MOSSY_ANDESITE_BRICKS = register(
        "mossy_andesite_bricks",
        BlockItem(Blocks.MOSSY_ANDESITE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_BRICK_SLAB = register(
        "mossy_andesite_brick_slab",
        BlockItem(Blocks.MOSSY_ANDESITE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_BRICK_STAIRS = register(
        "mossy_andesite_brick_stairs",
        BlockItem(Blocks.MOSSY_ANDESITE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_BRICK_WALL = register(
        "mossy_andesite_brick_wall",
        BlockItem(Blocks.MOSSY_ANDESITE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_BRICK_GATE = register(
        "mossy_andesite_brick_gate",
        BlockItem(Blocks.MOSSY_ANDESITE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Pillars and Chiseled
    val CHISELED_ANDESITE = register(
        "chiseled_andesite",
        BlockItem(Blocks.CHISELED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CRACKED_CHISELED_ANDESITE = register(
        "cracked_chiseled_andesite",
        BlockItem(Blocks.CRACKED_CHISELED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CHISELED_ANDESITE = register(
        "mossy_chiseled_andesite",
        BlockItem(Blocks.MOSSY_CHISELED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val ANDESITE_PILLAR =
        register("andesite_pillar", BlockItem(Blocks.ANDESITE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()))
    val CRACKED_ANDESITE_PILLAR = register(
        "cracked_andesite_pillar",
        BlockItem(Blocks.CRACKED_ANDESITE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_ANDESITE_PILLAR = register(
        "mossy_andesite_pillar",
        BlockItem(Blocks.MOSSY_ANDESITE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_ANDESITE =
        register("carved_andesite", BlockItem(Blocks.CARVED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val CRACKED_CARVED_ANDESITE = register(
        "cracked_carved_andesite",
        BlockItem(Blocks.CRACKED_CARVED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val MOSSY_CARVED_ANDESITE = register(
        "mossy_carved_andesite",
        BlockItem(Blocks.MOSSY_CARVED_ANDESITE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Diorite
    val DIORITE_GATE =
        register("diorite_gate", BlockItem(Blocks.DIORITE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

    //Polished
    val POLISHED_DIORITE_WALL = register(
        "polished_diorite_wall",
        BlockItem(Blocks.POLISHED_DIORITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_DIORITE_GATE = register(
        "polished_diorite_gate",
        BlockItem(Blocks.POLISHED_DIORITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val SMOOTH_DIORITE =
        register("smooth_diorite", BlockItem(Blocks.SMOOTH_DIORITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val SMOOTH_DIORITE_SLAB = register(
        "smooth_diorite_slab",
        BlockItem(Blocks.SMOOTH_DIORITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_DIORITE_STAIRS = register(
        "smooth_diorite_stairs",
        BlockItem(Blocks.SMOOTH_DIORITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_DIORITE_WALL = register(
        "smooth_diorite_wall",
        BlockItem(Blocks.SMOOTH_DIORITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_DIORITE_GATE = register(
        "smooth_diorite_gate",
        BlockItem(Blocks.SMOOTH_DIORITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val CUT_DIORITE =
        register("cut_diorite", BlockItem(Blocks.CUT_DIORITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_DIORITE_SLAB =
        register("cut_diorite_slab", BlockItem(Blocks.CUT_DIORITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_DIORITE_STAIRS = register(
        "cut_diorite_stairs",
        BlockItem(Blocks.CUT_DIORITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_DIORITE_WALL =
        register("cut_diorite_wall", BlockItem(Blocks.CUT_DIORITE_WALL, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_DIORITE_GATE =
        register("cut_diorite_gate", BlockItem(Blocks.CUT_DIORITE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

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
    val DIORITE_BRICKS =
        register("diorite_bricks", BlockItem(Blocks.DIORITE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()))
    val DIORITE_BRICK_SLAB = register(
        "diorite_brick_slab",
        BlockItem(Blocks.DIORITE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val DIORITE_BRICK_STAIRS = register(
        "diorite_brick_stairs",
        BlockItem(Blocks.DIORITE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val DIORITE_BRICK_WALL = register(
        "diorite_brick_wall",
        BlockItem(Blocks.DIORITE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val DIORITE_BRICK_GATE = register(
        "diorite_brick_gate",
        BlockItem(Blocks.DIORITE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Bricks
    //cracked_diorite_bricks
    //cracked_diorite_brick_slab
    //cracked_diorite_brick_stairs
    //cracked_diorite_brick_wall
    //Mossy Bricks
    //mossy_diorite_bricks
    //mossy_diorite_brick_slab
    //mossy_diorite_brick_stairs
    //mossy_diorite_brick_wall
    //Pillars and Chiseled
    val CHISELED_DIORITE =
        register("chiseled_diorite", BlockItem(Blocks.CHISELED_DIORITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val DIORITE_PILLAR =
        register("diorite_pillar", BlockItem(Blocks.DIORITE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()))

    //cracked_diorite_pillar
    //mossy_diorite_pillar
    //chiseled_diorite_bricks
    //cracked_chiseled_diorite_bricks
    //mossy_chiseled_diorite_bricks
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_DIORITE =
        register("carved_diorite", BlockItem(Blocks.CARVED_DIORITE, ItemGroups.consistencyPlusStoneItemSettings()))

    //cracked carved
    //mossy carved
    //Granite
    val GRANITE_GATE =
        register("granite_gate", BlockItem(Blocks.GRANITE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

    //Polished
    val POLISHED_GRANITE_WALL = register(
        "polished_granite_wall",
        BlockItem(Blocks.POLISHED_GRANITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_GRANITE_GATE = register(
        "polished_granite_gate",
        BlockItem(Blocks.POLISHED_GRANITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val SMOOTH_GRANITE =
        register("smooth_granite", BlockItem(Blocks.SMOOTH_GRANITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val SMOOTH_GRANITE_SLAB = register(
        "smooth_granite_slab",
        BlockItem(Blocks.SMOOTH_GRANITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_GRANITE_STAIRS = register(
        "smooth_granite_stairs",
        BlockItem(Blocks.SMOOTH_GRANITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_GRANITE_WALL = register(
        "smooth_granite_wall",
        BlockItem(Blocks.SMOOTH_GRANITE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_GRANITE_GATE = register(
        "smooth_granite_gate",
        BlockItem(Blocks.SMOOTH_GRANITE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val CUT_GRANITE =
        register("cut_granite", BlockItem(Blocks.CUT_GRANITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_GRANITE_SLAB =
        register("cut_granite_slab", BlockItem(Blocks.CUT_GRANITE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_GRANITE_STAIRS = register(
        "cut_granite_stairs",
        BlockItem(Blocks.CUT_GRANITE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_GRANITE_WALL =
        register("cut_granite_wall", BlockItem(Blocks.CUT_GRANITE_WALL, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_GRANITE_GATE =
        register("cut_granite_gate", BlockItem(Blocks.CUT_GRANITE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))

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
    val GRANITE_BRICKS =
        register("granite_bricks", BlockItem(Blocks.GRANITE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()))
    val GRANITE_BRICK_SLAB = register(
        "granite_brick_slab",
        BlockItem(Blocks.GRANITE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val GRANITE_BRICK_STAIRS = register(
        "granite_brick_stairs",
        BlockItem(Blocks.GRANITE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val GRANITE_BRICK_WALL = register(
        "granite_brick_wall",
        BlockItem(Blocks.GRANITE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val GRANITE_BRICK_GATE = register(
        "granite_brick_gate",
        BlockItem(Blocks.GRANITE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Cracked Bricks
    //cracked_granite_bricks
    //cracked_granite_brick_slab
    //cracked_granite_brick_stairs
    //cracked_granite_brick_wall
    //Mossy Bricks
    //mossy_granite_bricks
    //mossy_granite_brick_slab
    //mossy_granite_brick_stairs
    //mossy_granite_brick_wall
    //Pillars and Chiseled
    val CHISELED_GRANITE =
        register("chiseled_granite", BlockItem(Blocks.CHISELED_GRANITE, ItemGroups.consistencyPlusStoneItemSettings()))
    val GRANITE_PILLAR =
        register("granite_pillar", BlockItem(Blocks.GRANITE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()))

    //cracked_granite_pillar
    //mossy_granite_pillar
    //chiseled_granite_bricks
    //cracked_chiseled_granite_bricks
    //mossy_chiseled_granite_bricks
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_GRANITE =
        register("carved_granite", BlockItem(Blocks.CARVED_GRANITE, ItemGroups.consistencyPlusStoneItemSettings()))

    //cracked carved
    //mossy carved
    //clay
    val CLAY_SLAB = register("clay_slab", BlockItem(Blocks.CLAY_SLAB, Item.Settings()))
    val CLAY_STAIRS = register("clay_stairs", BlockItem(Blocks.CLAY_STAIRS, Item.Settings()))
    val CLAY_WALL = register("clay_wall", BlockItem(Blocks.CLAY_WALL, Item.Settings()))
    val POLISHED_CLAY = register("polished_clay", BlockItem(Blocks.POLISHED_CLAY, Item.Settings()))
    val POLISHED_CLAY_SLAB = register("polished_clay_slab", BlockItem(Blocks.POLISHED_CLAY_SLAB, Item.Settings()))
    val POLISHED_CLAY_STAIRS = register("polished_clay_stairs", BlockItem(Blocks.POLISHED_CLAY_STAIRS, Item.Settings()))
    val POLISHED_CLAY_WALL = register("polished_clay_wall", BlockItem(Blocks.POLISHED_CLAY_WALL, Item.Settings()))

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
    val CUT_CLAY = register("cut_clay", BlockItem(Blocks.CUT_CLAY, Item.Settings()))
    val CUT_CLAY_SLAB = register("cut_clay_slab", BlockItem(Blocks.CUT_CLAY_SLAB, Item.Settings()))
    val CUT_CLAY_STAIRS = register("cut_clay_stairs", BlockItem(Blocks.CUT_CLAY_STAIRS, Item.Settings()))
    val CUT_CLAY_WALL = register("cut_clay_wall", BlockItem(Blocks.CUT_CLAY_WALL, Item.Settings()))
    val SMOOTH_CLAY = register("smooth_clay", BlockItem(Blocks.SMOOTH_CLAY, Item.Settings()))
    val SMOOTH_CLAY_SLAB = register("smooth_clay_slab", BlockItem(Blocks.SMOOTH_CLAY_SLAB, Item.Settings()))
    val SMOOTH_CLAY_STAIRS = register("smooth_clay_stairs", BlockItem(Blocks.SMOOTH_CLAY_STAIRS, Item.Settings()))
    val SMOOTH_CLAY_WALL = register("smooth_clay_wall", BlockItem(Blocks.SMOOTH_CLAY_WALL, Item.Settings()))

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
    //cracked_bricks
    //cracked_brick_slab
    //cracked_brick_stairs
    //cracked_brick_wall
    //Mossy Bricks
    //mossy_bricks
    //mossy_brick_slab
    //mossy_brick_stairs
    //mossy_brick_wall
    val BRICK_GATE =
        register("brick_gate", BlockItem(Blocks.BRICK_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))

    //Pillars and Chiseled
    val CHISELED_BRICKS =
        register("chiseled_bricks", BlockItem(Blocks.CHISELED_BRICKS, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BRICK_PILLAR =
        register("brick_pillar", BlockItem(Blocks.BRICK_PILLAR, ItemGroups.consistencyPlusDyeableItemSettings()))

    //mossy_chiseled_bricks
    //cracked_chiseled_bricks
    //mossy_brick_pillar
    //cracked_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_BRICKS =
        register("carved_bricks", BlockItem(Blocks.CARVED_BRICKS, ItemGroups.consistencyPlusDyeableItemSettings()))

    //cracked carved
    //mossy carved
    //Nether Bricks
    //Cracked Bricks
    val CRACKED_NETHER_BRICK_SLAB = register(
        "cracked_nether_brick_slab",
        BlockItem(Blocks.CRACKED_NETHER_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_NETHER_BRICK_STAIRS = register(
        "cracked_nether_brick_stairs",
        BlockItem(Blocks.CRACKED_NETHER_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_NETHER_BRICK_WALL = register(
        "cracked_nether_brick_wall",
        BlockItem(Blocks.CRACKED_NETHER_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_NETHER_BRICK_FENCE_GATE = register(
        "cracked_nether_brick_fence_gate",
        BlockItem(Blocks.CRACKED_NETHER_BRICK_FENCE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Mossy Bricks
    //mossy_nether_bricks
    //mossy_nether_brick_slab
    //mossy_nether_brick_stairs
    //mossy_nether_brick_wall
    //Pillars and Chiseled
    val CHISELED_NETHER_BRICKS = register(
        "chiseled_nether_bricks",
        BlockItem(Blocks.CHISELED_NETHER_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_chiseled_nether_bricks
    //cracked_chiseled_nether_bricks
    val NETHER_BRICK_PILLAR = register(
        "nether_brick_pillar",
        BlockItem(Blocks.NETHER_BRICK_PILLAR, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_nether_brick_pillar
    //cracked_nether_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    //carved
    //cracked carved
    //mossy carved
    //Red Nether Bricks
    //Cracked Bricks
    //cracked_red_nether_bricks
    //cracked_red_nether_brick_slab
    //cracked_red_nether_brick_stairs
    //cracked_red_nether_brick_wall
    //Mossy Bricks
    //mossy_red_nether_bricks
    //mossy_red_nether_brick_slab
    //mossy_red_nether_brick_stairs
    //mossy_red_nether_brick_wall
    val RED_NETHER_BRICK_FENCE_GATE = register(
        "red_nether_brick_fence_gate",
        BlockItem(Blocks.RED_NETHER_BRICK_FENCE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Pillars and Chiseled
    val CHISELED_RED_NETHER_BRICKS = register(
        "chiseled_red_nether_bricks",
        BlockItem(Blocks.CHISELED_RED_NETHER_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_chiseled_red_nether_bricks
    //cracked_chiseled_red_nether_bricks
    val RED_NETHER_BRICK_PILLAR = register(
        "red_nether_brick_pillar",
        BlockItem(Blocks.RED_NETHER_BRICK_PILLAR, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_red_nether_brick_pillar
    //cracked_red_nether_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_RED_NETHER_BRICKS = register(
        "carved_red_nether_bricks",
        BlockItem(Blocks.CARVED_RED_NETHER_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //cracked carved
    //mossy carved
    //Blue Nether Bricks
    //Bricks
    val BLUE_NETHER_BRICKS = register(
        "blue_nether_bricks",
        BlockItem(Blocks.BLUE_NETHER_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val BLUE_NETHER_BRICK_SLAB = register(
        "blue_nether_brick_slab",
        BlockItem(Blocks.BLUE_NETHER_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val BLUE_NETHER_BRICK_STAIRS = register(
        "blue_nether_brick_stairs",
        BlockItem(Blocks.BLUE_NETHER_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val BLUE_NETHER_BRICK_WALL = register(
        "blue_nether_brick_wall",
        BlockItem(Blocks.BLUE_NETHER_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val BLUE_NETHER_BRICK_FENCE_GATE = register(
        "blue_nether_brick_fence_gate",
        BlockItem(Blocks.BLUE_NETHER_BRICK_FENCE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Cracked Bricks
    val CRACKED_BLUE_NETHER_BRICKS = register(
        "cracked_blue_nether_bricks",
        BlockItem(Blocks.CRACKED_BLUE_NETHER_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_BLUE_NETHER_BRICK_SLAB = register(
        "cracked_blue_nether_brick_slab",
        BlockItem(Blocks.CRACKED_BLUE_NETHER_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_BLUE_NETHER_BRICK_STAIRS = register(
        "cracked_blue_nether_brick_stairs",
        BlockItem(Blocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_BLUE_NETHER_BRICK_WALL = register(
        "cracked_blue_nether_brick_wall",
        BlockItem(Blocks.CRACKED_BLUE_NETHER_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = register(
        "cracked_blue_nether_brick_fence_gate",
        BlockItem(Blocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Mossy Bricks
    //mossy_blue_nether_bricks
    //mossy_blue_nether_brick_slab
    //mossy_blue_nether_brick_stairs
    //mossy_blue_nether_brick_wall
    //Pillars and Chiseled
    val CHISELED_BLUE_NETHER_BRICKS = register(
        "chiseled_blue_nether_bricks",
        BlockItem(Blocks.CHISELED_BLUE_NETHER_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_chiseled_blue_nether_bricks
    //cracked_chiseled_blue_nether_bricks
    val BLUE_NETHER_BRICK_PILLAR = register(
        "blue_nether_brick_pillar",
        BlockItem(Blocks.BLUE_NETHER_BRICK_PILLAR, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_blue_nether_brick_pillar
    //cracked_blue_nether_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_BLUE_NETHER_BRICKS = register(
        "carved_blue_nether_bricks",
        BlockItem(Blocks.CARVED_BLUE_NETHER_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //cracked carved
    //mossy carved
    //Prismarine
    val PRISMARINE_GATE =
        register("prismarine_gate", BlockItem(Blocks.PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

    //Polished
    val POLISHED_PRISMARINE = register(
        "polished_prismarine",
        BlockItem(Blocks.POLISHED_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PRISMARINE_SLAB = register(
        "polished_prismarine_slab",
        BlockItem(Blocks.POLISHED_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PRISMARINE_STAIRS = register(
        "polished_prismarine_stairs",
        BlockItem(Blocks.POLISHED_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PRISMARINE_WALL = register(
        "polished_prismarine_wall",
        BlockItem(Blocks.POLISHED_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PRISMARINE_GATE = register(
        "polished_prismarine_gate",
        BlockItem(Blocks.POLISHED_PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val SMOOTH_PRISMARINE =
        register("smooth_prismarine", BlockItem(Blocks.SMOOTH_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()))
    val SMOOTH_PRISMARINE_SLAB = register(
        "smooth_prismarine_slab",
        BlockItem(Blocks.SMOOTH_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_PRISMARINE_STAIRS = register(
        "smooth_prismarine_stairs",
        BlockItem(Blocks.SMOOTH_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_PRISMARINE_WALL = register(
        "smooth_prismarine_wall",
        BlockItem(Blocks.SMOOTH_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_PRISMARINE_GATE = register(
        "smooth_prismarine_gate",
        BlockItem(Blocks.SMOOTH_PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val CUT_PRISMARINE =
        register("cut_prismarine", BlockItem(Blocks.CUT_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()))
    val CUT_PRISMARINE_SLAB = register(
        "cut_prismarine_slab",
        BlockItem(Blocks.CUT_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CUT_PRISMARINE_STAIRS = register(
        "cut_prismarine_stairs",
        BlockItem(Blocks.CUT_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CUT_PRISMARINE_WALL = register(
        "cut_prismarine_wall",
        BlockItem(Blocks.CUT_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CUT_PRISMARINE_GATE = register(
        "cut_prismarine_gate",
        BlockItem(Blocks.CUT_PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val PRISMARINE_BRICK_WALL = register(
        "prismarine_brick_wall",
        BlockItem(Blocks.PRISMARINE_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val PRISMARINE_BRICK_GATE = register(
        "prismarine_brick_gate",
        BlockItem(Blocks.PRISMARINE_BRICK_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Cracked Bricks
    //cracked_prismarine_bricks
    //cracked_prismarine_brick_slab
    //cracked_prismarine_brick_stairs
    //cracked_prismarine_brick_wall
    //Mossy Bricks
    //mossy_prismarine_bricks
    //mossy_prismarine_brick_slab
    //mossy_prismarine_brick_stairs
    //mossy_prismarine_brick_wall
    //Pillar and Chiseled
    val CHISELED_PRISMARINE = register(
        "chiseled_prismarine",
        BlockItem(Blocks.CHISELED_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_chiseled_prismarine
    //cracked_chiseled_prismarine
    val PRISMARINE_PILLAR =
        register("prismarine_pillar", BlockItem(Blocks.PRISMARINE_PILLAR, ItemGroups.consistencyPlusMiscItemSettings()))

    //mossy_prismarine_pillar
    //cracked_prismarine_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_PRISMARINE =
        register("carved_prismarine", BlockItem(Blocks.CARVED_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()))

    //cracked carved
    //mossy carved
    //Dark Prismarine
    //Block
    val DARK_PRISMARINE_WALL = register(
        "dark_prismarine_wall",
        BlockItem(Blocks.DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val DARK_PRISMARINE_GATE = register(
        "dark_prismarine_gate",
        BlockItem(Blocks.DARK_PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Polished
    val POLISHED_DARK_PRISMARINE = register(
        "polished_dark_prismarine",
        BlockItem(Blocks.POLISHED_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_DARK_PRISMARINE_SLAB = register(
        "polished_dark_prismarine_slab",
        BlockItem(Blocks.POLISHED_DARK_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_DARK_PRISMARINE_STAIRS = register(
        "polished_dark_prismarine_stairs",
        BlockItem(Blocks.POLISHED_DARK_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_DARK_PRISMARINE_WALL = register(
        "polished_dark_prismarine_wall",
        BlockItem(Blocks.POLISHED_DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_DARK_PRISMARINE_GATE = register(
        "polished_dark_prismarine_gate",
        BlockItem(Blocks.POLISHED_DARK_PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val SMOOTH_DARK_PRISMARINE = register(
        "smooth_dark_prismarine",
        BlockItem(Blocks.SMOOTH_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_DARK_PRISMARINE_SLAB = register(
        "smooth_dark_prismarine_slab",
        BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_DARK_PRISMARINE_STAIRS = register(
        "smooth_dark_prismarine_stairs",
        BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_DARK_PRISMARINE_WALL = register(
        "smooth_dark_prismarine_wall",
        BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_DARK_PRISMARINE_GATE = register(
        "smooth_dark_prismarine_gate",
        BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val CUT_DARK_PRISMARINE = register(
        "cut_dark_prismarine",
        BlockItem(Blocks.CUT_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CUT_DARK_PRISMARINE_SLAB = register(
        "cut_dark_prismarine_slab",
        BlockItem(Blocks.CUT_DARK_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CUT_DARK_PRISMARINE_STAIRS = register(
        "cut_dark_prismarine_stairs",
        BlockItem(Blocks.CUT_DARK_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CUT_DARK_PRISMARINE_WALL = register(
        "cut_dark_prismarine_wall",
        BlockItem(Blocks.CUT_DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CUT_DARK_PRISMARINE_GATE = register(
        "cut_dark_prismarine_gate",
        BlockItem(Blocks.CUT_DARK_PRISMARINE_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val DARK_PRISMARINE_BRICKS = register(
        "dark_prismarine_bricks",
        BlockItem(Blocks.DARK_PRISMARINE_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val DARK_PRISMARINE_BRICK_SLAB = register(
        "dark_prismarine_brick_slab",
        BlockItem(Blocks.DARK_PRISMARINE_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val DARK_PRISMARINE_BRICK_STAIRS = register(
        "dark_prismarine_brick_stairs",
        BlockItem(Blocks.DARK_PRISMARINE_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val DARK_PRISMARINE_BRICK_WALL = register(
        "dark_prismarine_brick_wall",
        BlockItem(Blocks.DARK_PRISMARINE_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val DARK_PRISMARINE_BRICK_GATE = register(
        "dark_prismarine_brick_gate",
        BlockItem(Blocks.DARK_PRISMARINE_BRICK_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Cracked Bricks
    //cracked_dark_prismarine_bricks
    //cracked_dark_prismarine_brick_slab
    //cracked_dark_prismarine_brick_stairs
    //cracked_dark_prismarine_brick_wall
    //Mossy Bricks
    //mossy_dark_prismarine_bricks
    //mossy_dark_prismarine_brick_slab
    //mossy_dark_prismarine_brick_stairs
    //mossy_dark_prismarine_brick_wall
    //Pillar and Chiseled
    val CHISELED_DARK_PRISMARINE = register(
        "chiseled_dark_prismarine",
        BlockItem(Blocks.CHISELED_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_chiseled_dark_prismarine
    //cracked_chiseled_dark_prismarine
    val DARK_PRISMARINE_PILLAR = register(
        "dark_prismarine_pillar",
        BlockItem(Blocks.DARK_PRISMARINE_PILLAR, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_dark_prismarine_pillar
    //cracked_dark_prismarine_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_DARK_PRISMARINE = register(
        "carved_dark_prismarine",
        BlockItem(Blocks.CARVED_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //cracked carved
    //mossy carved
    //Purpur
    //Block
    val PURPUR_BLOCK =
        register("purpur_block", BlockItem(Blocks.PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings()))
    val PURPUR_SLAB =
        register("purpur_slab", BlockItem(Blocks.PURPUR_SLAB, ItemGroups.consistencyPlusMiscItemSettings()))
    val PURPUR_STAIRS =
        register("purpur_stairs", BlockItem(Blocks.PURPUR_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()))
    val PURPUR_WALL =
        register("purpur_wall", BlockItem(Blocks.PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings()))
    val PURPUR_GATE =
        register("purpur_gate", BlockItem(Blocks.PURPUR_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

    //Smooth
    val SMOOTH_PURPUR_BLOCK = register(
        "smooth_purpur_block",
        BlockItem(Blocks.SMOOTH_PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_PURPUR_SLAB = register(
        "smooth_purpur_slab",
        BlockItem(Blocks.SMOOTH_PURPUR_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_PURPUR_STAIRS = register(
        "smooth_purpur_stairs",
        BlockItem(Blocks.SMOOTH_PURPUR_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_PURPUR_WALL = register(
        "smooth_purpur_wall",
        BlockItem(Blocks.SMOOTH_PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val SMOOTH_PURPUR_GATE = register(
        "smooth_purpur_gate",
        BlockItem(Blocks.SMOOTH_PURPUR_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
        "polished_purpur_block",
        BlockItem(Blocks.POLISHED_PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PURPUR_SLAB = register(
        "polished_purpur_slab",
        BlockItem(Blocks.POLISHED_PURPUR_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PURPUR_STAIRS = register(
        "polished_purpur_stairs",
        BlockItem(Blocks.POLISHED_PURPUR_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PURPUR_WALL = register(
        "polished_purpur_wall",
        BlockItem(Blocks.POLISHED_PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val POLISHED_PURPUR_GATE = register(
        "polished_purpur_gate",
        BlockItem(Blocks.POLISHED_PURPUR_GATE, ItemGroups.consistencyPlusMiscItemSettings())
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
    val CUT_PURPUR_WALL =
        register("cut_purpur_wall", BlockItem(Blocks.CUT_PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings()))
    val CUT_PURPUR_GATE =
        register("cut_purpur_gate", BlockItem(Blocks.CUT_PURPUR_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

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
    val PURPUR_BRICKS =
        register("purpur_bricks", BlockItem(Blocks.PURPUR_BRICKS, ItemGroups.consistencyPlusMiscItemSettings()))
    val PURPUR_BRICK_SLAB =
        register("purpur_brick_slab", BlockItem(Blocks.PURPUR_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings()))
    val PURPUR_BRICK_STAIRS = register(
        "purpur_brick_stairs",
        BlockItem(Blocks.PURPUR_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val PURPUR_BRICK_WALL =
        register("purpur_brick_wall", BlockItem(Blocks.PURPUR_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings()))
    val PURPUR_BRICK_GATE =
        register("purpur_brick_gate", BlockItem(Blocks.PURPUR_BRICK_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

    //Cracked Bricks
    val CRACKED_PURPUR_BRICKS = register(
        "cracked_purpur_bricks",
        BlockItem(Blocks.CRACKED_PURPUR_BRICKS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_PURPUR_BRICK_SLAB = register(
        "cracked_purpur_brick_slab",
        BlockItem(Blocks.CRACKED_PURPUR_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_PURPUR_BRICK_STAIRS = register(
        "cracked_purpur_brick_stairs",
        BlockItem(Blocks.CRACKED_PURPUR_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRACKED_PURPUR_BRICK_WALL = register(
        "cracked_purpur_brick_wall",
        BlockItem(Blocks.CRACKED_PURPUR_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //Mossy Bricks
    //mossy_purpur_bricks
    //mossy_purpur_brick_slab
    //mossy_purpur_brick_stairs
    //mossy_purpur_brick_wall
    //Pillars and Chiseled
    val CHISELED_PURPUR_BLOCK = register(
        "chiseled_purpur_block",
        BlockItem(Blocks.CHISELED_PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings())
    )

    //mossy_chiseled_purpur
    //cracked_chiseled_purpur
    //mossy_purpur_pillar
    //cracked_purpur_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_PURPUR =
        register("carved_purpur", BlockItem(Blocks.CARVED_PURPUR, ItemGroups.consistencyPlusMiscItemSettings()))

    //cracked carved
    //mossy carved
    //End Stone
    //Block
    val END_STONE_SLAB =
        register("end_stone_slab", BlockItem(Blocks.END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()))
    val END_STONE_STAIRS =
        register("end_stone_stairs", BlockItem(Blocks.END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()))
    val END_STONE_WALL =
        register("end_stone_wall", BlockItem(Blocks.END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()))
    val END_STONE_GATE =
        register("end_stone_gate", BlockItem(Blocks.END_STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings()))
    val END_STONE_BRICK_GATE = register(
        "end_stone_brick_gate",
        BlockItem(Blocks.END_STONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //Smooth
    val SMOOTH_END_STONE =
        register("smooth_end_stone", BlockItem(Blocks.SMOOTH_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()))
    val SMOOTH_END_STONE_SLAB = register(
        "smooth_end_stone_slab",
        BlockItem(Blocks.SMOOTH_END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_END_STONE_STAIRS = register(
        "smooth_end_stone_stairs",
        BlockItem(Blocks.SMOOTH_END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_END_STONE_WALL = register(
        "smooth_end_stone_wall",
        BlockItem(Blocks.SMOOTH_END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_END_STONE_GATE = register(
        "smooth_end_stone_gate",
        BlockItem(Blocks.SMOOTH_END_STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    //CUT
    val CUT_END_STONE =
        register("cut_end_stone", BlockItem(Blocks.CUT_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()))
    val CUT_END_STONE_SLAB = register(
        "cut_end_stone_slab",
        BlockItem(Blocks.CUT_END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_END_STONE_STAIRS = register(
        "cut_end_stone_stairs",
        BlockItem(Blocks.CUT_END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_END_STONE_WALL = register(
        "cut_end_stone_wall",
        BlockItem(Blocks.CUT_END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_END_STONE_GATE = register(
        "cut_end_stone_gate",
        BlockItem(Blocks.CUT_END_STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    val POLISHED_END_STONE = register(
        "polished_end_stone",
        BlockItem(Blocks.POLISHED_END_STONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_END_STONE_SLAB = register(
        "polished_end_stone_slab",
        BlockItem(Blocks.POLISHED_END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_END_STONE_STAIRS = register(
        "polished_end_stone_stairs",
        BlockItem(Blocks.POLISHED_END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_END_STONE_WALL = register(
        "polished_end_stone_wall",
        BlockItem(Blocks.POLISHED_END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_END_STONE_GATE = register(
        "polished_end_stone_gate",
        BlockItem(Blocks.POLISHED_END_STONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
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
    //Cracked Bricks
    //cracked_end_stone_bricks
    //cracked_end_stone_brick_slab
    //cracked_end_stone_brick_stairs
    //cracked_end_stone_brick_wall
    //Mossy Bricks
    //mossy_end_stone_bricks
    //mossy_end_stone_brick_slab
    //mossy_end_stone_brick_stairs
    //mossy_end_stone_brick_wall
    // Pillars and Chiseled
    val CHISELED_END_STONE = register(
        "chiseled_end_stone",
        BlockItem(Blocks.CHISELED_END_STONE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //mossy_chiseled_end_stone_bricks
    //cracked_chiseled_end_stone_bricks
    val END_STONE_BRICK_PILLAR = register(
        "end_stone_brick_pillar",
        BlockItem(Blocks.END_STONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )

    //mossy_end_stone_brick_pillar
    //cracked_end_stone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    val CARVED_END_STONE =
        register("carved_end_stone", BlockItem(Blocks.CARVED_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()))

    //cracked carved
    //mossy carved
    // Soul Sandstone
    // Block
    val SOUL_SANDSTONE =
        register("soul_sandstone", BlockItem(Blocks.SOUL_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings()))
    val SOUL_SANDSTONE_SLAB = register(
        "soul_sandstone_slab",
        BlockItem(Blocks.SOUL_SANDSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_STAIRS = register(
        "soul_sandstone_stairs",
        BlockItem(Blocks.SOUL_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_WALL = register(
        "soul_sandstone_wall",
        BlockItem(Blocks.SOUL_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_GATE = register(
        "soul_sandstone_gate",
        BlockItem(Blocks.SOUL_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_PILLAR = register(
        "soul_sandstone_pillar",
        BlockItem(Blocks.SOUL_SANDSTONE_PILLAR, ItemGroups.consistencyPlusStoneItemSettings())
    )

    // Smooth
    val SMOOTH_SOUL_SANDSTONE = register(
        "smooth_soul_sandstone",
        BlockItem(Blocks.SMOOTH_SOUL_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_SOUL_SANDSTONE_SLAB = register(
        "smooth_soul_sandstone_slab",
        BlockItem(Blocks.SMOOTH_SOUL_SANDSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_SOUL_SANDSTONE_STAIRS = register(
        "smooth_soul_sandstone_stairs",
        BlockItem(Blocks.SMOOTH_SOUL_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_SOUL_SANDSTONE_WALL = register(
        "smooth_soul_sandstone_wall",
        BlockItem(Blocks.SMOOTH_SOUL_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SMOOTH_SOUL_SANDSTONE_GATE = register(
        "smooth_soul_sandstone_gate",
        BlockItem(Blocks.SMOOTH_SOUL_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    // Polished
    val POLISHED_SOUL_SANDSTONE = register(
        "polished_soul_sandstone",
        BlockItem(Blocks.POLISHED_SOUL_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SOUL_SANDSTONE_SLAB = register(
        "polished_soul_sandstone_slab",
        BlockItem(Blocks.POLISHED_SOUL_SANDSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SOUL_SANDSTONE_STAIRS = register(
        "polished_soul_sandstone_stairs",
        BlockItem(Blocks.POLISHED_SOUL_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SOUL_SANDSTONE_WALL = register(
        "polished_soul_sandstone_wall",
        BlockItem(Blocks.POLISHED_SOUL_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val POLISHED_SOUL_SANDSTONE_GATE = register(
        "polished_soul_sandstone_gate",
        BlockItem(Blocks.POLISHED_SOUL_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    // Bricks
    val SOUL_SANDSTONE_BRICKS = register(
        "soul_sandstone_bricks",
        BlockItem(Blocks.SOUL_SANDSTONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_BRICK_SLAB = register(
        "soul_sandstone_brick_slab",
        BlockItem(Blocks.SOUL_SANDSTONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_BRICk_STAIRS = register(
        "soul_sandstone_brick_stairs",
        BlockItem(Blocks.SOUL_SANDSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_BRICK_WALL = register(
        "soul_sandstone_brick_wall",
        BlockItem(Blocks.SOUL_SANDSTONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val SOUL_SANDSTONE_BRICK_GATE = register(
        "soul_sandstone_brick_gate",
        BlockItem(Blocks.SOUL_SANDSTONE_BRICK_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    // Cut
    val CUT_SOUL_SANDSTONE = register(
        "cut_soul_sandstone",
        BlockItem(Blocks.CUT_SOUL_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_SOUL_SANDSTONE_SLAB = register(
        "cut_soul_sandstone_slab",
        BlockItem(Blocks.CUT_SOUL_SANDSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_SOUL_SANDSTONE_STAIRS = register(
        "cut_soul_sandstone_stairs",
        BlockItem(Blocks.CUT_SOUL_SANDSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_SOUL_SANDSTONE_WALL = register(
        "cut_soul_sandstone_wall",
        BlockItem(Blocks.CUT_SOUL_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CUT_SOUL_SANDSTONE_GATE = register(
        "cut_soul_sandstone_gate",
        BlockItem(Blocks.CUT_SOUL_SANDSTONE_GATE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CHISELED_SOUL_SANDSTONE = register(
        "chiseled_soul_sandstone",
        BlockItem(Blocks.CHISELED_SOUL_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )
    val CARVED_SOUL_SANDSTONE = register(
        "carved_soul_sandstone",
        BlockItem(Blocks.CARVED_SOUL_SANDSTONE, ItemGroups.consistencyPlusStoneItemSettings())
    )

    // Terracotta
    // Terracotta Slab
    val RED_TERRACOTTA_SLAB = register(
        "red_terracotta_slab",
        BlockItem(Blocks.RED_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_TERRACOTTA_SLAB = register(
        "orange_terracotta_slab",
        BlockItem(Blocks.ORANGE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_TERRACOTTA_SLAB = register(
        "yellow_terracotta_slab",
        BlockItem(Blocks.YELLOW_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_TERRACOTTA_SLAB = register(
        "lime_terracotta_slab",
        BlockItem(Blocks.LIME_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_TERRACOTTA_SLAB = register(
        "green_terracotta_slab",
        BlockItem(Blocks.GREEN_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_TERRACOTTA_SLAB = register(
        "blue_terracotta_slab",
        BlockItem(Blocks.BLUE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_TERRACOTTA_SLAB = register(
        "cyan_terracotta_slab",
        BlockItem(Blocks.CYAN_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_TERRACOTTA_SLAB = register(
        "light_blue_terracotta_slab",
        BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_TERRACOTTA_SLAB = register(
        "purple_terracotta_slab",
        BlockItem(Blocks.PURPLE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_TERRACOTTA_SLAB = register(
        "magenta_terracotta_slab",
        BlockItem(Blocks.MAGENTA_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_TERRACOTTA_SLAB = register(
        "pink_terracotta_slab",
        BlockItem(Blocks.PINK_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_TERRACOTTA_SLAB = register(
        "white_terracotta_slab",
        BlockItem(Blocks.WHITE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_TERRACOTTA_SLAB = register(
        "light_gray_terracotta_slab",
        BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_TERRACOTTA_SLAB = register(
        "gray_terracotta_slab",
        BlockItem(Blocks.GRAY_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_TERRACOTTA_SLAB = register(
        "black_terracotta_slab",
        BlockItem(Blocks.BLACK_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_TERRACOTTA_SLAB = register(
        "brown_terracotta_slab",
        BlockItem(Blocks.BROWN_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val TERRACOTTA_SLAB =
        register("terracotta_slab", BlockItem(Blocks.TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Terracotta Stairs
    val RED_TERRACOTTA_STAIRS = register(
        "red_terracotta_stairs",
        BlockItem(Blocks.RED_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_TERRACOTTA_STAIRS = register(
        "orange_terracotta_stairs",
        BlockItem(Blocks.ORANGE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_TERRACOTTA_STAIRS = register(
        "yellow_terracotta_stairs",
        BlockItem(Blocks.YELLOW_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_TERRACOTTA_STAIRS = register(
        "lime_terracotta_stairs",
        BlockItem(Blocks.LIME_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_TERRACOTTA_STAIRS = register(
        "green_terracotta_stairs",
        BlockItem(Blocks.GREEN_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_TERRACOTTA_STAIRS = register(
        "blue_terracotta_stairs",
        BlockItem(Blocks.BLUE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_TERRACOTTA_STAIRS = register(
        "cyan_terracotta_stairs",
        BlockItem(Blocks.CYAN_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_TERRACOTTA_STAIRS = register(
        "light_blue_terracotta_stairs",
        BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_TERRACOTTA_STAIRS = register(
        "purple_terracotta_stairs",
        BlockItem(Blocks.PURPLE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_TERRACOTTA_STAIRS = register(
        "magenta_terracotta_stairs",
        BlockItem(Blocks.MAGENTA_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_TERRACOTTA_STAIRS = register(
        "pink_terracotta_stairs",
        BlockItem(Blocks.PINK_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_TERRACOTTA_STAIRS = register(
        "white_terracotta_stairs",
        BlockItem(Blocks.WHITE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_TERRACOTTA_STAIRS = register(
        "light_gray_terracotta_stairs",
        BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_TERRACOTTA_STAIRS = register(
        "gray_terracotta_stairs",
        BlockItem(Blocks.GRAY_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_TERRACOTTA_STAIRS = register(
        "black_terracotta_stairs",
        BlockItem(Blocks.BLACK_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_TERRACOTTA_STAIRS = register(
        "brown_terracotta_stairs",
        BlockItem(Blocks.BROWN_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val TERRACOTTA_STAIRS = register(
        "terracotta_stairs",
        BlockItem(Blocks.TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )

    // Terracotta Wall
    val RED_TERRACOTTA_WALL = register(
        "red_terracotta_wall",
        BlockItem(Blocks.RED_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_TERRACOTTA_WALL = register(
        "orange_terracotta_wall",
        BlockItem(Blocks.ORANGE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_TERRACOTTA_WALL = register(
        "yellow_terracotta_wall",
        BlockItem(Blocks.YELLOW_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_TERRACOTTA_WALL = register(
        "lime_terracotta_wall",
        BlockItem(Blocks.LIME_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_TERRACOTTA_WALL = register(
        "green_terracotta_wall",
        BlockItem(Blocks.GREEN_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_TERRACOTTA_WALL = register(
        "blue_terracotta_wall",
        BlockItem(Blocks.BLUE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_TERRACOTTA_WALL = register(
        "cyan_terracotta_wall",
        BlockItem(Blocks.CYAN_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_TERRACOTTA_WALL = register(
        "light_blue_terracotta_wall",
        BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_TERRACOTTA_WALL = register(
        "purple_terracotta_wall",
        BlockItem(Blocks.PURPLE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_TERRACOTTA_WALL = register(
        "magenta_terracotta_wall",
        BlockItem(Blocks.MAGENTA_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_TERRACOTTA_WALL = register(
        "pink_terracotta_wall",
        BlockItem(Blocks.PINK_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_TERRACOTTA_WALL = register(
        "white_terracotta_wall",
        BlockItem(Blocks.WHITE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_TERRACOTTA_WALL = register(
        "light_gray_terracotta_wall",
        BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_TERRACOTTA_WALL = register(
        "gray_terracotta_wall",
        BlockItem(Blocks.GRAY_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_TERRACOTTA_WALL = register(
        "black_terracotta_wall",
        BlockItem(Blocks.BLACK_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_TERRACOTTA_WALL = register(
        "brown_terracotta_wall",
        BlockItem(Blocks.BROWN_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val TERRACOTTA_WALL =
        register("terracotta_wall", BlockItem(Blocks.TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Terracotta Gate
    val RED_TERRACOTTA_GATE = register(
        "red_terracotta_gate",
        BlockItem(Blocks.RED_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_TERRACOTTA_GATE = register(
        "orange_terracotta_gate",
        BlockItem(Blocks.ORANGE_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_TERRACOTTA_GATE = register(
        "yellow_terracotta_gate",
        BlockItem(Blocks.YELLOW_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_TERRACOTTA_GATE = register(
        "lime_terracotta_gate",
        BlockItem(Blocks.LIME_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_TERRACOTTA_GATE = register(
        "green_terracotta_gate",
        BlockItem(Blocks.GREEN_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_TERRACOTTA_GATE = register(
        "blue_terracotta_gate",
        BlockItem(Blocks.BLUE_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_TERRACOTTA_GATE = register(
        "cyan_terracotta_gate",
        BlockItem(Blocks.CYAN_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_TERRACOTTA_GATE = register(
        "light_blue_terracotta_gate",
        BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_TERRACOTTA_GATE = register(
        "purple_terracotta_gate",
        BlockItem(Blocks.PURPLE_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_TERRACOTTA_GATE = register(
        "magenta_terracotta_gate",
        BlockItem(Blocks.MAGENTA_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_TERRACOTTA_GATE = register(
        "pink_terracotta_gate",
        BlockItem(Blocks.PINK_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_TERRACOTTA_GATE = register(
        "white_terracotta_gate",
        BlockItem(Blocks.WHITE_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_TERRACOTTA_GATE = register(
        "light_gray_terracotta_gate",
        BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_TERRACOTTA_GATE = register(
        "gray_terracotta_gate",
        BlockItem(Blocks.GRAY_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_TERRACOTTA_GATE = register(
        "black_terracotta_gate",
        BlockItem(Blocks.BLACK_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_TERRACOTTA_GATE = register(
        "brown_terracotta_gate",
        BlockItem(Blocks.BROWN_TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val TERRACOTTA_GATE =
        register("terracotta_gate", BlockItem(Blocks.TERRACOTTA_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Concrete
    // Concrete Slab
    val RED_CONCRETE_SLAB = register(
        "red_concrete_slab",
        BlockItem(Blocks.RED_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_CONCRETE_SLAB = register(
        "orange_concrete_slab",
        BlockItem(Blocks.ORANGE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_CONCRETE_SLAB = register(
        "yellow_concrete_slab",
        BlockItem(Blocks.YELLOW_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_CONCRETE_SLAB = register(
        "lime_concrete_slab",
        BlockItem(Blocks.LIME_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_CONCRETE_SLAB = register(
        "green_concrete_slab",
        BlockItem(Blocks.GREEN_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_CONCRETE_SLAB = register(
        "blue_concrete_slab",
        BlockItem(Blocks.BLUE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_CONCRETE_SLAB = register(
        "cyan_concrete_slab",
        BlockItem(Blocks.CYAN_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_CONCRETE_SLAB = register(
        "light_blue_concrete_slab",
        BlockItem(Blocks.LIGHT_BLUE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_CONCRETE_SLAB = register(
        "purple_concrete_slab",
        BlockItem(Blocks.PURPLE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_CONCRETE_SLAB = register(
        "magenta_concrete_slab",
        BlockItem(Blocks.MAGENTA_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_CONCRETE_SLAB = register(
        "pink_concrete_slab",
        BlockItem(Blocks.PINK_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_CONCRETE_SLAB = register(
        "white_concrete_slab",
        BlockItem(Blocks.WHITE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_CONCRETE_SLAB = register(
        "light_gray_concrete_slab",
        BlockItem(Blocks.LIGHT_GRAY_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_CONCRETE_SLAB = register(
        "gray_concrete_slab",
        BlockItem(Blocks.GRAY_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_CONCRETE_SLAB = register(
        "black_concrete_slab",
        BlockItem(Blocks.BLACK_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_CONCRETE_SLAB = register(
        "brown_concrete_slab",
        BlockItem(Blocks.BROWN_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )

    // Concrete Stairs
    val RED_CONCRETE_STAIRS = register(
        "red_concrete_stairs",
        BlockItem(Blocks.RED_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_CONCRETE_STAIRS = register(
        "orange_concrete_stairs",
        BlockItem(Blocks.ORANGE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_CONCRETE_STAIRS = register(
        "yellow_concrete_stairs",
        BlockItem(Blocks.YELLOW_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_CONCRETE_STAIRS = register(
        "lime_concrete_stairs",
        BlockItem(Blocks.LIME_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_CONCRETE_STAIRS = register(
        "green_concrete_stairs",
        BlockItem(Blocks.GREEN_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_CONCRETE_STAIRS = register(
        "blue_concrete_stairs",
        BlockItem(Blocks.BLUE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_CONCRETE_STAIRS = register(
        "cyan_concrete_stairs",
        BlockItem(Blocks.CYAN_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_CONCRETE_STAIRS = register(
        "light_blue_concrete_stairs",
        BlockItem(Blocks.LIGHT_BLUE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_CONCRETE_STAIRS = register(
        "purple_concrete_stairs",
        BlockItem(Blocks.PURPLE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_CONCRETE_STAIRS = register(
        "magenta_concrete_stairs",
        BlockItem(Blocks.MAGENTA_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_CONCRETE_STAIRS = register(
        "pink_concrete_stairs",
        BlockItem(Blocks.PINK_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_CONCRETE_STAIRS = register(
        "white_concrete_stairs",
        BlockItem(Blocks.WHITE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_CONCRETE_STAIRS = register(
        "light_gray_concrete_stairs",
        BlockItem(Blocks.LIGHT_GRAY_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_CONCRETE_STAIRS = register(
        "gray_concrete_stairs",
        BlockItem(Blocks.GRAY_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_CONCRETE_STAIRS = register(
        "black_concrete_stairs",
        BlockItem(Blocks.BLACK_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_CONCRETE_STAIRS = register(
        "brown_concrete_stairs",
        BlockItem(Blocks.BROWN_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )

    // Concrete Wall
    val RED_CONCRETE_WALL = register(
        "red_concrete_wall",
        BlockItem(Blocks.RED_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_CONCRETE_WALL = register(
        "orange_concrete_wall",
        BlockItem(Blocks.ORANGE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_CONCRETE_WALL = register(
        "yellow_concrete_wall",
        BlockItem(Blocks.YELLOW_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_CONCRETE_WALL = register(
        "lime_concrete_wall",
        BlockItem(Blocks.LIME_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_CONCRETE_WALL = register(
        "green_concrete_wall",
        BlockItem(Blocks.GREEN_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_CONCRETE_WALL = register(
        "blue_concrete_wall",
        BlockItem(Blocks.BLUE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_CONCRETE_WALL = register(
        "cyan_concrete_wall",
        BlockItem(Blocks.CYAN_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_CONCRETE_WALL = register(
        "light_blue_concrete_wall",
        BlockItem(Blocks.LIGHT_BLUE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_CONCRETE_WALL = register(
        "purple_concrete_wall",
        BlockItem(Blocks.PURPLE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_CONCRETE_WALL = register(
        "magenta_concrete_wall",
        BlockItem(Blocks.MAGENTA_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_CONCRETE_WALL = register(
        "pink_concrete_wall",
        BlockItem(Blocks.PINK_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_CONCRETE_WALL = register(
        "white_concrete_wall",
        BlockItem(Blocks.WHITE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_CONCRETE_WALL = register(
        "light_gray_concrete_wall",
        BlockItem(Blocks.LIGHT_GRAY_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_CONCRETE_WALL = register(
        "gray_concrete_wall",
        BlockItem(Blocks.GRAY_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_CONCRETE_WALL = register(
        "black_concrete_wall",
        BlockItem(Blocks.BLACK_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_CONCRETE_WALL = register(
        "brown_concrete_wall",
        BlockItem(Blocks.BROWN_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )

    // Concrete Gate
    val RED_CONCRETE_GATE = register(
        "red_concrete_gate",
        BlockItem(Blocks.RED_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_CONCRETE_GATE = register(
        "orange_concrete_gate",
        BlockItem(Blocks.ORANGE_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_CONCRETE_GATE = register(
        "yellow_concrete_gate",
        BlockItem(Blocks.YELLOW_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_CONCRETE_GATE = register(
        "lime_concrete_gate",
        BlockItem(Blocks.LIME_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_CONCRETE_GATE = register(
        "green_concrete_gate",
        BlockItem(Blocks.GREEN_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_CONCRETE_GATE = register(
        "blue_concrete_gate",
        BlockItem(Blocks.BLUE_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_CONCRETE_GATE = register(
        "cyan_concrete_gate",
        BlockItem(Blocks.CYAN_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_CONCRETE_GATE = register(
        "light_blue_concrete_gate",
        BlockItem(Blocks.LIGHT_BLUE_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_CONCRETE_GATE = register(
        "purple_concrete_gate",
        BlockItem(Blocks.PURPLE_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_CONCRETE_GATE = register(
        "magenta_concrete_gate",
        BlockItem(Blocks.MAGENTA_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_CONCRETE_GATE = register(
        "pink_concrete_gate",
        BlockItem(Blocks.PINK_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_CONCRETE_GATE = register(
        "white_concrete_gate",
        BlockItem(Blocks.WHITE_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_CONCRETE_GATE = register(
        "light_gray_concrete_gate",
        BlockItem(Blocks.LIGHT_GRAY_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_CONCRETE_GATE = register(
        "gray_concrete_gate",
        BlockItem(Blocks.GRAY_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_CONCRETE_GATE = register(
        "black_concrete_gate",
        BlockItem(Blocks.BLACK_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_CONCRETE_GATE = register(
        "brown_concrete_gate",
        BlockItem(Blocks.BROWN_CONCRETE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val RED_GLOWSTONE =
        register("red_glowstone", BlockItem(Blocks.RED_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val ORANGE_GLOWSTONE = register(
        "orange_glowstone",
        BlockItem(Blocks.ORANGE_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_GLOWSTONE = register(
        "yellow_glowstone",
        BlockItem(Blocks.YELLOW_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_GLOWSTONE =
        register("lime_glowstone", BlockItem(Blocks.LIME_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val GREEN_GLOWSTONE =
        register("green_glowstone", BlockItem(Blocks.GREEN_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLUE_GLOWSTONE =
        register("blue_glowstone", BlockItem(Blocks.BLUE_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val CYAN_GLOWSTONE =
        register("cyan_glowstone", BlockItem(Blocks.CYAN_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_BLUE_GLOWSTONE = register(
        "light_blue_glowstone",
        BlockItem(Blocks.LIGHT_BLUE_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_GLOWSTONE = register(
        "purple_glowstone",
        BlockItem(Blocks.PURPLE_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_GLOWSTONE = register(
        "magenta_glowstone",
        BlockItem(Blocks.MAGENTA_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_GLOWSTONE =
        register("pink_glowstone", BlockItem(Blocks.PINK_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val WHITE_GLOWSTONE =
        register("white_glowstone", BlockItem(Blocks.WHITE_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_GRAY_GLOWSTONE = register(
        "light_gray_glowstone",
        BlockItem(Blocks.LIGHT_GRAY_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_GLOWSTONE =
        register("gray_glowstone", BlockItem(Blocks.GRAY_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLACK_GLOWSTONE =
        register("black_glowstone", BlockItem(Blocks.BLACK_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BROWN_GLOWSTONE =
        register("brown_glowstone", BlockItem(Blocks.BROWN_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val SOUL_GLOWSTONE =
        register("soul_glowstone", BlockItem(Blocks.SOUL_GLOWSTONE, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Glowstone Slab
    val RED_GLOWSTONE_SLAB = register(
        "red_glowstone_slab",
        BlockItem(Blocks.RED_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_GLOWSTONE_SLAB = register(
        "orange_glowstone_slab",
        BlockItem(Blocks.ORANGE_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_GLOWSTONE_SLAB = register(
        "yellow_glowstone_slab",
        BlockItem(Blocks.YELLOW_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_GLOWSTONE_SLAB = register(
        "lime_glowstone_slab",
        BlockItem(Blocks.LIME_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_GLOWSTONE_SLAB = register(
        "green_glowstone_slab",
        BlockItem(Blocks.GREEN_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_GLOWSTONE_SLAB = register(
        "blue_glowstone_slab",
        BlockItem(Blocks.BLUE_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_GLOWSTONE_SLAB = register(
        "cyan_glowstone_slab",
        BlockItem(Blocks.CYAN_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_GLOWSTONE_SLAB = register(
        "light_blue_glowstone_slab",
        BlockItem(Blocks.LIGHT_BLUE_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_GLOWSTONE_SLAB = register(
        "purple_glowstone_slab",
        BlockItem(Blocks.PURPLE_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_GLOWSTONE_SLAB = register(
        "magenta_glowstone_slab",
        BlockItem(Blocks.MAGENTA_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_GLOWSTONE_SLAB = register(
        "pink_glowstone_slab",
        BlockItem(Blocks.PINK_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_GLOWSTONE_SLAB = register(
        "white_glowstone_slab",
        BlockItem(Blocks.WHITE_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_GLOWSTONE_SLAB = register(
        "light_gray_glowstone_slab",
        BlockItem(Blocks.LIGHT_GRAY_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_GLOWSTONE_SLAB = register(
        "gray_glowstone_slab",
        BlockItem(Blocks.GRAY_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_GLOWSTONE_SLAB = register(
        "black_glowstone_slab",
        BlockItem(Blocks.BLACK_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_GLOWSTONE_SLAB = register(
        "brown_glowstone_slab",
        BlockItem(Blocks.BROWN_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val SOUL_GLOWSTONE_SLAB = register(
        "soul_glowstone_slab",
        BlockItem(Blocks.SOUL_GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GLOWSTONE_SLAB =
        register("glowstone_slab", BlockItem(Blocks.GLOWSTONE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Glowstone Stairs
    val RED_GLOWSTONE_STAIRS = register(
        "red_glowstone_stairs",
        BlockItem(Blocks.RED_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_GLOWSTONE_STAIRS = register(
        "orange_glowstone_stairs",
        BlockItem(Blocks.ORANGE_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_GLOWSTONE_STAIRS = register(
        "yellow_glowstone_stairs",
        BlockItem(Blocks.YELLOW_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_GLOWSTONE_STAIRS = register(
        "lime_glowstone_stairs",
        BlockItem(Blocks.LIME_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_GLOWSTONE_STAIRS = register(
        "green_glowstone_stairs",
        BlockItem(Blocks.GREEN_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_GLOWSTONE_STAIRS = register(
        "blue_glowstone_stairs",
        BlockItem(Blocks.BLUE_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_GLOWSTONE_STAIRS = register(
        "cyan_glowstone_stairs",
        BlockItem(Blocks.CYAN_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_GLOWSTONE_STAIRS = register(
        "light_blue_glowstone_stairs",
        BlockItem(Blocks.LIGHT_BLUE_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_GLOWSTONE_STAIRS = register(
        "purple_glowstone_stairs",
        BlockItem(Blocks.PURPLE_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_GLOWSTONE_STAIRS = register(
        "magenta_glowstone_stairs",
        BlockItem(Blocks.MAGENTA_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_GLOWSTONE_STAIRS = register(
        "pink_glowstone_stairs",
        BlockItem(Blocks.PINK_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_GLOWSTONE_STAIRS = register(
        "white_glowstone_stairs",
        BlockItem(Blocks.WHITE_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_GLOWSTONE_STAIRS = register(
        "light_gray_glowstone_stairs",
        BlockItem(Blocks.LIGHT_GRAY_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_GLOWSTONE_STAIRS = register(
        "gray_glowstone_stairs",
        BlockItem(Blocks.GRAY_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_GLOWSTONE_STAIRS = register(
        "black_glowstone_stairs",
        BlockItem(Blocks.BLACK_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_GLOWSTONE_STAIRS = register(
        "brown_glowstone_stairs",
        BlockItem(Blocks.BROWN_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val SOUL_GLOWSTONE_STAIRS = register(
        "soul_glowstone_stairs",
        BlockItem(Blocks.SOUL_GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GLOWSTONE_STAIRS = register(
        "glowstone_stairs",
        BlockItem(Blocks.GLOWSTONE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )

    // Glowstone Wall
    val RED_GLOWSTONE_WALL = register(
        "red_glowstone_wall",
        BlockItem(Blocks.RED_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_GLOWSTONE_WALL = register(
        "orange_glowstone_wall",
        BlockItem(Blocks.ORANGE_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_GLOWSTONE_WALL = register(
        "yellow_glowstone_wall",
        BlockItem(Blocks.YELLOW_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_GLOWSTONE_WALL = register(
        "lime_glowstone_wall",
        BlockItem(Blocks.LIME_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_GLOWSTONE_WALL = register(
        "green_glowstone_wall",
        BlockItem(Blocks.GREEN_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_GLOWSTONE_WALL = register(
        "blue_glowstone_wall",
        BlockItem(Blocks.BLUE_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_GLOWSTONE_WALL = register(
        "cyan_glowstone_wall",
        BlockItem(Blocks.CYAN_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_GLOWSTONE_WALL = register(
        "light_blue_glowstone_wall",
        BlockItem(Blocks.LIGHT_BLUE_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_GLOWSTONE_WALL = register(
        "purple_glowstone_wall",
        BlockItem(Blocks.PURPLE_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_GLOWSTONE_WALL = register(
        "magenta_glowstone_wall",
        BlockItem(Blocks.MAGENTA_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_GLOWSTONE_WALL = register(
        "pink_glowstone_wall",
        BlockItem(Blocks.PINK_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_GLOWSTONE_WALL = register(
        "white_glowstone_wall",
        BlockItem(Blocks.WHITE_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_GLOWSTONE_WALL = register(
        "light_gray_glowstone_wall",
        BlockItem(Blocks.LIGHT_GRAY_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_GLOWSTONE_WALL = register(
        "gray_glowstone_wall",
        BlockItem(Blocks.GRAY_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_GLOWSTONE_WALL = register(
        "black_glowstone_wall",
        BlockItem(Blocks.BLACK_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_GLOWSTONE_WALL = register(
        "brown_glowstone_wall",
        BlockItem(Blocks.BROWN_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val SOUL_GLOWSTONE_WALL = register(
        "soul_glowstone_wall",
        BlockItem(Blocks.SOUL_GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GLOWSTONE_WALL =
        register("glowstone_wall", BlockItem(Blocks.GLOWSTONE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Glowstone Gate
    val RED_GLOWSTONE_GATE = register(
        "red_glowstone_gate",
        BlockItem(Blocks.RED_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val ORANGE_GLOWSTONE_GATE = register(
        "orange_glowstone_gate",
        BlockItem(Blocks.ORANGE_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_GLOWSTONE_GATE = register(
        "yellow_glowstone_gate",
        BlockItem(Blocks.YELLOW_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_GLOWSTONE_GATE = register(
        "lime_glowstone_gate",
        BlockItem(Blocks.LIME_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GREEN_GLOWSTONE_GATE = register(
        "green_glowstone_gate",
        BlockItem(Blocks.GREEN_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_GLOWSTONE_GATE = register(
        "blue_glowstone_gate",
        BlockItem(Blocks.BLUE_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val CYAN_GLOWSTONE_GATE = register(
        "cyan_glowstone_gate",
        BlockItem(Blocks.CYAN_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_BLUE_GLOWSTONE_GATE = register(
        "light_blue_glowstone_gate",
        BlockItem(Blocks.LIGHT_BLUE_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_GLOWSTONE_GATE = register(
        "purple_glowstone_gate",
        BlockItem(Blocks.PURPLE_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_GLOWSTONE_GATE = register(
        "magenta_glowstone_gate",
        BlockItem(Blocks.MAGENTA_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_GLOWSTONE_GATE = register(
        "pink_glowstone_gate",
        BlockItem(Blocks.PINK_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val WHITE_GLOWSTONE_GATE = register(
        "white_glowstone_gate",
        BlockItem(Blocks.WHITE_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_GLOWSTONE_GATE = register(
        "light_gray_glowstone_gate",
        BlockItem(Blocks.LIGHT_GRAY_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_GLOWSTONE_GATE = register(
        "gray_glowstone_gate",
        BlockItem(Blocks.GRAY_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLACK_GLOWSTONE_GATE = register(
        "black_glowstone_gate",
        BlockItem(Blocks.BLACK_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_GLOWSTONE_GATE = register(
        "brown_glowstone_gate",
        BlockItem(Blocks.BROWN_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val SOUL_GLOWSTONE_GATE = register(
        "soul_glowstone_gate",
        BlockItem(Blocks.SOUL_GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GLOWSTONE_GATE =
        register("glowstone_gate", BlockItem(Blocks.GLOWSTONE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Ice
    val RED_ICE = register("red_ice", BlockItem(Blocks.RED_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val ORANGE_ICE =
        register("orange_ice", BlockItem(Blocks.ORANGE_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val YELLOW_ICE =
        register("yellow_ice", BlockItem(Blocks.YELLOW_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIME_ICE = register("lime_ice", BlockItem(Blocks.LIME_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val GREEN_ICE = register("green_ice", BlockItem(Blocks.GREEN_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val CYAN_ICE = register("cyan_ice", BlockItem(Blocks.CYAN_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_BLUE_ICE =
        register("light_blue_ice", BlockItem(Blocks.LIGHT_BLUE_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val PURPLE_ICE =
        register("purple_ice", BlockItem(Blocks.PURPLE_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val MAGENTA_ICE =
        register("magenta_ice", BlockItem(Blocks.MAGENTA_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val PINK_ICE = register("pink_ice", BlockItem(Blocks.PINK_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val WHITE_ICE = register("white_ice", BlockItem(Blocks.WHITE_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_GRAY_ICE =
        register("light_gray_ice", BlockItem(Blocks.LIGHT_GRAY_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val GRAY_ICE = register("gray_ice", BlockItem(Blocks.GRAY_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLACK_ICE = register("black_ice", BlockItem(Blocks.BLACK_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BROWN_ICE = register("brown_ice", BlockItem(Blocks.BROWN_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val SOUL_ICE = register("soul_ice", BlockItem(Blocks.SOUL_ICE, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Ice Slab
    val RED_ICE_SLAB =
        register("red_ice_slab", BlockItem(Blocks.RED_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val ORANGE_ICE_SLAB =
        register("orange_ice_slab", BlockItem(Blocks.ORANGE_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val YELLOW_ICE_SLAB =
        register("yellow_ice_slab", BlockItem(Blocks.YELLOW_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIME_ICE_SLAB =
        register("lime_ice_slab", BlockItem(Blocks.LIME_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val GREEN_ICE_SLAB =
        register("green_ice_slab", BlockItem(Blocks.GREEN_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLUE_ICE_SLAB =
        register("blue_ice_slab", BlockItem(Blocks.BLUE_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val CYAN_ICE_SLAB =
        register("cyan_ice_slab", BlockItem(Blocks.CYAN_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_BLUE_ICE_SLAB = register(
        "light_blue_ice_slab",
        BlockItem(Blocks.LIGHT_BLUE_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_ICE_SLAB =
        register("purple_ice_slab", BlockItem(Blocks.PURPLE_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val MAGENTA_ICE_SLAB = register(
        "magenta_ice_slab",
        BlockItem(Blocks.MAGENTA_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_ICE_SLAB =
        register("pink_ice_slab", BlockItem(Blocks.PINK_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val WHITE_ICE_SLAB =
        register("white_ice_slab", BlockItem(Blocks.WHITE_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_GRAY_ICE_SLAB = register(
        "light_gray_ice_slab",
        BlockItem(Blocks.LIGHT_GRAY_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_ICE_SLAB =
        register("gray_ice_slab", BlockItem(Blocks.GRAY_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLACK_ICE_SLAB =
        register("black_ice_slab", BlockItem(Blocks.BLACK_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BROWN_ICE_SLAB =
        register("brown_ice_slab", BlockItem(Blocks.BROWN_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))
    val SOUL_ICE_SLAB =
        register("soul_ice_slab", BlockItem(Blocks.SOUL_ICE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Ice Stairs
    val RED_ICE_STAIRS =
        register("red_ice_stairs", BlockItem(Blocks.RED_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()))
    val ORANGE_ICE_STAIRS = register(
        "orange_ice_stairs",
        BlockItem(Blocks.ORANGE_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val YELLOW_ICE_STAIRS = register(
        "yellow_ice_stairs",
        BlockItem(Blocks.YELLOW_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIME_ICE_STAIRS =
        register("lime_ice_stairs", BlockItem(Blocks.LIME_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()))
    val GREEN_ICE_STAIRS = register(
        "green_ice_stairs",
        BlockItem(Blocks.GREEN_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BLUE_ICE_STAIRS =
        register("blue_ice_stairs", BlockItem(Blocks.BLUE_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()))
    val CYAN_ICE_STAIRS =
        register("cyan_ice_stairs", BlockItem(Blocks.CYAN_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_BLUE_ICE_STAIRS = register(
        "light_blue_ice_stairs",
        BlockItem(Blocks.LIGHT_BLUE_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_ICE_STAIRS = register(
        "purple_ice_stairs",
        BlockItem(Blocks.PURPLE_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val MAGENTA_ICE_STAIRS = register(
        "magenta_ice_stairs",
        BlockItem(Blocks.MAGENTA_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_ICE_STAIRS =
        register("pink_ice_stairs", BlockItem(Blocks.PINK_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()))
    val WHITE_ICE_STAIRS = register(
        "white_ice_stairs",
        BlockItem(Blocks.WHITE_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val LIGHT_GRAY_ICE_STAIRS = register(
        "light_gray_ice_stairs",
        BlockItem(Blocks.LIGHT_GRAY_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_ICE_STAIRS =
        register("gray_ice_stairs", BlockItem(Blocks.GRAY_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLACK_ICE_STAIRS = register(
        "black_ice_stairs",
        BlockItem(Blocks.BLACK_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val BROWN_ICE_STAIRS = register(
        "brown_ice_stairs",
        BlockItem(Blocks.BROWN_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val SOUL_ICE_STAIRS =
        register("soul_ice_stairs", BlockItem(Blocks.SOUL_ICE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Ice Wall
    val RED_ICE_WALL =
        register("red_ice_wall", BlockItem(Blocks.RED_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val ORANGE_ICE_WALL =
        register("orange_ice_wall", BlockItem(Blocks.ORANGE_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val YELLOW_ICE_WALL =
        register("yellow_ice_wall", BlockItem(Blocks.YELLOW_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIME_ICE_WALL =
        register("lime_ice_wall", BlockItem(Blocks.LIME_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val GREEN_ICE_WALL =
        register("green_ice_wall", BlockItem(Blocks.GREEN_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLUE_ICE_WALL =
        register("blue_ice_wall", BlockItem(Blocks.BLUE_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val CYAN_ICE_WALL =
        register("cyan_ice_wall", BlockItem(Blocks.CYAN_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_BLUE_ICE_WALL = register(
        "light_blue_ice_wall",
        BlockItem(Blocks.LIGHT_BLUE_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_ICE_WALL =
        register("purple_ice_wall", BlockItem(Blocks.PURPLE_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val MAGENTA_ICE_WALL = register(
        "magenta_ice_wall",
        BlockItem(Blocks.MAGENTA_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_ICE_WALL =
        register("pink_ice_wall", BlockItem(Blocks.PINK_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val WHITE_ICE_WALL =
        register("white_ice_wall", BlockItem(Blocks.WHITE_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_GRAY_ICE_WALL = register(
        "light_gray_ice_wall",
        BlockItem(Blocks.LIGHT_GRAY_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_ICE_WALL =
        register("gray_ice_wall", BlockItem(Blocks.GRAY_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLACK_ICE_WALL =
        register("black_ice_wall", BlockItem(Blocks.BLACK_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BROWN_ICE_WALL =
        register("brown_ice_wall", BlockItem(Blocks.BROWN_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))
    val SOUL_ICE_WALL =
        register("soul_ice_wall", BlockItem(Blocks.SOUL_ICE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Ice Gate
    val RED_ICE_GATE =
        register("red_ice_gate", BlockItem(Blocks.RED_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val ORANGE_ICE_GATE =
        register("orange_ice_gate", BlockItem(Blocks.ORANGE_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val YELLOW_ICE_GATE =
        register("yellow_ice_gate", BlockItem(Blocks.YELLOW_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIME_ICE_GATE =
        register("lime_ice_gate", BlockItem(Blocks.LIME_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val GREEN_ICE_GATE =
        register("green_ice_gate", BlockItem(Blocks.GREEN_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLUE_ICE_GATE =
        register("blue_ice_gate", BlockItem(Blocks.BLUE_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val CYAN_ICE_GATE =
        register("cyan_ice_gate", BlockItem(Blocks.CYAN_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_BLUE_ICE_GATE = register(
        "light_blue_ice_gate",
        BlockItem(Blocks.LIGHT_BLUE_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PURPLE_ICE_GATE =
        register("purple_ice_gate", BlockItem(Blocks.PURPLE_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val MAGENTA_ICE_GATE = register(
        "magenta_ice_gate",
        BlockItem(Blocks.MAGENTA_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val PINK_ICE_GATE =
        register("pink_ice_gate", BlockItem(Blocks.PINK_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val WHITE_ICE_GATE =
        register("white_ice_gate", BlockItem(Blocks.WHITE_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val LIGHT_GRAY_ICE_GATE = register(
        "light_gray_ice_gate",
        BlockItem(Blocks.LIGHT_GRAY_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings())
    )
    val GRAY_ICE_GATE =
        register("gray_ice_gate", BlockItem(Blocks.GRAY_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BLACK_ICE_GATE =
        register("black_ice_gate", BlockItem(Blocks.BLACK_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val BROWN_ICE_GATE =
        register("brown_ice_gate", BlockItem(Blocks.BROWN_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))
    val SOUL_ICE_GATE =
        register("soul_ice_gate", BlockItem(Blocks.SOUL_ICE_GATE, ItemGroups.consistencyPlusDyeableItemSettings()))

    // Obsidian
    val OBSIDIAN_SLAB =
        register("obsidian_slab", BlockItem(Blocks.OBSIDIAN_SLAB, ItemGroups.consistencyPlusMiscItemSettings()))
    val OBSIDIAN_STAIRS =
        register("obsidian_stairs", BlockItem(Blocks.OBSIDIAN_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()))
    val OBSIDIAN_WALL =
        register("obsidian_wall", BlockItem(Blocks.OBSIDIAN_WALL, ItemGroups.consistencyPlusMiscItemSettings()))
    val OBSIDIAN_GATE =
        register("obsidian_gate", BlockItem(Blocks.OBSIDIAN_GATE, ItemGroups.consistencyPlusMiscItemSettings()))

    // Crying Obsidian
    val CRYING_OBSIDIAN_SLAB = register(
        "crying_obsidian_slab",
        BlockItem(Blocks.CRYING_OBSIDIAN_SLAB, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRYING_OBSIDIAN_STAIRS = register(
        "crying_obsidian_stairs",
        BlockItem(Blocks.CRYING_OBSIDIAN_STAIRS, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRYING_OBSIDIAN_WALL = register(
        "crying_obsidian_wall",
        BlockItem(Blocks.CRYING_OBSIDIAN_WALL, ItemGroups.consistencyPlusMiscItemSettings())
    )
    val CRYING_OBSIDIAN_GATE = register(
        "crying_obsidian_gate",
        BlockItem(Blocks.CRYING_OBSIDIAN_GATE, ItemGroups.consistencyPlusMiscItemSettings())
    )

    // Dirt
    val DIRT_SLAB =
        register("dirt_slab", BlockItem(Blocks.DIRT_SLAB, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC)))
    val DIRT_STAIRS =
        register("dirt_stairs", BlockItem(Blocks.DIRT_STAIRS, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC)))
    val DIRT_WALL =
        register("dirt_wall", BlockItem(Blocks.DIRT_WALL, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC)))

    // Grass
    val GRASS_SLAB =
        register("grass_slab", BlockItem(Blocks.GRASS_SLAB, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC)))
    val GRASS_STAIRS = register(
        "grass_stairs",
        BlockItem(Blocks.GRASS_STAIRS, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC))
    )
    val GRASS_WALL =
        register("grass_wall", BlockItem(Blocks.GRASS_WALL, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC)))

    // Mycelium
    val MYCELIUM_SLAB = register(
        "mycelium_slab",
        BlockItem(Blocks.MYCELIUM_SLAB, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC))
    )
    val MYCELIUM_STAIRS = register(
        "mycelium_stairs",
        BlockItem(Blocks.MYCELIUM_STAIRS, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC))
    )
    val MYCELIUM_WALL = register(
        "mycelium_wall",
        BlockItem(Blocks.MYCELIUM_WALL, Item.Settings().group(ItemGroups.CONSISTENCY_PLUS_MISC))
    )

    // Miscellaneous
    val JACK_O_SOUL =
        register("jack_o_soul", BlockItem(Blocks.JACK_O_SOUL, ItemGroups.consistencyPlusMiscItemSettings()))
    val WARPED_WART =
        register("warped_wart", AliasedBlockItem(Blocks.WARPED_WART, ItemGroups.consistencyPlusMiscItemSettings()))
    val NETHERITE_STAIRS = register("netherite_stairs", BlockItem(Blocks.NETHERITE_STAIRS, Item.Settings()))
    val SUSPICIOUS_SLAB = register("suspicious_slab", BlockItem(Blocks.SUSPICIOUS_SLAB, Item.Settings()))
    private fun register(name: String, item: Item): Item {
        return Registry.register(Registry.ITEM, Identifier("consistency_plus", name), item)
    }

    fun init() {}
}