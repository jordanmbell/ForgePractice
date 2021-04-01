package com.example.jordanmod;

import com.example.jordanmod.block.JordansBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Global {
    public final static String modid = "jordanmod";

    public final static ItemGroup jordanItemGroup = (new ItemGroup("jordanItemGroup") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(JordansBlocks.JORDANSBLOCK);
        }
    });
}
