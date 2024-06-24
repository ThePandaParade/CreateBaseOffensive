package main.java.com.tpp.baseoffensive;

import com.simibubi.create.Create;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import org.dimdev.matrix.Registrar;
import org.dimdev.matrix.RegistryEntry;

@Registrar(element = Item.class, modid = "baseoffensive")
public class ModItems {
    @RegistryEntry("test_item")
    public static final Item TEST_BLOCK = new BlockItem(ModBlocks.TEST_BLOCK, new Item.Properties());
}