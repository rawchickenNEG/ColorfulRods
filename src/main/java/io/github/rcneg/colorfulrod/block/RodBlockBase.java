package io.github.rcneg.colorfulrod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RodBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RodBlockBase extends RodBlock {
    public RodBlockBase(BlockBehaviour.Properties p_53085_) {
        super(p_53085_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP));
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_53087_) {
        Direction direction = p_53087_.getClickedFace();
        BlockState blockstate = p_53087_.getLevel().getBlockState(p_53087_.getClickedPos().relative(direction.getOpposite()));
        return blockstate.is(this) && blockstate.getValue(FACING) == direction ? this.defaultBlockState().setValue(FACING, direction.getOpposite()) : this.defaultBlockState().setValue(FACING, direction);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_53105_) {
        p_53105_.add(FACING);
    }

    public PushReaction getPistonPushReaction(BlockState p_53112_) {
        return PushReaction.NORMAL;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
