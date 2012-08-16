package icons;

public class Roar extends SpecialIcons {

	public Roar(int aV) {
		super("Roar", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		if(rollFlags.MeleeFlag){
			System.out.println("You rolled Roar");
		}
		return rollFlags.resetFlags();
	}

}
