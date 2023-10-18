package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main4 {

public static void main(String[] args) {
		
		// 여러개의 객체를 관리할 변수 컬렉션
		Map<String, User> m = new HashMap<String, User>();
		// 메뉴 객체 여러개 만들기, 위에 만든 컬렉션에 담기
		User a = new User("qwe","qwe1234");
		User b = new User("zxc","zxc1234");
		User c = new User("asd","asd1234");
		
		m.put(a.getId() , a);
		m.put(b.getId() , b);
		m.put(c.getId() , c);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(m);
		//여러개의 객체 전부다 출력 (객체의 id 필드만 출력)
		//여러개의 객체 전부다 출력 (객체의 pwd 필드만 출력)
		Set<String> ks = m.keySet();
		for(String k : ks) {
			System.out.println(k);
			User v = m.get(k);
			System.out.println(v);
		}
	}

}
