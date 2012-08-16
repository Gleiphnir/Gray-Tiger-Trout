package dice;

import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class LeopardFolk extends Feral {

	public LeopardFolk() {
		super(6, 2, "Leopard Folk");
		this.actionIcons.add(new ManeuverIcon(2));
		this.actionIcons.add(new MeleeIcon(3));
		this.actionIcons.add(new MeleeIcon(3));
		this.actionIcons.add(new SaveIcon(2));
		this.actionIcons.add(new SaveIcon(2));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
