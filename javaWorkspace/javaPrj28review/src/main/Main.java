package main;

import mob.Pokemon;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습!!@~");
		
		Pokemon pk = new Pokemon();
		pk.setName("피카츄");
		pk.setHp(100);
		pk.setAtk(20);
		
		pk.bodyAttack();
		System.out.println(pk.getFieldInfo()); 
	
	}

}
