package io.github.rcneg.colorfulrod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class AbyssRod extends RodBlockBase{
    public AbyssRod(Properties p_53085_) {
        super(p_53085_);
    }

    public void animateTick(BlockState p_53094_, Level p_53095_, BlockPos p_53096_, Random p_53097_) {
        Direction direction = p_53094_.getValue(FACING);
        double d0 = (double)p_53096_.getX() + 0.55D - (double)(p_53097_.nextFloat() * 0.1F);
        double d1 = (double)p_53096_.getY() + 0.55D - (double)(p_53097_.nextFloat() * 0.1F);
        double d2 = (double)p_53096_.getZ() + 0.55D - (double)(p_53097_.nextFloat() * 0.1F);
        double d3 = (double)(0.4F - (p_53097_.nextFloat() + p_53097_.nextFloat()) * 0.4F);
        if (p_53097_.nextInt(5) == 0) {
            p_53095_.addParticle(ParticleTypes.GLOW, d0 + (double)direction.getStepX() * d3, d1 + (double)direction.getStepY() * d3, d2 + (double)direction.getStepZ() * d3, 0, 0, 0);
        }

    }
}
