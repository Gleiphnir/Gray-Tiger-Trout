package dice;

import icons.DoubleStrike;
import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.Roar;
import icons.SaveIcon;

public class LionFolk extends Feral {

	public LionFolk() {
		super(10, 4, "Lion Folk");
		this.actionIcons.add(new Roar(4).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(4).setOwningDice(this));
		this.actionIcons.add(new DoubleStrike(4).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(4).setOwningDice(this));
		this.actionIcons.add(new DoubleStrike(4).setOwningDice(this));
		this.actionIcons.add(new Roar(4).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(4).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(4).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(4).setOwningDice(this));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
