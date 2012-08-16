package dice;

import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.MissileIcon;

public class HawkFolk extends Feral {

	public HawkFolk(){
		super(6, 2, "Hawk Folk");
		this.actionIcons.add(new MeleeIcon(2));
		this.actionIcons.add(new MissileIcon(3));
		this.actionIcons.add(new MissileIcon(2));
		this.actionIcons.add(new ManeuverIcon(3));
		this.actionIcons.add(new ManeuverIcon(2));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}
}
