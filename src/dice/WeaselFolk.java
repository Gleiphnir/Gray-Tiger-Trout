package dice;

import icons.IDIcon;
import icons.MagicIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class WeaselFolk extends Feral {
	
	public WeaselFolk() {
		super(6, 1, "Weasel Folk");
		this.actionIcons.add(new MagicIcon(1).setOwningDice(this));
		this.actionIcons.add(new MagicIcon(2).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(1).setOwningDice(this));
		this.actionIcons.add(new SaveIcon(1).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(1).setOwningDice(this));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
