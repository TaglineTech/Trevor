package co.schemati.trevor.velocity.platform;

import co.schemati.trevor.api.data.User;
import com.velocitypowered.api.proxy.Player;

import java.util.UUID;

public class VelocityUser extends User {

  public VelocityUser(Player player) {
    super(player.getUniqueId(), player.getUsername(),
            player.getRemoteAddress().getAddress().toString());
  }

  public VelocityUser(UUID uuid, String name, String address) {
    super(uuid, name, address);
  }
}
