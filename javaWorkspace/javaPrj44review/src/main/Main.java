package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습");
		
		// 여러개의 객체를 관리할 변수 컬렉션
		List menuList = new ArrayList();
		
		// 메뉴 객체 여러개 만들기, 위에 만든 컬렉션에 담기
		Menu menu = new Menu("아메리카노", 1800);
		menuList.add(menu);
//		menuList.add(new Menu("아메리카노" , 1800));
		menuList.add(new Menu("에스프레소" , 1500));
		menuList.add(new Menu("카페라떼" , 2500));
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(menuList.get(0));
		System.out.println(menuList.get(1));
		System.out.println(menuList.get(2));
		
		//여러개의 객체 전부다 출력 (객체의 name 필드만 출력)
		Menu x = (Menu)menuList.get(0);
		System.out.println(x.getName());
		Menu x1 = (Menu)menuList.get(1);
		System.out.println(x1.getName());
		Menu x2 = (Menu)menuList.get(2);
		System.out.println(x2.getName());
		//여러개의 객체 전부다 출력 (객체의 price 필드만 출력)
		Menu y = (Menu)menuList.get(0);
		System.out.println(y.getPrice());
		Menu y1 = (Menu)menuList.get(1);
		System.out.println(y1.getPrice());
		Menu y2 = (Menu)menuList.get(2);
		System.out.println(y2.getPrice());
		
	}

}
