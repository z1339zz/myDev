package main;

public class Menu {
	public int burgerMenu() { // void ==> 이 메소드는 리턴값이 없다.

		// 메뉴선택 (버거) //메뉴판 보여주고 //입력받기
		System.out.println("=======햄버거=======");
		System.out.println("1. " + Main.BURGER01);
		System.out.println("2. " + Main.BURGER02);
		System.out.println("3. " + Main.BURGER03);
		int burger = Main.sc.nextInt();
		return burger;
	}

	public int sideMenu() {

		// 메뉴선택 (사이드)

		System.out.println("=======사이드=======");
		System.out.println("1. " + Main.SIDE01);
		System.out.println("2. " + Main.SIDE02);
		System.out.println("3. " + Main.SIDE03);
		int side = Main.sc.nextInt();
		return side;
	}

	public int drinkMenu() {

		// 메뉴선택 (음료)

		System.out.println("=======음료=======");
		System.out.println("1. " + Main.DRINK01);
		System.out.println("2. " + Main.DRINK02);
		System.out.println("3. " + Main.DRINK03);
		int drink = Main.sc.nextInt();
		return drink;
	}

}
