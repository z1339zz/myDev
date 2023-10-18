package manager;

import main.Main;
import mod.Pokemon;
import util.Myutil;

public class PokemonManager {

	public void selectPokemon() {

		// 포켓몬 목풀 출력
		printPokemonList();
		// 유저 입력 받기
		int num = scavUserInput();
		// 유저 포켓몬 준비
		setUserPokemon(num);
		// 적 포켓몬 준비
		setEnemyPokemon();
	}

	private void printPokemonList() {
		System.out.println("------포켓몬 목록------");
		System.out.println("1 : " + Pokemon.NAME01);
		System.out.println("2 : " + Pokemon.NAME02);
		System.out.println("3 : " + Pokemon.NAME03);
		System.out.print("원하는 포켓몬의 번호를 입력해주세요. : ");

	}

	private int scavUserInput() {
		int num = Main.scanner.nextInt();
		return num;
	}

	private void setUserPokemon(int num) {
		switch (num) {
		case 1:
			Main.userPokemon = new Pokemon(Pokemon.NAME01);
			break;
		case 2:
			Main.userPokemon = new Pokemon(Pokemon.NAME02);
			break;
		case 3:
			Main.userPokemon = new Pokemon(Pokemon.NAME03);
			break;
		}

	}

	private void setEnemyPokemon() {
		int num = Myutil.getRandomInt(1, 3);
		switch (num) {
		case 1:
			Main.EnemyPokemon = new Pokemon(Pokemon.NAME01);
			break;
		case 2:
			Main.EnemyPokemon = new Pokemon(Pokemon.NAME02);
			break;
		case 3:
			Main.EnemyPokemon = new Pokemon(Pokemon.NAME03);
			break;
		}

	}
}
