package main;

import java.util.Scanner;

public class Main1093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 배열 생성 (24칸 짜리)
		int[] memo = new int[23]; // 배열이 24개 있음

		// 입력 받기 (출석 몇번 부를건지) //출석 n번 부를지 입력
		int n = sc.nextInt();

		// 입력 받기 (출석 번호들)
		for (int i = 0; i < n; i++) { // n번 입력 할 수 
			int num = sc.nextInt(); // 부른 출석 입력

			// 메모하기
			memo[num]++; // 
		}

		// 결과 출력
		for (int i = 1; i <= 23; i++) {
			System.out.print(memo[i] + " ");
		}

	}// main

}// class
