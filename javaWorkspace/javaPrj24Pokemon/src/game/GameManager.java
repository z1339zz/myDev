package game;

import main.Main;

public class GameManager {

	// 게임시작
	public void gameStart() {
		// 포켓몬 선택
		PokemonManager pm = new PokemonManager();
		pm.selectPokemon();
		// 배틀하기
		
		// 결과출력
	System.out.println("유저가 선택한 포켓몬은 : " + Main.userPokemon.name);
	}

}
