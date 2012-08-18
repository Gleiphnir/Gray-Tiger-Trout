package icons;

import main.Player;

public class Cantrip extends SpecialIcons {

	public Cantrip(int aV) {
		super("Cantrip", aV);
	}

	@Override
	public boolean resolveEffects(Player p) {
		System.out.println("Do something here if magic");
		return false;
	}

}
