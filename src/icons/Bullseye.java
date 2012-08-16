package icons;

public class Bullseye extends SpecialIcons {

	public Bullseye(int aV) {
		super("Bullseye", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		return rollFlags.resetFlags();
	}

}
