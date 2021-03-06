package net.rush.protocol.packets;

import java.io.IOException;

import io.netty.buffer.ByteBuf;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper=true)
public class PlayerLook extends PlayerOnGround {

	public PlayerLook(float yaw, float pitch, boolean onGround) {
		super(onGround);
		this.yaw = yaw;
		this.pitch = pitch;
	}

	@Override
	public void read(ByteBuf in) throws IOException {
		yaw = in.readFloat();
		pitch = in.readFloat();
		super.read(in);
	}
}
