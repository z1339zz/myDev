package main;

import person.Member1;
import person.Member2;
import person.Member3;
import person.Person;

public class Main {

	public static void main(String[] args) {

		Person[] memger = new Person[3];

		memger[0] = new Member1(23, "11월 07일");
		memger[1] = new Member2(26, "12월 31일");
		memger[2] = new Member3(20, "4월 9일");
		

		for (int i = 0; i < memger.length; i++) {
			System.out.println(memger[i].toString());
		}

		for (int i = 0; i < memger.length; i++) {
			memger[i].aboutMe();
		}

	}

}
