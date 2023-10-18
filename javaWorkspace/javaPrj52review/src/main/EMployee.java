package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EMployee {
	
	Scanner sc = new Scanner(System.in);
	private List<Menu> menuList = new ArrayList<Menu>();
	private int totalPrice = 0;
	
	public void startWork() {
		
		//메뉴판 준비
		preparList();
		
		//메뉴판 보여주기
		showMenu();
		
		//주문받기
		order();
		
		//결제하기
		pay();
	}


	//메뉴판 준비
	private void preparList() {
		
		menuList.add(new Menu("야채김밥", 3000));
		menuList.add(new Menu("참치김밥", 4000));
		menuList.add(new Menu("갈치김밥", 5000));
		menuList.add(new Menu("민트김밥", 6000));
		menuList.add(new Menu("초코김밥", 7000));
	}
	
	//메뉴판 보여주기
	private void showMenu() {
		for(Menu menu : menuList) {
		System.out.println(menu);
		}
	}

	//주문받기
	private void order() {
		System.out.println("원하시는 메뉴의 번호를 선택하세요.");
		String str = sc.nextLine();
		
		switch(str) {
		case "1" : totalPrice = 3000; break;
		case "2" : totalPrice = 4000; break;
		case "3" : totalPrice = 5000; break;
		case "4" : totalPrice = 6000; break;
		case "5" : totalPrice = 7000; break;
		default : System.out.println("잘못 골랐음");
		}
	}
	
	
	//결제하기
	private void pay() {
		System.out.println("결제하실 금액은" + totalPrice + "원 입니다.");
		
	}
	
}
