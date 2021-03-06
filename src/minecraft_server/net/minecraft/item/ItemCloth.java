package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;

public class ItemCloth extends ItemBlock
{
    private static final String __OBFID = "CL_00000075";

    public ItemCloth(Block p_i45358_1_)
    {
        super(p_i45358_1_);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int par1)
    {
        return par1;
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        return super.getUnlocalizedName() + "." + ItemDye.field_150923_a[BlockColored.func_150032_b(par1ItemStack.getItemDamage())];
    }
}
