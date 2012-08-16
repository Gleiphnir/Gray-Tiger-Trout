package icons;

public class Trumpet extends SpecialIcons {

	public Trumpet(int aV) {
		super("Trumpet", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		if(rollFlags.MeleeFlag || rollFlags.SaveFlag){
			rollFlags.resetFlags();
			rollFlags.MeleeFlag = true;
			rollFlags.SaveFlag = true;
			rollFlags.armyModifier = true;
			rollFlags.valueModifier = 2;
			return rollFlags;
		}
		return rollFlags.resetFlags();
	}

}
