package icons;

import main.Player;

public class MissileIcon extends NormalIcon {
	public MissileIcon(int av){
		super("Missile",av);
	}

	@Override
	public int resolveEffects(Player p) {
		return 0;
	}
}
