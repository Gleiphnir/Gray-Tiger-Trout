package dice;

import icons.Gore;
import icons.IDIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.SaveIcon;
import icons.Trample;

public class RhinoFolk extends Feral {

	public RhinoFolk() {
		super(10, 4, "Rhino Folk");
		this.actionIcons.add(new ManeuverIcon(4));
		this.actionIcons.add(new SaveIcon(4));
		this.actionIcons.add(new MeleeIcon(4));
		this.actionIcons.add(new Gore(4));
		this.actionIcons.add(new Gore(4));
		this.actionIcons.add(new MeleeIcon(4));
		this.actionIcons.add(new Trample(4));
		this.actionIcons.add(new SaveIcon(4));
		this.actionIcons.add(new ManeuverIcon(4));
		this.actionIcons.add(new IDIcon(this.ID,this.size));
	}

}
