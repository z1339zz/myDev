package manager;

import java.util.Scanner;

import main.Main;
import mod.Pokemon;

public class PokemonManager {

	public void gameStart() {

		// 포켓몬 정보출력
		generatePokemon();
		// 포켓몬 출력
		printPokemonInfo();
		// 유저 포켓몬 입력
		int num = userPokemonInPut();
		// 유저 포켓몬 저장
		setUserPokemon(num);
		// 적 포켓몬 랜덤 입력
		setEnemyPokemon();
		
	}

	private void setEnemyPokemon() {
		int num = (int) (Math.random() * 3 + 1);
		switch (num) {
		case 1:
			Main.enemyPokemon = Main.pokemon;break;
		case 2:
			Main.enemyPokemon = Main.pokemon2;break;
		case 3:
			Main.enemyPokemon = Main.pokemon3;break;
		}
	}

	private void setUserPokemon(int num) {
		switch (num) {
		case 1:
			Main.userPokemon = Main.pokemon;break;
		case 2:
			Main.userPokemon = Main.pokemon2;break;
		case 3:
			Main.userPokemon = Main.pokemon3;break;
		}
		
	}

	private int userPokemonInPut() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}

	private void printPokemonInfo() {
		
		System.out.println("포켓몬을 골라주세요.");
		System.out.println("1번 : " + Main.pokemon.toString());
		System.out.println("2번 : " + Main.pokemon2.toString());
		System.out.println("3번 : " + Main.pokemon3.toString());
		System.out.println("번호를 선택하세요.");

	}

	private void generatePokemon() {
		
		Main.pokemon = new Pokemon("피카츄", 100, 30, 5);
		Main.pokemon2 = new Pokemon("파이리", 90, 33, 3);
		Main.pokemon3 = new Pokemon("꼬부기", 110, 29, 8);
		
		
	}

}
