package icons;

import main.Player;

public abstract class SpecialIcons extends Icons {
	
	public abstract boolean resolveEffects(Player p);
	
	public SpecialIcons(String name, int aV) {
		super(name,aV);
	}

}
