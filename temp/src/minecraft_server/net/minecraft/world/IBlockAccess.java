package net.minecraft.world;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Vec3Pool;

public interface IBlockAccess {

   Block func_147439_a(int var1, int var2, int var3);

   TileEntity func_147438_o(int var1, int var2, int var3);

   int func_72805_g(int var1, int var2, int var3);

   Vec3Pool func_82732_R();

   int func_72879_k(int var1, int var2, int var3, int var4);
}
