package dice;

import icons.Bullseye;
import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.MissileIcon;

public class VultureFolk extends Feral {

	public VultureFolk() {
		super(6, 3, "Vulture Folk");
		this.actionIcons.add(new Bullseye(4));
		this.actionIcons.add(new MissileIcon(4));
		this.actionIcons.add(new MissileIcon(2));
		this.actionIcons.add(new MeleeIcon(3));
		this.actionIcons.add(new ManeuverIcon(3));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
