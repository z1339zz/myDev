package main;

import java.awt.Paint;

import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;

public class Main {

	public static void main(String[] args) {

		
		System.out.println("===== 상속 연습 =====");
		
		Pikachu pikachu = new Pikachu();
		pikachu.skill();
		pikachu.bodyAttack();
		
		Pairi pairi = new Pairi();
		pairi.skill();
		pairi.bodyAttack();
	}

}
