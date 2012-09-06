package icons;

import main.Player;

public class MeleeIcon extends NormalIcon {
	public MeleeIcon(int av){
		super("Melee",av);
	}

	@Override
	public int resolveEffects(Player p) {
		return (p.getCurrentPhase().equalsIgnoreCase("Melee")) ? this.getActionValue():0;
	}
}
