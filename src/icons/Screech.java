package icons;

public class Screech extends SpecialIcons {

	public Screech(int aV) {
		super("Screech", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		if(rollFlags.MeleeFlag){
			rollFlags.resetFlags();
			rollFlags.SaveFlag = true;
			rollFlags.armyModifier = true;
			rollFlags.valueModifier = -4;
			return rollFlags;
		}
			
		return rollFlags.resetFlags();
	}

}
