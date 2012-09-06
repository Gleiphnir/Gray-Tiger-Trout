package icons;

import main.Player;
import dice.Dice;

public abstract class Icons {

	private final int actionValue;
	private final String name;
	public Dice owningDice;
	
	Icons(String name, int aV){
		this.actionValue = aV;
		this.name = name;
	}
	
	public int getActionValue(){
		return this.actionValue;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return name+" "+actionValue;
		
	}
	
	public Icons setOwningDice(Dice die){
		this.owningDice = die;
		return this;
	}
	
	public abstract int resolveEffects(Player p);
}
