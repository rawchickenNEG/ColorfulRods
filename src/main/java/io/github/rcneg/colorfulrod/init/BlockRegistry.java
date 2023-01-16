package io.github.rcneg.colorfulrod.init;

import io.github.rcneg.colorfulrod.ColorfulRods;
import io.github.rcneg.colorfulrod.block.AbyssRod;
import io.github.rcneg.colorfulrod.block.RodBlockBase;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColorfulRods.MOD_ID);
    public static final RegistryObject<Block> ABYSS_ROD = BLOCKS.register("abyss_rod", BlockRegistry::abyssRodType);
    public static final RegistryObject<Block> CAVE_ROD = BLOCKS.register("cave_rod", BlockRegistry::endRodType);
    public static final RegistryObject<Block> NETHER_ROD = BLOCKS.register("nether_rod", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_BLACK = BLOCKS.register("end_rod_black", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_BLUE = BLOCKS.register("end_rod_blue", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_BROWN = BLOCKS.register("end_rod_brown", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_CYAN = BLOCKS.register("end_rod_cyan", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_GRAY = BLOCKS.register("end_rod_gray", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_GREEN = BLOCKS.register("end_rod_green", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_LIGHT_BLUE = BLOCKS.register("end_rod_light_blue", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_LIGHT_GRAY = BLOCKS.register("end_rod_light_gray", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_LIME = BLOCKS.register("end_rod_lime", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_MAGENTA = BLOCKS.register("end_rod_magenta", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_ORANGE = BLOCKS.register("end_rod_orange", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_PINK = BLOCKS.register("end_rod_pink", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_PURPLE = BLOCKS.register("end_rod_purple", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_RED = BLOCKS.register("end_rod_red", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_WHITE = BLOCKS.register("end_rod_white", BlockRegistry::endRodType);
    public static final RegistryObject<Block> END_ROD_YELLOW = BLOCKS.register("end_rod_yellow", BlockRegistry::endRodType);

    private static RodBlockBase endRodType(){
        return new RodBlockBase(BlockBehaviour.Properties.of(Material.DECORATION).instabreak().lightLevel((p_187435_) -> {
            return 14;
        }).sound(SoundType.WOOD).noOcclusion());
    }

    private static AbyssRod abyssRodType(){
        return new AbyssRod(BlockBehaviour.Properties.of(Material.DECORATION).instabreak().lightLevel((p_187435_) -> {
            return 14;
        }).sound(SoundType.WOOD).noOcclusion());
    }

}
