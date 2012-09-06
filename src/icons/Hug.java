package icons;

import main.Player;

public class Hug extends SpecialIcons {

	public Hug(int aV) {
		super("Hug", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		return 0;
	}

}
