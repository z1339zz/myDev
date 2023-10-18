package mod;

public class Pokemon {

	private String name;
	private int hp;
	private int atk;
	private int def;

	public Pokemon(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		
	}
	public Pokemon() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String toString() {
		return "포켓몬의 정보 [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}
	
	
	

}
