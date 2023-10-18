package mob;

public class Pokemon {

	//기본 생성자
	public Pokemon() {
		
	}
	
	//멤버 변수
	private String name;
	private int hp;
	private int atk;
	
	
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


	//멤버 메소드
	public void bodyAttack() {
		System.out.println(this.name + " 의 몸통박치기 !");
		
	}


	public String getFieldInfo() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	
}
