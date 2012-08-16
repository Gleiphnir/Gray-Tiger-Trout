package dice;

import icons.MagicIcon;
import icons.MeleeIcon;
import icons.MissileIcon;

import java.awt.Color;

public class FlatlandCity extends TerrainDice {

	public FlatlandCity() {
		super(8, 8, "Flatland City");
		this.aspect.add(Color.yellow);
		this.aspect.add(Color.green);
		this.actionIcons.add(new MagicIcon(1));
		this.actionIcons.add(new MissileIcon(2));
		this.actionIcons.add(new MissileIcon(3));
		this.actionIcons.add(new MissileIcon(4));
		this.actionIcons.add(new MeleeIcon(5));
		this.actionIcons.add(new MeleeIcon(6));
		this.actionIcons.add(new MeleeIcon(7));
		this.actionIcons.add(new CityIcon());
	}

}
