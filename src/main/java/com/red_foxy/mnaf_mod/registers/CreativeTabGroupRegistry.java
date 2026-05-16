package com.red_foxy.mnaf_mod.registers;

import com.red_foxy.mnaf_mod.MNAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabGroupRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MNAFMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MNAF = CREATIVE_MODE_TABS.register("mnaf", () -> CreativeModeTab.builder()
            .title(Component.translatable("creative_tab.mnaf_mod.mnaf"))
            .icon(() -> ItemRegistry.EXAMPLE_BLOCK.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.EXAMPLE_BLOCK.get());
            }).build());

}
