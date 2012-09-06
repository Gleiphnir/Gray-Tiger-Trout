package dice;

import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class HorseFolk extends Feral {

	public HorseFolk() {
		super(6, 2, "Horse Folk");
		this.actionIcons.add(new ManeuverIcon(2).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(2).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(3).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(2).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(3).setOwningDice(this));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
