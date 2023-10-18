package game;

import java.util.Scanner;

import main.Main;
import mob.Pokemon;

public class PokemonManager {

	public void selectPokemon() {

		// 포켓몬 목록 보여주기
		showPokeminList();
		// 유저 포켓몬 입력
		int num = scanUserInput();

		// 입력번호에 맞게 포켓몬 기억하기
		setUserPokrmon(num);
	}

	
	public void showPokeminList() {
		// 포켓몬 목록 생성
		generatePokemonList();

		// 포켓몬 목록 출력
		printPokemonList();
	}

	// 입력에 맞게 포켓몬 기억하기
	public void setUserPokrmon(int x) {
		// 전달받은 값에 따라 포켓몬을 선택하고
		// userPokemon 이라는 변수에 저장
		// userPokemon 변수는 앞으로 여기저기서 쓰일 예정이므로
		// Main 클래스에 static 변수로 만들 예정
		// (Main 클래스 아니어도 되긴 함. static 으로 만드는게 중요.)
		switch (x) {
		case 1:
			Main.userPokemon = Main.p1;
			break;
		case 2:
			Main.userPokemon = Main.p2;
			break;
		case 3:
			Main.userPokemon = Main.p3;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void generatePokemonList() {
		Main.p1 = new Pokemon();
		Main.p1.name = "피카츄";
		Main.p1.hp = 100;
		Main.p1.atk = 30;
		Main.p1.def = 10;
		Main.p2 = new Pokemon();
		Main.p2.name = "파이리";
		Main.p2.hp = 90;
		Main.p2.atk = 33;
		Main.p2.def = 9;
		Main.p3 = new Pokemon();
		Main.p3.name = "꼬부기";
		Main.p3.hp = 95;
		Main.p3.atk = 29;
		Main.p3.def = 11;

	}

	public void printPokemonList() {
		System.out.println("원하는 포켓몬을 골라주세요.");
		System.out.println("1번 : " + Main.p1.name);
		System.out.println("2번 : " + Main.p2.name);
		System.out.println("3번 : " + Main.p3.name);
		System.out.println();
		System.out.println("원하는 포켓몬의 번호를 입력하세요. : ");

	}

	// 유저입력받기
	public int scanUserInput() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;

	}

}
