package dice;

public class TerrainDice extends Dice {

	public TerrainDice(int nf, int sz, String id) {
		super(nf, sz, id);
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
