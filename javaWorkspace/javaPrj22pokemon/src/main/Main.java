package main;

import battle.BattleManager;
import mod.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		//포켓몬 배틀
		BattleManager bm = new BattleManager();
		bm.battleStart();
		
		
		
		
		
//		//포켓몬 객체 생성 하고, 해당 객체의 주소르 변수에 담기
//		Pokemon p = new Pokemon();
//		
//		//객체 안에 변수들에 값 넣기
//		p.name = "피카추";
//		p.hp = 10;
//		
//		//객체 안의 변수들 출력해보기
//		System.out.println(p.name);
//		System.out.println(p.hp);
//
//		//객체의 attack메소드 호출(실행)하기
//		p.attack();
	}

}
