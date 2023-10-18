package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 소수 판별

		// 정수 입력하기
		Scanner sc = new Scanner(System.in); // 스케너 객체 준비
		int num = sc.nextInt();

		/*
		 * 소수 판단 - 약수가 2개 (1과 자신) ==> 1,자신 뺴고 다른수로 나누어 떨어지면 안됨 ==> 1에서 자신 사이에 숫자로 자신과
		 * 나누었을 때 나누어 지는지 확인
		 * 
		 */

		// 2~ num-1 중에서 num이랑 나눴을 때, 나누어 떨어지는게 있는지
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}

		// 결과 출력

		String str = "";
		str = isPrime ? "prime" : "not prime";
		if (num == 1) {
			System.out.println("not prime");
		} else {
			System.out.println(str);

		}
		

//		if (isPrime) {
//			System.out.println("prime");
//		} else {
//			System.out.println("not prime");
//		}
	}

}
