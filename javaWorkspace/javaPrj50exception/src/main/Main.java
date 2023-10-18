package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("예외처리");
		
		TestClass ts = new TestClass();
		try {
		ts.method01();
		}catch(Exception e) {
			System.out.println("메인에서 잡았음");
		}
		
	}

}
