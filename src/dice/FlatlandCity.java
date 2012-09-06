package dice;

import icons.CityIcon;
import icons.MagicIcon;
import icons.MeleeIcon;
import icons.MissileIcon;

import java.awt.Color;

public class FlatlandCity extends TerrainDice {

	public FlatlandCity() {
		super(8, 8, "Flatland City");
		this.aspect.add(Color.yellow);
		this.aspect.add(Color.green);
		this.actionIcons.add(new MagicIcon(1).setOwningDice(this));
		this.actionIcons.add(new MissileIcon(2).setOwningDice(this));
		this.actionIcons.add(new MissileIcon(3).setOwningDice(this));
		this.actionIcons.add(new MissileIcon(4).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(5).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(6).setOwningDice(this));
		this.actionIcons.add(new MeleeIcon(7).setOwningDice(this));
		this.actionIcons.add(new CityIcon(8).setOwningDice(this));
	}

}
