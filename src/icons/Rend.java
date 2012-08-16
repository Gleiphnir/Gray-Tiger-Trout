package icons;

public class Rend extends SpecialIcons{

	public Rend(int aV) {
		super("Rend", aV);
	}

	@Override
	public Flags resolveEffects(Flags rollType) {
		if(rollType.ManeuverFlag){
			rollType.resetFlags();
			rollType.ManeuverFlag = true;
			rollType.addFaceValue = true;
			return rollType;
		}
		else if(rollType.MeleeFlag){
			rollType.resetFlags();
			rollType.MeleeFlag = true;
			rollType.addFaceValue = true;
			rollType.RerollFlag = true;
			return rollType;
		}
			
		return rollType.resetFlags();
			
	}

}
