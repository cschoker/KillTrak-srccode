package com.cschoker.traknttkill.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CounterBlock extends BlockBase
{

	public CounterBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(-1.0F);
		setBlockUnbreakable();
		setResistance(10000000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(10.0F);
		//setLightOpacity();

	}

}
