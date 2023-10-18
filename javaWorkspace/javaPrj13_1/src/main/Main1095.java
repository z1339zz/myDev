package main;

import java.util.Scanner;

public class Main1095 {

	public static void main(String[] args) {

		int min = 24; // 23번이 가장 큰 수 이므로

		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);

		// 몇번 출석 부를지 입력받기
		int n = sc.nextInt();

		// n번 만큼 출석 확인
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();

			// 가장 빠른 번호인지 판단하기
			if (min > x) { // 지금 들은 번호가 더 빠르다면?
				min = x; // min 값을 새로 갱신
			}

		}

		// 가장 빠른 번호 출련
		System.out.println(min);

	}

}
