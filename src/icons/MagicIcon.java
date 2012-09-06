package icons;

import main.Player;

public class MagicIcon extends NormalIcon {
	
	public MagicIcon(int av){
		super("Magic",av);
	}

	@Override
	public int resolveEffects(Player p) {
		return (p.getCurrentPhase().equalsIgnoreCase("Magic")) ? this.getActionValue():0;
	}
	
}
