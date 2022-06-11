package samebutdifferent.ecologics.block.grower;

import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;
import samebutdifferent.ecologics.registry.ModConfiguredFeatures;

public class CoconutTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean pLargeHive) {
        return ModConfiguredFeatures.COCONUT.getHolder().orElseThrow();
    }
}
