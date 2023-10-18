package main;

import java.util.Stack;

public class Main5 {
public static void main(String[] args) {
		
		// 여러개의 객체를 관리할 변수 컬렉션
		Stack<User> st = new Stack<User>();
		// 메뉴 객체 여러개 만들기, 위에 만든 컬렉션에 담기
		User a = new User("qwe","qwe12345");
		User b = new User("zxc","zxc12345");
		User c = new User("asd","asd12345");
		
		st.add(a);
		st.add(b);
		st.add(c);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(st);
		//여러개의 객체 전부다 출력 (객체의 id 필드만 출력)
		//여러개의 객체 전부다 출력 (객체의 pwd 필드만 출력)
		for(User elem : st) {
			System.out.println(elem.getId());
			System.out.println(elem.getPwd());
		}
	}

}
