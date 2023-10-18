package manager;

import java.util.Scanner;

import main.Main;
import mod.Pokemon;

public class PokemonManager {

	// 포켓몬 선택
	

	public void selectPokemon() {

		// 포켓몬 생성
		generatePokemmon();
		// 포켓몬 정보 출력
		printPokemonInfo();
		// 유저한테 입력받기
		int num = scanUserInput();
		// 입력 받은 정보를 이용하여 유저포켓몬 준비
		setUserPokemon(num);
		// 적 포켓몬 설정
		setEnemyPokmon();

		

	}

	private void setEnemyPokmon() {
		int num = (int)(Math.random()*3+1);
		switch(num) {
		case 1 : Main.enemyPokmon = Main.pokemon;
		case 2 : Main.enemyPokmon = Main.pokemon2;
		case 3 : Main.enemyPokmon = Main.pokemon3;
		}
		
	}

	private void generatePokemmon() {
		Main.pokemon = new Pokemon("피카츄", 100, 30, 5);
		
		Main.pokemon2 = new Pokemon("파이리", 97, 35, 10);
		
		Main.pokemon3 = new Pokemon("꼬부기", 110, 25, 20);
		

	}

	private void printPokemonInfo() {
		System.out.println("포켓몬을 선택해주세요.");
		System.out.println("1번 : " + Main.pokemon.toString());
		System.out.println("2번 : " + Main.pokemon2.toString());
		System.out.println("3번 : " + Main.pokemon3.toString());
		System.out.println("번호(숫자)를 입력해주세요");
		

	}

	private int scanUserInput() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		return n;
	}

	private void setUserPokemon(int num) {
		
		switch(num) {
		case 1 : Main.userPokmon = Main.pokemon;
		case 2 : Main.userPokmon = Main.pokemon2;
		case 3 : Main.userPokmon = Main.pokemon3;
		}

	}

}
