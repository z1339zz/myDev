package main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		// 여러개의 객체를 관리할 변수 컬렉션
		List<User> al = new ArrayList<User>();
		// 메뉴 객체 여러개 만들기, 위에 만든 컬렉션에 담기
		User a = new User("qwe","qwe12");
		User b = new User("zxc","zxc12");
		User c = new User("asd","asd12");
		
		al.add(a);
		al.add(b);
		al.add(c);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(al);
		//여러개의 객체 전부다 출력 (객체의 id 필드만 출력)
		//여러개의 객체 전부다 출력 (객체의 pwd 필드만 출력)
		
		for(User e : al ) {
			System.out.println(e.getId());
			System.out.println(e.getPwd());
		}//인덱스 for문 : 상향된 랙문
		
//		for(int i= 0; i < 3; i++) {
//			User e = (User)al.get(i);
//			System.out.println(e.getId());
//			System.out.println(e.getPwd());
//		}	
//			User elem02 = (User)al.get(1);
//			System.out.println(elem02.getId());
//			System.out.println(elem02.getPwd());
//			
//			User elem03 = (User)al.get(2);
//			System.out.println(elem03.getId());
//			System.out.println(elem03.getPwd());
		
	}

}
