package icons;

import main.Player;

public class Trumpet extends SpecialIcons {

	public Trumpet(int aV) {
		super("Trumpet", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		if(p.getCurrentPhase().equalsIgnoreCase("Melee")||p.getCurrentPhase().equalsIgnoreCase("Save")){
			
		}
	}

}
