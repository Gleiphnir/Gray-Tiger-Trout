package main;

import java.util.Vector;

import dice.Dice;
import dice.TerrainDice;

public class Player {
	int magicPoints = 0;
	Vector<Dice> allDice = new Vector<Dice>();
	Vector<Dice> BuriedUnitArea = new Vector<Dice>();
	Vector<Dice> DeadUnitArea = new Vector<Dice>();
	Vector<Dice> SummoningPool = new Vector<Dice>();
	Vector<Dice> ReserveArea = new Vector<Dice>();
	Vector<Dice> HordeArmy = new Vector<Dice>();
	Vector<Dice> HomeArmy = new Vector<Dice>();
	Vector<Dice> CampaignArmy = new Vector<Dice>();
	TerrainDice horde;
	TerrainDice campaign;
	TerrainDice home;
	
	Player(Dice[] D){
		for(Dice d:D)
			this.allDice.add(d);
	}
	
	boolean addDiceToCampaign(Dice a){
		return this.CampaignArmy.add(this.allDice.remove(this.allDice.indexOf(a)));
	}
	
	boolean addDiceToHorde(Dice a){
		return this.HordeArmy.add(this.allDice.remove(this.allDice.indexOf(a)));
	}
	
	boolean addDiceToHome(Dice a){
		return this.HomeArmy.add(this.allDice.remove(this.allDice.indexOf(a)));
	}
	boolean setUp(){
		while(!this.allDice.isEmpty())
			this.addDiceToCampaign(this.allDice.firstElement());
		return true;
	}
	
	boolean setHordeTerrain(TerrainDice t){
		this.horde = t;
		return true;
	}
	boolean setHomeTerrain(TerrainDice t){
		this.home = t;
		return true;
	}
	boolean setCampaignTerrain(TerrainDice t){
		this.campaign = t;
		return true;
	}
}