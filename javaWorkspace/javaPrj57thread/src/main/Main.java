package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====Thread=====");
		
		Thread t0 = Thread.currentThread();
		
		String t0name = t0.getName();
		System.out.println(t0name);
		
		//쓰레드 생성
		Thread t1 = new Thread(new KhClass());
		t1.start();
		
	}

}
