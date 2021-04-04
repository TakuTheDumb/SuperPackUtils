package fr.minemobs.superpackutils.data.client;

import fr.minemobs.superpackutils.Main;
import fr.minemobs.superpackutils.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Main.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /*for (RegistryObject<Block> entry : BlockInit.BLOCKS.getEntries()) {
            if(entry.get() instanceof WallTinyTorch || entry.get() instanceof TinyTorch) return;
            simpleBlock(entry.get());
        }*/
        simpleBlock(BlockInit.PLATINUM_BLOCK.get());
    }
}
