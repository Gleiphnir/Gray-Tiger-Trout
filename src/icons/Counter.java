package icons;

public class Counter extends SpecialIcons {

	public Counter(int aV) {
		super("Counter", aV);
		
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		return rollFlags.resetFlags();
	}

}
