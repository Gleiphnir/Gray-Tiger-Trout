package main;

import icons.Flags;
import icons.IDIcon;
import icons.MagicIcon;
import icons.ManeuverIcon;
import icons.MeleeIcon;
import icons.MissileIcon;
import icons.SpecialIcons;
import icons.EightFace;

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
				new BearFolk(),new OwlFolk(),new ElephantFolk(),new LionFolk(),new RhinoFolk()};
		
		TerrainDice t1 = new FlatlandCity();
		
		Dice w2[] = {new WeaselFolk(),new AntelopeFolk(),new FalconFolk(),new HoundFolk(),new LynxFolk(),
				new BadgerFolk(),new HorseFolk(),new HawkFolk(),new FoxFolk(),new LeopardFolk(),
				new WolverineFolk(),new BuffaloFolk(),new VultureFolk(),new WolfFolk(),new TigerFolk(),
				new BearFolk(),new OwlFolk(),new ElephantFolk(),new LionFolk(),new RhinoFolk()};
		
		//While the terrain dice is rolled on the eight face. (ie. Loops until not eight face)
		while(t1.rollDice() instanceof EightFace);
		System.out.println("Current Terrain Face is: "+t1.getCurrentFace().toString());		
		
		//Begin a new round with first March
		movementRoll(keyboard, w1, t1, w2);
		
		System.out.println("Would you like to conduct a Action?");
		boolean player1 = keyboard.nextBoolean();
		if(player1){//If player wants to engage in an Action
			if(t1.getCurrentFace() instanceof MeleeIcon){
				System.out.println("You are conducting a Melee Action.");
			}
			else if(t1.getCurrentFace() instanceof MissileIcon){
				System.out.println("You are conducting a Missile Action");
			}
			else if(t1.getCurrentFace() instanceof MagicIcon){
				System.out.println("You are conducting a Magic Action");
			}
		}
	}

	private static boolean movementRoll(Scanner keyboard, Dice[] w1,
			TerrainDice t1, Dice[] w2) {
		System.out.println("Would you like to conduct a Maneuver?");
		boolean player1 = keyboard.nextBoolean();
		boolean move = false;//Assume player does not want to move
		if(player1){
			//If player1 wants to move the terrain, then ask for counter
			move = true;
			System.out.println("Would you like to conduct a Counter-Maneuver?");
			boolean player2 = keyboard.nextBoolean();
			//If player2 wants to counter then proceed with rolls
			if(player2){
				int maneuver = maneuverDiceRoll(w1);
				System.out.println("You rolled "+maneuver+" movement score.");
				int counterManeuver = maneuverDiceRoll(w2);
				System.out.println("You countered with "+counterManeuver+" movement score.");
				//Set move to the success or failure of player1 beating player2 in maneuver
				move = (maneuver>counterManeuver);
			}
		}
		return move ? successfullMovement(keyboard, t1):false;
	}

	private static boolean successfullMovement(Scanner keyboard, TerrainDice t1) {
		System.out.println("Would you like to move the Terrain Dice Up or Down?");
		String choice = keyboard.next();
			return choice.equalsIgnoreCase("up") ? t1.moveUp():
				choice.equalsIgnoreCase("down") ? t1.moveDown() : false;
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
