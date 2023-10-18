package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("=====쓰레드=====");

		// 현재 쓰레드 이름 확인
//		Thread x = Thread.currentThread();
//		System.out.println(x.getName());

		// 방법1 (Runnable 인터페이스를 상속받은 객체 전달)
		Thread x = new Thread(new KhClass());
		x.start();

		// 방법2 (객체 생성과 동시에 Override 진행)
		Thread y = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("2222222222222");
			}
		});
		y.start();

		// 방법3 (메소드를 바로 만들어서 전달)
		Thread z = new Thread(() -> {
			System.out.println("333333333");
		});
		z.start();

	}// main

}// class
