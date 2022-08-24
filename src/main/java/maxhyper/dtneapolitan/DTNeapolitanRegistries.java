package maxhyper.dtneapolitan;

import com.ferreusveritas.dynamictrees.api.registry.RegistryEvent;
import com.ferreusveritas.dynamictrees.api.registry.TypeRegistryEvent;
import com.ferreusveritas.dynamictrees.blocks.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.systems.fruit.Fruit;
import com.ferreusveritas.dynamictrees.systems.genfeatures.GenFeature;
import com.ferreusveritas.dynamictrees.trees.Species;
import maxhyper.dtneapolitan.blocks.BananaLeavesProperties;
import maxhyper.dtneapolitan.fruits.BananaFruit;
import maxhyper.dtneapolitan.genfeatures.DTNeapolitanGenFeatures;
import maxhyper.dtneapolitan.trees.BananaSpecies;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DTNeapolitanRegistries {

    public static final ResourceLocation BANANA = new ResourceLocation(DynamicTreesNeapolitan.MOD_ID, "banana");

    @SubscribeEvent
    public static void registerSpeciesType(final TypeRegistryEvent<Species> event) {
        event.registerType(BANANA, BananaSpecies.TYPE);
    }

    @SubscribeEvent
    public static void registerLeavesPropertiesTypes(final TypeRegistryEvent<LeavesProperties> event) {
        event.registerType(BANANA, BananaLeavesProperties.TYPE);
    }

    @SubscribeEvent
    public static void registerFruitTypes(final TypeRegistryEvent<Fruit> event) {
        event.registerType(BANANA, BananaFruit.TYPE);
    }

    @SubscribeEvent
    public static void onGenFeatureRegistry(final RegistryEvent<GenFeature> event) {
        DTNeapolitanGenFeatures.register(event.getRegistry());
    }

}
