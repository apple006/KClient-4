package net.minecraft.block;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Direction;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRedstoneWire extends Block {

   private boolean field_150181_a = true;
   private Set field_150179_b = new HashSet();
   private static final String __OBFID = "CL_00000295";


   public BlockRedstoneWire() {
      super(Material.field_151594_q);
      this.func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   public AxisAlignedBB func_149668_a(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
      return null;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public int func_149645_b() {
      return 5;
   }

   public boolean func_149742_c(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_) {
      return World.func_147466_a(p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_) || p_149742_1_.func_147439_a(p_149742_2_, p_149742_3_ - 1, p_149742_4_) == Blocks.field_150426_aN;
   }

   private void func_150177_e(World p_150177_1_, int p_150177_2_, int p_150177_3_, int p_150177_4_) {
      this.func_150175_a(p_150177_1_, p_150177_2_, p_150177_3_, p_150177_4_, p_150177_2_, p_150177_3_, p_150177_4_);
      ArrayList var5 = new ArrayList(this.field_150179_b);
      this.field_150179_b.clear();

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         ChunkPosition var7 = (ChunkPosition)var5.get(var6);
         p_150177_1_.func_147459_d(var7.field_151329_a, var7.field_151327_b, var7.field_151328_c, this);
      }

   }

   private void func_150175_a(World p_150175_1_, int p_150175_2_, int p_150175_3_, int p_150175_4_, int p_150175_5_, int p_150175_6_, int p_150175_7_) {
      int var8 = p_150175_1_.func_72805_g(p_150175_2_, p_150175_3_, p_150175_4_);
      byte var9 = 0;
      int var15 = this.func_150178_a(p_150175_1_, p_150175_5_, p_150175_6_, p_150175_7_, var9);
      this.field_150181_a = false;
      int var10 = p_150175_1_.func_94572_D(p_150175_2_, p_150175_3_, p_150175_4_);
      this.field_150181_a = true;
      if(var10 > 0 && var10 > var15 - 1) {
         var15 = var10;
      }

      int var11 = 0;

      for(int var12 = 0; var12 < 4; ++var12) {
         int var13 = p_150175_2_;
         int var14 = p_150175_4_;
         if(var12 == 0) {
            var13 = p_150175_2_ - 1;
         }

         if(var12 == 1) {
            ++var13;
         }

         if(var12 == 2) {
            var14 = p_150175_4_ - 1;
         }

         if(var12 == 3) {
            ++var14;
         }

         if(var13 != p_150175_5_ || var14 != p_150175_7_) {
            var11 = this.func_150178_a(p_150175_1_, var13, p_150175_3_, var14, var11);
         }

         if(p_150175_1_.func_147439_a(var13, p_150175_3_, var14).func_149721_r() && !p_150175_1_.func_147439_a(p_150175_2_, p_150175_3_ + 1, p_150175_4_).func_149721_r()) {
            if((var13 != p_150175_5_ || var14 != p_150175_7_) && p_150175_3_ >= p_150175_6_) {
               var11 = this.func_150178_a(p_150175_1_, var13, p_150175_3_ + 1, var14, var11);
            }
         } else if(!p_150175_1_.func_147439_a(var13, p_150175_3_, var14).func_149721_r() && (var13 != p_150175_5_ || var14 != p_150175_7_) && p_150175_3_ <= p_150175_6_) {
            var11 = this.func_150178_a(p_150175_1_, var13, p_150175_3_ - 1, var14, var11);
         }
      }

      if(var11 > var15) {
         var15 = var11 - 1;
      } else if(var15 > 0) {
         --var15;
      } else {
         var15 = 0;
      }

      if(var10 > var15 - 1) {
         var15 = var10;
      }

      if(var8 != var15) {
         p_150175_1_.func_72921_c(p_150175_2_, p_150175_3_, p_150175_4_, var15, 2);
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_ - 1, p_150175_3_, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_ + 1, p_150175_3_, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_ - 1, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_ + 1, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_ - 1));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_ + 1));
      }

   }

   private void func_150172_m(World p_150172_1_, int p_150172_2_, int p_150172_3_, int p_150172_4_) {
      if(p_150172_1_.func_147439_a(p_150172_2_, p_150172_3_, p_150172_4_) == this) {
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_ - 1, p_150172_3_, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_ + 1, p_150172_3_, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_, p_150172_4_ - 1, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_, p_150172_4_ + 1, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_ - 1, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_ + 1, p_150172_4_, this);
      }
   }

   public void func_149726_b(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_) {
      super.func_149726_b(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
      if(!p_149726_1_.field_72995_K) {
         this.func_150177_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
         p_149726_1_.func_147459_d(p_149726_2_, p_149726_3_ + 1, p_149726_4_, this);
         p_149726_1_.func_147459_d(p_149726_2_, p_149726_3_ - 1, p_149726_4_, this);
         this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_, p_149726_4_);
         this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_, p_149726_4_);
         this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_ - 1);
         this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_ + 1);
         if(p_149726_1_.func_147439_a(p_149726_2_ - 1, p_149726_3_, p_149726_4_).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_ + 1, p_149726_4_);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_);
         }

         if(p_149726_1_.func_147439_a(p_149726_2_ + 1, p_149726_3_, p_149726_4_).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_ + 1, p_149726_4_);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_);
         }

         if(p_149726_1_.func_147439_a(p_149726_2_, p_149726_3_, p_149726_4_ - 1).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ + 1, p_149726_4_ - 1);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ - 1, p_149726_4_ - 1);
         }

         if(p_149726_1_.func_147439_a(p_149726_2_, p_149726_3_, p_149726_4_ + 1).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ + 1, p_149726_4_ + 1);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ - 1, p_149726_4_ + 1);
         }

      }
   }

   public void func_149749_a(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
      super.func_149749_a(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
      if(!p_149749_1_.field_72995_K) {
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_ + 1, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_ - 1, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_ + 1, p_149749_3_, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_ - 1, p_149749_3_, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_, p_149749_4_ + 1, this);
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_, p_149749_4_ - 1, this);
         this.func_150177_e(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_);
         this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_, p_149749_4_);
         this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_, p_149749_4_);
         this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_ - 1);
         this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_ + 1);
         if(p_149749_1_.func_147439_a(p_149749_2_ - 1, p_149749_3_, p_149749_4_).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_ + 1, p_149749_4_);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_ - 1, p_149749_4_);
         }

         if(p_149749_1_.func_147439_a(p_149749_2_ + 1, p_149749_3_, p_149749_4_).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_ + 1, p_149749_4_);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_ - 1, p_149749_4_);
         }

         if(p_149749_1_.func_147439_a(p_149749_2_, p_149749_3_, p_149749_4_ - 1).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ + 1, p_149749_4_ - 1);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ - 1, p_149749_4_ - 1);
         }

         if(p_149749_1_.func_147439_a(p_149749_2_, p_149749_3_, p_149749_4_ + 1).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ + 1, p_149749_4_ + 1);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ - 1, p_149749_4_ + 1);
         }

      }
   }

   private int func_150178_a(World p_150178_1_, int p_150178_2_, int p_150178_3_, int p_150178_4_, int p_150178_5_) {
      if(p_150178_1_.func_147439_a(p_150178_2_, p_150178_3_, p_150178_4_) != this) {
         return p_150178_5_;
      } else {
         int var6 = p_150178_1_.func_72805_g(p_150178_2_, p_150178_3_, p_150178_4_);
         return var6 > p_150178_5_?var6:p_150178_5_;
      }
   }

   public void func_149695_a(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
      if(!p_149695_1_.field_72995_K) {
         boolean var6 = this.func_149742_c(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
         if(var6) {
            this.func_150177_e(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
         } else {
            this.func_149697_b(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, 0, 0);
            p_149695_1_.func_147468_f(p_149695_2_, p_149695_3_, p_149695_4_);
         }

         super.func_149695_a(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_);
      }
   }

   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
      return Items.field_151137_ax;
   }

   public int func_149748_c(IBlockAccess p_149748_1_, int p_149748_2_, int p_149748_3_, int p_149748_4_, int p_149748_5_) {
      return !this.field_150181_a?0:this.func_149709_b(p_149748_1_, p_149748_2_, p_149748_3_, p_149748_4_, p_149748_5_);
   }

   public int func_149709_b(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_) {
      if(!this.field_150181_a) {
         return 0;
      } else {
         int var6 = p_149709_1_.func_72805_g(p_149709_2_, p_149709_3_, p_149709_4_);
         if(var6 == 0) {
            return 0;
         } else if(p_149709_5_ == 1) {
            return var6;
         } else {
            boolean var7 = func_150176_g(p_149709_1_, p_149709_2_ - 1, p_149709_3_, p_149709_4_, 1) || !p_149709_1_.func_147439_a(p_149709_2_ - 1, p_149709_3_, p_149709_4_).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_ - 1, p_149709_3_ - 1, p_149709_4_, -1);
            boolean var8 = func_150176_g(p_149709_1_, p_149709_2_ + 1, p_149709_3_, p_149709_4_, 3) || !p_149709_1_.func_147439_a(p_149709_2_ + 1, p_149709_3_, p_149709_4_).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_ + 1, p_149709_3_ - 1, p_149709_4_, -1);
            boolean var9 = func_150176_g(p_149709_1_, p_149709_2_, p_149709_3_, p_149709_4_ - 1, 2) || !p_149709_1_.func_147439_a(p_149709_2_, p_149709_3_, p_149709_4_ - 1).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_, p_149709_3_ - 1, p_149709_4_ - 1, -1);
            boolean var10 = func_150176_g(p_149709_1_, p_149709_2_, p_149709_3_, p_149709_4_ + 1, 0) || !p_149709_1_.func_147439_a(p_149709_2_, p_149709_3_, p_149709_4_ + 1).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_, p_149709_3_ - 1, p_149709_4_ + 1, -1);
            if(!p_149709_1_.func_147439_a(p_149709_2_, p_149709_3_ + 1, p_149709_4_).func_149721_r()) {
               if(p_149709_1_.func_147439_a(p_149709_2_ - 1, p_149709_3_, p_149709_4_).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_ - 1, p_149709_3_ + 1, p_149709_4_, -1)) {
                  var7 = true;
               }

               if(p_149709_1_.func_147439_a(p_149709_2_ + 1, p_149709_3_, p_149709_4_).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_ + 1, p_149709_3_ + 1, p_149709_4_, -1)) {
                  var8 = true;
               }

               if(p_149709_1_.func_147439_a(p_149709_2_, p_149709_3_, p_149709_4_ - 1).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_, p_149709_3_ + 1, p_149709_4_ - 1, -1)) {
                  var9 = true;
               }

               if(p_149709_1_.func_147439_a(p_149709_2_, p_149709_3_, p_149709_4_ + 1).func_149721_r() && func_150176_g(p_149709_1_, p_149709_2_, p_149709_3_ + 1, p_149709_4_ + 1, -1)) {
                  var10 = true;
               }
            }

            return !var9 && !var8 && !var7 && !var10 && p_149709_5_ >= 2 && p_149709_5_ <= 5?var6:(p_149709_5_ == 2 && var9 && !var7 && !var8?var6:(p_149709_5_ == 3 && var10 && !var7 && !var8?var6:(p_149709_5_ == 4 && var7 && !var9 && !var10?var6:(p_149709_5_ == 5 && var8 && !var9 && !var10?var6:0))));
         }
      }
   }

   public boolean func_149744_f() {
      return this.field_150181_a;
   }

   public static boolean func_150174_f(IBlockAccess p_150174_0_, int p_150174_1_, int p_150174_2_, int p_150174_3_, int p_150174_4_) {
      Block var5 = p_150174_0_.func_147439_a(p_150174_1_, p_150174_2_, p_150174_3_);
      if(var5 == Blocks.field_150488_af) {
         return true;
      } else if(!Blocks.field_150413_aR.func_149907_e(var5)) {
         return var5.func_149744_f() && p_150174_4_ != -1;
      } else {
         int var6 = p_150174_0_.func_72805_g(p_150174_1_, p_150174_2_, p_150174_3_);
         return p_150174_4_ == (var6 & 3) || p_150174_4_ == Direction.field_71580_e[var6 & 3];
      }
   }

   public static boolean func_150176_g(IBlockAccess p_150176_0_, int p_150176_1_, int p_150176_2_, int p_150176_3_, int p_150176_4_) {
      if(func_150174_f(p_150176_0_, p_150176_1_, p_150176_2_, p_150176_3_, p_150176_4_)) {
         return true;
      } else if(p_150176_0_.func_147439_a(p_150176_1_, p_150176_2_, p_150176_3_) == Blocks.field_150416_aS) {
         int var5 = p_150176_0_.func_72805_g(p_150176_1_, p_150176_2_, p_150176_3_);
         return p_150176_4_ == (var5 & 3);
      } else {
         return false;
      }
   }
}