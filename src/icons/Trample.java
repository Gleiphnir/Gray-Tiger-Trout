package icons;

public class Trample extends SpecialIcons {

	public Trample(int aV) {
		super("Trample", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		rollFlags.resetFlags();
		rollFlags.MeleeFlag = true;
		rollFlags.ManeuverFlag = true;
		rollFlags.addFaceValue = true;
		return rollFlags;
	}

}
