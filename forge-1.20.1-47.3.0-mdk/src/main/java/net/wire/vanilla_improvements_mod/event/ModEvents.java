package net.wire.vanilla_improvements_mod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wire.vanilla_improvements_mod.VanillaImprovementsMod;
import net.wire.vanilla_improvements_mod.item.ModItems;

import java.util.List;

@Mod.EventBusSubscriber(modid = VanillaImprovementsMod.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.NITWIT) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SAPPHIRE.get(), 1),
                    new ItemStack(Items.EMERALD, 3),
                    10, 8, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.SAPPHIRE.get(), 2),
                    10, 8, 0.02f));
        }
    }

    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.SAPPHIRE.get(), 2),
                new ItemStack(Items.EMERALD, 3),
                10, 8, 0.02f));
        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(ModItems.SAPPHIRE.get(), 1),
                10, 8, 0.02f));
    }
}
