package mob;

public class Pairi extends Pokemon {

	public Pairi(int hp, int atk, int def) {
		super("파이리", hp, atk, def);
	}

	@Override
	public void skill() {
		System.out.println("화염방사 !!!");
	}

}
