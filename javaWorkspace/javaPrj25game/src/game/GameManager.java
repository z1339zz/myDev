package game;

import java.util.Scanner;

import game.rcp.RcpGemaManager;
import game.updown.UpDownGameManager;
import main.Main;

public class GameManager {

	public void printGameInfo() {
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("===원하시는 게임을 선택해 주세요.====");
		System.out.println("1. UPDOWN");
		System.out.println("2. 가위바위보");
		System.out.println("3. 포켓몬");
		System.out.println("9. 게임종료");
		System.out.print("입력하세요. : ");
		
		
	}
	
	
	
	public void startUpDown() {
		UpDownGameManager gm = new UpDownGameManager();
		gm.stsartGame();
		
	}



	public void startRcp() {
		RcpGemaManager rg = new RcpGemaManager();
		rg.rcpGemaStart();
	}



	public void startPokemon() {
		System.out.println("준비중");
		
	}
}
