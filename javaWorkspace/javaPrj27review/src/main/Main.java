package main;

import date.Person;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습~~~");
		
		Person p = new Person();
		p.setName ("고영대");
		p.setAge(20);
		p.setGender('M');
		
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println(p.getGender());
		
		String str = p.getFieldInfo();
		System.out.println(str);
		
	}//main

}//class
