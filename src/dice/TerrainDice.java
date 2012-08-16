package dice;

public class TerrainDice extends Dice {

	public TerrainDice(int nf, int sz, String id) {
		super(nf, sz, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMonster() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isItem() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTerrain() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resolveRacialAbility() {
		// TODO Auto-generated method stub
		return false;
	}

}
