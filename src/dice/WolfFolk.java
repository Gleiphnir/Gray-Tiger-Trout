package dice;

import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.Rend;
import icons.SaveIcon; 

public final class WolfFolk extends Feral {

	public WolfFolk() {
		super(6, 3, "Wolf Folk");
		this.actionIcons.add(new Rend(3));
		this.actionIcons.add(new MeleeIcon(2));
		this.actionIcons.add(new MeleeIcon(3));
		this.actionIcons.add(new SaveIcon(3));
		this.actionIcons.add(new ManeuverIcon(4));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
