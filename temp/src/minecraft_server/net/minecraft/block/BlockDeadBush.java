package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class BlockDeadBush extends BlockBush {

   private static final String __OBFID = "CL_00000224";


   protected BlockDeadBush() {
      super(Material.field_151582_l);
      float var1 = 0.4F;
      this.func_149676_a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   protected boolean func_149854_a(Block p_149854_1_) {
      return p_149854_1_ == Blocks.field_150354_m || p_149854_1_ == Blocks.field_150405_ch || p_149854_1_ == Blocks.field_150406_ce || p_149854_1_ == Blocks.field_150346_d;
   }

   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
      return null;
   }

   public void func_149636_a(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_) {
      if(!p_149636_1_.field_72995_K && p_149636_2_.func_71045_bC() != null && p_149636_2_.func_71045_bC().func_77973_b() == Items.field_151097_aZ) {
         p_149636_2_.func_71064_a(StatList.field_75934_C[Block.func_149682_b(this)], 1);
         this.func_149642_a(p_149636_1_, p_149636_3_, p_149636_4_, p_149636_5_, new ItemStack(Blocks.field_150330_I, 1, p_149636_6_));
      } else {
         super.func_149636_a(p_149636_1_, p_149636_2_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_);
      }

   }
}
