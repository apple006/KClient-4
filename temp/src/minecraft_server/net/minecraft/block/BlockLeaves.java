package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public abstract class BlockLeaves extends BlockLeavesBase {

   int[] field_150128_a;
   protected IIcon[][] field_150129_M = new IIcon[2][];
   private static final String __OBFID = "CL_00000263";


   public BlockLeaves() {
      super(Material.field_151584_j, false);
      this.func_149675_a(true);
      this.func_149647_a(CreativeTabs.field_78031_c);
      this.func_149711_c(0.2F);
      this.func_149713_g(1);
      this.func_149672_a(field_149779_h);
   }

   public void func_149749_a(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
      byte var7 = 1;
      int var8 = var7 + 1;
      if(p_149749_1_.func_72904_c(p_149749_2_ - var8, p_149749_3_ - var8, p_149749_4_ - var8, p_149749_2_ + var8, p_149749_3_ + var8, p_149749_4_ + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  if(p_149749_1_.func_147439_a(p_149749_2_ + var9, p_149749_3_ + var10, p_149749_4_ + var11).func_149688_o() == Material.field_151584_j) {
                     int var12 = p_149749_1_.func_72805_g(p_149749_2_ + var9, p_149749_3_ + var10, p_149749_4_ + var11);
                     p_149749_1_.func_72921_c(p_149749_2_ + var9, p_149749_3_ + var10, p_149749_4_ + var11, var12 | 8, 4);
                  }
               }
            }
         }
      }

   }

   public void func_149674_a(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
      if(!p_149674_1_.field_72995_K) {
         int var6 = p_149674_1_.func_72805_g(p_149674_2_, p_149674_3_, p_149674_4_);
         if((var6 & 8) != 0 && (var6 & 4) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if(this.field_150128_a == null) {
               this.field_150128_a = new int[var9 * var9 * var9];
            }

            int var12;
            if(p_149674_1_.func_72904_c(p_149674_2_ - var8, p_149674_3_ - var8, p_149674_4_ - var8, p_149674_2_ + var8, p_149674_3_ + var8, p_149674_4_ + var8)) {
               int var13;
               int var14;
               for(var12 = -var7; var12 <= var7; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        Block var15 = p_149674_1_.func_147439_a(p_149674_2_ + var12, p_149674_3_ + var13, p_149674_4_ + var14);
                        if(var15 != Blocks.field_150364_r && var15 != Blocks.field_150363_s) {
                           if(var15.func_149688_o() == Material.field_151584_j) {
                              this.field_150128_a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
                           } else {
                              this.field_150128_a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
                           }
                        } else {
                           this.field_150128_a[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        }
                     }
                  }
               }

               for(var12 = 1; var12 <= 4; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        for(int var16 = -var7; var16 <= var7; ++var16) {
                           if(this.field_150128_a[(var13 + var11) * var10 + (var14 + var11) * var9 + var16 + var11] == var12 - 1) {
                              if(this.field_150128_a[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var16 + var11] == -2) {
                                 this.field_150128_a[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var16 + var11] = var12;
                              }

                              if(this.field_150128_a[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var16 + var11] == -2) {
                                 this.field_150128_a[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var16 + var11] = var12;
                              }

                              if(this.field_150128_a[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var16 + var11] == -2) {
                                 this.field_150128_a[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var16 + var11] = var12;
                              }

                              if(this.field_150128_a[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var16 + var11] == -2) {
                                 this.field_150128_a[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var16 + var11] = var12;
                              }

                              if(this.field_150128_a[(var13 + var11) * var10 + (var14 + var11) * var9 + (var16 + var11 - 1)] == -2) {
                                 this.field_150128_a[(var13 + var11) * var10 + (var14 + var11) * var9 + (var16 + var11 - 1)] = var12;
                              }

                              if(this.field_150128_a[(var13 + var11) * var10 + (var14 + var11) * var9 + var16 + var11 + 1] == -2) {
                                 this.field_150128_a[(var13 + var11) * var10 + (var14 + var11) * var9 + var16 + var11 + 1] = var12;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var12 = this.field_150128_a[var11 * var10 + var11 * var9 + var11];
            if(var12 >= 0) {
               p_149674_1_.func_72921_c(p_149674_2_, p_149674_3_, p_149674_4_, var6 & -9, 4);
            } else {
               this.func_150126_e(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
            }
         }

      }
   }

   private void func_150126_e(World p_150126_1_, int p_150126_2_, int p_150126_3_, int p_150126_4_) {
      this.func_149697_b(p_150126_1_, p_150126_2_, p_150126_3_, p_150126_4_, p_150126_1_.func_72805_g(p_150126_2_, p_150126_3_, p_150126_4_), 0);
      p_150126_1_.func_147468_f(p_150126_2_, p_150126_3_, p_150126_4_);
   }

   public int func_149745_a(Random p_149745_1_) {
      return p_149745_1_.nextInt(20) == 0?1:0;
   }

   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
      return Item.func_150898_a(Blocks.field_150345_g);
   }

   public void func_149690_a(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {
      if(!p_149690_1_.field_72995_K) {
         int var8 = this.func_150123_b(p_149690_5_);
         if(p_149690_7_ > 0) {
            var8 -= 2 << p_149690_7_;
            if(var8 < 10) {
               var8 = 10;
            }
         }

         if(p_149690_1_.field_73012_v.nextInt(var8) == 0) {
            Item var9 = this.func_149650_a(p_149690_5_, p_149690_1_.field_73012_v, p_149690_7_);
            this.func_149642_a(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, new ItemStack(var9, 1, this.func_149692_a(p_149690_5_)));
         }

         var8 = 200;
         if(p_149690_7_ > 0) {
            var8 -= 10 << p_149690_7_;
            if(var8 < 40) {
               var8 = 40;
            }
         }

         this.func_150124_c(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, var8);
      }

   }

   protected void func_150124_c(World p_150124_1_, int p_150124_2_, int p_150124_3_, int p_150124_4_, int p_150124_5_, int p_150124_6_) {}

   protected int func_150123_b(int p_150123_1_) {
      return 20;
   }

   public void func_149636_a(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_) {
      if(!p_149636_1_.field_72995_K && p_149636_2_.func_71045_bC() != null && p_149636_2_.func_71045_bC().func_77973_b() == Items.field_151097_aZ) {
         p_149636_2_.func_71064_a(StatList.field_75934_C[Block.func_149682_b(this)], 1);
         this.func_149642_a(p_149636_1_, p_149636_3_, p_149636_4_, p_149636_5_, new ItemStack(Item.func_150898_a(this), 1, p_149636_6_ & 3));
      } else {
         super.func_149636_a(p_149636_1_, p_149636_2_, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_);
      }

   }

   public int func_149692_a(int p_149692_1_) {
      return p_149692_1_ & 3;
   }

   public boolean func_149662_c() {
      return !this.field_150121_P;
   }

   protected ItemStack func_149644_j(int p_149644_1_) {
      return new ItemStack(Item.func_150898_a(this), 1, p_149644_1_ & 3);
   }

   public abstract String[] func_150125_e();
}
