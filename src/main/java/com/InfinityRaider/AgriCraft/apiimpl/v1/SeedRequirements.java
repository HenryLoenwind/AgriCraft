package com.InfinityRaider.AgriCraft.apiimpl.v1;

import java.util.List;

import net.minecraft.block.Block;

import com.InfinityRaider.AgriCraft.api.v1.IBlockWithMeta;
import com.InfinityRaider.AgriCraft.api.v1.ISeedRequirements;

public class SeedRequirements implements ISeedRequirements {

	private boolean needsCrops;
	private boolean hasRequiredDimension;
	private List<Integer> requiredDimenstions;
	private boolean hasRejectedDimension;
	private List<Integer> rejectedDimenstions;
	private List<IBlockWithMeta> soilBlock;
	private List<IBlockWithMeta> belowBlock;
	private List<IBlockWithMeta> nearBlocks;
	private boolean needsTilling;

	public void setNeedsCrops(boolean needsCrops) {
		this.needsCrops = needsCrops;
	}

	public void setHasRequiredDimension(boolean hasRequiredDimension) {
		this.hasRequiredDimension = hasRequiredDimension;
	}

	public void setRequiredDimenstions(List<Integer> requiredDimenstions) {
		this.requiredDimenstions = requiredDimenstions;
	}

	public void setHasRejectedDimension(boolean hasRejectedDimension) {
		this.hasRejectedDimension = hasRejectedDimension;
	}

	public void setRejectedDimenstions(List<Integer> rejectedDimenstions) {
		this.rejectedDimenstions = rejectedDimenstions;
	}

	public void setSoilBlock(List<IBlockWithMeta> soilBlock) {
		this.soilBlock = soilBlock;
	}

	public void setBelowBlock(List<IBlockWithMeta> belowBlock) {
		this.belowBlock = belowBlock;
	}

	public void setNearBlocks(List<IBlockWithMeta> nearBlocks) {
		this.nearBlocks = nearBlocks;
	}

	public void setNeedsTilling(boolean needsTilling) {
		this.needsTilling = needsTilling;
	}

	@Override
	public boolean needsCrops() {
		return needsCrops;
	}

	@Override
	public boolean hasRequiredDimension() {
		return hasRequiredDimension;
	}

	@Override
	public List<Integer> getRequiredDimenstions() {
		return requiredDimenstions;
	}

	@Override
	public boolean hasRejectedDimension() {
		return hasRejectedDimension;
	}

	@Override
	public List<Integer> getRejectedDimenstions() {
		return rejectedDimenstions;
	}

	@Override
	public List<IBlockWithMeta> getSoilBlock() {
		return soilBlock;
	}

	@Override
	public List<IBlockWithMeta> getBelowBlock() {
		return belowBlock;
	}

	@Override
	public List<IBlockWithMeta> getNearBlocks() {
		return nearBlocks;
	}

	@Override
	public boolean needsTilling() {
		return needsTilling;
	}

}
