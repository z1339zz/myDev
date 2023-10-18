package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		// 여러개의 객체를 관리할 변수 컬렉션
		Set<User> s = new HashSet<User>();
		// 메뉴 객체 여러개 만들기, 위에 만든 컬렉션에 담기
		User a = new User("qwe", "qwe123");
		User b = new User("zxc", "zxc123");
		User c = new User("asd", "asd123");

		s.add(a);
		s.add(b);
		s.add(c);

		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(s);
		// 여러개의 객체 전부다 출력 (객체의 id 필드만 출력)
		// 여러개의 객체 전부다 출력 (객체의 pwd 필드만 출력)
		for(User elem : s) {
			System.out.println(elem.getId());
			System.out.println(elem.getPwd());
		}
	}

}
