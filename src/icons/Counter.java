package icons;

import main.Player;

public class Counter extends SpecialIcons {

	public Counter(int aV) {
		super("Counter", aV);
		
	}

	@Override
	public boolean resolveEffects(Player p) {
		System.out.println("Do something here if melee");
		return false;
	}

}
