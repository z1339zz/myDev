package main;

import mob.Pokemon;

public class Main {

	public static void main(String[] args) {

		Pokemon p = new Pokemon();
		p.name = "피카츄";
		p.atk = 10;
		p.def = 20;
		p.hp = 50;
		
		
		System.out.println("이름 : " + p.name);
		System.out.println("체력 : " + p.hp);
		System.out.println("공격력 : " + p.atk);
		System.out.println("방어력 : " + p.def);
		
		p.attack();
	}

}
