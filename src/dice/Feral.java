package dice;

import java.awt.Color;

public class Feral extends Dice{
	
	public Feral(int nf, int sz, String id) {
		super(nf, sz, id);
		this.aspect.add(Color.yellow);
		this.aspect.add(Color.green);
	}

	public String Ferilization = "Ferilization";
	
	public boolean resolveRacialAbility() {
		try{
			System.out.println("During the Initial Effects phase, " +
			"any of your armies at a terrain with at least one Feral unit may" +
			"recruit one Feral unit to this army or" +
			"promote one Feral unit in this army.");
		}catch(Exception e){
			System.err.println("Failed");
			return false;
		}
		return true;
	}

	@Override
	public boolean isMonster() {
		return true;
	}

	@Override
	public boolean isItem() {
		return false;
	}

	@Override
	public boolean isTerrain() {
		return false;
	}
}
