package mod;

import main.Main;
import util.Myutil;

public class Pokemon {

	public Pokemon(String name) {
		this.name = name;
		this.hp = 100;
		this.atk = Myutil.getRandomInt(MIN_ATK, 30);
		this.def = Myutil.getRandomInt(1, MAX_DEF);
	}
	

	public static final String NAME01 = "피카츄";
	public static final String NAME02 = "파이리";
	public static final String NAME03 = "꼬부기";
	private static final int MIN_ATK = 20;
	private static final int MAX_DEF = 10;

	private String name;
	private int hp;
	private int atk;
	private int def;
	
	


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

	public void bodyAttack() {
		System.out.println(this.name + "의 몸통박치기~!");
		
	}
	public void skill() {
		System.out.println(this.name + "의 스킬~!!");

	}
	
	public static void Run() {
		System.out.println(Main.userPokemon.getName() + "이(가) 도망갑니다~~~~~");
	}

	public String toString() {
		return "포켓몬의 정보 [이름 = " + name + ", 체력 = " + hp + ", 공격력 = " + atk + ", 방어력 = " + def + "]";
	}


}
