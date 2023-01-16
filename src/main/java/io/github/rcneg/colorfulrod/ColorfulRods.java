package io.github.rcneg.colorfulrod;

import io.github.rcneg.colorfulrod.init.BlockRegistry;
import io.github.rcneg.colorfulrod.init.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod(ColorfulRods.MOD_ID)
public class ColorfulRods {
    public ColorfulRods(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(ColorfulRods.MOD_ID)
    {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.END_ROD_MAGENTA.get());
        }
    };
    public static final String MOD_ID = "colorful_rods";
}
