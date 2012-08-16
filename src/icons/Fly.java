package icons;

public class Fly extends SpecialIcons {

	public Fly(int aV) {
		super("Fly", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		rollFlags.resetFlags();
		rollFlags.ManeuverFlag = true;
		rollFlags.SaveFlag = true;
		rollFlags.addFaceValue = true;
		return rollFlags;
	}

}
