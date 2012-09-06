package main;

import icons.MagicIcon;
import icons.MeleeIcon;
import icons.MissileIcon;
import icons.EightFace;

import java.util.Scanner;

import dice.*;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Set up the game with a keyboard and two sets of dice
		Scanner keyboard = new Scanner(System.in);
		Dice w1[] = {new WeaselFolk(),new AntelopeFolk(),new FalconFolk(),new HoundFolk(),new LynxFolk(),
				new BadgerFolk(),new HorseFolk(),new HawkFolk(),new FoxFolk(),new LeopardFolk(),
				new WolverineFolk(),new BuffaloFolk(),new VultureFolk(),new WolfFolk(),new TigerFolk(),
				new BearFolk(),new OwlFolk(),new ElephantFolk(),new LionFolk(),new RhinoFolk()};
		
		Dice w2[] = {new WeaselFolk(),new AntelopeFolk(),new FalconFolk(),new HoundFolk(),new LynxFolk(),
				new BadgerFolk(),new HorseFolk(),new HawkFolk(),new FoxFolk(),new LeopardFolk(),
				new WolverineFolk(),new BuffaloFolk(),new VultureFolk(),new WolfFolk(),new TigerFolk(),
				new BearFolk(),new OwlFolk(),new ElephantFolk(),new LionFolk(),new RhinoFolk()};
		
		TerrainDice t1 = new FlatlandCity();
		
		//Set up the players
		Player p1 = new Player(w1);
		Player p2 = new Player(w2);
		
		p1.setUp();
		p2.setUp();
		p1.setCampaignTerrain(t1);
		p2.setCampaignTerrain(t1);
		
		
		//While the terrain dice is rolled on the eight face. (ie. Loops until not eight face)
		while(t1.rollDice() instanceof EightFace);
		System.out.println("Current Terrain Face is: "+t1.getCurrentFace().toString());
		
		//Begin a new round with first March
		System.out.println("Would you like to conduct your First March?");
		boolean choice = keyboard.nextBoolean();
		if(choice){
			System.out.println("Where wouldfal you like to conduct your First March?");
			String army = keyboard.next();
			System.out.println(movementRoll(keyboard, p1, p2, army) ?
					"Terrain Dice is now: "+p1.getTerrainDiceAt(army).getCurrentFace()+" "
					+p1.getTerrainDiceAt(army).getCurrentFaceValue():"No move occured."); 
			actionRoll(keyboard, p1, p2, army);
		}
	}

	private static void actionRoll(Scanner keyboard, Player p1, Player p2, String location) {
		System.out.println("Would you like to conduct an Action?");
		boolean player1 = keyboard.nextBoolean();
		if(player1){//If player wants to engage in an Action
			if(p1.getTerrainDiceAt(location).getCurrentFace() instanceof MeleeIcon){
				System.out.println("You are conducting a Melee Action.");
				p1.setCurrentPhase("Melee");
				int attack = meleeDiceRoll(p1,location);
				if(attack > 0){
					p2.setCurrentPhase("Save");
					int defend = saveDiceRoll(p2);
					if(attack > defend)
						System.out.println("You have done "+(attack-defend)+" damage.");
				}
			}
			else if(p1.getTerrainDiceAt(location).getCurrentFace() instanceof MissileIcon){
				System.out.println("You are conducting a Missile Action");
			}
			else if(p1.getTerrainDiceAt(location).getCurrentFace() instanceof MagicIcon){
				System.out.println("You are conducting a Magic Action");
			}
		}
	}
	
	private static int saveDiceRoll(Player p2) {
		return 0;
	}

	private static boolean movementRoll(Scanner keyboard, Player p1, Player p2, String location) {
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
				p1.setCurrentPhase("Maneuver");
				p2.setCurrentPhase("Maneuver");
				int maneuver = maneuverDiceRoll(p1,location);
				System.out.println("You rolled "+maneuver+" movement score.");
				int counterManeuver = maneuverDiceRoll(p2,location);
				System.out.println("You countered with "+counterManeuver+" movement score.");
				//Set move to the success or failure of player1 beating player2 in maneuver
				move = (maneuver>counterManeuver);
			}
		}
		return move ? successfullMovement(keyboard, p1, location):false;
	}

	private static boolean successfullMovement(Scanner keyboard, Player p1, String location) {
		System.out.println("Would you like to move the Terrain Dice Up or Down?");
		String choice = keyboard.next();
			return choice.equalsIgnoreCase("up") ? p1.getTerrainDiceAt(location).moveUp():
				choice.equalsIgnoreCase("down") ? p1.getTerrainDiceAt(location).moveDown() : false;
	}

	private static int maneuverDiceRoll(Player p, String army){
		int total = 0;
		if(army.equalsIgnoreCase("Campaign")){
			for(int index=0;index<p.CampaignArmy.size();index++)
				total += p.CampaignArmy.elementAt(index).rollDice().resolveEffects(p);
		}
		return total;
	}
	
	private static int meleeDiceRoll(Player p, String army){
		int total = 0;
		if(army.equalsIgnoreCase("Campaign")){
			for(int index=0;index<p.CampaignArmy.size();index++)
				total += p.CampaignArmy.elementAt(index).rollDice().resolveEffects(p);
		}
		return total;
	}

}
