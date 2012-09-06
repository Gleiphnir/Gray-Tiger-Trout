package icons;

import main.Player;

public class Screech extends SpecialIcons {

	public Screech(int aV) {
		super("Screech", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		return 0;
	}

}
