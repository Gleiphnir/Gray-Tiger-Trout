package icons;

import main.Player;

public class Bullseye extends SpecialIcons {

	public Bullseye(int aV) {
		super("Bullseye", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		System.out.println("Do something here if it's a missile action");
		return 0;
	}

}
