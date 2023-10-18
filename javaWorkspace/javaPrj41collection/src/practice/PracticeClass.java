package practice;

import java.util.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//import java.util.Set;
//import java.util.Stack;

import mob.Pokemon;

public class PracticeClass {

	// List
	public void method01() {
		System.out.println("=====List=====");
		List al = new ArrayList();

		Pokemon p = new Pokemon();
		int num = 10;
		String str = "hello";

		al.add(p);
		al.add(num);
		al.add(str);

		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));

//		System.out.println(al);
//		boolean result = al.contains(10);
//		System.out.println(result);
//		
//		System.out.println(al);
	}

	// Set
	public void method02() {
		System.out.println("=====Set=====");

		Set s = new HashSet();
		
		s.add("one");
		s.add("one");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add(4);
		s.add(5);
		
		System.out.println(s);
	}

	// Map
	public void method03() {
		System.out.println("=====Map=====");
		
		Map map = new HashMap();
		
//		map.put("name", "피카츄");
//		map.put("name", "피커츄");
//		map.put("atk", 78);
//		map.put("gender", "M");
		
		Object resylt = map.get("name");
		System.out.println(resylt);
		
		map.remove("name");
		
		System.out.println(map);

	}

	// Stack
	public void method04() {
		System.out.println("=====Stack=====");
		
		Stack stack = new Stack();

		stack.add("one");
		stack.add("two");
		stack.add("three");
		
		Object result = stack.peek();
		System.out.println(result);
		
		Object result2 = stack.pop();
		System.out.println(result2);
		
		
		System.out.println(stack);
	}

	// Queue
	public void method05() {
		System.out.println("=====Queue=====");

		Queue q = new LinkedList();
		
		q.add("one");
		q.add("two");
		q.add("three");
		
		Object result = q.poll();
		Object result2 = q.poll();
		
		System.out.println(result);
		System.out.println(result2);
		
		System.out.println(q);
	}

}
