package dice;

public class TerrainDice extends Dice {

	public TerrainDice(int nf, int sz, String id) {
		super(nf, sz, id);
	}
	
	public boolean moveUp(){
		if(this.getCurrentFaceValue() < 8){
			this.currentFace = this.getActionIcon(getCurrentFaceValue());
			return true;
		}
		return false;
			
	}
	
	public boolean moveDown(){
		if(this.getCurrentFaceValue() > 1){
			this.currentFace = this.getActionIcon(getCurrentFaceValue()-2);
			return true;
		}
		return false;
	}

	@Override
	public boolean isMonster() {
		return false;
	}

	@Override
	public boolean isItem() {
		return false;
	}

	@Override
	public boolean isTerrain() {
		return true;
	}

	@Override
	public boolean resolveRacialAbility() {
		return false;
	}

}
