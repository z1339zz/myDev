package main;

import java.util.ArrayList;
import java.util.List;

import emp.CounterEmp;
import menu.Burger;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습");
		
		//버거 초기 셋팅
		List<Burger> burgerList = new ArrayList<Burger>();
		burgerList.add(new Burger("치즈버거", 5000));
		burgerList.add(new Burger("불고기버거", 5500));
		burgerList.add(new Burger("빅맥", 6000));
		burgerList.add(new Burger("치킨버거", 4500));
		burgerList.add(new Burger("라이스버거", 6500));
		
		System.out.println("메인메소드에서 버거 리스트 출력");
		System.out.println(burgerList);
		
		//카운터 직월을 통해서, 모든 버거 메뉴 출력
		CounterEmp cemp = new CounterEmp();
		cemp.showBurgerMenu(burgerList);
		
		System.out.println("메인메소드에서 버거 리스트 출력");
		System.out.println(burgerList);
		
	}

}
