package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import mob.Pokemon;

public class TestClass {
	//List //인덱스로 요소들을 관리
	public void method01() {
		System.out.println("----리스트----");
		List al = new ArrayList();
		
		//데이터 넣기
		Pokemon p = new Pokemon();
		al.add(p);
		
		//데이터 꺼내기
		Object result = al.get(0);
		System.out.println(result);
	}
	
	//Set //중복 X
	public void method02() {
		System.out.println("----Set----");
		
		Set s = new HashSet();
		
		//넣기
		s.add(new Pokemon());
		
		//꺼내기
		System.out.println(s.toString());
		
	}
	
	//Map //key-value 쌍으로 데이터 관리
	public void method03() {
		System.out.println("----ㅡMap-----");
		
		Map m = new HashMap();
		
		//넣기
		m.put("first", new Pokemon());
			
		//꺼내기
		Object result = m.get("first");
		System.out.println(result);
	}
	
	//Stack //LIFO (Last In First Out)
	public void method04() {
		System.out.println("------Stack------");
		
		Stack s = new Stack();
		
		//넣기
		s.add(new Pokemon());
		
		//꺼내기
		Object result = s.pop();		
		System.out.println(result);
	}

	//Queue //FIFO (First In First Out)
	public void method05() {
		System.out.println("------Queue------");
		
		
		LinkedList q = new LinkedList();
		
		//넣기
		q.add(new Pokemon());
		
		//꺼내기
		Object result = q.poll();
		System.out.println(result);
	}
}
