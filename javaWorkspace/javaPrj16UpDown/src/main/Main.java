package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		UpdownGame ug = new UpdownGame();

		ug.printStartMsg();

		ug.printGameInfo();

		int answer = ug.prepareRandomAnswer();

		int cnt = 0;

		boolean isFinish = false;
		while (!isFinish) {

			int x = ug.scanUserInput();
			cnt++;

			isFinish =ug.judgeUpDown(answer , x);

		}
		System.out.println("시도 횟수 : " + cnt);

	}// main

}// class