package dice;

import icons.IDIcon;
import icons.MagicIcon;
import icons.MeleeIcon;
import icons.SaveIcon;

public class BadgerFolk extends Feral{

	public BadgerFolk() {
		super(6, 2, "BadgerFolk");
		this.actionIcons.add(new MeleeIcon(3));
		this.actionIcons.add(new MagicIcon(3));
		this.actionIcons.add(new MagicIcon(2));
		this.actionIcons.add(new SaveIcon(2));
		this.actionIcons.add(new SaveIcon(2));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
