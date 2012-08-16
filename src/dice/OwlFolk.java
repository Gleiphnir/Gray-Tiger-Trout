package dice;

import icons.DispelMagic;
import icons.Fly;
import icons.IDIcon;
import icons.MagicIcon;
import icons.Screech;
import icons.Seize;

public class OwlFolk extends Feral {

	public OwlFolk() {
		super(10, 4, "Owl Folk");
		this.actionIcons.add(new Fly(4));
		this.actionIcons.add(new DispelMagic(4));
		this.actionIcons.add(new MagicIcon(4));
		this.actionIcons.add(new Screech(4));
		this.actionIcons.add(new Seize(4));
		this.actionIcons.add(new MagicIcon(4));
		this.actionIcons.add(new Fly(4));
		this.actionIcons.add(new DispelMagic(4));
		this.actionIcons.add(new MagicIcon(4));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
