package icons;

import main.Player;
import icons.SpecialIcons;

public class DispelMagic extends SpecialIcons {

	public DispelMagic(int aV) {
		super("Dispel Magic", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		return 0;
	}

}
