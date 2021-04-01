package com.example.jordanmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class JordansBlock extends Block {


    public JordansBlock(ResourceLocation registryName) {
        super(AbstractBlock.Properties.of
                (Material.METAL).
                sound(SoundType.METAL).
                strength(7.0F, 10.0F).
                harvestLevel(3).
                harvestTool(ToolType.PICKAXE).
                lightLevel((x) -> 15)
            );
        setRegistryName(registryName);
    }


}
