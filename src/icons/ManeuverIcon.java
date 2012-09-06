package icons;

import main.Player;

public class ManeuverIcon extends NormalIcon {
	public ManeuverIcon(int av){
		super("Maneuver",av);
	}

	@Override
	public int resolveEffects(Player p) {
		return (p.getCurrentPhase().equalsIgnoreCase("Maneuver")) ? this.getActionValue():0;
	}
}
