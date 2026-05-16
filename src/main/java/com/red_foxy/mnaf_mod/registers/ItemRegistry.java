package com.red_foxy.mnaf_mod.registers;

import com.red_foxy.mnaf_mod.MNAFMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MNAFMod.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_BLOCK = ITEMS.register("example_block", () -> new BlockItem(BlockRegistry.EXAMPLE_BLOCK.get(), new Item.Properties()));
}
