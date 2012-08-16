package icons;

public abstract class SpecialIcons extends Icons {
	
	public abstract Flags resolveEffects(Flags rollFlags);
	
	public SpecialIcons(String name, int aV) {
		super(name,aV);
	}

}
