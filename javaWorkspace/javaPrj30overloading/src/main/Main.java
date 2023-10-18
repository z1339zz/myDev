package main;

import data.Member;
import data.Person;
import data.Pokemon;

public class Main {

	public static void main(String[] args) {

		System.out.println("생성자 오버로딩~~");
		
		//생성자를 이용한 초기화
		Person ps = new Person("홍길동",22);
		System.out.println(ps);
		
		//setter를 이용한여 객체 준비
		Person s = new Person();
		s.setName("홍길동");
		s.setAge(22);
		System.out.println(s);
		
		//Pokemon
		Pokemon pk = new Pokemon("피카츄", 100, 20);
		System.out.println(pk);
		
		Pokemon p = new Pokemon();
		p.setName("피카츄");
		p.setHp(100);
		p.setAtk(20);
		System.out.println(p);
		
		
		//MemberS
		Member mb = new Member("rh","dud","eo");
		System.out.println(mb);
		
		Member m = new Member();
		m.setId ("rh");
		m.setPwd("dud");
		m.setNick("eo");
		System.out.println(m);
		
		
	}//main
}//class
