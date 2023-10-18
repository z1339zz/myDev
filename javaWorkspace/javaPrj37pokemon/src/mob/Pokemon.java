package mob;

public abstract class Pokemon extends Object{

	// 멤버 변수
	protected String name;
	protected int hp;
	protected int atk;
	protected int def;

	// 멤버 메소드
	public void bodyAttack() {
		System.out.println(name + "의 몸통박치기 !!!");
	}
	
	public abstract void skill();

	public Pokemon(String name, int hp, int atk, int def) {
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}



	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}

}
