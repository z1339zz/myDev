package main;

import data.Pokemon;
import data.User;

public class Main {

	public static void main(String[] args) {

		System.out.println("======캡슐화======");

//		User p1 = new User();
//		p1.getName = "홍길동";
//		p1.setAge(21);
//
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//
//		System.out.println("안녕하세요. " + p1.getName + "입니다. 저는" + p1.getAge() + "살 입나다.");

		// 1년 후 ,,,, 벌써 일년,,,
		
		Pokemon p = new Pokemon();
		p.setName("라이츄");
		p.setAtk(77);
		p.setHp(200);
		
//		p.printInfo();
		String s = p.toString();
		System.out.println(s);
	}

}
