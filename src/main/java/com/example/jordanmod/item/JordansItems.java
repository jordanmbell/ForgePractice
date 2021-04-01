package com.example.jordanmod.item;

import com.example.jordanmod.block.JordansBlocks;
import net.minecraft.item.Item;

import java.lang.reflect.Field;


public class JordansItems {
    public static final Item JORDANSBLOCKITEM = new JordansBlockItem();

    public static Item[] items() {
        Field[] fields = JordansItems.class.getFields();
        Item[] items = new Item[fields.length];
        try {
            for (int i = 0; i < fields.length; ++i) {
                items[i] = (Item) fields[i].get(null);
            }
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to make item");
        }

        return items;
    }
}
