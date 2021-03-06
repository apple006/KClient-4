package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;

public class S19PacketEntityHeadLook extends Packet
{
    private int field_149384_a;
    private byte field_149383_b;
    private static final String __OBFID = "CL_00001323";

    public S19PacketEntityHeadLook() {}

    public S19PacketEntityHeadLook(Entity p_i45214_1_, byte p_i45214_2_)
    {
        this.field_149384_a = p_i45214_1_.getEntityId();
        this.field_149383_b = p_i45214_2_;
    }

    /**
     * Reads the raw packet data from the data stream.
     */
    public void readPacketData(PacketBuffer p_148837_1_) throws IOException
    {
        this.field_149384_a = p_148837_1_.readInt();
        this.field_149383_b = p_148837_1_.readByte();
    }

    /**
     * Writes the raw packet data to the data stream.
     */
    public void writePacketData(PacketBuffer p_148840_1_) throws IOException
    {
        p_148840_1_.writeInt(this.field_149384_a);
        p_148840_1_.writeByte(this.field_149383_b);
    }

    public void func_148833_a(INetHandlerPlayClient p_149382_1_)
    {
        p_149382_1_.handleEntityHeadLook(this);
    }

    /**
     * Returns a string formatted as comma separated [field]=[value] values. Used by Minecraft for logging purposes.
     */
    public String serialize()
    {
        return String.format("id=%d, rot=%d", new Object[] {Integer.valueOf(this.field_149384_a), Byte.valueOf(this.field_149383_b)});
    }

    public void func_148833_a(INetHandler p_148833_1_)
    {
        this.func_148833_a((INetHandlerPlayClient)p_148833_1_);
    }
}
