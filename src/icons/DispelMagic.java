package icons;

import icons.SpecialIcons;

public class DispelMagic extends SpecialIcons {

	public DispelMagic(int aV) {
		super("Dispel Magic", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		return rollFlags.resetFlags();
	}

}
