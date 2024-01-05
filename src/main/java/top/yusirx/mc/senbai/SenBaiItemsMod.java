package top.yusirx.mc.senbai;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.yusirx.mc.senbai.block.ModBlocks;
import top.yusirx.mc.senbai.item.ModItems;
import top.yusirx.mc.senbai.sound.ItemRegistry;

public class SenBaiItemsMod implements ModInitializer {
    public static Identifier ID(String path) {
        return new Identifier(SenBaiItemsMod.MOD_ID, path);
    }
    public static final Logger LOGGER = LoggerFactory.getLogger("senbaiitemsmod");
    public static final String MOD_ID = "senbaiitemsmod";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ItemRegistry.init();
        LOGGER.info("Loaded SenBaiItems mod");
    }
}