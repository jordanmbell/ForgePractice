package com.example.jordanmod.block;

import com.example.jordanmod.Global;
import net.minecraft.block.Block;

import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Field;


public class JordansBlocks {
    public static final Block JORDANSBLOCK = new JordansBlock(new ResourceLocation(Global.modid,"jordans_block"));

    public static Block[] blocks() {
        Field[] fields = JordansBlocks.class.getFields();
        Block[] blocks = new Block[fields.length];
        try {
            for (int i = 0; i < fields.length; ++i) {
                blocks[i] = (Block) fields[i].get(null);
            }
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to make block");
        }

        return blocks;
    }
}
