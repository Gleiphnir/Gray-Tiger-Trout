package icons;

import main.Player;

public class Gore extends SpecialIcons {

	public Gore(int aV) {
		super("Gore", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		return 0;
	}

}
