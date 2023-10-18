package emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import meun.Menu;

public class CounterEmp {
	
	Scanner scanner = new Scanner(System.in);
	List menuList = new ArrayList();
	private Object menuNum;

	private void printMenu() {

		menuList.add(new Menu("아메리카노", 1800));
		menuList.add(new Menu("에스프레소", 1500));
		menuList.add(new Menu("카페라떼", 2000));
		menuList.add(new Menu("아이스티", 2200));

		for (int i = 0; i < menuList.size(); i++) {
			Menu menu =  (Menu) menuList.get(i);
			System.out.println(i + 1 + "번 메뉴는 " + menu.getName() + "(" + menu.getPirce() + "원)");
		}

	}

	public void work() {
		// 메뉴 출력
		printMenu();
		// 메뉴 입력
		int num = userMenuInput();
		// 메뉴 확인
		menuCheck(num);
		// 개수 입력
		int menuCut = userMenuInput();
		// 최종 주문 출력
		int totalPirce = 0;
		int pirce = getMeunPirce(num);
		totalPirce += pirce * menuCut;
		System.out.println("총 가격은 " + totalPirce + "입니다.");
	

	}

	private int getMeunPirce(int num) {
		Menu menu = (Menu)menuList.get(num);
		return menu.getPirce();
	}

	private void menuCheck(int num) {
		Menu menu = (Menu) menuList.get(num - 1);
		System.out.println("선택하신 메뉴는 " + (num + 1) + "번 " + menu.getName() + "(" + menu.getPirce() + "원) 입니다.");
	}

	private int userMenuInput() {
		String numStr = scanner.nextLine();
		int num = Integer.parseInt(numStr);
		return num;
	}

}
