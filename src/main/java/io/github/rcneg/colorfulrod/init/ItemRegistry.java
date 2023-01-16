package io.github.rcneg.colorfulrod.init;

import io.github.rcneg.colorfulrod.ColorfulRods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings({"unused"})
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ColorfulRods.MOD_ID);
    public static final RegistryObject<Item> GLOW_TUBE_INK = ITEMS.register("glow_tube_ink", () -> new Item(defaultBuilder()));
    public static final RegistryObject<Item> GLOW_TUBE_BERRY = ITEMS.register("glow_tube_berry", () -> new Item(defaultBuilder()));
    public static final RegistryObject<Item> GLOW_TUBE_DUST = ITEMS.register("glow_tube_dust", () -> new Item(defaultBuilder()));
    public static final RegistryObject<Item> ABYSS_ROD = ITEMS.register("abyss_rod", () -> new ItemNameBlockItem(BlockRegistry.ABYSS_ROD.get(), defaultBuilder()));
    public static final RegistryObject<Item> CAVE_ROD = ITEMS.register("cave_rod", () -> new ItemNameBlockItem(BlockRegistry.CAVE_ROD.get(), defaultBuilder()));
    public static final RegistryObject<Item> NETHER_ROD = ITEMS.register("nether_rod", () -> new ItemNameBlockItem(BlockRegistry.NETHER_ROD.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_BLACK = ITEMS.register("end_rod_black", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_BLACK.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_BLUE = ITEMS.register("end_rod_blue", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_BLUE.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_BROWN = ITEMS.register("end_rod_brown", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_BROWN.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_CYAN = ITEMS.register("end_rod_cyan", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_CYAN.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_GRAY = ITEMS.register("end_rod_gray", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_GRAY.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_GREEN = ITEMS.register("end_rod_green", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_GREEN.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_LIGHT_BLUE = ITEMS.register("end_rod_light_blue", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_LIGHT_BLUE.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_LIGHT_GRAY = ITEMS.register("end_rod_light_gray", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_LIGHT_GRAY.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_LIME = ITEMS.register("end_rod_lime", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_LIME.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_MAGENTA = ITEMS.register("end_rod_magenta", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_MAGENTA.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_ORANGE = ITEMS.register("end_rod_orange", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_ORANGE.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_PINK = ITEMS.register("end_rod_pink", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_PINK.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_PURPLE = ITEMS.register("end_rod_purple", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_PURPLE.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_RED = ITEMS.register("end_rod_red", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_RED.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_WHITE = ITEMS.register("end_rod_white", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_WHITE.get(), defaultBuilder()));
    public static final RegistryObject<Item> END_ROD_YELLOW = ITEMS.register("end_rod_yellow", () -> new ItemNameBlockItem(BlockRegistry.END_ROD_YELLOW.get(), defaultBuilder()));


    private static Item.Properties defaultBuilder() {
        return new Item.Properties().tab(ColorfulRods.CREATIVE_TAB);
    }
}
