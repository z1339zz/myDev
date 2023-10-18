package mob;

public class Pokemon {
	
	//구성품==멤버 (변수, 메소드)
	
	public String name;
	public int hp;
	public int atk;
	public int def;
	
	public void attack() {
		
		System.out.println(name + "이(가) " + atk + "만큼 공격");
	}

}
