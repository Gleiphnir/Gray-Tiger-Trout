package dice;

import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class HoundFolk extends Feral {
	
	public HoundFolk() {
		super(6, 1, "Hound Folk");
		this.actionIcons.add(new ManeuverIcon(1));
		this.actionIcons.add(new ManeuverIcon(1));
		this.actionIcons.add(new SaveIcon(1));
		this.actionIcons.add(new MeleeIcon(1));
		this.actionIcons.add(new MeleeIcon(2));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
