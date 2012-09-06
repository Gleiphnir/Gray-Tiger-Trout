package icons;

import main.Player;

public class IDIcon extends NormalIcon {

	public IDIcon(String name, int aV) {
		super(name, aV);
	}

	@Override
	public int resolveEffects(Player p) {
		return this.getActionValue();
	}

}
