package dice;

import icons.DoubleStrike;
import icons.Hug;
import icons.IDIcon;
import icons.MagicIcon;
import icons.ManeuverIcon;
import icons.MissileIcon;
import icons.SaveIcon;

public class BearFolk extends Feral {

	public BearFolk() {
		super(10, 4, "Bear Folk");
		this.actionIcons.add(new ManeuverIcon(4).setOwningDice(this));
		this.actionIcons.add(new Hug(4).setOwningDice(this));
		this.actionIcons.add(new MissileIcon(4).setOwningDice(this));
		this.actionIcons.add(new DoubleStrike(4).setOwningDice(this));
		this.actionIcons.add(new DoubleStrike(4).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(4).setOwningDice(this));
		this.actionIcons.add(new ManeuverIcon(4).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(4).setOwningDice(this));
		this.actionIcons.add(new MagicIcon(4).setOwningDice(this));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
