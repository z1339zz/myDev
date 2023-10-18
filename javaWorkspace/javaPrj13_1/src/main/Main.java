package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();//번호를 말한 횟수(입력 할 개수)
		
		 int[] num = new int[24]; // 번호를 부른 횟수를 저장할 배열, 1부터 23까지 사용

	        for (int i = 0; i < x; i++) { // 어떤 번호를 불렀는지 입력
	            int number = sc.nextInt();
	            num[number]++; // 해당 번호의 빈도 증가
	        }

	        // 1~23번 까지 각 번호가 몇번 씩 불렸는지 출력
	        for (int i = 1; i <= 23; i++) {
	            System.out.print(num[i] + " ");
	        }
	}//main

}//class
