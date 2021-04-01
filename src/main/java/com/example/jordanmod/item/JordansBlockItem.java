package com.example.jordanmod.item;

import com.example.jordanmod.Global;
import com.example.jordanmod.block.JordansBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.util.Objects;


public class JordansBlockItem extends BlockItem {

    public JordansBlockItem() {
        super(JordansBlocks.JORDANSBLOCK, new Item.Properties().
                stacksTo(11).
                fireResistant().
                tab(Global.jordanItemGroup)
                );
        setRegistryName(Objects.requireNonNull(JordansBlocks.JORDANSBLOCK.getRegistryName()));
    }
}
