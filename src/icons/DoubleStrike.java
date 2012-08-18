package icons;

import main.Player;

public class DoubleStrike extends SpecialIcons {
	
	public DoubleStrike(int size) {
		super("Double Strike",size);
	}

	@Override
	public boolean resolveEffects(Player rollFlags) {
		System.out.println("Do something here if magic");
		return false;
	}

}
