package game.updown;

import java.util.Scanner;

import main.Main;

public class UpDownGameManager {

	public void stsartGame() {
		
		System.out.println("1 ~ 100 까지의 정수를 입력하세요 : ");
		// 시도횟수
		int cnt = 0;

		// 정답 숫자 준비
		int answer = (int) (Math.random() * 100 + 1);

		// 반복(정답까지)
		while (true) {
			// 유저한테 숫자 입력받기
			
			String num_ = Main.scanUserInput(); // 입력 받을 준비
			int num = Integer.parseInt(num_);
			// 시도 횟수 증가
			cnt++;

			// 업, 다운, 정답 판단
			if (num < answer) {
				System.out.println("업");
			} else if (num > answer) {
				System.out.println("다운");
			} else {
				System.out.println("정답");
				System.out.println("시도 횟수 : " + cnt);
				break; // 정답 맞춤(정지)
			}
		}
	}

}
