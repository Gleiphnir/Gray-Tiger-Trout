package dice;

import icons.DoubleStrike;
import icons.IDIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class TigerFolk extends Feral {

	public TigerFolk() {
		super(6, 3, "Tiger Folk");
		this.actionIcons.add(new MeleeIcon(4));
		this.actionIcons.add(new MeleeIcon(2));
		this.actionIcons.add(new DoubleStrike(4));
		this.actionIcons.add(new SaveIcon(4));
		this.actionIcons.add(new SaveIcon(2));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
