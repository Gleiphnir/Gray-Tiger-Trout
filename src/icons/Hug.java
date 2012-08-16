package icons;

public class Hug extends SpecialIcons {

	public Hug(int aV) {
		super("Hug", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollFlags) {
		if(rollFlags.MeleeFlag){
			System.out.println("You Rolled Hug");
		}
		return rollFlags.resetFlags();
	}

}
