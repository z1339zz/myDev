package main;

import java.util.Scanner;

public class Main {

	// final : 재할당 불가능, 대분자는 상수로 정하는게 관례
	static final String BURGER01 = "상하이스파이시";
	static final String BURGER02 = "베이컨 토마토 디러스";
	static final String BURGER03 = "슈비버거";
	static final String SIDE01 = "감자튀김";
	static final String SIDE02 = "치즈스틱";
	static final String SIDE03 = "코울슬로";
	static final String DRINK01 = "콜라";
	static final String DRINK02 = "사이다";
	static final String DRINK03 = "환타";

	// 스케너 객체 준비
	static final Scanner sc = new Scanner(System.in);

	// 맥도날드 키오스크
	public static void main(String[] args) {

		System.out.println("주문하시겠습니까?");

		// 포장 매장
		System.out.println("1.포장 2.매장");
		int packageType = sc.nextInt();

		// 아래 변수는 항상 동일한 값을 유지해야하니까,,,, 할당 ㄴㄴ

		// 메뉴선택 (버거) //메뉴판 보여주고 //입력받기
		Menu m = new Menu();
		int burger = m.burgerMenu();

		// 메뉴선택 (사이드)
		int side = m.sideMenu();

		// 메뉴선택 (음료)
		int drink = m.drinkMenu();

		// 결제

		// 대기번호 발급

		// 메뉴명 준비
		String burgername = null;
		String sidename = null;
		String drinkname = null;

		switch (burger) {
		case 1:
			burgername = BURGER01;
			break;
		case 2:
			burgername = BURGER02;
			break;
		case 3:
			burgername = BURGER03;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		switch (side) {
		case 1:
			sidename = SIDE01;
			break;
		case 2:
			sidename = SIDE02;
			break;
		case 3:
			sidename = SIDE03;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		switch (drink) {
		case 1:
			drinkname = DRINK01;
			break;
		case 2:
			drinkname = DRINK02;
			break;
		case 3:
			drinkname = DRINK03;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

		// 주문확인서 출력
		System.out.println("주문하신 메뉴는");
		System.out.println("햄버거 : " + burgername);
		System.out.println("사이드 : " + sidename);
		System.out.println("음료수 : " + drinkname);
		System.out.println("입니다.");

	} // main

}// class
