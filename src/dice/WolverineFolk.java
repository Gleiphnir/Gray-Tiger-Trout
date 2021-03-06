package dice;

import icons.Cantrip;
import icons.IDIcon;
import icons.MagicIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class WolverineFolk extends Feral {

	public WolverineFolk() {
		super(6, 3, "Wolverine Folk");
		this.actionIcons.add(new Cantrip(4));
		this.actionIcons.add(new MagicIcon(3));
		this.actionIcons.add(new MagicIcon(4));
		this.actionIcons.add(new SaveIcon(2));
		this.actionIcons.add(new MeleeIcon(3));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
