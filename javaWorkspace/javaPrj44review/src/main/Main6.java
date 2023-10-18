package main;

import java.util.LinkedList;
import java.util.Queue;

public class Main6 {
	
public static void main(String[] args) {
		
		// 여러개의 객체를 관리할 변수 컬렉션
		Queue q = new LinkedList();
		// 메뉴 객체 여러개 만들기, 위에 만든 컬렉션에 담기
		User a = new User("qwe","qwe123456");
		User b = new User("zxc","zxc123456");
		User c = new User("asd","asd123456");
		
		q.add(a);
		q.add(b);
		q.add(c);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(q);
		//여러개의 객체 전부다 출력 (객체의 id 필드만 출력)
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println(c.getId());
		//여러개의 객체 전부다 출력 (객체의 pwd 필드만 출력)
		System.out.println(a.getPwd());
		System.out.println(b.getPwd());
		System.out.println(c.getPwd());
	}

}
