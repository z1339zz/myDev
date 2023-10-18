package main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 도구 준비 new = heap 안에 새로운 메모리(객체) 생성 // stack 메모리에 sc라는 메모리를 생성
												// in : 들어오는 통로
		System.out.print("학생 수 : ");
		int n = sc.nextInt(); // 배열 개수 입력 // nextInt = 유저가 입력한 데이더가 int타입 변수에 할당된다.(통로에 있는 int타입 데이터를 가지고 온다.)
								// sc라는 통로에서 Int타입 데이터를 가이고 온다.

		int[] scoreArr = new int[n]; // 배열 선언

		// 입력
		for (int i = 1; i <= scoreArr.length; i++) { // 배열 할당
			System.out.print(i + "번 학생 성적 :");

			scoreArr[i] = sc.nextInt();
		}

		// 출력
		for (int i = 1; i <= scoreArr.length; i++) // 할당 된 배열 출력
			System.out.println(i + " 학생 성적 : " + scoreArr[i]);

	}

}
