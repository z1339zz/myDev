package mob;

public class Gobugi extends Pokemon{
	
	public Gobugi(int hp, int atk, int def) {
		super("꼬부기", hp, atk, def);
	}

	@Override
	public void skill() {
		System.out.println("물대포 !!!");
	}

}
