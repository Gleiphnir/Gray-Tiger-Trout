package icons;

public class Cantrip extends SpecialIcons {

	public Cantrip(int aV) {
		super("Cantrip", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		return rollFlags.resetFlags();
	}

}
