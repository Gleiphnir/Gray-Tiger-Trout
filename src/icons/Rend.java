package icons;

import main.Player;

public class Rend extends SpecialIcons{

	public Rend(int aV) {
		super("Rend", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		if(p.getCurrentPhase().equalsIgnoreCase("Maneuver"))
			return this.getActionValue();
		else if(p.getCurrentPhase().equalsIgnoreCase("Melee"))
			return this.getActionValue() + this.owningDice.rollDice().resolveEffects(p);
		else
			return 0;
	}

}
