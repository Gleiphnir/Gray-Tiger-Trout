package icons;

public class DoubleStrike extends SpecialIcons {
	
	public DoubleStrike(int size) {
		super("Double Strike",size);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		
		return rollFlags.resetFlags();
	}

}
