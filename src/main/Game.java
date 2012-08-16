package main;

import icons.Flags;
import icons.IDIcon;
import icons.ManeuverIcon;
import icons.SpecialIcons;

import java.util.Scanner;

import dice.*;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Dice w1[] = {new WeaselFolk(),new AntelopeFolk(),new FalconFolk(),new HoundFolk(),new LynxFolk(),
				new BadgerFolk(),new HorseFolk(),new HawkFolk(),new FoxFolk(),new LeopardFolk(),
				new WolverineFolk(),new BuffaloFolk(),new VultureFolk(),new WolfFolk(),new TigerFolk(),
				new BearFolk(),new OwlFolk(),new ElephantFolk(),new LionFolk()};
		
		TerrainDice t1 = new FlatlandCity();
		
		Dice w2[] = {new WeaselFolk(),new AntelopeFolk(),new FalconFolk(),new HoundFolk(),new LynxFolk(),
				new BadgerFolk(),new HorseFolk(),new HawkFolk(),new FoxFolk(),new LeopardFolk(),
				new WolverineFolk(),new BuffaloFolk(),new VultureFolk(),new WolfFolk(),new TigerFolk(),
				new BearFolk(),new OwlFolk(),new ElephantFolk(),new LionFolk()};
		
		t1.rollDice();
		
		
		//Begin a new round with first March
		System.out.println("Would you like to conduct a Maneuver?");
		boolean player1 = keyboard.nextBoolean();
		if(player1){//If player1 wants to move the terrain dice up, then ask for counter
			System.out.println("Would you like to conduct a Counter-Maneuver?");
			boolean player2 = keyboard.nextBoolean();
			if(player2){//If player2 wants to counter then proceed with rolls
				int maneuver = maneuverDiceRoll(w1);
				System.out.println("You rolled "+maneuver+" movement score.");
				int counterManeuver = maneuverDiceRoll(w2);
				System.out.println("You countered with "+counterManeuver+" movement score.");
				System.out.println((maneuver>counterManeuver) ? "Sucess":"Failure");				
			}
		}
		
		System.out.println("Would you like to conduct a Action?");
		player1 = keyboard.nextBoolean();
		if(player1){//If player wants to engage in an Action
			
		}
	}

	private static int maneuverDiceRoll(Dice[] w) {
		int total = 0;
		for(Dice d:w)	
		{
			total += singleManeuverRoll(d);
		}
		return total;
	}
	
	private static int singleManeuverRoll(Dice d){
		Flags rollFlags = new Flags();
		rollFlags.ManeuverFlag = true;
		d.rollDice();
		if((d.getCurrentFace() instanceof ManeuverIcon)||(d.getCurrentFace() instanceof IDIcon))
			return d.getCurrentFaceValue();
		
		else if(d.getCurrentFace() instanceof SpecialIcons){
			SpecialIcons s = (SpecialIcons) d.getCurrentFace();
			rollFlags = s.resolveEffects(rollFlags);
			if(rollFlags.addFaceValue){
				return (rollFlags.RerollFlag) ? d.getCurrentFaceValue() + singleManeuverRoll(d) : d.getCurrentFaceValue();
			}
		}
		
		return 0;
	}

}
