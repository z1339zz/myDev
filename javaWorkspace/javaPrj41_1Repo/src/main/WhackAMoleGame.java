package main;

import java.util.Scanner;

public class WhackAMoleGame {

	public static void main(String[] args) {

		Mole mole1 = new Mole("두더지", (int) (Math.random() * 20 + 10));
		Mole mole2 = new Mole("두더지", (int) (Math.random() * 20 + 10));
		Mole user = new Mole("User", 100);

		System.out.println("========두더지 잡기 게임을 시작하니다.========");
		System.out.println(mole1.getName() + "의 체력은 : " + mole1.getHealth());
		System.out.println(mole2.getName() + "의 체력은 : " + mole2.getHealth());
		System.out.println(user.getName() + "의 체력은 : " + user.getHealth());

		int cnt = 0;
		UserInput userInput = new UserInput();

		while (mole1.getHealth() > 0 && mole2.getHealth() > 0) {
			cnt++;
			int slt = (int) (Math.random() * 3 + 1);
			System.out.println("");
			
			if (slt == 1) {
				System.out.println(mole1.getName() + "가 1번 구멍에서 튀어나왔습니다.");
				System.out.print("구멍의 번호를 입력 하여 두더지를 공격하세요. : ");
				if (userInput.UserInput() == 1) {
					user.attack(mole1);
					System.out.println("");
				} else {
					userInput.userMiss();
					user.attack(user);
					System.out.println("");
				}
			} else if (slt == 2) {
				System.out.println(mole2.getName() + "가 2번 구멍에서 튀어나왔습니다.");
				System.out.print("구멍의 번호를 입력 하여 두더지를 공격하세요. : ");
				if (userInput.UserInput() == 2) {
					user.attack(mole2);
					System.out.println("");
				} else {
					userInput.userMiss();
					user.attack(user);
					System.out.println("");
				}
			} else if (slt == 3) {
				System.out.println("아무것도 튀어나오지 않았습니다.");
				user.attack(user);
				System.out.println("");
			} else {
				System.out.println("잘못된 입력입니다");
			}
		}
		System.out.println("시도 횟수는 : " + cnt + " 입니다. ");
		System.out.println("게임이 끝났습니다.");

	}
}
