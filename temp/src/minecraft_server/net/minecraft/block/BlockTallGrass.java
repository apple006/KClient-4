package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class BlockTallGrass extends BlockBush implements IGrowable {

   private static final String[] field_149871_a = new String[]{"deadbush", "tallgrass", "fern"};
   private static final String __OBFID = "CL_00000321";


   protected BlockTallGrass() {
      super(Material.field_151582_l);
      float var1 = 0.4F;
      this.func_149676_a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.8F, 0.5F + var1);
   }

   public boolean func_149718_j(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_) {
      return this.func_149854_a(p_149718_1_.func_147439_a(p_149718_2_, p_149718_3_ - 1, p_149718_4_));
   }

   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
      return p_149650_2_.nextInt(8) == 0?Items.field_151014_N:null;
   }

   public int func_149679_a(int p_149679_1_, Random p_149679_2_) {
      return 1 + p_149679_2_.nextInt(p_149679_1_ * 2 + 1);
   }

   public void func_149636_a(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_) {
      if(!p_149636_1_.field_72995_K && p_149636_2_.func_71045_bC() != null && p_149636_2_.func_71045_bC().func_77973_b() == Items.field_151097_aZ) {
         p_149636_2_.func_71064_a(StatList.field_75934_C[Block.func_149682_b(this)], 1);
         this.func_149642_a(p_149636_1_, p_149636_3_, p_149636_4_, p_149636_5_, new ItemStack(Blocks.field_150329_H, 1, p_149636_6_));
      } else {
         super.func_149636_a(p_149636_1_, p_149636_2_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_);
      }

   }

   public int func_149643_k(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_) {
      return p_149643_1_.func_72805_g(p_149643_2_, p_149643_3_, p_149643_4_);
   }

   public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_) {
      int var6 = p_149851_1_.func_72805_g(p_149851_2_, p_149851_3_, p_149851_4_);
      return var6 != 0;
   }

   public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_) {
      return true;
   }

   public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_) {
      int var6 = p_149853_1_.func_72805_g(p_149853_3_, p_149853_4_, p_149853_5_);
      byte var7 = 2;
      if(var6 == 2) {
         var7 = 3;
      }

      if(Blocks.field_150398_cm.func_149742_c(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_)) {
         Blocks.field_150398_cm.func_149889_c(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_, var7, 2);
      }

   }

}
