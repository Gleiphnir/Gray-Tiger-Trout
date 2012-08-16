package dice;

import icons.IDIcon;
import icons.MeleeIcon;
import icons.SaveIcon;
import icons.Trample;
import icons.Trumpet;

public class ElephantFolk extends Feral {

	public ElephantFolk() {
		super(10, 4, "Elephant Folk");
		this.actionIcons.add(new SaveIcon(4));
		this.actionIcons.add(new Trample(4));
		this.actionIcons.add(new SaveIcon(4));
		this.actionIcons.add(new Trample(4));
		this.actionIcons.add(new MeleeIcon(4));
		this.actionIcons.add(new Trumpet(4));
		this.actionIcons.add(new MeleeIcon(4));
		this.actionIcons.add(new Trumpet(4));
		this.actionIcons.add(new SaveIcon(4));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
