package main.java.com.tpp.baseoffensive;

import com.simibubi.create.Create;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.dimdev.matrix.Registrar;
import org.dimdev.matrix.RegistryEntry;

@Registrar(element = Block.class, modid = "baseoffensive")
public class ModBlocks {
    @RegistryEntry("test_block")
    public static final Block TEST_BLOCK = new Block(BlockBehaviour.Properties.copy(Blocks.STONE));
}