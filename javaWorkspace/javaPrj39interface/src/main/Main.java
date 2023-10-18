package main;

public class Main {

	public static void main(String[] agrs) {
		HongGilDong hong = new HongGilDong();

		System.out.println("======== 인터페이스 ========");

		hong.coding();
		hong.fishing();

		if (hong instanceof Programmer) {
			System.out.println("프로그래머 ㅇㅋ");
		} else {
			System.out.println("프로그래머 ㄴㄴ");
		}

		if (hong instanceof Fisheman) {
			System.out.println("어부 ㅇㅋ");
		} else {
			System.out.println("어부 ㄴㄴ");
		}

		if (hong instanceof Object) {
			System.out.println("ㅇㅋ");
		} else {
			System.out.println("ㄴㄴ");
		}
		
//		Person p = new Person();  //생성이 안되니까,,,,
//		String s = p.say();
//		int cnt = p.walk();
//		p.eat();
	}

}
