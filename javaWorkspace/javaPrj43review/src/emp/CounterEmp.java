package emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.event.MenuListener;

import menu.Menu;

public class CounterEmp {
	
	// 스캐너
	private Scanner scanner = new Scanner(System.in);
	List menuList = new ArrayList();

	// 메뉴 보여주기
	private void showMenu() {

		// 메뉴판 준비
		menuList.add(new Menu("아메리카노", 3000));
		menuList.add(new Menu("카페라뗴", 4000));
		menuList.add(new Menu("청포도에이드", 5000));
		menuList.add(new Menu("달고나라떼", 6000));
		menuList.add(new Menu("밀크쉐이크", 7000));

		// 메뉴판 출력
		for (int i = 0; i < menuList.size(); i++) {
			Menu x = (Menu)menuList.get(i);
			System.out.println(  (i + 1)+ "번 " + x.getName() + "(" + x.getPeice() + "원)");
		}
	}

	// 손님 받음
	public void work() {
		
		// 메뉴 보여주기
		showMenu();
		
		// 메뉴 입력받기
		System.out.print("원하시는 메뉴의 번호를 입력하세요. : ");
		int menuNum = scanUserInput();
		//선택한 메뉴 확인시켜주고, 금액 더하기
		System.out.println();
		printMenu(menuNum);
		//갯수 입력받기
		System.out.print("메뉴의 수량를 입력해주세요. : ");
		int menuCnt = scanUserInput();
		// 결제 (금액)
		int totalPrice = 0;
		int price = getMenuPrice(menuNum);
		totalPrice += price * menuCnt;
		System.out.println("금액의 총 합은 " + totalPrice + "원 입니다.");

	}
	private int getMenuPrice(int menuNum) {
		Menu result = (Menu)menuList.get(menuNum - 1);
		return result.getPeice();
	}

	private void printMenu(int num) {
		Menu result = (Menu)menuList.get(num - 1);
		System.out.println("메뉴이름 : " + result.getName());
		System.out.println("메뉴가격 : " + result.getPeice());
		System.out.println();
		
	}

	// 메뉴 입력받기

	private int scanUserInput() {
		String numStr = scanner.nextLine();
		int num = Integer.parseInt(numStr);
		return num;
		
	}

	// 결제 (금액)

}
