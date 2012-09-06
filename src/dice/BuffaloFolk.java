package dice;

import icons.Counter;
import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class BuffaloFolk extends Feral {

	public BuffaloFolk() {
		super(6, 3, "Buffalo Folk");
		this.actionIcons.add(new Counter(4).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(3).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(4).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(2).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(3).setOwningDice(this));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
