package net.wire.vanilla_improvements_mod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.wire.vanilla_improvements_mod.VanillaImprovementsMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> VIM_ORES = tag("vim_ores");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(VanillaImprovementsMod.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(VanillaImprovementsMod.MODID, name));
        }
    }
}
