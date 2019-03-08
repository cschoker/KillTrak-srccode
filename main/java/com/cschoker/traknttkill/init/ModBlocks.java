package com.cschoker.traknttkill.init;

import java.util.ArrayList;
import java.util.List;

import com.cschoker.traknttkill.blocks.BlockBase;
import com.cschoker.traknttkill.blocks.CounterBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
        public static final List<Block> BLOCKS = new ArrayList<Block>();
        
        //blocks
        public static final Block COUNTER_BLOCK = new CounterBlock("counter_block", Material.BARRIER);
        
}
