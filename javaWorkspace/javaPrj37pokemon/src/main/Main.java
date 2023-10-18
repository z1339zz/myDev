package main;

import mob.Gobugi;
import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;

public class Main {

	public static void main(String[] args) {

		System.out.println("=======포켓몬=======");

		Pokemon[] pokemonArr = new Pokemon[3];
		pokemonArr[0] = new Pikachu(100, 30, 10);
		pokemonArr[1] = new Pairi(95, 33, 7);
		pokemonArr[2] = new Gobugi(110, 28, 15);

		//모든 포켓몬 정보(멤버변수==필드==객체변수==인스턴스변수)확인
		for (int i = 0; i < pokemonArr.length; i++) {
		System.out.println(pokemonArr[i]);
		}
		
		// 모든 포켓몬 몸통 박치기
		for (int i = 0; i < pokemonArr.length; i++) {
			pokemonArr[i].bodyAttack();
		}

		// 모든 포켓몬 스킬
		for (int i = 0; i < pokemonArr.length; i++) {
			pokemonArr[i].skill();
		}
		
	}

}
