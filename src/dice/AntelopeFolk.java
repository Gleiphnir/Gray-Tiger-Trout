package dice;

import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class AntelopeFolk extends Feral{
	
	public AntelopeFolk() {
		super(6, 1, "Antelope Folk");
		this.actionIcons.add(new ManeuverIcon(1).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(2).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(1).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(1).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(1).setOwningDice(this));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
