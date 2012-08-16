package dice;

import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.MissileIcon;

public class FalconFolk extends Feral {
	
	public FalconFolk() {
		super(6, 1, "Falcon Folk");
		this.actionIcons.add(new MissileIcon(1));
		this.actionIcons.add(new MissileIcon(2));
		this.actionIcons.add(new ManeuverIcon(1));
		this.actionIcons.add(new ManeuverIcon(1));
		this.actionIcons.add(new MeleeIcon(1));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
