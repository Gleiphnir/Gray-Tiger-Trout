package icons;

import main.Player;

public class Fly extends SpecialIcons {

	public Fly(int aV) {
		super("Fly", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		System.out.println("Do something here if magic");
		return 0;
	}

}
