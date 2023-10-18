package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====method=====");
		
		/*
		 * 메소드 : 명령어 모아둔 것
		 * [문법]
		 * public void m01(){실행내용}
		 * 
		 * 접근제한자 리턴타입 메소드이름(){실행내용}
		 * 
		 * 접근제한자 리턴타입 메소드이름(매개변수){실행내용}
		 * 접근제한자 리턴타입 메소드이름(매개변수,매개변수 ... ){실행내용}
		 * 
		 * 접근제한자 리턴타입 메소드이름(){return 값;}
		 * return 값; - 값을 뱉어낼 수 있음
		 * 
		 * 접근제한자 리턴타입 메소드이름(매개변수){return 값;}
		 * 접근제한자 리턴타입 메소드이름(매개변수, 매개변수 ... ){return 값;}-return 값은 하나만 가능
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		MethodTest mt = new MethodTest();
		mt.printNumber(x);
		
		
	}// main   {}안에있는 변수를 local(지역) 변수

}// class
