package icons;

import main.Player;
import icons.SpecialIcons;

public class DispelMagic extends SpecialIcons {

	public DispelMagic(int aV) {
		super("Dispel Magic", aV);
	}

	@Override
	public boolean resolveEffects(Player p) {
		return false;
	}

}
