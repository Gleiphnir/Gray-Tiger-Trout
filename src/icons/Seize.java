package icons;

public class Seize extends SpecialIcons {

	public Seize(int aV) {
		super("Seize", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		if(rollFlags.MissileFlag){
			System.out.println("You have rolled Seize");
		}
		return rollFlags.resetFlags();			
	}

}
