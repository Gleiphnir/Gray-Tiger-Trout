package dice;

import icons.Icons;

import java.awt.Color;
import java.util.Vector;

public abstract class Dice {
	protected final int numFaces;
	protected final int size;
	protected final String ID;
	protected Icons currentFace;
	protected Vector<Color> aspect;
	protected Vector<Icons> actionIcons;
	
	/**
	 * @param Integer numFaces
	 * @param Integer size
	 * @param String ID
	 */
	public Dice(int nf, int sz, String id){
		numFaces = nf;
		size = sz;
		ID = id;
		aspect = new Vector<Color>();
		actionIcons = new Vector<Icons>();
	}

	public Vector<Color> getAspect() {
		return this.aspect;
	}
	
	public Icons getActionIcon(double faceValue){
		return this.actionIcons.get((int) faceValue);
	}
	
	public int getNumFaces(){
		return this.numFaces;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public Icons getCurrentFace(){
		return this.currentFace;
	}
	
	public int getCurrentFaceValue(){
		return this.currentFace.getActionValue();
	}
	
	public Icons rollDice(){
		this.currentFace = this.actionIcons.get((int) (Math.random()*(this.numFaces)));
	//	System.out.println("You rolled "+this.ID+" with "+this.currentFace.getName()+" "+this.currentFace.getActionValue());
		return this.currentFace;
	}
	
	public abstract boolean isMonster();
	public abstract boolean isItem();	
	public abstract boolean isTerrain();
	public abstract boolean resolveRacialAbility();
}
