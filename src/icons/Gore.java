package icons;

public class Gore extends SpecialIcons {

	public Gore(int aV) {
		super("Gore", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		return rollFlags.resetFlags();
	}

}
