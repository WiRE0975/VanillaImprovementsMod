package net.wire.vanilla_improvements_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.wire.vanilla_improvements_mod.VanillaImprovementsMod;
import net.wire.vanilla_improvements_mod.block.ModBlocks;
import net.wire.vanilla_improvements_mod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VanillaImprovementsMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.VIM_ORES)
                .add(ModBlocks.SAPPHIRE_ORE.get()).add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()).addTags(Tags.Blocks.ORES);


        this.tag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(BlockTags.MINEABLE_WITH_HOE);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL);


        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_ORE.get()).addTags(Tags.Blocks.ORES);

        this.tag(Tags.Blocks.NEEDS_GOLD_TOOL);

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL);




    }
}
