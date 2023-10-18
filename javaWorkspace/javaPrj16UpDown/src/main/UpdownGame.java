package main;

import java.util.Scanner;

public class UpdownGame {

	public void printStartMsg() {

		// 업다운게임 시작
		System.out.println("====================");
		System.out.println("|업 다운 게임을 시작합니다.|");
		System.out.println("====================");

	}

	public void printGameInfo() {
		// 게임 시작 문구
		System.out.println("1~100 사이의 랜덤 숫자를 맞춰주세요.");
		System.out.println("자연수만 입력 가능");
		System.out.println("정답을 맞출 때 까지 반복.");
		System.out.println("마지막에 시도횟수가 나옴");
	}

	public int prepareRandomAnswer() {

		return (int) (Math.random() * 100 + 1);

	}

	public int scanUserInput() {
		System.out.print("번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public boolean judgeUpDown(int answer , int x) {
		if (answer > x) {
			System.out.println("UP");
			return false;
		} else if (answer < x) {
			System.out.println("Down");
			return false;
		} else {
			System.out.println("정답");
			return true;
		}
	}
}
