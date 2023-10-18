package main;

public class Run {

	public static void main(String[] args) {

		// 배열 : 같은 타입의 변수들로 이루어진 유한집한 - 변수들이 여러개 붙어있는거
		/*
		 * int x1 = 100; int x2 = 100; int x3 = 100; int x4 = 100; int x4 = 100; 이렇게 배열
		 * 시 컴퓨터에 무리를 줌(메모리를 많이 사용) : 좋은 방식 x
		 *
		 * int[] x = new int[30]; : 30개의 변수를 만들 수 있음 []<-배열
		 *
		 * 변수를 사용한다는 것은 할당과 접근이 가능
		 *
		 */

//		int[] x = new int[3];
//		
//		//각 칸에 원하는 수를 집어넣고, 출력
//		x [0] = 1;
//		x [1] = 3;
//		x [2] = 2;
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[0]);

		int[] x = new int[5];

		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 400;
		x[4] = 500;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);

		int[] arr = new int[5];

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println(arr); // 주소값 출력, 정확하게는 주소값이 아니라 해시코드(객체를 식별하기 위한 ID)

	}// main

}// class
