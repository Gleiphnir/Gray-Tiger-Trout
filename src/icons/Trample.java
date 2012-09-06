package icons;

import main.Player;

public class Trample extends SpecialIcons {

	public Trample(int aV) {
		super("Trample", aV);
	}

	@Override
	public int resolveEffects(Player p) {
		return p.getCurrentPhase().equalsIgnoreCase("Melee") ? this.getActionValue()
				: p.getCurrentPhase().equalsIgnoreCase("Maneuver") ? this.getActionValue():0;
	}

}
