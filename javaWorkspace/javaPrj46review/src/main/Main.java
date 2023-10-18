package main;

import java.util.ArrayList;
import java.util.List;

import menu.Burger;

public class Main {

	public static void main(String[] args) {

		System.out.println("맥날");

		// 메뉴준비
		Burger b1 = new Burger("치즈버거", 5000);
		Burger b2 = new Burger("불고기버거", 5500);
		Burger b3 = new Burger("빅맥", 6000);

		// 여러 객체 한번에 관리하기(배열)
//		Burger[] burgerArr = new Burger[3];
//		burgerArr[0] = b1;
//		burgerArr[1] = b2;
//		burgerArr[2] = b3;
		
		//여러 객체 한번에 관리하기(컬렉션)
		List<Burger> burgerList = new ArrayList<Burger>();
		burgerList.add(b1);
		burgerList.add(b2);
		burgerList.add(b3);

		// 메뉴 보여주기
//		for (int i = 0; i < burgerArr.length; i++) {
//			System.out.println(burgerArr[i]);
//		}
		//향상된 for문 
		for(Burger burger : burgerList) {
			System.out.println(burger);
			
		}
	}

}
