package main;

import java.util.Scanner;

public class UserInput {

	WhackAMoleGame whackAMoleGame = new WhackAMoleGame();
	Scanner scanner = new Scanner(System.in);
	
	
	public int UserInput() {
		int UserSelet = scanner.nextInt();
		return UserSelet;
		
	}
	
	public void userMiss() {
		System.out.println("두더지를 맞추지 못하였습니다.");
		
	}

}
